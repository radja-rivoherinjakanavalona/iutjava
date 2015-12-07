package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.app.ApplicationSession;
import edu.iut.gui.listeners.NotImplemented;
import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
/**
 * Classe SchedulerFrame qui est une sous-classe de JFrame
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */

public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;
	
	/**
	 * Méthode qui initialise les différents composants
	 */
	protected void setupUI() {
		
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu, submenu;		
		JMenuItem menuItem;
		
		/**
		 * Création du menu
		 */
		// Menu Fichier
		menu = new JMenu(ApplicationSession.instance().getString("file"));
		// Menu Item Télécharger
		menuItem = new JMenuItem(ApplicationSession.instance().getString("load"));
		menuItem.addActionListener(new NotImplemented());
		menu.add(menuItem);
		// Menu Item Sauver
		menuItem = new JMenuItem(ApplicationSession.instance().getString("save"));
		menuItem.addActionListener(new NotImplemented());
		menu.add(menuItem);
		// Menu Item Quitter
		menuItem = new JMenuItem(ApplicationSession.instance().getString("quit"));
		menuItem.addActionListener(new NotImplemented());
		menu.add(menuItem);
		menuBar.add(menu);
		
		// Menu Editer
		menu = new JMenu(ApplicationSession.instance().getString("edit"));
		// Menu Item Vues
		submenu = new JMenu(ApplicationSession.instance().getString("view"));
		// Sous Menu Item Mois
		menuItem = new JMenuItem(ApplicationSession.instance().getString("month"));
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    layerLayout.show(contentPane, ActiveView.MONTH_VIEW.name());			
			}			
		});
		submenu.add(menuItem);
		// Sous Menu Item Semaine
		menuItem = new JMenuItem(ApplicationSession.instance().getString("week"));
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    layerLayout.show(contentPane, ActiveView.WEEK_VIEW.name());			
			}			
		});
		submenu.add(menuItem);
		// Sous Menu Item Jour
		menuItem = new JMenuItem(ApplicationSession.instance().getString("day"));
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    layerLayout.show(contentPane, ActiveView.DAY_VIEW.name());			
			}			
		});
		submenu.add(menuItem);
		menu.add(submenu);
		menuBar.add(menu);
		
		// Menu Aider
		menu = new JMenu(ApplicationSession.instance().getString("help"));
		// Menu Item Afficher
		menuItem = new JMenuItem(ApplicationSession.instance().getString("display"));
		menuItem.addActionListener(new NotImplemented());
		menu.add(menuItem);
		// Menu Item A propos
		menuItem = new JMenuItem(ApplicationSession.instance().getString("about"));
		menuItem.addActionListener(new NotImplemented());
		menu.add(menuItem);
		menuBar.add(menu);
		
		menuBar.add(menu);
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}
	
	/**
	 * Constructeur qui initialise la fenetre et les composants
	 */
	public SchedulerFrame() {
		super();
		
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	
	/**
	 * Constructeur qui initilise la fenetre avec un titre 
	 * avec les composants
	 * @param title
	 */
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}
	
}
