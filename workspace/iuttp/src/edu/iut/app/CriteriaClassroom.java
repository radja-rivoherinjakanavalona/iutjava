package edu.iut.app;

import java.util.List;
/**
 * Interface CriteriaClassroom
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface CriteriaClassroom  {
	/**
	 * M�thode qui v�rifie si le num�ro de salle est affect� 
	 * et va l'ajouter dans une liste
	 * @return List
	 */
	public List<Classroom> meetCriteria(List<Classroom> classRooms);
}
