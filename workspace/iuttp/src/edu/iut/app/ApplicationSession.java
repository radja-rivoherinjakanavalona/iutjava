package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Classe ApplicationSession, cette classe va gérer l'internationnalisation
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class ApplicationSession {

	/**
	 * Attributs
	 */
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;
	protected String[] months;
	protected String[] days;


	private static ApplicationSession session = null;

	/**
	 * Constructeur
	 */
	private ApplicationSession() {
		//Locale.setDefault(Locale.US);
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("IUTTrain");
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("IUTException");
		sessionExceptionLogger.setLevel(Level.ALL);

		days = new String[7];
		days[0] = getString("monday"); days[1] =  getString("tuesday"); days[2] =  getString("wednesday");
		days[3] = getString("thursday");   days[4] =  getString("friday"); days[5] =  getString("saturday");
		days[6] = getString("sunday"); 
		
		months = new String[12];
		months[0] = getString("january"); months[1] =  getString("february"); months[2] =  getString("march");
		months[3] = getString("april");   months[4] =  getString("may");      months[5] =  getString("june");
		months[6] = getString("july"); months[7] =  getString("august"); months[8] =  getString("september");
		months[9] = getString("october"); months[10] =  getString("november"); months[11] =  getString("december");
		

	}

	/**
	 * Méthode qui retourne une instance d'ApplicationSession
	 * @return ApplicationSession
	 */
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}

	/**
	 * Méthode qui retourne un GUILogger
	 * @return Logger
	 */
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}

	/**
	 * Méthode qui retourne une ExceptionLogger
	 * @return Logger
	 */
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}

	/**
	 * Méthode qui configure un Locale
	 * @param locale
	 */
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.strings.res");
	}

	/**
	 * Retourne le resourceBunble associé à la clé
	 * @param key
	 * @return String
	 */
	public String getString(String key) {
		return resourceBundle.getString(key);
	}

	/**
	 * Méthode qui retourne un tableau de jours
	 * @return String
	 */
	public String[] getDays() {
		return days;
	}
	
	/**
	 * Méthode qui retourne un tableau de mois
	 * @return String
	 */
	public String[] getMonths() {
		return months;
	}


}
