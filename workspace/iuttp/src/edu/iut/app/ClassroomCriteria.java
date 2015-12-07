package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe ClassroomCriteria qui impl�mente l'interface CriteriaClassroom
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ClassroomCriteria implements CriteriaClassroom{

	/**
	 * M�thode qui v�rifie si le num�ro de salle est affect� 
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
