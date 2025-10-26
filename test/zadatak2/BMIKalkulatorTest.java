package zadatak2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BMIKalkulatorTest {

	BMIKalkulator instance;

	@Before
	public void setUp() throws Exception {
		instance = new BMIKalkulator();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void atribut_BMIVrednost() {
		assertEquals("Pocetna vrednost nije 0.0", 0.0, instance.BMIVrednost, 0.001);
	}

	@Test
	public void metoda_izracunajBMI() {
		instance.izracunajBMI(1.95, 100);

		assertEquals("Za unete 1.95m i 100kg, metoda ne postavlja atribut BMIVrednost na 26.29848", 26.29848,
				instance.BMIVrednost, 0.001);
	}

	@Test
	public void metoda_izracunajBMI_Test2() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.izracunajBMI(1.19, 100);

			assertEquals(
					"Za unete 1.19m i 100kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
					0.0, instance.BMIVrednost, 0.001);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			assertTrue("NE ispisuje se rec GRESKA u slucaju greske", ispis.trim().equalsIgnoreCase("GRESKA"));
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test
	public void metoda_izracunajBMI_Test3() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.izracunajBMI(2.41, 100);

			assertEquals(
					"Za unete 2.41m i 100kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
					0.0, instance.BMIVrednost, 0.001);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			assertTrue("NE ispisuje se rec GRESKA u slucaju greske", ispis.trim().equalsIgnoreCase("GRESKA"));
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test
	public void metoda_izracunajBMI_Test4() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.izracunajBMI(1.95, 29.5);

			assertEquals(
					"Za unete 1.95m i 29.5kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
					0.0, instance.BMIVrednost, 0.001);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			assertTrue("NE ispisuje se rec GRESKA u slucaju greske", ispis.trim().equalsIgnoreCase("GRESKA"));
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test
	public void metoda_izracunajBMI_Test5() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.izracunajBMI(1.95, 200.5);

			assertEquals(
					"Za unete 1.95m i 200.5kg, metoda postavlja atribut BMIVrednost, a ne treba jer je visina van granica",
					0.0, instance.BMIVrednost, 0.001);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			assertTrue("NE ispisuje se rec GRESKA u slucaju greske", ispis.trim().equalsIgnoreCase("GRESKA"));
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test
	public void metoda_postaviBMIStatus_ANOREKSICAN() {
		instance.BMIVrednost = 14.5;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 14.5, status nije ANOREKSICAN", BMIKategorija.ANOREKSICAN, instance.BMIStatus);
	}
	
	@Test
	public void metoda_postaviBMIStatus_MRSAV() {
		instance.BMIVrednost = 15.5;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 15.5, status nije MRSAV", BMIKategorija.MRSAV, instance.BMIStatus);
	}

	@Test
	public void metoda_postaviBMIStatus_NORMALAN() {
		instance.BMIVrednost = 18.6;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 18.6, status nije NORMALAN", BMIKategorija.NORMALAN, instance.BMIStatus);
	}
	
	@Test
	public void metoda_postaviBMIStatus_DEBEO() {
		instance.BMIVrednost = 25.1;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 25.1, status nije DEBEO", BMIKategorija.DEBEO, instance.BMIStatus);
	}
	
	@Test
	public void metoda_postaviBMIStatus_GOJAZAN() {
		instance.BMIVrednost = 30.1;
		
		instance.postaviBMIStatus();
		
		assertEquals("Ako je BMIVrednost 30.1, status nije GOJAZAN", BMIKategorija.GOJAZAN, instance.BMIStatus);
	}
}
