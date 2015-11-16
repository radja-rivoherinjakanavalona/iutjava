package edu.iut.tools;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */

public class IUTScheduler {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE);
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);		        
		    }
		});
	}
	
}
