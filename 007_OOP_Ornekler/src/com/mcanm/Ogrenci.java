package com.mcanm;

public class Ogrenci {

	public int ogrenciNo;
	public String ad; // null bir String'i sysout ile yazdırmaya çalışırsanız exception vermez, null
						// yazdırır
	public String soyad;
	public IletisimBilgileri iletisimBilgileri;

	@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad=" + soyad + ", iletisimBilgileri="
				+ iletisimBilgileri + "]";
	}

	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciNo = 100;
		ogrenci1.ad = "Ali";
		ogrenci1.soyad = "Özkan";
		ogrenci1.iletisimBilgileri = new IletisimBilgileri();
		ogrenci1.iletisimBilgileri.tel = 55544443322L;
		ogrenci1.iletisimBilgileri.adres = "Ihlamur sk No:5 Çankaya Ankara";
		System.out.println(ogrenci1.toString());

		// toString() kullanımı : sysout içine nesneyi yazarsak, sysout otomatik oalrak
		// nesnenin toString() metodunu çağırır
		System.out.println(ogrenci1);

		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciNo = 101;
		ogrenci2.ad = "Zeynep";
		ogrenci2.soyad = "Çalışkan";
		ogrenci2.iletisimBilgileri = new IletisimBilgileri();
		ogrenci2.iletisimBilgileri.tel = 5325323344L;
		ogrenci2.iletisimBilgileri.adres = "manolya apt No:27 Kadıköy İstanbul";
		System.out.println(ogrenci2.toString());

		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciNo = 102;
		ogrenci3.ad = "Ahmet";
		ogrenci3.soyad = "Kaya";
		ogrenci3.iletisimBilgileri = new IletisimBilgileri();
		ogrenci3.iletisimBilgileri.tel = 5424443322L;
		ogrenci3.iletisimBilgileri.adres = "Menekşe apt No:55 Karşıyaka İzmir";
		System.out.println(ogrenci3.toString());

		System.out.println();
		// Soru: siz yapın
		// Öğrenci nesnelerinden oluşan bir dizi oluşturun
		// Diziye sırasıyla ogrenci1, ogrenci2 ve ogrenci3'ü içerik olarak atayın
		// for each döngüsü ile dizinin tüm elemanlarını yazdırın

		Ogrenci[] array = new Ogrenci[4];
		array[0] = ogrenci1; // -> { ogrenci1, null, null, null };
		array[1] = ogrenci2; // -> { ogrenci1, ogrenci2, null, null };
		array[2] = ogrenci3; // -> { ogrenci1, ogrenci2, ogrenci3, null };
		array[3] = new Ogrenci(); // -> { ogrenci1, ogrenci2, ogrenci3, (Ogrenci sinifindan bir nesne) };
		array[3].ogrenciNo = 103;
		array[3].ad = "Bartu";
		array[3].soyad = "Ak";
		array[3].iletisimBilgileri = new IletisimBilgileri();
		array[3].iletisimBilgileri.adres = "Ayrancı mah Çankaya Ankara";
		array[3].iletisimBilgileri.tel = 5321112233L;

		System.out.println("--öğrenci listesi---");
		for (Ogrenci ogrenci : array) {
			// null kontrolü
			if (ogrenci != null) {
				System.out.println(ogrenci);
			}
		}
		
		System.out.println(ogrenci2.ad);
		System.out.println(array[1].ad);

	}

}
