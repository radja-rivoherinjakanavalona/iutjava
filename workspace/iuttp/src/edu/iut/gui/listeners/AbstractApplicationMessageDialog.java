package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;
/**
 * Classe AbstractApplicationMessageDialog qui impl�mente
 * l'interface IApplicationLogListener
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	/**
	 * M�thode qui cr�e un message
	 * 	@param level
	 * 	@param message
	 */
	@Override
	public void newMessage(String level, String message) {
		showMessage(level, message);
		
	}
	
	/**
	 * M�thode qui affiche un message
	 * @param level
	 * @param message
	 */
	protected abstract void showMessage(String level, String message);
}
