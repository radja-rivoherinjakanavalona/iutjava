package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.*;

import edu.iut.app.Document;
import edu.iut.app.Person;
/**
 * Classe DocumentTest : test pour les méthodes de Document
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVLONA
 *
 */
public class DocumentTest {

	private Document doc;
	
	@Before
	public void setUp() {
		System.out.println("Run @Before");
		doc = new Document("ficheStage");
	}
	
	
	@Test
	public void testDocument(){
		System.out.println("Run TestDocument\n");
		assertNotNull("L'instance est créée", doc);
	}
	
	@Test
	public void testGetDocument() {
		System.out.println("Run TestGetDocumentURI\n");
		assertEquals("Est ce que function est correct","ficheStage" , doc.getDocumentURI());
	}
	
	@Test
	public void testSetDocument() {
		System.out.println("Run TestSetDocumentURI\n");
		doc.setDocumentURI("ficheLocalisation");
		assertEquals("Est ce que function est correct","ficheLocalisation", doc.getDocumentURI());
	}

}
