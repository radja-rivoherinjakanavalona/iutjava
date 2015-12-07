package edu.iut.app;
/**
 * Classe Person
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class Person {

	/**
	 * Enumération des différents fonctions selon les personnes
	 */
	public enum PersonFunction{
		NONE(ApplicationSession.instance().getString("none")),
		JURY(ApplicationSession.instance().getString("jury")),
		STUDENT(ApplicationSession.instance().getString("student"));


		private String personFunction;

		/**
		 * Constructeur
		 * @param personFunction
		 */
		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}

		public String toString() {
			return personFunction;
		}		
	}

	/**
	 * Constructeur qui initialise la fonction d'une personne
	 */
	public Person() {
		personFunction = PersonFunction.NONE;
	}

	/**
	 * Constructeur qui crée une personne
	 * @param personFunction
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 */
	public Person(PersonFunction personFunction,
			String firstname,
			String lastname,
			String email,
			String phone) {
		this.personFunction = personFunction;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
	}

	/**
	 * Méthode qui réinitialise une personne
	 * @param function
	 */
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}

	/**
	 * Méthode qui retourne la fonctiond'une personne
	 * @return PersonFunction
	 */
	public PersonFunction getFunction() {
		return personFunction;
	}

	/**
	 * Méthode qui réinitialise le prénom
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Méthode qui retourne le prénom
	 * @return String
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Méthode qui réinitialise le nom
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Méthode qui retourne le nom
	 * @return String
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Méthode qui réinitialise l'adresse mail
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Méthode qui retourne l'adresse mail
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Méthode qui réinitialise le numéro de téléphone
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * Méthode qui retourne le numéro de téléphone
	 * @return String
	 */
	public String getPhone() {
		return phone;
	}


	protected PersonFunction personFunction;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String phone;


}
