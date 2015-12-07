package edu.iut.gui.listeners;

import javax.swing.JOptionPane;
/**
 * Classe  ApplicationWarningMessageDialog qui est une sous-classe
 * de AbstractApplicationMessageDialog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ApplicationWarningMessageDialog extends
		AbstractApplicationMessageDialog {

	/**
	 * Méthode qui affiche un message warning
	 * @param level
	 * @param message
	 */
	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.WARNING_MESSAGE, null);
	}

}
