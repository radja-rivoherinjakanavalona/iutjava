package edu.iut.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.*;

import edu.iut.app.Classroom;
import edu.iut.app.Document;
import edu.iut.app.ExamEvent;
import edu.iut.app.Person;
/**
 * Classe ExamEventTest : test pour les méthodes de ExamEvent
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVLONA
 *
 */
public class ExamEventTest {

	private ExamEvent event;
	private Date examDate1;
	private Date examDate2;
	private Person student1;
	private Person student2;
	private Person jury;
	private ArrayList<Person> jury1;
	private ArrayList<Person> jury2;
	private Classroom classroom1;
	private Classroom classroom2;
	private Document doc;
	private ArrayList<Document> documents1;
	private ArrayList<Document> documents2;
	
	@Before
	public void setUp() {
		System.out.println("Run @Before");
		event = new ExamEvent(examDate1, student1,jury1, classroom1, documents1);
	}
	
	@Test
	public void testExamEvent(){
		System.out.println("Run TestExamEvent\n");
		assertNotNull("L'instance est crée", event);
	}
	
	@Test
	public void testGetExamDate() {
		System.out.println("Run TestGetExamDate\n");
		assertEquals("Est ce que function est correct", examDate1, event.getExamDate());
	}
	
	@Test
	public void testSetExamDate() {
		System.out.println("Run TestSetExamDate\n");
		event.setExamDate(examDate2);
		assertEquals("Est ce que function est correct", examDate2, event.getExamDate());
	}
	
	@Test
	public void testGetStudent() {
		System.out.println("Run TestGetStudent\n");
		assertEquals("Est ce que function est correct", student1, event.getStudent());
	}
	
	@Test
	public void testSetStudent() {
		System.out.println("Run TestSetStudent\n");
		event.setStudent(student2);
		assertEquals("Est ce que function est correct", student2, event.getStudent());
	}
	
	@Test
	public void testGetJury() {
		System.out.println("Run TestGetJury\n");
		assertEquals("Est ce que function est correct", jury1, event.getJury());
	}
	
	@Test
	public void testSetJury() {
		System.out.println("Run TestSetJury\n");
		event.setJury(jury2);
		assertEquals("Est ce que function est correct", jury2,  event.getJury());
	}
	
	@Test
	public void testGetClassroom() {
		System.out.println("Run TestGetClassroom\n");
		assertEquals("Est ce que function est correct", classroom1, event.getClassroom());
	}
	
	@Test
	public void testSetClassroom() {
		System.out.println("Run TestSetClassroom\n");
		event.setClassroom(classroom2);
		assertEquals("Est ce que function est correct", classroom2,  event.getClassroom());
	}
	
	@Test
	public void testGetDocuments() {
		System.out.println("Run TestGetDocuments\n");
		assertEquals("Est ce que function est correct", documents1, event.getDocuments());
	}
	
	@Test
	public void testSetDocuments() {
		System.out.println("Run TestSetDocuments\n");
		event.setDocuments(documents2);
		assertEquals("Est ce que function est correct", documents2,  event.getDocuments());
	}
	

}
