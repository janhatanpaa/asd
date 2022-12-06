package data;

public class Kala {
	private int id;
	private String laji;
	private float paino;
	
	public int getId() {
		return id;
	}
	
	//Metodi setId on ylikuormitettu
	public boolean setId(int id) {
		if (id>0) {
			this.id = id;
			return true;
		}
		return false;
	}
	public boolean setId(String id) {
		try {
			this.id = Integer.parseInt(id);
			return true;
		}
		catch(NumberFormatException e) {
		}
		return false;
	}
	public String getLaji() {
		return laji;
	}
	public boolean setLaji(String laji) {
		if (laji!=null && laji.length()>3) {
			this.laji = laji;
			return true;
		}
		return false;
	}
	public float getPaino() {
		return paino;
	}
	
	//Metodi setPaino on ylikuormitettu
	public boolean setPaino(float paino) {
		if (paino>=0 && paino<50000) {
			this.paino = paino;
			return true;
		}
		return false;
	}
	public boolean setPaino(String paino) {
		try {
			return this.setPaino(Float.parseFloat(paino));
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	//Kun pääohjelmassa tulostetaan (System.out.println(olioviittaus)
	//Tulostetaan toString metodin palauttama arvo
	public String toString() {
		return this.id+": "+this.laji+" ("+this.paino+")";
		//TAI: return id+": "+laji+" ("+paino+")";
	}
}