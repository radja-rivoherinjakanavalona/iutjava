package edu.iut.app;
/**
 * Classe ApplicationInfoLog qui est une sous-classe de AbstractApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public class ApplicationInfoLog extends AbstractApplicationLog {

	/**
	 * Constructeur
	 * Initialise le level et utilise 
	 * le constructeur de  AbstractApplicationLog (héritage)
	 */
	public ApplicationInfoLog() {
		super();
		level="[INFO]";
	}
	
	/**
	 * Méthode abstraite qui initialise un message d'information
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
