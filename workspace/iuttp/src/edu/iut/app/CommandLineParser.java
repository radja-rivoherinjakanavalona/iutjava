package edu.iut.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
/**
 * Classe CommandLineParser : reproduit les diff�rents comportements selon les options
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class CommandLineParser {
	
	protected HashMap<String, CommandLineOption <?>> options;
	protected ArrayList<String> parseErrors;
	
	/**
	 * Constructeur sui initialise une liste et un Hashtable
	 */
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption<?>>();
		parseErrors = new ArrayList<String>();
	}
	
	/**
	 * M�thode qui ajpute des options dans une liste
	 * @param option
	 */
	public void addOption(CommandLineOption<?> option) {
		if (option != null) {
			options.put(option.getKey(),option);
		}
	}
	
	/**
	 * M�thode principale qui va g�rer les comportements des diff�rentes options
	 * @param args
	 */
	public void parse(String[] args) {
		for (String argument: args) {
			String[] keyValue=argument.split("=");
			if (options.containsKey(keyValue[0])) {
				switch (((CommandLineOption<?>)options.get(keyValue[0])).getOptionType()) {
				
					// Option : Fichier
					case FILE:
						CommandLineOption<File> fileOption = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
						
					// Option : Cha�ne de cract�res
					case STRING :
						CommandLineOption<String> stringOption = (CommandLineOption<String>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							stringOption.setValue(new String(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
						
					// Option : Entier
					case INTEGER :
						CommandLineOption<Integer> intOption = (CommandLineOption<Integer>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							intOption.setValue(new Integer(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
						
					// Option : Nombre � virgule
					case DOUBLE :
						CommandLineOption<Double> doubleOption = (CommandLineOption<Double>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							doubleOption.setValue(new Double(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
						
					// Option : Aucune valeur
					case NOVALUE : 
						CommandLineOption<?> noValueOption = (CommandLineOption<?>)options.get(keyValue[0]);
						break;
					default:
						parseErrors.add("Unrecognize option type.");						
				}
			}
		}
	}
	
	/**
	 * M�thode qui retourne une option selon une cl� en parametre
	 * @param key
	 * @return CommandLineOption
	 */
	public CommandLineOption<?> getOption(String key) {
		if (options.containsKey(key)) {
			return options.get(key);
		}
		return null;
	}
	
	/**
	 * M�thode qui retourne une liste d'erreurs
	 * @return ArrayList
	 */
	public ArrayList<String> getErrors() {
		return parseErrors;
	}
	
}
