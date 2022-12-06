package app;

import java.util.Scanner;

import data.Traktori;

public class Maatila {

	static Scanner sc=new Scanner(System.in)
			;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traktori [] taulu=new Traktori[3];
		for (int i=0;i<taulu.length;i++) {
			taulu[i]=lueTiedot();
		}
		for (Traktori k:taulu) {
			tulosta(k);
		}
	}

	private static Traktori lueTiedot() {
		int tId=0;
		while (true) {
			System.out.print("Anna id: ");
			String s=sc.nextLine();
			try{
				tId=Integer.parseInt(s);
				break;
			}
			catch(Exception e) {
				System.out.println("Kokonaisluku, kiitos!");
			}
		}
		String tmerkki=null;
		while (true) {
			System.out.print("Anna merkki: ");
			String s=sc.nextLine();
			if (s.length()>=5) {
				tmerkki=s;
				break;
			}
			else {
				System.out.println("Ainakin viisi kirjainta, kiitos!");
			}
		}
		String tmalli=null;
		while (true) {
			System.out.print("Anna malli: ");
			String s=sc.nextLine();
			if (s.length()>=5) {
				tmalli=s;
				break;
			}
			else {
				System.out.println("Ainakin viisi kirjainta, kiitos!");
			}
		}
		int tteho=0;
		while (true) {
			System.out.print("Anna teho: ");
			String s=sc.nextLine();
			try{
				tteho=Integer.parseInt(s);
				break;
			}
			catch(Exception e) {
				System.out.println("Kokonaisluku, kiitos!");
			}
		}
		Traktori traktori=new Traktori(tId, tmerkki, tmalli, tteho);
		return traktori;
	}

	private static void tulosta(Traktori tadaa) {
		System.out.println(tadaa);
	}

}
