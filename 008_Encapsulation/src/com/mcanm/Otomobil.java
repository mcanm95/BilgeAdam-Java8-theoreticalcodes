package com.mcanm;

public class Otomobil {
	
	public static final String ARAC_TIPI = "Kara Aracı";

	// Üye özellikler
	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesneye ait özellikler
	private String marka;		// String nesnesi null olarak initialize edilir
	private String model;		// String nesnesi null olarak initialize edilir
	private int yil;			// Sayısal veri tipleri 0 olarak initialize edilir
	private int aracinKm;		// Sayısal veri tipleri 0 olarak initialize edilir
	private Motor motor;		// Otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişken olarak tutuyorum
	

	
	public void araciSur (int km) {
		System.out.println("Araç " + km + " km. yol yapıyor..");
		this.aracinKm = this.aracinKm + km;     // aracinKm += km;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAracinKm() {
		return aracinKm;
	}

	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		if (motor != null) {
		this.motor = motor;
		}
		else {
			System.out.println("otomobile takmaya çalışılan motor nesnesi null (yok) !");
		}
	}

	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", aracinKm=" + aracinKm + ", motor="
				+ motor + "]";
	}
	

}
