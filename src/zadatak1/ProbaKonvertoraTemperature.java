package zadatak1;

class ProbaKonvertoraTemperature {

	public static void main(String[] args) {
		
		KonvertorTemperature kt = new KonvertorTemperature();
		
		double tempFarenhajti = kt.konvertujUFarenhajte(0);
		System.out.println("Temperatura u farenhajtima: " + tempFarenhajti + "F");

		double tempCelzjusi = kt.konvertujUCelzijuse(0);
		System.out.println("Temperatura u celzijusima: " + tempCelzjusi + "C");
		
		System.out.println("Agregatno stanje vode na 13C je: " + kt.vratiAgregatnoStanjeVode(13));
	}

}
