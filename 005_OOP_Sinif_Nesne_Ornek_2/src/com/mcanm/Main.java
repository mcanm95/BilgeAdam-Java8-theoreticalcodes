package com.mcanm;

import com.alikaya.Paralelkenar;
import com.alikaya.Ucgen;

public class Main {

	public static void main(String[] args) {
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 7;
		dikdortgen1.uzunKenar = 10;

		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 8;
		dikdortgen2.uzunKenar = 15;

		System.out.println("dikdortgen1 nesnesinin alanı: " + dikdortgen1.alanHesapla());
		System.out.println("dikdortgen2 nesnesinin alanı: " + dikdortgen2.alanHesapla());

		dikdortgen2.uzunKenar = 20;
		System.out.println("dikdortgen2 nesnesinin alanı: " + dikdortgen2.alanHesapla());
		
		Kare kare1 = new Kare();
		kare1.kenar = 10;
		System.out.println("kare1 alan: " + kare1.alanHesapla());
		
		Kare kare2 = new Kare();
		kare2.kenar = 20;
		System.out.println("kare2 alan: " + kare2.alanHesapla());
		
		// Ali'nin Paralelkenar sınıfını istediğim şekilde kullanabilir miyim?
		Paralelkenar paralelKenar1 = new Paralelkenar();
		// paralelKenar1.kenarKisa = 30;   --> erişilemez çünkü access modifier default yani protected olarak tanımlandı
		// paralelKenar2.kenarKisa = 50;   --> erişilemez çünkü access modifier default yani protected olarak tanımlandı
		// paralelKenar1.isim --> erişilemez, private tanımlanmış
		
		Ucgen ikizkenarUcgen = new Ucgen();
		ikizkenarUcgen.kenar1 = 10;
		ikizkenarUcgen.kenar2 = 10;
		ikizkenarUcgen.kenar3 = 20;
		System.out.println("Üçgenin çevre uzunluğu: " + ikizkenarUcgen.ucgenCevresi());
		// ikizkenarUcgen.kenarlariUzat(5);   -> protected olduğu için farklı paketlerden erişilemez bu metoda
		ikizkenarUcgen.kereminMetodu(20);    // çalıştı
		System.out.println(ikizkenarUcgen.kenar1 + " " + ikizkenarUcgen.kenar2 + " " + ikizkenarUcgen.kenar3);
		
		// Daire daire1 = new Daire();   --> Daire sınıfı başka bir pakette ve protected (package specific) olduğu için
											// burada erişilemez ve kullanılamaz 
	}

}
