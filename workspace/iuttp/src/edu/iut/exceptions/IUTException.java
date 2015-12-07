package edu.iut.exceptions;
/**
 * Classe IUTException qui est une xous-classe de Exception
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class IUTException extends Exception {
	
	/**
	 * Construteur sans parametre : 
	 * Il retourne une instance vide
	 */
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	
	/**
	 * Constructeur avec parametre : 
	 * il retourne un message d'erreur avec le parametre en question
	 * @param e
	 */
	public IUTException(IUTException e) {
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	
	/**
	 * Constructeur avec parametre : 
	 * il retourne un message d'erreur
	 * @param message
	 */
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
