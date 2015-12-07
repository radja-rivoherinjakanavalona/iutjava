package edu.iut.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iut.app.ApplicationSession;
/**
 * 
 * Classe  NotImlemented qui implémente ActionListener
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class NotImplemented implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ApplicationInfoMessageDialog messageInfo = new ApplicationInfoMessageDialog();
		messageInfo.newMessage("Information", ApplicationSession.instance().getString("messageInfo"));
		
	}
	

}
