package edu.iut.app;
/**
 * Classe Date
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class Date {
	/**
	 * Attributs
	 */
	private int jour;
	private int mois;
	private int annee;
	
	/**
	 * Constructeur
	 * @param day
	 * @param month
	 * @param year
	 */
	public void Date(int day, int month, int year){
		jour = day;
		mois = month;
		annee = year;
	}
	
	/**
	 * M�thode qui affiche date/mois/annee
	 */
	public void affciherDate(){
		System.out.println(jour+"/"+mois+"/"+annee);
	}

	/**
	 * M�thode qui retourne le jour
	 * @return int
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * M�thode qui r�initialise le jour
	 * @param jour
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * M�thode qui retourne le mois
	 * @return int
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * M�thode qui r�initialise le mois
	 * @param mois
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * M�thode qui retourne l'ann�e
	 * @return int
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * M�thode qui r�initialise l'ann�e
	 * @param annee
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
}
