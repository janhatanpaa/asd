package data;

public class Kulkuneuvo {
	private float hinta;
	public String vari;
	private int maksimiNopeus;
	
	public Kulkuneuvo() {
		System.out.println("Kulkuneuvo muodeostettu");
	}
	
	public float getHita() {
		return hinta;
	}
	public void setHita(float hinta) {
		this.hinta = hinta;
	}
	public String getVari() {
		return vari;
	}
	public void setVari(String vari) {
		this.vari = vari;
	}
	public int getMaksimiNopeus() {
		return maksimiNopeus;
	}
	public void setMaksimiNopeus(int maksimiNopeus) {
		this.maksimiNopeus = maksimiNopeus;
	}
	
	
}


