package edu.iut.app;
/**
 * Classe ApplicationErrorLog qui est une sous-classe de AbstractApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ApplicationErrorLog extends AbstractApplicationLog {

	/**
	 * Constructeur
	 * Initialise le level et utilise 
	 * le constructeur de  AbstractApplicationLog (h�ritage)
	 */
	public ApplicationErrorLog() {
		super();
		level="[ERROR]";
	}

	/**
	 * M�thode abstraite qui initialise un message d'erreur
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
