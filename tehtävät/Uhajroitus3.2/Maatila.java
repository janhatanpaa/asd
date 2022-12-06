package app;

import java.util.Scanner;

import data.Traktori;

public class Maatila {

	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Traktori [] taulu=new Traktori[1];
		for (int i=0;i<taulu.length;i++){
			taulu[i]=new Traktori();
			lueTraktorinTiedot(taulu[i]);
		}
		for (Traktori k:taulu) {
			tulostaTraktorit(k);
		}
	}

	private static void lueTraktorinTiedot(Traktori traktori) {
		while (true) {
		System.out.print("anna id: ");
		String s=sc.nextLine();
		boolean ok=traktori.setId(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("Kokonaisluku");
		}
	}
		
		while (true) {
		System.out.print("anna merkki: ");
		String s=sc.nextLine();
		boolean ok=traktori.setMerkki(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("Ainakin viisi merkkiä");
		}
	}
		
		
		while (true) {
		System.out.print("anna malli: ");
		String s=sc.nextLine();
		boolean ok=traktori.setMalli(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("alle viisi merkkiä");
		}
	}
		
		while (true) {
		System.out.print("anna teho: ");
		String s=sc.nextLine();
		boolean ok=traktori.setTeho(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("30 ja 250 välillä");
		}
	}
}

	private static void tulostaTraktorit(Traktori x) {
		// TODO Auto-generated method stub
		System.out.println(x);
		}
	}