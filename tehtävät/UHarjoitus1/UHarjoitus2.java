//Tee sellainen Java-kielinen ohjelma, jossa:
//
//1. on luokka Tiskikone, jolla on ominaisuuksina eli attribuutteina id, merkki, malli ja pesuohjelma. Valitse näille sopivat tyypit (int, String, jne).
//Lisää luokkaan myös getterit ja setterit.
//2. on pääohjelma (luokka, jossa on main-funktio), jossa muodostetaan kaksi Tiskikone-tyyppistä oliota ja annetaan näille arvot.
//3. pääohjelmassa on aliohjelma, jossa kummankin tistikoneen tiedot tulostetaan näytölle


package app;

import data.UHarjoitus1;

public class UHarjoitus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Muodostetaan kaksi tiskikone tyyppistä oliota
		UHarjoitus1 tiskikone = new UHarjoitus1();
		UHarjoitus1 tiskikone2 = new UHarjoitus1();
		
		//Annetaan arvot oliolle tiskikone
		tiskikone.setId(1);
		tiskikone.setMalli("A4");
		tiskikone.setMerkki("mersu");
		tiskikone.setPesuohjelma(13);
		
		//Annetaan arvot oliolle tiskikone2
		tiskikone2.setId(3);
		tiskikone2.setMalli("A8");
		tiskikone2.setMerkki("audi");
		tiskikone2.setPesuohjelma(40);
		
		
		//Tulostetaan Tiskikoneiden tiedot
		//Tässä viedään Tiskikone-olioiden osoite (muistiviittaus) aliohjelmalle tulosta
		//ja aliohjelma parametri Tiskikone saa tuon arvon ja käyttää sitä tulostuksessa.
		tulosta(tiskikone);
		tulosta(tiskikone2);

	}

	
//	Aliohjelma tulosta saa parametrinaan Tiskikone-tyyppisen olion viittauksen ja
//	käyttää sitä tulostaessaa Tiskikoneiden tiedot.
	private static void tulosta(UHarjoitus1 tiskikone) {
		// TODO Auto-generated method stub
		System.out.println(tiskikone);
	}

}
