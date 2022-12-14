package app;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import data.Kala;
public class KirjoitaOlio {

	public static void main(String[] args) {
		kirjoitaKala();
	}
	private static void kirjoitaKala() {
	Scanner sc = new Scanner(System.in);
	ArrayList<Kala>lista=new ArrayList<>();
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("kalatdsto.dat");
			oos=new ObjectOutputStream(fos);
			
			Kala k=new Kala();
			System.out.println("id ");
			k.setId(Integer.parseInt(sc.nextLine()));
			System.out.println("laji ");
			k.setLaji(sc.nextLine());
			System.out.println("pituus ");
			k.setPituus(Integer.parseInt(sc.nextLine()));
			lista.add(k);
			
			k=new Kala();
			System.out.println("id ");
			k.setId(Integer.parseInt(sc.nextLine()));
			System.out.println("laji ");
			k.setLaji(sc.nextLine());
			System.out.println("pituus ");
			k.setPituus(Integer.parseInt(sc.nextLine()));
			lista.add(k);
			
			oos.writeObject(lista);
			System.out.println(lista);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}