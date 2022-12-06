//Tee sellainen Java-kielinen ohjelma, jossa:
//
//1. on luokka Tiskikone, jolla on ominaisuuksina eli attribuutteina id, merkki, malli ja pesuohjelma. Valitse näille sopivat tyypit (int, String, jne).
//Lisää luokkaan myös getterit ja setterit.
//2. on pääohjelma (luokka, jossa on main-funktio), jossa muodostetaan kaksi Tiskikone-tyyppistä oliota ja annetaan näille arvot.
//3. pääohjelmassa on aliohjelma, jossa kummankin tistikoneen tiedot tulostetaan näytölle

//Tee uusi ohjelma, joka on muutoin sama kuin tehtävässä 1, mutta nyt kummallekin Tiskikoneelle luetaan tiedot näppäimistöltä.
//Mieti myös, miten lukemisen voisi tehdä aliohjelmassa.

package app;

import java.util.Scanner;

import data.UHarjoitus1;

public class UHarjoitus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		UHarjoitus1 tiskikone = new UHarjoitus1();
		UHarjoitus1 tiskikone2 = new UHarjoitus1();
		
		System.out.println("id "); ;//Käyttäjälle kehote
		String s=sc.nextLine(); //Luetaan merkkijono näppäimistöltä
		int i=Integer.parseInt(s); ;//Muutetaan merkkijono kokonaisluvuksi
		tiskikone.setId(i); //Tulostetaan annettu luku
		
		System.out.println("malli ");
		s=sc.nextLine();
		tiskikone.setMalli(s);
		
		
		System.out.println("merkki ");
		s=sc.nextLine();
		tiskikone.setMerkki(s);
		
		
		System.out.println("pesuohjelma ");
		s=sc.nextLine();
		i=Integer.parseInt(s);
		tiskikone.setPesuohjelma(i);
		
		
		System.out.println("id ");
		s=sc.nextLine();
		i=Integer.parseInt(s);
		tiskikone2.setId(i);
		
		System.out.println("malli ");
		s=sc.nextLine();
		tiskikone2.setMalli(s);
		
		
		System.out.println("merkki ");
		s=sc.nextLine();
		tiskikone2.setMerkki(s);
		
		
		System.out.println("pesuohjelma ");
		s=sc.nextLine();
		i=Integer.parseInt(s);
		tiskikone2.setPesuohjelma(i);
		
		tulosta(tiskikone);
		tulosta(tiskikone2);

	}

	private static void tulosta(UHarjoitus1 tiskikone) {
		// TODO Auto-generated method stub
		System.out.println(tiskikone);
	}

}
