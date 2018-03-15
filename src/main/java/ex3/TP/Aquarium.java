/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public class Aquarium extends Zone {

	/** KG_NOURRITURE_PAR_JOUR : double */
	private static final double KG_NOURRITURE_PAR_JOUR = 0.2;
	
	
	/** NOM_ZONE : String */
	private static final String NOM_ZONE = "Aquarium";
	
	/** Constructor
	 * @param kgNourritureParJour 
	 * @param nom
	 */
	public Aquarium() {
		super(KG_NOURRITURE_PAR_JOUR, NOM_ZONE);
	}
	
	@Override
	public boolean accepterAnimal(Animal animal) {
		return (animal.getType() == TypeAnimal.POISSON);
	}

}
