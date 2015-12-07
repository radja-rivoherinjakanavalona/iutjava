package edu.iut.gui.widget.agenda;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import edu.iut.app.ApplicationSession;
/**
 * Classe  ControlAgendaViewPanel sous classe de JPanel, contrôle 
 * les différentes vues de Agenda
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 * 
 */
public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	/**
	 * Constructeur
	 * @param layerLayout
	 * @param contentPane
	 */
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		JPanel setDate = new JPanel();
        Calendar cal = Calendar.getInstance();
        ApplicationSession app = null;
        
        String[] months = app.instance().getMonths();
        JComboBox monthsList = new JComboBox(months);
        monthsList.setSelectedIndex(cal.get(Calendar.MONTH));
        
        String[] days = app.instance().getDays();
        JComboBox daysList = new JComboBox(days);
        daysList.setSelectedIndex(cal.get(Calendar.DAY_OF_WEEK));

        SpinnerModel spinner = new SpinnerNumberModel(cal.get(Calendar.YEAR), 2010, 2020, 1);
        JSpinner spin = new JSpinner(spinner);
       
        setDate.add(spin);
        setDate.add(monthsList);
        setDate.add(daysList);
        setDate.setLayout(new GridLayout(3,1));	
        add(setDate);
	}
	
}
