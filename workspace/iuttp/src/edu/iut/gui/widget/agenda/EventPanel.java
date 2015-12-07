package edu.iut.gui.widget.agenda;
import javax.swing.JPanel;
/**
 * Classe  EventPanel qui est une sous-classe de JPanel
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 * 
 */
public class EventPanel extends JPanel {
	
	protected AgendaPanelFactory.ActiveView activeView;
	
	/**
	 * Constructeur
	 * @param activeView
	 */
	public EventPanel(AgendaPanelFactory.ActiveView activeView) {
		this.activeView = activeView;
	}

}
