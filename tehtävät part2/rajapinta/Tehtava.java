package data;

import java.io.Serializable;

public class Tehtava implements Serializable {
	private int numero;
	private String kysymys;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getKysymys() {
		return kysymys;
	}
	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}
	
	
}
