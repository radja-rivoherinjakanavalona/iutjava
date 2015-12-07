package edu.iut.app;

import java.util.List;
/**
 * Interface CriteriaExamEvent
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface CriteriaExamEvent {
	/**
	 * Méthode qui vérifie si un évenement contient bien 
	 * une salle, une date, un jury et un étudiant
	 * et rajoute cet évenement dans une liste
	 * @return List
	 */
	public List<ExamEvent> meetCriteria(List<ExamEvent> events);
}