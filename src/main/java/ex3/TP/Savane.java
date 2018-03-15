/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public class Savane extends Zone{
	
	private static final int KG_NOURRITURE_PAR_JOUR = 10;
	private static final String NOM_ZONE = "Savane";

	/** Constructor
	 * @param kgNourritureParJour
	 * @param nom
	 */
	public Savane() {
		super(KG_NOURRITURE_PAR_JOUR, NOM_ZONE);
	}

	@Override
	public boolean accepterAnimal(Animal animal) {
		return (animal.getComportement() == ComportementAnimal.CARNIVORE &&
				animal.getType() == TypeAnimal.MAMMIFERE);
	}
	
}
