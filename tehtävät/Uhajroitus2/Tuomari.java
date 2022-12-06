//Mäkihyppykilpailussa on eri maista olevia tuomareita, jotka antavat tyylipisteitä kunkin hyppääjän suorituksesta.
//
//Tee sellainen Java-kielinen ohjelma, jossa:
//
//1. on luokka Tuomari, jolla on attribuutteina id, nimi ja maa (anna sopivat tyypit kaikille attribuuteille).
//2. on aksessorit (getterit ja setterit) kaikille attribuuteille.
//3. on oletusmuodostimen näköinen parametriton muodostin
//4. on muodostin, jolla voidaan antaa parametrina arvot kaikkiin luokan attribuutteihin.

package data;

public class Tuomari {

	private int id;
	private String nimi;
	private String maa;
	
	
	//Parametriton muodostin
	public Tuomari() {}
	//on muodostin, jolla voidaan antaa parametrina arvot kaikkiin luokan attribuutteihin.
	public Tuomari( int id, String nimi, String maa) {
		this.id=id;
		this.nimi=nimi;
		this.maa=maa;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getMaa() {
		return maa;
	}
	public void setMaa(String maa) {
		this.maa = maa;
	}
	@Override
	public String toString() {
		return "Tuomari [id=" + id + ", nimi=" + nimi + ", maa=" + maa + "]";
	}
	
	
}
