/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public class Ferme extends Zone {
	
	/** KG_NOURRITURE_PAR_JOUR : int */
	private static final int KG_NOURRITURE_PAR_JOUR = 10;
	
	
	/** NOM_ZONE : String */
	private static final String NOM_ZONE = "Ferme";

	/** Constructor
	 * @param kgNourritureParJour
	 * @param nom
	 */
	public Ferme() {
		super(KG_NOURRITURE_PAR_JOUR, NOM_ZONE);
	}
	
	@Override
	public boolean accepterAnimal(Animal animal) {
		return (animal.getType() == TypeAnimal.REPTILE);
	}

}
