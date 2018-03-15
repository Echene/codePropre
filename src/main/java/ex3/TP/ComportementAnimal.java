/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public enum ComportementAnimal {

	/** CARNIVORE : ComportementAnimal */
	CARNIVORE("Carnicore"),
	
	/** HERBIVORE : ComportementAnimal */
	HERBIVORE("Herbivore");

	/** type : String */
	private String comportement;
	
	/** Constructor
	 * @param type
	 */
	private ComportementAnimal(String comportement) {
		this.comportement = comportement;
	}
	
}
