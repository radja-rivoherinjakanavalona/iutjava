package edu.iut.gui.listeners;

import javax.swing.JOptionPane;
/**
 * Classe  ApplicationInfoMessageDialog qui est une sous-classe
 * de AbstractApplicationMessageDialog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ApplicationInfoMessageDialog extends
		AbstractApplicationMessageDialog {

	/**
	 * Méthode qui affiche un message d'information
	 * @param level
	 * @param message
	 */
	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.INFORMATION_MESSAGE, null);
	}
}
