package com.mcanm;

public class Main {

	public static void main(String[] args) {

		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Audi";
		otomobil1.model = "A3";
		otomobil1.yil = 2012;
		otomobil1.aracinKm = 0;
		otomobil1.motor = new Motor();
		otomobil1.motor.motorHacmi = 1400;
		otomobil1.motor.saseNo = "AU2233445GH";
		otomobil1.motor.yakitTuketimi = 7;
		otomobil1.bilgileriEkranaYaz();
		
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "Opel";
		otomobil2.model = "Astra";
		otomobil2.yil = 2017;
		otomobil2.aracinKm = 5000;
		otomobil2.motor = new Motor();
		otomobil2.motor.motorHacmi = 1600;
		otomobil2.motor.saseNo = "WOLO4455";
		otomobil2.motor.yakitTuketimi = 8;
		otomobil2.bilgileriEkranaYaz();

		otomobil1.araciSur(100); // --> otomobil.aracinKm += 100; --> bu şekilde de yapabilirdik. ama
									// encapsulation kuralına
		otomobil1.bilgileriEkranaYaz(); // uymak için direk değil metod ile değiştiriyoruz
		otomobil1.araciSur(200);
		otomobil1.bilgileriEkranaYaz();

		otomobil2.araciSur(500);
		otomobil2.bilgileriEkranaYaz();

		System.out.println();
		otomobil2.aracYilBilgisiDegistir(2018);
		otomobil2.bilgileriEkranaYaz();

		SUV jeep = new SUV();
		jeep.aracinKm = 20000;
		jeep.marka = "JEEP";
		jeep.model = "Range Rover";
		jeep.yil = 2020;
		jeep.motor = new Motor();
		jeep.motor.motorHacmi = 2000;
		jeep.motor.saseNo = "JJ3344";
		jeep.motor.yakitTuketimi = 14;
		jeep.bilgileriEkranaYaz();

		jeep.motor.yakitTuketimi = 15;
		jeep.bilgileriEkranaYaz();

		// otomobil ya da SUV'den bağımsız motor nesnesi üretebilir miyim? evet
		Motor m1 = new Motor();
		m1.motorHacmi = 1200;
		m1.saseNo = "GGYY5577";
		m1.yakitTuketimi = 5;
		m1.motorBilgileriniYazdir();
		
		otomobil2.motor = m1;
		otomobil2.bilgileriEkranaYaz();
		
		// otomobil1.motor = m1;  -> pratikte iki farklı otomobil aynı motoru kullanamaz ama java bu atamayı yapmamıza izin veriyor
		
		System.out.println();
		Otomobil temp;
		temp = otomobil2;
		temp.motor.motorHacmi = 1100;
		System.out.println(otomobil2.motor.motorHacmi);
		
		System.out.println(m1.motorHacmi);
	}

}
