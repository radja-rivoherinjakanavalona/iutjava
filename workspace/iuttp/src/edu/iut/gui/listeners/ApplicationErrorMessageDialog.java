package edu.iut.gui.listeners;

import javax.swing.JOptionPane;
/**
 * Classe  ApplicationErrorMessageDialog qui est une sous-classe
 * de AbstractApplicationMessageDialog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {

	/**
	 * Méthode qui affiche un message d'erreur
	 * @param level
	 * @param message
	 */
	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.ERROR_MESSAGE, null);
	}

}
