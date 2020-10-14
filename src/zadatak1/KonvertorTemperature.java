package zadatak1;

class KonvertorTemperature {

	static final double APSOLUTNA_NULA_C = -273.15;

	static final double APSOLUTNA_NULA_F = -459.67;

	double konvertujUFarenhajte(double celzjusi) {
		if (celzjusi >= APSOLUTNA_NULA_C)
			return celzjusi * 9 / 5 + 32;
		else {
			System.out.println("GRESKA!!");
			return -1000;
		}
	}

	double konvertujUCelzijuse(double farenhajti) {
		if (farenhajti >= APSOLUTNA_NULA_F)
			return (farenhajti - 32) * 5 / 9;

		// Moze i ovako bez ELSE jer prethodni return prekida metodu.
		System.out.println("GRESKA");
		return -1000;
	}

	AgregatnoStanje vratiAgregatnoStanjeVode(double tc) {
		if (tc < 0)
			return AgregatnoStanje.CVRSTO;
		else if (tc >= 0 && tc < 100)
			return AgregatnoStanje.TECNO;
		else
			return AgregatnoStanje.GAS;
	}

}
