package edu.iut.app;

import java.util.LinkedList;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class Agenda extends LinkedList<ExamEvent> {
	
	/**
	 * Constructeur
	 */
	public Agenda() {	
		new LinkedList<ExamEvent>();
	}
	
	/**
	 * Ajout d'objet d'ExamEvent dans la liste 
	 * @param examEvent
	 */
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
