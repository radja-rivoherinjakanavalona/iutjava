package edu.iut.app;
/**
 * Classe qui traite les différentes options (File,String,etc)
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
	 * Enumération des options
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
	 * Méthode qui initialise une valeur
	 * @param value
	 */
	public  void setValue(ValueType value) {
		this.value = value;
	}
	
	/**
	 * Méthode qui retourne une clé
	 * @return String
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * Méthode qui retourne une description
	 * @return String
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Méthode qui retourne une valeur 
	 * @return ValueType
	 */
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	
	/**
	 * Méthode qui retourne une option
	 * @return OptionType
	 */
	public OptionType getOptionType() {
		return optionType;
	}

}
