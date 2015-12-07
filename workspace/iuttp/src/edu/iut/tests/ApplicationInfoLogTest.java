package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iut.app.ApplicationInfoLog;
/**
 * Classe ApplicationInfoLogTest : test pour les m�thodes de ApplicationInfoLog
 * @author Anita RADJA / Nathalie RIVOHERINJAKANAVALONA
 *
 */
public class ApplicationInfoLogTest {

	@Test
	public void test() {
		ApplicationInfoLog info = new ApplicationInfoLog();
		ApplicationInfoLog info2 = new ApplicationInfoLog();

		System.out.println("Test du message d'erreur");
		info.setMessage("Un message");
		assertEquals(info.getMessage(),"[INFO]un message");

	}

}