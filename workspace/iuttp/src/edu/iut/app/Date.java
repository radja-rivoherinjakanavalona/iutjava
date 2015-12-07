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
	 * Méthode qui affiche date/mois/annee
	 */
	public void affciherDate(){
		System.out.println(jour+"/"+mois+"/"+annee);
	}

	/**
	 * Méthode qui retourne le jour
	 * @return int
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * Méthode qui réinitialise le jour
	 * @param jour
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * Méthode qui retourne le mois
	 * @return int
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * Méthode qui réinitialise le mois
	 * @param mois
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * Méthode qui retourne l'année
	 * @return int
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * Méthode qui réinitialise l'année
	 * @param annee
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
}
