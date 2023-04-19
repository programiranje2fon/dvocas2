# Laboratorijske vežbe – dvočas br. 2

## Zadatak 1
*(radi laborant u saradnji sa studentima)*

Napraviti nabrojivi tip **AgregatnoStanje** u paketu **zadatak1** koji ima sledeće instance **(ENUM - nabrojivi tip)**:

1. **CVRSTO**
2. **TECNO**
3. **GAS**

Napraviti klasu **KonvertorTemperature** u paketu **zadatak1** koja ima:

1. Atribut **apsolutnaNulaC** koji predstavlja vrednost apsolutne nule za celzijusovu skalu. Postaviti da vrednost bude -273.15. 

2. Atribut **apsolutnaNulaF** koji predstavlja vrednost apsolutne nule za farenhajtovu skalu. Postaviti da vrednost bude -459.67.

3. Metodu **konvertujUFarenhajte** koja kao parametar dobija iznos temperature u celzijusima (realan broj). Ova metoda proverava da li je uneta temperatura jednaka ili veća od apsolutne nule za celzijusovu skalu, i ako jeste, pretvara je u temperaturu izraženu u farenhajtima i vraća kao rezultat. Ako nije, metoda vraća vrednost -1000 ispisuje na ekranu "GRESKA". Konverzija se vrši po formuli **TF = TC*9/5 + 32** **(IF klauzula i operatori poređenja vrednosti, RETURN naredba i prekidanje izvršavanja metode)**

4. Metodu **konvertujUCelzijuse** koja kao parametar dobija iznos temperature u farenhajtima. Ova metoda proverava da li je uneta temperatura jednaka ili veća od apsolutne nule za farenhajtovu skalu, i ako jeste, pretvara je u temperaturu izraženu u celzijusima i vraća kao rezultat. Ako nije, metoda vraća vrednost -1000 i ispisuje na ekranu "GRESKA". Konverzija se vrši po formuli **TC = (TF-32)*5/9**

5. Metodu **vratiAgregatnoStanjeVode** koja kao parametar dobija iznos temperature u celzijusima (realan broj) i proverava i vraća u kom bi agregatnom stanju voda bila na toj temperaturi (nabrojivi tip). Ako je temperatura niža od 0 celzijusa, metoda vraća da je voda u čvrstom stanju (AgregatnoStanje.CVRSTO). Ako je od 0 do 100 stepeni (ali ipak manja od 100) onda vraća da je u tečnom stanju (AgregatnoStanje.TECNO), a za temperature od 100 stepeni i više, vraća da je u gasovitom stanju (AgregatnoStanje.GAS).**(ELSE klauzula, složeni uslovi, logički operatori AND, OR, NOT, svaki logički uslov može da se napiše na više načina)**

Napraviti klasu **ProbaKonvertoraTemperature** u paketu **zadatak1** koja, preko svoje **main** metode, proverava rad klase KonvertorTemperature pozivanjem svih njenih metoda i ispisivanjem rezultata na ekranu.

## Zadatak 2
*(Studenti rade sami)*

Napraviti nabrojivi tip **BMIKategorija** u paketu **zadatak2** koji ima sledeće instance:

1. **ANOREKSICAN**
2. **MRSAV**
3. **NORMALAN**
4. **DEBEO**
5. **GOJAZAN**

Napraviti klasu **BMIKalkulator** u paketu **zadatak2** koja ima:

1. Atribut **vrednost** koji predstavlja iznos BMI ("Body Mass Index"-a) jedne osobe (npr. 23.55). Početna vrednost je 0.0;

2. Atribut **status** koji predstavlja BMI kategoriju kojoj osoba pripada (nabrojivi tip BMIKategorija)

3. Metodu **izracunajBMI** koja ima dva parametra: visinu osobe u **METRIMA** (realan broj, npr. 1.85) i težinu osobe u kilogramima (realan broj). Pre izračunavanja je potrebno proveriti da li su visina i težina u okviru granica (1.20-2.40m i 30-200kg). Ako nisu, metoda samo ispisuje na ekranu reč "GRESKA".
Ako jesu u okviru granica, metoda na osnovu unetih parametara izračunava BMI po formuli **BMI = težina/(visina X visina)**. Izračunata vrednost se smešta u atribut **vrednost**.

	Primer računanja: 	Visina = 1.87 m, Težina = 100 kg,  BMI = 100/(1.87*1.87) = 28.59

4. Metodu **postaviBMIStatus** koja uzima vrednost atributa **vrednost** (npr. 20,02) i postavlja odgovarajuću BMI kategoriju u atribut **status** i to prema sledećoj tabeli:

	BMI Kategorija		BMI vrednost
	Anoreksican 		BMI <= 15 
	Mrsav 			15 < BMI <= 18.5 
	Normalan 		18.5 < BMI <= 25
	Debeo			25 < BMI <= 30
	Gojazan			30 < BMI

5. Metodu **ispisi** koja na ekranu ispisuje vrednosti atributa vrednost i status uz odgovarajuću poruku.

Napraviti klasu **ProbaBMIKalkulatora** u paketu **zadatak2** koja u svojoj **main** metodi proverava rad klase BMIKalkulator.