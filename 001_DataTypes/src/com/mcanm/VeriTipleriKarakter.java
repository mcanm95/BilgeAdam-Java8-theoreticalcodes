package com.mcanm;

public class VeriTipleriKarakter {

	public static void main(String[] args) {
		
		// CHAR : 1 byte yer kaplar
		char charValue = 'A';          //ASCII tablosundaki decimal karşılığı: 65
		System.out.println(charValue);
		
		//Soru
		char charValue2 = 65;      // bu da A harfini yazdırır
		System.out.println(charValue2);
		
		//Soru
		char charValue3 = 84;
		System.out.println(charValue3);
		
		// STRING : Karakter limiti yoktur. 
		// Ekrana bir şey yazdırmak için sysout("mustafa")
		// Metinleri de tıpkı sayılar gibi değişkenlerde tutabiliriz
		
		
		int y = 75;
		System.out.println(y);
		
		String name = "Ali";
		String surname = "Kaya";
		System.out.println("isim: " + name + "\nsoyisim: " + surname);
		
		String nameSurname;
		nameSurname = name + " " + surname;
		System.out.println(nameSurname);


	}

}
