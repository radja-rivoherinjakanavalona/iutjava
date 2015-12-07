package edu.iut.app;
/**
 * Classe Classroom, cette classe correspond � la salle de soutenance
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
	 * Constructeur qui initialise une salle avec son num�ro  
	 * @param classRoomNumber
	 */
	public Classroom(String classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	
	/**
	 * M�thode qui r�initialise une salle avec son num�ro
	 * @param number
	 */
	public void setClassroomNumber(String number) {
		this.classRoomNumber = number;
	}
	
	/**
	 * M�thode qui retourne un num�ro de salle
	 * @return
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
