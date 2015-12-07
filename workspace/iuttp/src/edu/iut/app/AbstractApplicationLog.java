package edu.iut.app;

import java.util.ArrayList;
/**
 * Classe AbstractApplicationLog qui implémente l'interface IApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public abstract class AbstractApplicationLog implements IApplicationLog {

	/**
	 * Attributs 
	 *  message : une chaîne de caractère
	 *  level : une chaîne de caractère
	 *  listeners : une liste de IApplicationLogListener
	 */
	protected String message;
	protected String level;
	protected ArrayList<IApplicationLogListener> listeners;

	/**
	 * Constructeur
	 * Initialise le message et la liste 
	 */
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}

	/**
	 * Méthode abstraite qui initialise un message
	 * @param message
	 */
	public abstract void setMessage(String message);

	/**
	 * Méthode qui retourne un message
	 * @return String
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 * Méthode qui ajoute un listener 
	 * de type IApplicationLogListener
	 * @param listener
	 */
	public void addListener(IApplicationLogListener listener){
		listeners.add(listener);
	}

	/**
	 * Méthode qui retourne un tableau de IApplicationLogListener
	 * @return IApplicationLogListener
	 */
	public IApplicationLogListener[] getApplicationLogListeners(){
		IApplicationLogListener[] tabListeners = new IApplicationLogListener[listeners.size()];
		for(int i = 0; i < listeners.size(); i++) {
			tabListeners[i] = listeners.get(i);
		}
		return tabListeners;
	}

	/**
	 * 	Créer un nouveau message pour chaque listener
	 * 	@param level
	 * 	@param message
	 */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, this.message);
		}
	}
}
