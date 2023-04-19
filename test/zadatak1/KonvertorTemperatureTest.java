package zadatak1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KonvertorTemperatureTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	private KonvertorTemperature instance;

	@Before
	public void setUp() throws Exception {
		instance = new KonvertorTemperature();
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test
	public void atribut_apsolutnaNulaC() {
		assertEquals("Vrednost atributa nije -273.15", -273.15, instance.apsolutnaNulaC, 0.001);
	}
	
	@Test
	public void atribut_apsolutnaNulaF() {
		assertEquals("Vrednost atributa nije -459.67", -459.67, instance.apsolutnaNulaF, 0.001);
	}

	@Test
	public void metoda_konvertujUFarenhajte_Test1() {
		assertEquals("Ako se unese 0 C, povratna vrednost nije 32", 32, instance.konvertujUFarenhajte(0), 0.001);
	}
	
	@Test
	public void metoda_konvertujUFarenhajte_Test2() {
		assertEquals("Ako se unese 5 C, povratna vrednost nije 41",41,instance.konvertujUFarenhajte(5), 0.001);
	}
	
	@Test
	public void metoda_konvertujUFarenhajte_TestGreska() {
		double f = instance.konvertujUFarenhajte(-274);
		
		assertEquals("Ako se unese -274 C, povratna vrednost nije -1000",-1000, f, 0.001);
		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", outContent.toString().toLowerCase().contains("GRESKA".toLowerCase()));
	}
	
	@Test
	public void metoda_konvertujUCelzijuseTest1() {
		assertEquals("Ako se unese 41 F, povratna vrednost nije 5", 5, instance.konvertujUCelzijuse(41), 0.001);
	}

	@Test
	public void metoda_konvertujUCelzijuse_Test2() {
		assertEquals("Ako se unese 32 F, povratna vrednost nije 0", 0, instance.konvertujUCelzijuse(32), 0.001);
	}
	
	@Test
	public void metoda_konvertujUCelzijuse_TestGreska() {
		double c = instance.konvertujUCelzijuse(-460);
		
		assertEquals("Ako se unese -460 C, povratna vrednost nije -1000", -1000, c, 0.001);
		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", outContent.toString().toLowerCase().contains("GRESKA".toLowerCase()));
	}
	
	@Test
	public void metoda_vratiAgregatnoStanjeVode_CVRSTO() {
		assertEquals("Ako se unese -0.5 C, povratna vrednost nije CVRSTO", AgregatnoStanje.CVRSTO, instance.vratiAgregatnoStanjeVode(-0.5));
	}

	@Test
	public void metoda_vratiAgregatnoStanjeVode_TECNO() {
		assertEquals("Ako se unese 0 C, povratna vrednost nije TECNO", AgregatnoStanje.TECNO, instance.vratiAgregatnoStanjeVode(0));
	}

	@Test
	public void metoda_vratiAgregatnoStanjeVode_GAS() {
		assertEquals("Ako se unese 100 C, povratna vrednost nije GAS", AgregatnoStanje.GAS,	instance.vratiAgregatnoStanjeVode(100));
	}

}
