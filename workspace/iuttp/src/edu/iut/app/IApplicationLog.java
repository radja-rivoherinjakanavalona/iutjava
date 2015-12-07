package edu.iut.app;
/**
 * Interface  IApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface IApplicationLog {
	
	/**
	 * M�thode qui initialise un message
	 * Parametre
	 * 	@param message
	 */
	void setMessage(String message);
	
	/**
	 * M�thode qui retourne un message
	 * @return String
	 */
	String getMessage();
	
	/**
	 * M�thode qui ajoute un listener 
	 * de type IApplicationLogListener
	 * 	@param listener
	 */
	void addListener(IApplicationLogListener listener);
	
	/**
	 * M�thode qui retourne un tableau de IApplicationLogListener
	 * @return IApplicationLogListener
	 */
	IApplicationLogListener[] getApplicationLogListeners();
}
