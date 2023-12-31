package com.mcanm;

public class Main {

	public static void main(String[] args) {
		
		// 1. otogaleri nesnesi:
		OtoGaleri kardeslerOtoGaleri = new OtoGaleri("Kardeşler Oto Galeri", 5);
		
		Otomobil otomobil1 = new Otomobil("Opel", "Corsa", 2018, 124000, new Motor(1000, "WOLOGG1", 7), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		Otomobil otomobil2 = new Otomobil("Opel", "Astra", 2019, 114000, new Motor(1400, "WOLOGG2", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil2);
		Otomobil otomobil3 = new Otomobil("Audi", "A2", 2019, 114000, new Motor(1400, "WOLOGG2", 8), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil3);
		Otomobil otomobil4 = new Otomobil("Audi", "Q3", 2018, 114000, new Motor(1500, "WOLOGG2", 10), 55);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil4);
		Otomobil otomobil5 = new Otomobil("BMW", "3.20", 2020, 145000, new Motor(1700, "WOLOGG2", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil5);
		
		Otomobil otomobil6 = new Otomobil("BMW", "5.20", 2020, 145000, new Motor(1700, "WOLOGG2", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil6);
		
		
		kardeslerOtoGaleri.galeridekiOtomobilleriListele();
		System.out.println("Galerideki anlık oto sayısı: " + kardeslerOtoGaleri.getGaleridekiOtomobilSayisi());
		
		// 2. otogaleri nesnesi:
		OtoGaleri galeriSuperCar = new OtoGaleri("Galeri SuperCar", 100);
		
		Otomobil otomobil7 = new Otomobil("Fiat", "Aegea", 2017, 188000, new Motor(1400, "FAW22334", 10), 45);
		Otomobil otomobil8 = new Otomobil("Renault", "Clio", 2018, 134000, new Motor(1200, "RAW22334", 8), 40);
		
		galeriSuperCar.galeriyeOtomobilEkle(otomobil7);
		galeriSuperCar.galeridekiOtomobilleriListele();
		galeriSuperCar.galeriyeOtomobilEkle(otomobil8);
		galeriSuperCar.galeridekiOtomobilleriListele();
		
		// findCount
		System.out.println();
		System.out.println(kardeslerOtoGaleri.getGaleriAdi() + " galerisindeki Audi otomobil sayısı: " + kardeslerOtoGaleri.findCount("audi"));
		System.out.println(kardeslerOtoGaleri.getGaleriAdi() + " galerisindeki BMW otomobil sayısı: " + kardeslerOtoGaleri.findCount("bmw"));
		System.out.println(galeriSuperCar.getGaleriAdi() + " galerisindeki Renault araç sayısı: " + galeriSuperCar.findCount("renault"));
		
		Otomobil otomobil9 = new Otomobil("Renault", "Megane", 2019, 105000, new Motor(1200, "RAW22334", 8), 50);
		galeriSuperCar.galeriyeOtomobilEkle(otomobil9);
		
		System.out.println(galeriSuperCar.getGaleriAdi() + " galerisindeki Renault araç sayısı: " + galeriSuperCar.findCount("renault"));
		
		System.out.println();
		// search işlemi
		System.out.println("\n* * * Search sonuçları - kardeşlerOtoGaleri * * *\n");
		Otomobil[] sonuclarDizisi = kardeslerOtoGaleri.search("audi");
		for (Otomobil oto : sonuclarDizisi) {
			System.out.println(oto);
		}
		
		System.out.println("\n* * * Search sonuçları - galeriSuperCar * * *\n");
		Otomobil[] sonuclarDizisi2 = galeriSuperCar.search("fiat");
		for (Otomobil oto : sonuclarDizisi2) {
			System.out.println(oto);
		}
		
		System.out.println("\n* * * silme işlemleri * * *\n");
		galeriSuperCar.galeridenOtomobilSil(1);
		galeriSuperCar.galeridekiOtomobilleriListele();
		
				
	}

}
