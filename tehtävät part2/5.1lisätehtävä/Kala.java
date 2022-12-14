package data;

import java.io.Serializable;
public class Kala implements Serializable  {
	
	private int id;
	private String laji;
	private int pituus;
	
	public Kala() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaji() {
		return laji;
	}
	public void setLaji(String laji) {
		this.laji = laji;
	}
	public int getPituus() {
		return pituus;
	}
	public void setPituus(int pituus) {
		this.pituus = pituus;
	}

	@Override
	public String toString() {
		return "Kala id=" + id + ", laji=" + laji + ", pituus=" + pituus + "";
	}
	
	
}
