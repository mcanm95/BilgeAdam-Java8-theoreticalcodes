package com.mcanm;

public class Otomobil {
	
	public static final String ARAC_TIPI = "Kara Aracı";

	private String marka;		// String nesnesi null olarak initialize edilir
	private String model;		// String nesnesi null olarak initialize edilir
	private int yil;			// Sayısal veri tipleri 0 olarak initialize edilir
	private int aracinKm;		// Sayısal veri tipleri 0 olarak initialize edilir
	private Motor motor;		// Otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişken olarak tutuyorum
	
	
	// Parametre: Bir metodun parantez içinde aldığı değişkenlere denir.
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor motor) {
		this.setAracinKm(aracinKm);									// bu constructordaki gibi motor tanımlamak tavsiye ediliyor
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		this.setMotor(motor);
	}
	
	public Otomobil(String marka, String model, int yil, int aracinKm, int motorHacmi, String saseNo, int yakitTuketimi) {
		this.setAracinKm(aracinKm);							
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);											// bu constructordaki gibi motor tanımlamak tavsiye edilmiyor
		this.motor = new Motor(motorHacmi, saseNo, yakitTuketimi);   // bunun yerine aşağıdaki gibi de olur
		// this.setMotor(new Motor(motorHacmi, saseNo, yakitTuketimi));
	}
	
	public Otomobil(String marka, String model) {
		this.setMarka(marka);
		this.setModel(model);
	}
	
	public Otomobil() {
		
	}
	

	public Otomobil(String model, int yil, Motor motor) {
		this.model = model;     	//setModel() metodunda kontrol olmadığı için direkt böyle kullanabilirim. eğer bir kontrol olsaydı setModel() kullanmalıydım
		this.yil = yil;				//setYil() metodunda kontrol olmadığı için direkt böyle kullanabilirim. eğer bir kontrol olsaydı setYil() kullanmalıydım
		this.setMotor(motor);		// setMotor() içinde kontrol olduğu için bunu kullanmam daha iyi olur
	}



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
