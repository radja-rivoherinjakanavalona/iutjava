package edu.iut.app;

import java.util.ArrayList;
/**
 * Classe AbstractApplicationLog qui impl�mente l'interface IApplicationLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 */
public abstract class AbstractApplicationLog implements IApplicationLog {

	/**
	 * Attributs 
	 *  message : une cha�ne de caract�re
	 *  level : une cha�ne de caract�re
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
	 * M�thode abstraite qui initialise un message
	 * @param message
	 */
	public abstract void setMessage(String message);

	/**
	 * M�thode qui retourne un message
	 * @return String
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 * M�thode qui ajoute un listener 
	 * de type IApplicationLogListener
	 * @param listener
	 */
	public void addListener(IApplicationLogListener listener){
		listeners.add(listener);
	}

	/**
	 * M�thode qui retourne un tableau de IApplicationLogListener
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
	 * 	Cr�er un nouveau message pour chaque listener
	 * 	@param level
	 * 	@param message
	 */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, this.message);
		}
	}
}
