package ex1;

import java.util.Date;

/**
 * @author Emmanuel
 *
 */
public class Entreprise {
	
	public static final int CAPITAL_MAX = 3000000;

	/** siret : int */
	int siret;

	/** som : String */
	String som;
	
	/** adresse : Adresse */
	Adresse adresse;
	
	/** dateCreation : Date */
	Date dateCreation;
	
	/**
	 * Affiche le status de l'entreprise
	 */
	public void afficherStatut(){
		
	}
	
	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Getter
	 * @return the som
	 */
	public String getSom() {
		return som;
	}

	/** Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/** Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Setter
	 * @param som the som to set
	 */
	public void setSom(String som) {
		this.som = som;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
