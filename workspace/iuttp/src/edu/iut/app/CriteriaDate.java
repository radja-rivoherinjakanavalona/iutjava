package edu.iut.app;

import java.util.List;
/**
 * Interface CriteriaDate
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface CriteriaDate  {
	/**
	 * M�thode qui v�rifie si une date est bien conforme 
	 * selon les normes et rajoute cette date dans une liste
	 * @return List
	 */
	public List<Date> meetCriteria(List<Date> dates);
}
