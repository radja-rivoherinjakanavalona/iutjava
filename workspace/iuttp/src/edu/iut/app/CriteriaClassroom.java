package edu.iut.app;

import java.util.List;
/**
 * Interface CriteriaClassroom
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface CriteriaClassroom  {
	/**
	 * Méthode qui vérifie si le numéro de salle est affecté 
	 * et va l'ajouter dans une liste
	 * @return List
	 */
	public List<Classroom> meetCriteria(List<Classroom> classRooms);
}
