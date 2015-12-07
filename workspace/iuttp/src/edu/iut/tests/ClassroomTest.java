package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.iut.app.Classroom;
import edu.iut.app.Document;
/**
 * Classe ClassroomTest : test pour les méthodes de Classroom
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVLONA
 *
 */
public class ClassroomTest {

	private Classroom room;

	@Before
	public void setUp() {
		System.out.println("Run @Before");
		room = new Classroom ("106");
	}


	@Test
	public void testClassroom(){
		System.out.println("Run TestClassroom\n");
		assertNotNull("L'instance est créée", room);
	}

	@Test
	public void testGetClassroom() {
		System.out.println("Run TestGetClassroom\n");
		assertEquals("Est ce que function est correct","106" , room.getClassRoomNumber());
	}

	@Test
	public void testSetClassroom() {
		System.out.println("Run TestSetClassroom\n");
		room.setClassroomNumber("102");
		assertEquals("Est ce que function est correct","102", room.getClassRoomNumber());
	}


}
