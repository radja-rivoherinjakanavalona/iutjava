package edu.iut.app;

import java.util.List;
/**
 * Interface CriteriaExamEvent
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface CriteriaExamEvent {
	/**
	 * M�thode qui v�rifie si un �venement contient bien 
	 * une salle, une date, un jury et un �tudiant
	 * et rajoute cet �venement dans une liste
	 * @return List
	 */
	public List<ExamEvent> meetCriteria(List<ExamEvent> events);
}