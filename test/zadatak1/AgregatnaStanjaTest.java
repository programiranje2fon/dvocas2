package zadatak1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgregatnaStanjaTest {

	@Test
	public void enum_CVRSTO() {
		assertEquals(AgregatnoStanje.CVRSTO, AgregatnoStanje.CVRSTO);
	}

	@Test
	public void enum_TECNO() {
		assertEquals(AgregatnoStanje.TECNO, AgregatnoStanje.TECNO);
	}

	@Test
	public void enum_GAS() {
		assertEquals(AgregatnoStanje.GAS, AgregatnoStanje.GAS);
	}

}
