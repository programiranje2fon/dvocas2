package zadatak1;

class KonvertorTemperature {

	static final double apsolutnaNulaC = -273.15;

	static final double apsolutnaNulaF = -459.67;

	double konvertujCUF(double tc) {
		if (tc >= apsolutnaNulaC)
			return tc * 9 / 5 + 32;
		else {
			System.out.println("GRESKA");
			return -1000;
		}
	}

	double konvertujFUC(double tf) {
		if (tf >= apsolutnaNulaF)
			return (tf - 32) * 5 / 9;

		// Moze i ovako bez ELSE jer prethodni return prekida metodu.
		System.out.println("GRESKA");
		return -1000;
	}

	AgregatnaStanja vratiAgregatnoStanjeVode(double tc) {
		if (tc < 0)
			return AgregatnaStanja.CVRSTO;
		else if (tc >= 0 && tc < 100)
			return AgregatnaStanja.TECNO;
		else
			return AgregatnaStanja.GAS;
	}

}
