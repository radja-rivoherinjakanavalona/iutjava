package edu.iut.gui.widget.agenda;
import javax.swing.JPanel;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class EventPanel extends JPanel {
	
	protected AgendaPanelFactory.ActiveView activeView;
	/**
	 * 
	 * @param activeView AgendaPanelFactory.ActiveView
	 */
	public EventPanel(AgendaPanelFactory.ActiveView activeView) {
		this.activeView = activeView;
	}

}
