package edu.iut.app;
/**
 * Interface IApplicationLogListener
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface IApplicationLogListener {
	
	/**
	 * M�thode qui cr�e un message
	 * 	@param level
	 * 	@param message
	 */
	void newMessage(String level, String message);
}
