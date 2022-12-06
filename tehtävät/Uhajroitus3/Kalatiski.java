package app;

import java.util.Scanner;

import data.Kala;

public class Kalatiski {

	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kala kala=new Kala();
		
		
		
		while(true) {
			System.out.print("Id ");
			String s=sc.nextLine();
			boolean b=kala.setId(s);
			if (b==true); {
				break;
			}
				
		}
		
		
		
		kala.setLaji("shark");
		
		while(true) {
			System.out.print("Paino ");
			String s=sc.nextLine();
			boolean b=kala.setPaino(s);
			if (b==true); {
				break;
			}
				
		}
		
		while(true) {
			System.out.print("Pituus: ");
			String s=sc.nextLine();
			boolean b=kala.setPituus(s);
			if (b==true); {
				break;
			}
				
		}
		
		tulosta(kala);
	}
	
	
	private static void tulosta(Kala kala) {
		System.out.println("Id: "+kala.getId());
		System.out.println("Laji: "+kala.getLaji());
		System.out.println("Paino: "+kala.getPaino());
		System.out.println("Pituus: "+kala.getPituus());
		
	}

}
