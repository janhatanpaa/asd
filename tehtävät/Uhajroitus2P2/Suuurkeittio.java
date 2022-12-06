package app;

import java.util.Scanner;

import data.Tiskikone;

public class Suuurkeittio {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiskikone tk1=new Tiskikone();
		lueTiskikone(tk1);
		Tiskikone tk2=new Tiskikone();
		lueTiskikone(tk2);
		tulosta(tk1);
		tulosta(tk2);
		
	}


		

	private static void lueTiskikone(Tiskikone x) {
		// TODO Auto-generated method stub
		
		//Id kokonaislukuna, Muuten ei palauta mitään
		while(true) {
			System.out.println("Anna id: ");
			String s=sc.nextLine();
			try {
				int i=Integer.parseInt(s);
				x.setId(i);
				break;
			}
			catch(Exception e) {
				System.out.println("Luku, kiitos");
			}
		}
		
	//Merkki ja malli luetaan käyttämällä samaa metodia ja Stringiä. HUOMAA kehote metodisssa!
	//Kehote viittaa lueMerkkiJonon sulkeisiin! esim "anna merkki" ja "anna malli" jne.
	//Sama voidaan tehä intillä ottamalla Integer.parseInt mukaan.
	String mjono=lueMerkkiJono("anna merkki: ");
	x.setMerkki(mjono);
	mjono=lueMerkkiJono("anna malli: ");
	x.setMalli(mjono);
	
	//Pesukone kokonaislukuna, Muuten ei palauta mitään
		while(true) {
			System.out.println("Anna pesuohjelma: ");
			String s=sc.nextLine();
			try {
				int i=Integer.parseInt(s);
				x.setPesuohjelma(i);
				break;
			}
			catch(Exception e) {
				System.out.println("Luku, kiitos");
			}
		}
		
	}
	
	
	
	//Merkkijono metodi joka tulostaa Merkin ja Mallin tiedot, jos niissä on yli 3 kirjainta tai numeroa. Muuten ei palauta mitään
	//return s Tallentaa x.setMerkki arvon, jolloin se voi katsoa x.setMallille arvon samalla Stringillä, koska se ei ole enään merkillä käytössä.
	private static String lueMerkkiJono(String kehote) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(kehote);
			String s=sc.nextLine();
			if (s.length()>=3) {
				return s;
			}
			else {
				System.out.println("ainakin kolme kirjainta");
			}
		}
		
	}




	private static void tulosta(Tiskikone tk) {
		System.out.print(tk);
	}




}
