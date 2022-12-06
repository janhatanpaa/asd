package app;

import java.util.Scanner;

import data.Kala;

public class Kalatiski {

	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kala [] taulu=new Kala[3];
		for (int i=0;i<taulu.length;i++){
			taulu[i]=new Kala();
			lueKalanTiedot(taulu[i]);
		}
		for (Kala k:taulu) {
			tulostaKalat(k);
		}
	}

	private static void lueKalanTiedot(Kala kala) {
		while (true) {
		System.out.print("anna id: ");
		String s=sc.nextLine();
		boolean ok=kala.setId(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("Kokoanisluku");
		}
	}
		
		while (true) {
		System.out.print("anna laji: ");
		String s=sc.nextLine();
		boolean ok=kala.setLaji(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("Ainakin kolme merkkiä");
		}
	}
		
		while (true) {
		System.out.print("anna paino: ");
		String s=sc.nextLine();
		boolean ok=kala.setPaino(s);
		if (ok==true) {
			break;
		}
		else {
			System.out.println("0 ja 50000 välillä");
		}
	}
}

	private static void tulostaKalat(Kala x) {
		// TODO Auto-generated method stub
		System.out.println("Id: "+x.getId());
		System.out.println("Laji: "+x.getLaji());
		System.out.println("Paino: "+x.getPaino());
		}
	}