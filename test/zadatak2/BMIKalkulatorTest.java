package zadatak2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BMIKalkulatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	private BMIKalkulator instance;

	@Before
	public void setUp() throws Exception {
		instance = new BMIKalkulator();
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
	public void atribut_vrednost() {
		assertEquals("Pocetna vrednost nije 0.0", 0.0, instance.vrednost, 0.001);
	}

	@Test
	public void metoda_izracunajBMI() {
		instance.izracunajBMI(1.95, 100);

		assertEquals("Za unete 1.95m i 100kg, metoda ne postavlja atribut BMIVrednost na 26.29848", 26.29848, instance.vrednost, 0.001);
	}

	@Test
	public void metoda_izracunajBMI_Test2() {
		instance.izracunajBMI(1.19, 100);

		assertEquals("Za unete 1.19m i 100kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
				0.0, instance.vrednost, 0.001);


		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", outContent.toString().toLowerCase().contains("GRESKA".toLowerCase()));
	}

	@Test
	public void metoda_izracunajBMI_Test3() {
			instance.izracunajBMI(2.41, 100);

		assertEquals("Za unete 2.41m i 100kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
				0.0, instance.vrednost, 0.001);


		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", outContent.toString().toLowerCase().contains("GRESKA".toLowerCase()));
	}

	@Test
	public void metoda_izracunajBMI_Test4() {
		instance.izracunajBMI(1.95, 29.5);

		assertEquals("Za unete 1.95m i 29.5kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
				0.0, instance.vrednost, 0.001);

		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", outContent.toString().toLowerCase().contains("GRESKA".toLowerCase()));
	}

	@Test
	public void metoda_izracunajBMI_Test5() {
		instance.izracunajBMI(1.95, 200.5);

		assertEquals("Za unete 1.95m i 200.5kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
				0.0, instance.vrednost, 0.001);

		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", outContent.toString().toLowerCase().contains("GRESKA".toLowerCase()));
	}

	@Test
	public void metoda_postaviBMIStatus_ANOREKSICAN() {
		instance.vrednost = 14.5;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 14.5, status nije ANOREKSICAN", BMIKategorija.ANOREKSICAN, instance.status);
	}
	
	@Test
	public void metoda_postaviBMIStatus_MRSAV() {
		instance.vrednost = 15.5;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 15.5, status nije MRSAV", BMIKategorija.MRSAV, instance.status);
	}

	@Test
	public void metoda_postaviBMIStatus_NORMALAN() {
		instance.vrednost = 18.6;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 18.6, status nije NORMALAN", BMIKategorija.NORMALAN, instance.status);
	}
	
	@Test
	public void metoda_postaviBMIStatus_DEBEO() {
		instance.vrednost = 25.1;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 25.1, status nije DEBEO", BMIKategorija.DEBEO, instance.status);
	}
	
	@Test
	public void metoda_postaviBMIStatus_GOJAZAN() {
		instance.vrednost = 30.1;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 30.1, status nije GOJAZAN", BMIKategorija.GOJAZAN, instance.status);
	}
}
