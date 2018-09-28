package zadatak1;

import static org.junit.Assert.*;

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
	public void konstanta_apsolutnaNulaC() {
		fail("Not yet implemented");
	}

}
