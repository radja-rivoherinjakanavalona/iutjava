package edu.iut.app;
/**
 * Classe ApplicationWarningLog qui est une sous-classe de AbstractApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ApplicationWarningLog extends AbstractApplicationLog {

	/**
	 * Constructeur
	 * Initialise le level et utilise 
	 * le constructeur de  AbstractApplicationLog (héritage)
	 */
	public ApplicationWarningLog() {
		super();
		level = "[WARNING]";
	}
	
	/**
	 * Méthode abstraite qui initialise un message warning
	 * Paramètre
	 * 	@param message
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).newMessage(level, this.message);
		}
	}
}
