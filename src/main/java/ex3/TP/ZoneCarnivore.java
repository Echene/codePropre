/**
 * 
 */
package ex3.TP;

/**
 * @author Emmanuel
 *
 */
public class ZoneCarnivore extends Zone {
	
	private static final int KG_NOURRITURE_PAR_JOUR = 10;
	private static final String NOM_ZONE = "Zone Carnivore";

	/** Constructor
	 * @param kgNourritureParJour
	 * @param nom
	 */
	public ZoneCarnivore() {
		super(KG_NOURRITURE_PAR_JOUR, NOM_ZONE);
	}
	
	@Override
	public boolean accepterAnimal(Animal animal) {
		return (animal.getComportement() == ComportementAnimal.HERBIVORE &&
				animal.getType() == TypeAnimal.MAMMIFERE);
	}

}
