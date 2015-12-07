package edu.iut.app;
/**
 * Classe Person
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class Person {

	/**
	 * Enum�ration des diff�rents fonctions selon les personnes
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
	 * Constructeur qui cr�e une personne
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
	 * M�thode qui r�initialise une personne
	 * @param function
	 */
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}

	/**
	 * M�thode qui retourne la fonctiond'une personne
	 * @return PersonFunction
	 */
	public PersonFunction getFunction() {
		return personFunction;
	}

	/**
	 * M�thode qui r�initialise le pr�nom
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * M�thode qui retourne le pr�nom
	 * @return String
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * M�thode qui r�initialise le nom
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * M�thode qui retourne le nom
	 * @return String
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * M�thode qui r�initialise l'adresse mail
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * M�thode qui retourne l'adresse mail
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * M�thode qui r�initialise le num�ro de t�l�phone
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * M�thode qui retourne le num�ro de t�l�phone
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
