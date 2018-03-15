/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public class Animal {
	
	/** nom : String */
	protected String nom;
	
	/** zone : Zone */
	protected Zone zone;
	
	/** comportement : ComportementAnimal */
	protected ComportementAnimal comportement;
	
	/** type : TypeAnimal */
	protected TypeAnimal type;
	
	/** Constructor d'un Animal avec tous ses paramètres
	 * @param nom Nom de l'animal
	 * @param zone Zone auquel l'animal appartient
	 * @param comportement Comportement alimentaire
	 * @param type Mode de vie
	 */
	public Animal(String nom, Zone zone, ComportementAnimal comportement, TypeAnimal type) {
		this.nom = nom;
		this.zone = zone;
		this.comportement = comportement;
		this.type = type;
	}
	
	/** Constructor d'un Animal avec la zone par défaut null
	 * @param nom Nom de l'animal
	 * @param comportement Zone auquel l'animal appartient
	 * @param type Mode de vie
	 */
	public Animal(String nom, ComportementAnimal comportement, TypeAnimal type) {
		this.nom = nom;
		this.zone = null;
		this.comportement = comportement;
		this.type = type;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Getter
	 * @return the zone
	 */
	public Zone getZone() {
		return zone;
	}

	/** Getter
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}

	/** Getter
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Setter
	 * @param zone the zone to set
	 */
	public void setZone(Zone zone) {
		this.zone = zone;
	}

	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

}
