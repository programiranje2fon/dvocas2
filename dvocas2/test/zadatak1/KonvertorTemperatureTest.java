package zadatak1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KonvertorTemperatureTest {

	KonvertorTemperature instance;
	
	@Before
	public void setUp() throws Exception {
		instance = new KonvertorTemperature();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void staticka_konstanta_apsolutnaNulaC() {
		assertEquals("Vrednost konstante nije -273.15",-273.15,KonvertorTemperature.APSOLUTNA_NULA_C, 0.001);
	}
	
	@Test
	public void staticka_konstanta_apsolutnaNulaF() {
		assertEquals("Vrednost konstante nije -459.67",-459.67,KonvertorTemperature.APSOLUTNA_NULA_F, 0.001);
	}
	
	@Test
	public void metoda_konvertujCUFTest1() {
		assertEquals("Ako se unese 0 C, povratna vrednost nije 32",32,instance.konvertujCUF(0), 0.001);
	}
	
	@Test
	public void metoda_konvertujCUFTest2() {
		assertEquals("Ako se unese 5 C, povratna vrednost nije 41",41,instance.konvertujCUF(5), 0.001);
	}
	
	@Test
	public void metoda_konvertujCUFTestGreska() {
			PrintStream pom = System.out;
		try {
			//Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			//Redirekcija
			System.setOut(new PrintStream(buffer));
			
			assertEquals("Ako se unese -274 C, povratna vrednost nije -1000",-1000,instance.konvertujCUF(-274), 0.001);
			
			System.out.flush();
			
			//Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();
			
			//Vracanje System.out na staro
			System.setOut(pom);
			
			assertTrue("NE ispisuje se rec GRESKA u slucaju greske", ispis.trim().equalsIgnoreCase("GRESKA"));
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}
	
	@Test
	public void metoda_konvertujFUCTest1() {
		assertEquals("Ako se unese 41 F, povratna vrednost nije 5",5,instance.konvertujFUC(41), 0.001);
	}
	
	@Test
	public void metoda_konvertujFUCTest2() {
		assertEquals("Ako se unese 32 F, povratna vrednost nije 0",0,instance.konvertujFUC(32), 0.001);
	}
	
	@Test
	public void metoda_konvertujFUCTestGreska() {
		PrintStream pom = System.out;
	try {
		//Otvoren outputstream za redirekciju System.out
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		System.out.flush();
		//Redirekcija
		System.setOut(new PrintStream(buffer));
		
		assertEquals("Ako se unese -460 C, povratna vrednost nije -1000",-1000,instance.konvertujFUC(-460), 0.001);
		
		System.out.flush();
		
		//Preuzimanje ispisa metode na ekranu
		String ispis = buffer.toString();
		
		//Vracanje System.out na staro
		System.setOut(pom);
		
		assertTrue("NE ispisuje se rec GRESKA u slucaju greske", ispis.trim().equalsIgnoreCase("GRESKA"));
	} catch (Exception e) {
		System.setOut(pom);
		e.printStackTrace();
	}
}
	
	@Test
	public void metoda_vratiAgregatnoStanjeVodeCVRSTO() {
		assertEquals("Ako se unese -0.5 C, povratna vrednost nije CVRSTO",AgregatnaStanja.CVRSTO,instance.vratiAgregatnoStanjeVode(-0.5));
	}
	
	@Test
	public void metoda_vratiAgregatnoStanjeVodeTECNO() {
		assertEquals("Ako se unese 0 C, povratna vrednost nije TECNO",AgregatnaStanja.TECNO,instance.vratiAgregatnoStanjeVode(0));
	}
	
	@Test
	public void metoda_vratiAgregatnoStanjeVodeGAS() {
		assertEquals("Ako se unese 100 C, povratna vrednost nije GAS",AgregatnaStanja.GAS,instance.vratiAgregatnoStanjeVode(100));
	}

}
