package edu.iut.app;
/**
 * Interface IApplicationLogListener
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public interface IApplicationLogListener {
	
	/**
	 * Méthode qui crée un message
	 * 	@param level
	 * 	@param message
	 */
	void newMessage(String level, String message);
}
