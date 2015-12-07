package edu.iut.app;
/**
 * Interface  IApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface IApplicationLog {
	
	/**
	 * Méthode qui initialise un message
	 * Parametre
	 * 	@param message
	 */
	void setMessage(String message);
	
	/**
	 * Méthode qui retourne un message
	 * @return String
	 */
	String getMessage();
	
	/**
	 * Méthode qui ajoute un listener 
	 * de type IApplicationLogListener
	 * 	@param listener
	 */
	void addListener(IApplicationLogListener listener);
	
	/**
	 * Méthode qui retourne un tableau de IApplicationLogListener
	 * @return IApplicationLogListener
	 */
	IApplicationLogListener[] getApplicationLogListeners();
}
