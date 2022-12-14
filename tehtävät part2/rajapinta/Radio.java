package app;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import data.RadioTehtava;
public class Radio {
	

	public static void main(String[] args) {
		ArrayList<RadioTehtava> lista=lueTehtava();
		tallennaTiedostoon(lista);
	}
		
	private static void tallennaTiedostoon(ArrayList<RadioTehtava> lista) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("radiotdsto.dat");
			oos=new ObjectOutputStream(fos);
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

	public static ArrayList<RadioTehtava> lueTehtava(){
		ArrayList<RadioTehtava> lista=new ArrayList<>();
		RadioTehtava rt=new RadioTehtava();
		rt.setKysymys("Kuka on Suomen tasavallan presidentti?");
		rt.setVaihtoehto1("Aaro");
		rt.setVaihtoehto2("Sauli");
		rt.setVaihtoehto3("Urho");
		rt.setOikea(2);
		lista.add(rt);
		
		rt=new RadioTehtava();
		rt.setKysymys("Kynsilaukka on?");
		rt.setVaihtoehto1("Valkosipuli");
		rt.setVaihtoehto2("Ruohosipuli");
		rt.setVaihtoehto3("Keltasipuli");
		rt.setOikea(1);
		lista.add(rt);
		return lista;
		
	}
}