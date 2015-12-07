package edu.iut.app;
/**
 * Classe Classroom, cette classe correspond à la salle de soutenance
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class Classroom {
	
	/**
	 * Constructeur 
	 */
	public Classroom() {
		classRoomNumber="not affected";
	}
	
	/**
	 * Constructeur qui initialise une salle avec son numéro  
	 * @param classRoomNumber
	 */
	public Classroom(String classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	
	/**
	 * Méthode qui réinitialise une salle avec son numéro
	 * @param number
	 */
	public void setClassroomNumber(String number) {
		this.classRoomNumber = number;
	}
	
	/**
	 * Méthode qui retourne un numéro de salle
	 * @return
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
