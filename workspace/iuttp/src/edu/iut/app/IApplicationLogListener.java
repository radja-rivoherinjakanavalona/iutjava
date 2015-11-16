package edu.iut.app;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public interface IApplicationLogListener {
	/**
	 * 
	 * @param level String
	 * @param message String
	 */
	public void newMessage(String level, String message);
}
