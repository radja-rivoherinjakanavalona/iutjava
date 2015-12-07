package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;
/**
 * Classe AbstractApplicationMessageDialog qui implémente
 * l'interface IApplicationLogListener
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	/**
	 * Méthode qui crée un message
	 * 	@param level
	 * 	@param message
	 */
	@Override
	public void newMessage(String level, String message) {
		showMessage(level, message);
		
	}
	
	/**
	 * Méthode qui affiche un message
	 * @param level
	 * @param message
	 */
	protected abstract void showMessage(String level, String message);
}
