package data;

public class Traktori {

	private int id;
	private String merkki;
	private String malli;
	private int teho;
	
	public int getId() {
		return id;
	}
	public boolean setId(int id) {
		if (id>0) {
			this.id=id;
			return true;
			}
		return false;
	}
	
	public boolean setId(String id) {
		try {
			return this.setId(Integer.parseInt(id));
		}
		catch(Exception e) {
			
		}
		return false;
	}
	public String getMerkki() {
		return  merkki;
	}
	public boolean setMerkki(String merkki) {
		if (merkki!=null && merkki.length()>=5) {
			this.merkki=merkki;
			return true;
		}
		return false;
	}
	public String getMalli() {
		return malli;
	}
	public boolean setMalli(String malli) {
		if (malli!=null && malli.length()<=5) {
			this.malli=malli;
			return true;
		}
		return false;
	}
	public int getTeho() {
		return teho;
	}
	public boolean setTeho(int teho) {
		if (teho>30 && teho<250) {
			this.teho = teho;
			return true;
			}
		return false;
	}
	public boolean setTeho(String teho) {
		try {
			int t=Integer.parseInt(teho);
			boolean ok=setTeho(t);
			return ok;
		}
		catch (Exception e) {
		}
		return false;
	}
	@Override
	public String toString() {
		return "Traktori [id=" + id + ", merkki=" + merkki + ", malli=" + malli + ", teho=" + teho + "]";
	}
	
	
}
