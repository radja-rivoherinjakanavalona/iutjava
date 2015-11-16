package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Anita RADJA  / Nathalie RIVOHERINJAKANAVALONA
 *
 */

public class ApplicationSession {
	
	// Exercice 1 : Gérer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private static ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par défaut */
		Locale.setDefault(Locale.US);
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("train");
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("IUTException");
		sessionExceptionLogger.setLevel(Level.ALL);
	}
	
	/**
	 * 
	 * @return an ApplicationSession
	 */
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	/**
	 * 
	 * @return an Logger
	 */
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	/**
	 * 
	 * @return an Logger
	 */
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	/**
	 * 
	 * @param locale Locale
	 */
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.strings.res");
	}
	/**
	 * 
	 * @param key String
	 * @return String
	 */
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}
