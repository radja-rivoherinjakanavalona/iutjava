package edu.iut.app;
/**
 * 
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public interface IApplicationLog {
	/**
	 * @param message String
	 */
	public void setMessage(String message);
	
	/**
	 * @return String
	 */
	public String getMessage();
	
	/**
	 * @param listener IApplicationLogListener
	 */
	public void addListener(IApplicationLogListener listener);
	
	/**
	 * 
	 * @return IApplicationLogListener[]
	 */
	public IApplicationLogListener[] getApplicationLogListeners();
}
