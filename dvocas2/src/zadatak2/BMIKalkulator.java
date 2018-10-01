package zadatak2;

class BMIKalkulator {

	double BMIVrednost = 0.0;

	BMIKategorija BMIStatus;

	void izracunajBMI(double visina, double tezina) {
		if (visina >= 1.2 && visina <= 2.4 && tezina >= 30 && tezina <= 200)
			BMIVrednost = tezina / (visina * visina);
		else
			System.out.println("GRESKA");
	}

	void postaviBMIStatus() {
		if (BMIVrednost <= 15)
			BMIStatus = BMIKategorija.ANOREKSICAN;
		else if (BMIVrednost <= 18.5)
			BMIStatus = BMIKategorija.MRSAV;
		else if (BMIVrednost <= 25)
			BMIStatus = BMIKategorija.NORMALAN;
		else if (BMIVrednost <= 30)
			BMIStatus = BMIKategorija.DEBEO;
		else
			BMIStatus = BMIKategorija.GOJAZAN;
	}
	
	void ispisi() {
		System.out.println("BMI vrednost: " + BMIVrednost);
		System.out.println("BMI status: " + BMIStatus);
	}

}
