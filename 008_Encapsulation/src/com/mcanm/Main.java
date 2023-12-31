package com.mcanm;

public class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		motor.setMotorHacmi(14000);
	//	motor.saseNo = "MW4355";
		motor.setYakitTuketimi(10);
		
		
		System.out.println(motor.toString());
		System.out.println(motor);    // -> eğer motor nesnesi için toString metodu varsa otomatik onu çağırır
		
		//
		Otomobil otomobil1 = new Otomobil();
		otomobil1.setAracinKm(0);
		otomobil1.setMarka("Opel");
		otomobil1.setModel("Insignia");
		otomobil1.setYil(2023);
		
		Motor motor1 = new Motor();
		motor1.setMotorHacmi(1500);
		motor1.setYakitTuketimi(10);
		
		otomobil1.setMotor(motor1);
		System.out.println(Otomobil.ARAC_TIPI);
		System.out.println(otomobil1);
		
		Motor motor2 = new Motor();
		motor2.setMotorHacmi(1800);
		motor2.setYakitTuketimi(12);
		otomobil1.setMotor(motor2);
		
		System.out.println("\nMotor değiştikten sonra:\n" + otomobil1);
		
		System.out.println();
		System.out.println(motor1.getMotorHacmi());                 // bu ve alttaki satır aynı bilgiyi getiriyor
		System.out.println(otomobil1.getMotor().getMotorHacmi());	// eskiden (private olmadan önce) direk erişirken -> otomobil1.motor.motorHacmi
		
		// 
		System.out.println();
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.setAracinKm(100);
		otomobil2.setMarka("Audi");
		otomobil2.setModel("A3");
		otomobil2.setYil(2023);
		
		System.out.println(otomobil2.getMotor());
//		otomobil2.getMotor().setMotorHacmi(1400); // --> olmayan bir motora hacim atamaya çalıştığım için NullPointerException hatası
		Motor m = null;
		otomobil2.setMotor(m);    // initialize etmediğim için hata veriyor --> "Motor m;" yazmam yetmiyor new demem gerek. "Motor m = null;" da yetmiyor
		
		m = new Motor();
		otomobil2.setMotor(m);
		otomobil2.getMotor().setMotorHacmi(1400);
		System.out.println("oto2 motor hacmi: " + otomobil2.getMotor().getMotorHacmi());
		
	
	}

}
