package zadatak2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMIKategorijaTest {

	@Test
	public void enum_ANOREKSICAN() {
		assertEquals(BMIKategorija.ANOREKSICAN, BMIKategorija.ANOREKSICAN);
	}
	
	@Test
	public void enum_MRSAV() {
		assertEquals(BMIKategorija.MRSAV, BMIKategorija.MRSAV);
	}
	
	@Test
	public void enum_NORMALAN() {
		assertEquals(BMIKategorija.NORMALAN, BMIKategorija.NORMALAN);
	}
	
	@Test
	public void enum_DEBEO() {
		assertEquals(BMIKategorija.DEBEO, BMIKategorija.DEBEO);
	}
	
	@Test
	public void enum_GOJAZAN() {
		assertEquals(BMIKategorija.GOJAZAN, BMIKategorija.GOJAZAN);
	}

}
