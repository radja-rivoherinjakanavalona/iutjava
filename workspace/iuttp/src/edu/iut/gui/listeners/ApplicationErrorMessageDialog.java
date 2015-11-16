package edu.iut.gui.listeners;

import javax.swing.JOptionPane;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class ApplicationErrorMessageDialog extends AbstractApplicationMessageDialog {

	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.ERROR_MESSAGE, null);
	}

}
