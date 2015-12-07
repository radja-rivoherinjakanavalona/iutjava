package edu.iut.app;
/**
 * Classe qui traite les diff�rentes options (File,String,etc)
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 * @param <ValueType>
 */
public class CommandLineOption <ValueType>  {

	protected String key;
	protected String description;
	protected ValueType defaultValue;
	protected ValueType value;
	protected OptionType optionType;

	/**
	 * Enum�ration des options
	 *
	 */
	public enum OptionType{
		NONE(ApplicationSession.instance().getString("none")),
		FILE(ApplicationSession.instance().getString("file")),
		STRING(ApplicationSession.instance().getString("string")),
		INTEGER(ApplicationSession.instance().getString("integer")),
		DOUBLE(ApplicationSession.instance().getString("double")),
		NOVALUE(ApplicationSession.instance().getString("novalue"));
		private String optionType;

		/**
		 * Constructeur avec le nom de l'option en parametre
		 * @param optionType
		 */
		OptionType(String optionType) {
			this.optionType = optionType;
		}

		public String toString() {
			return optionType;
		}		
	}

	/**
	 * Constructeur vide initialisant toutes les valeurs 
	 */
	public CommandLineOption() {	
		optionType = OptionType.NONE;
		key = null;
		description = null;
		defaultValue = null;
		value = null;
	}

	/**
	 * Constructeur avec des parametres contants
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 */
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType defaultValue) {
		this.optionType = optionType;
		this.key = key;
		this.description = description;
		this.defaultValue = defaultValue;
	}

	/**
	 * Constructeur avec des parametres
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 */
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		this.optionType = optionType;
		this.key = key;
		this.description = description;
		this.defaultValue = defaultValue;
	}

	/**
	 * M�thode qui initialise une valeur
	 * @param value
	 */
	public  void setValue(ValueType value) {
		this.value = value;
	}
	
	/**
	 * M�thode qui retourne une cl�
	 * @return String
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * M�thode qui retourne une description
	 * @return String
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * M�thode qui retourne une valeur 
	 * @return ValueType
	 */
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	
	/**
	 * M�thode qui retourne une option
	 * @return OptionType
	 */
	public OptionType getOptionType() {
		return optionType;
	}

}
