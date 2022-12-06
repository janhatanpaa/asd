package data;

public class Mopo extends Kulkuneuvo{
	private String moottorimerkki;
	private String tyyppi;
	
	public Mopo() {
		System.out.println("Mopo muodostettu");
	}
	
	public String getMoottorimerkki() {
		return moottorimerkki;
	}
	public void setMoottorimerkki(String moottorimerkki) {
		this.moottorimerkki = moottorimerkki;
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	@Override
	public String toString() {
		return "moottorimerkki=" + moottorimerkki + "\ntyyppi=" + tyyppi +
				"\nhinta=" + this.getHita() +
				"\nväri=" + this.getVari() +
				"\nhhuiput=" + this.getHita();
	
	}
}
