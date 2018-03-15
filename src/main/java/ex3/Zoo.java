package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.TP.Animal;
import ex3.TP.Ferme;
import ex3.TP.Savane;
import ex3.TP.Aquarium;
import ex3.TP.Zone;
import ex3.TP.ZoneCarnivore;

/**
 * @author Emmanuel
 *
 */
public class Zoo {

	/** nom du zoo: String */
	private String nom;

	/** zones : List<Zone> contenant toutes les zones d'un zoo*/
	private List<Zone> zones = new ArrayList<Zone>();

	/** Constructor
	 * @param nom Nom du zoo
	 */
	public Zoo(String nom) {

		this.nom = nom;

		zones.add(new Savane());
		zones.add(new Aquarium());
		zones.add(new Ferme());
		zones.add(new ZoneCarnivore());

	}

	/**
	 * Prends un animal non null et l'ajoute dans une zone
	 * @param animal L'Animal auquel on va ajouter à une zone
	 */
	public void addAnimal(Animal animal) {

		if (animal != null) {
			choixZoneAnimal(animal);
		}
	
	}

	/**
	 * Affiche chaque zone avec leurs animaux respectifs
	 */
	public void afficherListeAnimaux() {
		for (Zone z : zones) {
			System.out.println("**********" + z.getNom() + "**********");
			z.afficherListeAnimaux();
		}
	}

	/**
	 * Prends un animal et le place dans une zone en fonction de ses caractéristiques
	 * @param animal L'Animal auquel on va affecter une zone
	 */
	public void choixZoneAnimal(Animal animal) {
		for (Zone z : zones) {
			if (z.accepterAnimal(animal)) {
				z.addAnimal(animal);
				return;
			}
		
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the zones
	 */
	public List<Zone> getZones() {
		return zones;
	}

	/** Setter
	 * @param zones the zones to set
	 */
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
}
