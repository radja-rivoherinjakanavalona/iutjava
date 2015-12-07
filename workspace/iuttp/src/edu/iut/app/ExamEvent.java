package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
/**
 * Classe ExamEvent
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class ExamEvent {
	/**
	 * Constructeur vide
	 */
	public ExamEvent() {		
	}
	
	/**
	 * Constructeur qui crée un évenement
	 * @param date
	 * @param person
	 * @param jury
	 * @param classRoom
	 * @param document
	 */
	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
					Classroom classRoom, ArrayList<Document> document) {
		examDate = date;
		student = person;
		this.jury = new ArrayList<Person>();
		this.jury = jury;
		classroom = classRoom;
		this.documents = new ArrayList<Document>();
		documents = document;
		
	}

	/**
	 * Méthode qui retourne la date de l'examen
	 * @return Date
	 */
	public Date getExamDate() {
		return examDate;
	}

	/**
	 * Méthode qui réinitialise la date
	 * @param examDate
	 */
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	/**
	 * Méthode qui retourne un étudiant
	 * @return Person
	 */
	public Person getStudent() {
		return student;
	}

	/**
	 * Méthode qui réinitialise un étudiant
	 * @param student
	 */
	public void setStudent(Person student) {
		this.student = student;
	}

	/**
	 * Méthode qui retourne un liste de jury
	 * @return ArrayList
	 */
	public ArrayList<Person> getJury() {
		return jury;
	}

	/**
	 * Méthode qui réinitialise la liste des jurys
	 * @param jury
	 */
	public void setJury(ArrayList<Person> jury) {
		this.jury = jury;
	}

	/**
	 * Méthode qui retourne un salle 
	 * @return Classroom
	 */
	public Classroom getClassroom() {
		return classroom;
	}

	/**
	 * Méthode qui réinitialise une salle
	 * @param classroom
	 */
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	/**
	 * Méthode qui retourne la liste des documents 
	 * @return ArrayList
	 */
	public ArrayList<Document> getDocuments() {
		return documents;
	}

	/**
	 * Méthode qui réinitialise la liste des documents
	 * @param documents
	 */
	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	/**
	 * Méthode qui ajoute un jury dans la liste des jurys
	 * @param person
	 */
	public void addPerson(Person person) {
		jury.add(person);
	}
	
	/**
	 * Méthode qui ajoute un document dans la liste des documents
	 * @param doc
	 */
	public void addDocument(Document doc) {
		documents.add(doc);
	}
	
	protected Date examDate;
	protected Person student;
	protected ArrayList<Person> jury;
	protected Classroom classroom;
	protected ArrayList<Document> documents;
	 
}
