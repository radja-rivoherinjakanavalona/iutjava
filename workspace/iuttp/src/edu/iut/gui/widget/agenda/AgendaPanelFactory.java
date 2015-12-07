package edu.iut.gui.widget.agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;
/**
 * Classe  AgendaPanelFactory qui contient les diff�rentes vues d'agenda
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 * 
 */
public class AgendaPanelFactory {

	/**
	 * Enum�ration des vues
	 *
	 */
	public enum ActiveView{
		MONTH_VIEW("Month View"),
		WEEK_VIEW("Week View"),
		DAY_VIEW("Day View");
		
		/**
		 * Attribut
		 * activeView : cha�ne de caract�re
		 */
		private String activeView;
		
		/**
		 * Constructeur pour la liste des vues
		 * @param activeView
		 */
		ActiveView(String activeView) {
			this.activeView = activeView;
		}
		
		public String toString() {
			return activeView;
		}		
	}
	
	/**
	 * Constructeur de la classe
	 */
	public AgendaPanelFactory() {
	}
	
	/**
	 * M�thode qui retourne une des vues d'agenda
	 * @param activeView
	 * @return JPanel
	 */
	public JPanel getAgendaView(ActiveView activeView) {
		JPanel agendaView = null;
		switch (activeView) {
			case MONTH_VIEW:
				MonthPanel monthPanel = new MonthPanel();
				agendaView = monthPanel;
				break;
			case WEEK_VIEW:
				WeekPanel weekPanel = new WeekPanel();
				agendaView = weekPanel;
				break;
			case DAY_VIEW:
				DayPanel dayPanel = new DayPanel(activeView,WeekDayNames.EMPTYDAY);
				agendaView = dayPanel;
				break;
			default:
				break;				
		}
		return agendaView;
	}

}
