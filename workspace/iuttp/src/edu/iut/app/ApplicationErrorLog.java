package edu.iut.app;
/**
 * 
 * @author Anita RADJA  / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class ApplicationErrorLog extends AbstractApplicationLog {

	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(this.message);
		super.fireMessage("[ERROR]", this.message);
	}


}
