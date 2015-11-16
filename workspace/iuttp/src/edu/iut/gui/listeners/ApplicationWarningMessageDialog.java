package edu.iut.gui.listeners;

import javax.swing.JOptionPane;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */

public class ApplicationWarningMessageDialog extends AbstractApplicationMessageDialog {

	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.WARNING_MESSAGE, null);
	}

}
