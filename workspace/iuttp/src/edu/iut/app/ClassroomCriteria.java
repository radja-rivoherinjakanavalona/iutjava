package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe ClassroomCriteria qui implémente l'interface CriteriaClassroom
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ClassroomCriteria implements CriteriaClassroom{

	/**
	 * Méthode qui vérifie si le numéro de salle est affecté 
	 * et va l'ajouter dans une liste
	 * @return List
	 */
	@Override
	public List<Classroom> meetCriteria(List<Classroom> element) {
		List<Classroom> classRooms = new ArrayList<Classroom>(); 

		for (Classroom classRoom : classRooms) {
			if(classRoom.getClassRoomNumber() != "not affected"){
				classRooms.add(classRoom);
			}
		}
		return classRooms;
	}
	

}
