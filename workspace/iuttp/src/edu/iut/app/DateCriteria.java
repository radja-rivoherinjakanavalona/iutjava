package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe DateCriteria qui implémente l'interface CriteriaDate
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class DateCriteria implements CriteriaDate{

	/**
	 * Méthode qui vérifie si une date est bien conforme 
	 * selon les normes et rajoute cette date dans une liste
	 * @return List
	 */
	@Override
	public List<Date> meetCriteria(List<Date> dates){
		List<Date> dateOk = new ArrayList<Date>(); 

		for (Date date : dates) {
			if(1<= date.getJour()&& date.getJour()<=31){
				if(1<=date.getMois() && date.getMois()<=12){
					if(2010 <= date.getAnnee() && date.getAnnee()<=2020){
						dateOk.add(date);
					}
				}
			}
		}
		return dateOk;
	}

}
