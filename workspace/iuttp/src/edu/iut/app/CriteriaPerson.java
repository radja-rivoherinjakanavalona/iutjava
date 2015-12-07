package edu.iut.app;

import java.util.List;
/**
 * Interface CriteriaPerson
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface CriteriaPerson {
	/**
	 * Méthode qui va ajouter une personne dans une liste 
	 * selon sa fonction
	 * @param persons
	 * @return List
	 */
	   public List<Person> meetCriteria(List<Person> persons);
	
}
