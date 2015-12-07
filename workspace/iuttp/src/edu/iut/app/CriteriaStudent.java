package edu.iut.app;
import java.util.ArrayList;
import java.util.List;

import edu.iut.app.Person.PersonFunction;
/**
 * Classe CriteriaStudent qui implémente l'interface CriteriaPerson
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class CriteriaStudent implements CriteriaPerson{
	/**
	 * Méthode qui va ajouter une personne dans une liste 
	 * si celle-ci est un étudiant
	 * @param persons
	 * @return List
	 */
	@Override
		public List<Person> meetCriteria(List<Person> persons){
	      List<Person> students = new ArrayList<Person>(); 
	      
	      for (Person person : persons) {
	         if(person.getFunction() == PersonFunction.STUDENT){
	            students.add(person);
	         }
	      }
	      return students;
	   }

}
