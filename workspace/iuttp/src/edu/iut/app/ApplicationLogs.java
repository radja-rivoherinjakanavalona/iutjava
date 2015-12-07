package edu.iut.app;

import java.util.ArrayList;
/**
 * Classe ApplicationLogs qui est une sous-classe d'une liste de IApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */

public class ApplicationLogs extends ArrayList<IApplicationLog> {

	/**
	 * Constructeur vide
	 */
	public ApplicationLogs() {		
	}
	
	/**
	 * Retourne une ArrayList de erreur
	 * @return ArrayList
	 */
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog log_i : this ) {
			if(log_i instanceof ApplicationErrorLog)
				filteredLogs.add(log_i);
		}
		return filteredLogs;
	}
	
	/**
	 * Retourne une ArrayList de warnings
	 * @return ArrayList
	 */
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog log_i : this) {
			if(log_i instanceof ApplicationWarningLog)
				filteredLogs.add(log_i);
		}
		return filteredLogs;
	}
	
	/**
	 * Retourne une ArrayList d'informations
	 * @return ArrayList
	 */
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog log_i : this) {
			if(log_i instanceof ApplicationInfoLog)
				filteredLogs.add(log_i);
		}
		return filteredLogs;
	}
	

}
