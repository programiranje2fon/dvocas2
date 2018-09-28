package zadatak1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgregatnaStanjaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void enum_CVRSTO() {
		assertEquals(AgregatnaStanja.CVRSTO, AgregatnaStanja.CVRSTO);
	}
	
	@Test
	public void enum_TECNO() {
		assertEquals(AgregatnaStanja.TECNO, AgregatnaStanja.TECNO);
	}
	
	@Test
	public void enum_GAS() {
		assertEquals(AgregatnaStanja.GAS, AgregatnaStanja.GAS);
	}

}
