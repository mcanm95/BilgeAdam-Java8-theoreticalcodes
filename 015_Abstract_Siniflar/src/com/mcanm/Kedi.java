package com.mcanm;

public class Kedi extends Hayvan {

	public void sesCikar() {
		System.out.println("miyav..");
	}

	public Kedi(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public String toString() {
		return "Kedi [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunlugu()=" + getUzunlugu() + "]";
	}

	@Override
	public void yemekYe() {
		System.out.println("kedi mama yiyor..");
		
	}
	
	public void sutIc() {
		System.out.println("kedi süt içiyor..");
	}

}
