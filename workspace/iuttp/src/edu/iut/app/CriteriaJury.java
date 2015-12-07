package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.Person.PersonFunction;
/**
 * Classe CriteriaJury qui implémente l'interface CriteriaPerson
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class CriteriaJury implements CriteriaPerson{

	/**
	 * Méthode qui va ajouter une personne dans une liste 
	 * si celle-ci est un jury 
	 * @param persons
	 * @return List
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> jurys = new ArrayList<Person>(); 

		for (Person person : persons) {
			if(person.getFunction() == PersonFunction.JURY){
				jurys.add(person);
			}
		}
		return jurys;
	}
}