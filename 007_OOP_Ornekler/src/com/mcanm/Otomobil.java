package com.mcanm;

public class Otomobil {
	
	public static String ARAC_TIPI = "Kara Aracı";

	// Üye özellikler
	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesneye ait özellikler
	public String marka;		// String nesnesi null olarak initialize edilir
	public String model;		// String nesnesi null olarak initialize edilir
	public int yil;				// Sayısal veri tipleri 0 olarak initialize edilir
	public int aracinKm;		// Sayısal veri tipleri 0 olarak initialize edilir
	public Motor motor;			// Otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişken olarak tutuyorum
	
	public void bilgileriEkranaYaz() {
		System.out.println("Marka: " + this.marka + " - Model: " + this.model + " - Yıl: " + this.yil + " - Km: " + this.aracinKm + " " + Otomobil.ARAC_TIPI);
		this.motor.motorBilgileriniYazdir();
		// aşağıdaki satır, yukarıdaki ile aynı işi yapar
		//System.out.println("motor hacmi: " + this.motor.motorHacmi + " - şaşe no: " + this.motor.saseNo + " - yakıt tüketimi : " + this.motor.yakitTuketimi);
		System.out.println();
	}
	
	public void araciSur (int km) {
		System.out.println("Araç " + km + " km. yol yapıyor..");
		this.aracinKm = this.aracinKm + km;     // aracinKm += km;
	}
	
	public void aracYilBilgisiDegistir(int yil) {
		// yil = yil;      // ambiguity : kafa karışıklığı oluştur 
		this.yil = yil;   // -> ok ✔️
	}
}
