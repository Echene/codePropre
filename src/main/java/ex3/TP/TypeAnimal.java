/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public enum TypeAnimal {

	/** MAMMIFERE : TypeAnimal */
	MAMMIFERE("Mammifère"),
	
	/** POISSON : TypeAnimal */
	POISSON("Poisson"),
	
	/** REPTILE : TypeAnimal */
	REPTILE("Reptile");

	/** type : String */
	private String type;
	
	/** Constructor
	 * @param type
	 */
	private TypeAnimal(String type) {
		this.type = type;
	}
	
}
