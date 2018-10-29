package zadatak1;

class ProbaKonvertoraTemperature {

	public static void main(String[] args) {
		
		KonvertorTemperature kt = new KonvertorTemperature();
		
		double tf = kt.konvertujCUF(0);
		
		System.out.println("Temperatura u farenhajtima: " + tf + "F");

		double tc = kt.konvertujFUC(0);
		
		System.out.println("Temperatura u celzijusima: " + tc + "C");
		
		System.out.println("Agregatno stanje vode na 13C je: " + kt.vratiAgregatnoStanjeVode(13));
	}

}
