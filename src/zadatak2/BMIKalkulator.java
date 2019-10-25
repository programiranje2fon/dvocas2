package zadatak2;

class BMIKalkulator {

	double vrednost = 0.0;

	BMIKategorija status;

	void izracunajBMI(double visina, double tezina) {
		if (visina >= 1.2 && visina <= 2.4 && tezina >= 30 && tezina <= 200)
			vrednost = tezina / (visina * visina);
		else
			System.out.println("GRESKA");
	}

	void postaviBMIStatus() {
		if (vrednost <= 15)
			status = BMIKategorija.ANOREKSICAN;
		else if (vrednost <= 18.5)
			status = BMIKategorija.MRSAV;
		else if (vrednost <= 25)
			status = BMIKategorija.NORMALAN;
		else if (vrednost <= 30)
			status = BMIKategorija.DEBEO;
		else
			status = BMIKategorija.GOJAZAN;
	}
	
	void ispisi() {
		System.out.println("BMI vrednost: " + vrednost);
		System.out.println("BMI status: " + status);
	}

}
