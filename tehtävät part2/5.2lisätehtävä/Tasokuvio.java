package abstrakti;

public abstract class Tasokuvio {
	private int pitempiPuoliakseli;
	private int lyhyempiPuoliakseli;
	private int kanta;
	private int korkeus;
	private int pituus;
	private int leveys;
	

	public int getPitempiPuoliakseli() {
		return pitempiPuoliakseli;
	}

	public void setPitempiPuoliakseli(int pitempiPuoliakseli) {
		this.pitempiPuoliakseli = pitempiPuoliakseli;
	}

	public int getLyhyempiPuoliakseli() {
		return lyhyempiPuoliakseli;
	}

	public void setLyhyempiPuoliakseli(int lyhyempiPuoliakseli) {
		this.lyhyempiPuoliakseli = lyhyempiPuoliakseli;
	}

	public int getKanta() {
		return kanta;
	}

	public void setKanta(int kanta) {
		this.kanta = kanta;
	}

	public int getKorkeus() {
		return korkeus;
	}

	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
	}

	public int getPituus() {
		return pituus;
	}

	public void setPituus(int pituus) {
		this.pituus = pituus;
	}

	public int getLeveys() {
		return leveys;
	}

	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}

	public abstract int getPintaAla();
	
	@Override
	public String toString() {
		return "Tasokuvio [Pinta-ala= " + getPintaAla() + "]";
	}
}
