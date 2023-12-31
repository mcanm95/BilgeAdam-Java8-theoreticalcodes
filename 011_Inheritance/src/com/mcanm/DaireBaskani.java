package com.mcanm;

// DaireBaskani sınıfı da Personel sınıfının bir alt sınıfıdır (DaireBaskani sınıfı Personel sınıfından türemiştir)
// (Personel sınıfı, DaireBaskani sınıfının super classı'dır)
public class DaireBaskani extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] bagliMudurler;

	public String getMakamAdi() {
		return makamAdi;
	}

	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	public Mudur[] getBagliMudurler() {
		return bagliMudurler;
	}

	public void setBagliMudurler(Mudur[] bagliMudurler) {
		this.bagliMudurler = bagliMudurler;
	}

}
