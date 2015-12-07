package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.*;

import edu.iut.app.Person;
import edu.iut.app.Person.PersonFunction;
/**
 * Classe PersonTest : test pour les méthodes de Person
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVLONA
 *
 */
public class PersonTest {

	private Person person;
	private PersonFunction none;
	private PersonFunction student;

	@Before
	public void setUp() {
		System.out.println("Run @Before");
		person = new Person(none, "firstname1","lastname1", "testGet@orange.fr", "0102030405");
	}

	
	@Test
	public void testPerson(){
		System.out.println("Run TestPerson\n");
		assertNotNull("L'instance est créée", person);
	}

	@Test
	public void testGetFunction() {
		System.out.println("Run TestGetFunction\n");
		assertEquals("Est ce que function est correct", none, person.getFunction());
	}
	
	@Test
	public void testSetFunction() {
		System.out.println("Run TestSetFunction\n");
		person.setFunction(student);
		assertEquals("Est ce que function est correct", student, person.getFunction());
	}
	
	@Test
	public void testGetFirstname() {
		System.out.println("Run TestGetFirstname\n");
		assertEquals("Est ce que firstname est correct", "firstname1", person.getFirstname());
	}
	
	@Test
	public void testSetFirstname() {
		System.out.println("Run TestSetFirstname\n");
		person.setFirstname("firstname2");
		assertEquals("Est ce que firstname est correct", "firstname2", person.getFirstname());
	}
	
	@Test
	public void testGetLastname() {
		System.out.println("Run TestGetLastname\n");
		assertEquals("Est ce que lastname est correct", "lastname1", person.getLastname());
	}
	
	@Test
	public void testSetLastname() {
		System.out.println("Run TestSetLastname\n");
		person.setLastname("lastname2");
		assertEquals("Est ce que lastname est correct", "lastname2", person.getLastname());
	}
	
	@Test
	public void testGetEmail() {
		System.out.println("Run TestGetEmail\n");
		assertEquals("Est ce que email est correct","testGet@orange.fr", person.getEmail());
	}
	
	@Test
	public void testSetEmail() {
		System.out.println("Run TestSetEmail\n");
		person.setEmail("testSet@orange.fr");
		assertEquals("Est ce que email est correct","testSet@orange.fr", person.getEmail());
	}
	
	@Test
	public void testGetPhone() {
		System.out.println("Run TestGetPhone\n");
		assertEquals("Est ce que phone est correct",  "0102030405", person.getPhone());
	}
	
	@Test
	public void testSetPhone() {
		System.out.println("Run TestSetPhone\n");
		person.setPhone("0102030406");
		assertEquals("Est ce que phone est correct",  "0102030406", person.getPhone());
	}

}
