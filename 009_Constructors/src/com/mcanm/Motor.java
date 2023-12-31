package com.mcanm;

// Constructor (yapıcı metod) : Nesnelerin ilk oluşumu sırasında çağırılan metoddur. Constructorlar public olur. 
// Return tipi yok gibi görünüyor ama return tipi kendi classı gibi düşünebilirsin.
// eğer bir sınıf içinde constructor tanımlı değilse, java otomatik boş argümanlı bir constructor oluşturur.
// Ancak; yazılımcı sınıf içine herhangi bir/birden fazla parametre alan bir constructor tanımlarsa 
// java otomatik olarak constructor oluşturmaz. Bu durumda boş constructora ihtiyaç duyarsak manuel olarak boş constructorı oluşturmamız gerekir.

public class Motor {
	
	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi;  // lt/100 km
	
	
	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {
//		this.motorHacmi = motorHacmi;
//		this.saseNo = saseNo;
//		this.yakitTuketimi = yakitTuketimi;	
		this.setMotorHacmi(motorHacmi);    // -> şu şekilde de kullanılabilir = setMotorHacmi(motorHacmi);
		this.saseNo = saseNo;
		this.setYakitTuketimi(yakitTuketimi);	// -> şu şekilde de kullanılabilir = setYakitTuketimi(yakitTuketimi);
		
	}
	
	public Motor() {
		
	}
			
	
	public int getMotorHacmi() {
		return motorHacmi;			// --> this.motorHacmi; aynısı
	}
	
	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi >= 800 && motorHacmi<=10000) {
		this.motorHacmi = motorHacmi;
		}
		else {
			System.out.println("Motor hacmi 800-10000 dışında girdiğiniz için otomatik olarak 800 değerinde ayarlanmıştır!");
			this.motorHacmi = 800;
		}
	}
	
	public int getYakitTuketimi() {
		return yakitTuketimi;
	}
	
	public void setYakitTuketimi(int yakitTuketimi) {
		if (yakitTuketimi >= 4 && yakitTuketimi <= 25) {
		this.yakitTuketimi = yakitTuketimi;
		}
		else {
			System.out.println("Yakıt tüketim değeri mantıklı sınırların dışında, muhtemelen yanlış veri girildi. En düşük değere ayarlanıyor!");
			this.yakitTuketimi = 4;
		}
	}
	
	public String getSaseNo() {
		return saseNo;
	}
	
	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}
	
	public void setBaziMotorBilgileri(int motorHacmi, int yakitTuketimi) {
		this.setMotorHacmi(motorHacmi);
		this.setYakitTuketimi(yakitTuketimi);
	}

}
