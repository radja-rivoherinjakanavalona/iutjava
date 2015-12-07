package edu.iut.app;
/**
 * Classe Document
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class Document {
	
	/**
	 * Constructeur qui initialise un document vide
	 */
	public Document() {
		documentURI="";
	}
	
	/**
	 * Constructeur qui initialise un document 
	 * avec son nom en parametre
	 * @param documentURI
	 */
	public Document(String documentURI) {
		this.documentURI = documentURI;
	}
	
	/**
	 * Méthode qui réinitialise un document 
	 * @param number
	 */
	public void setDocumentURI(String number) {
		this.documentURI = number;
	}
	
	/**
	 * Méthode qui retourne un document
	 * @return String
	 */
	public String getDocumentURI() {
		return documentURI;
	}
	
	protected String documentURI;
}
