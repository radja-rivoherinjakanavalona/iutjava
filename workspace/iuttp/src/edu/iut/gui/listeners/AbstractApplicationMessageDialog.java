package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public abstract class AbstractApplicationMessageDialog implements IApplicationLogListener {

	@Override
	public void newMessage(String level, String message) {
	 showMessage(level, message);

	}
	/**
	 * 
	 * @param level
	 * @param message
	 */
	protected abstract void showMessage(String level, String message);

}
