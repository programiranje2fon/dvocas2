package zadatak1;

class KonvertorTemperature {

	static final double APSOLUTNA_NULA_C = -273.15;

	static final double APSOLUTNA_NULA_F = -459.67;

	double konvertujCUF(double tc) {
		if (tc >= APSOLUTNA_NULA_C)
			return tc * 9 / 5 + 32;
		else {
			System.out.println("GRESKA");
			return -1000;
		}
	}

	double konvertujFUC(double tf) {
		if (tf >= APSOLUTNA_NULA_F)
			return (tf - 32) * 5 / 9;

		// Moze i ovako bez ELSE jer prethodni return prekida metodu.
		System.out.println("GRESKA");
		return -1000;
	}

	AgregatnaStanja vratiAgregatnoStanjeVode(double tc) {
		if (tc < 0)
			return AgregatnaStanja.CVRSTO;
		else if (tc < 100)
			return AgregatnaStanja.TECNO;
		else
			return AgregatnaStanja.GAS;
	}

}
