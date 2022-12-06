package data;

public class Kala {

	private int id;
	private String laji;
	private float paino;
	private int pituus;
	
	public int getId() {
		return id;
	}
	public boolean setId(int id) {
		if (id<0) {
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
			return false;
		}
	}
	public String getLaji() {
		return laji;
	}
	public void setLaji(String laji) {
		this.laji = laji;
	}
	public float getPaino() {
		return paino;
	}
	public boolean setPaino(float paino) {
		if (paino>0) {
			this.paino = paino;
			return true;
		}
		return false;
	}
	public boolean setPaino(String s) {
		try {
			float f=Float.parseFloat(s);
			boolean ok=this.setPaino(f);
			if (ok) {
				return true;
			}
		}
		catch(NumberFormatException e) {
		}
		return false;
	}
	public int getPituus() {
		return pituus;
	}
	public boolean setPituus(int pituus) {
		if (pituus>0) {
			this.pituus = pituus;
			return true;
		}
		return false;
	}
	public boolean setPituus(String pituus) {
		try {
			this.pituus = Integer.parseInt(pituus);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Kala [id=" + id + ", laji=" + laji + ", paino=" + paino + ", pituus=" + pituus + "]";
	}
}
