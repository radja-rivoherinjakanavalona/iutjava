package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;
/**
 * Classe  MonthPanel qui est une sous-clsse de EventPanel
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 * 
 */
public class MonthPanel extends EventPanel {

	int dayOfMonth = 1;
	/**
	 * Constructeur
	 */
	public MonthPanel() {
		super(ActiveView.MONTH_VIEW);
		GridLayout daysOfMonthLayout = new GridLayout(5,7);		
		this.setLayout(daysOfMonthLayout);
		GregorianCalendar calendar = new GregorianCalendar();		
		for (int di = 0;di<calendar.getActualMaximum(Calendar.DAY_OF_MONTH);di++) {
			JPanel day = new DayPanel(ActiveView.MONTH_VIEW,WeekDayNames.EMPTYDAY);
			day.add(new JLabel(new Integer(dayOfMonth).toString()));
			this.add(day);
			dayOfMonth++;
		}
	}
}
