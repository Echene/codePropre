/**
 * 
 */
package ex3.TP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emmanuel
 * Classe permettant de créer une Zone
 */
public class Zone {

	/** kgNourritureParJour : double */
	protected double kgNourritureParJour;

	/** animaux : List<Animal> contenant les animaux de la zone*/
	protected List<Animal> animaux;

	/** nom de la zone: String */
	protected String nom;

	/**
	 * Constructor
	 * 
	 * @param kgNourritureParJour Kg nourriture nécessaire par jour
	 * @param nom Nom de la zone
	 */
	protected Zone(double kgNourritureParJour, String nom) {
		this.nom = nom;
		this.kgNourritureParJour = kgNourritureParJour;
		this.animaux = new ArrayList<>();
	}

	/**
	 * Calcul le nombre de Kg nécessaire à la zone par jour en fonction de la quantité de nourriture par animal
	 * @param kgParAnimal Quantité de nourriture nécessaire par animal
	 * @return Le total de nourriture nécessaire par jour
	 */
	public double calculerTotalKgNourritureParJour(int kgParAnimal) {
		return animaux.size() * kgParAnimal;
	}

	/**
	 * Ajoute un animal dans la liste de la zone
	 * @param animal L'Animal à ajouter
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche tous les noms d'animaux de la liste
	 */
	public void afficherListeAnimaux() {
		for(Animal a: animaux) {
			System.out.println(a.getNom() + "\n");
		}	
	}
	
	/**
	 * @param animal
	 * @return
	 */
	public boolean accepterAnimal(Animal animal) {
		return false;
	}

	/**
	 * Getter
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/**
	 * Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

}
