//Jatkoa tehtävälle 1:
//Tee pääohjelma, jossa luodaan kaksi Tuomari-tyyppistä oliota.
//Ensimmäiselle annetaan arvot muodostuksen yhteydesä ja toiselle settereillä.
//Ohjelman tulee lisäksi tulostaa tuomareiden tiedot erillisessä aliohjelmassa.

package app;

import java.util.Scanner;

import data.Tuomari;

public class TuomariApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Muodostetaan T1 olio
		Tuomari T1=new Tuomari();
		//Luetaan T1 olion Tiedot aliohjelmalla
		//lueTuomari(T1) = kutsutaan toisiksi alinta metodia (private static void lueTuomari(Tuomari x))
		lueTuomari(T1);
		//Tulostetaan T1 olion tiedot erillisellä aliohjelmalla
		//tulostaTuomari(T1) = kutsutaan alhaalla olevaa metodia (private static void tulostaTuomari(Tuomari T))
		tulostaTuomari(T1);
		
		
		//Muodostetaan T2 olio, jossa annetaan sen tiedot samalla
		Tuomari T2=new Tuomari(21, "matti", "Suomi");
		//Tulostetaan T2 olion tiedot erillisellä aliohjelmalla
		//tulostaTuomari(T2) = kutsutaan alhaalla olevaa metodia(private static void tulostaTuomari(Tuomari T))
		tulostaTuomari(T2);

	}



	private static void lueTuomari(Tuomari x) {
		// TODO Auto-generated method stub
		System.out.println("Id ");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		x.setId(i);
		
		//Sama kuin edellinen mutta ei riko ohjelmaa jos kokonaislukua ei ole annettu ja antaa uuden yrityksen.
		//break rikkoo loopin jos try toteutuu, eli se ei silloin käytä catchia.
		
//		while(true) {
//			System.out.println("Anna id: ");
//			s=sc.nextLine();
//			try {
//				int i=Integer.parseInt(s);
//				x.setId(i);
//				break;
//			}
//			catch(Exception e) {
//				System.out.println("Luku, kiitos");
//			}
//		}
		
		
		
		System.out.println("nimi ");
		s=sc.nextLine();
		x.setNimi(s);
		
		//Sama kuin edellinen mutta ei päästä läpi, jos ei anneta yli 3 merkkiä ja antaa uuden yrityksen.
		//break rikkoo loopin jos try toteutuu, eli se ei silloin käytä catchia.
		
//		while(true) {
//			System.out.println("Anna nimi: ");
//			s=sc.nextLine();
//			if (s.length()>=3) {
//				x.setNimi(s);
//				break;
//			}
//			else
//				System.out.println("Ainakin kolme kirjainta");
//		}
		
		
		System.out.println("maa ");
		s=sc.nextLine();
		x.setMaa(s);
	}

	//tulostTuomari = metodi
	private static void tulostaTuomari(Tuomari T) {
		// TODO Auto-generated method stub
		System.out.println(T);
	}
}
