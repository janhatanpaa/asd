package app;
import java.io.*;
import java.util.ArrayList;
import data.RadioTehtava;

public class LueTehtavat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RadioTehtava> lista=lueTiedostosta();
		tulostaLista(lista);
	}
	private static void tulostaLista(ArrayList<RadioTehtava> lista) {
		// TODO Auto-generated method stub
		for (int i=0;lista!=null && i<lista.size();i++) {
			RadioTehtava rt=lista.get(i);
			System.out.println(rt.getNumero()+": "+rt.getKysymys());
			System.out.println("1: " +rt.getVaihtoehto1());
			System.out.println("2: " +rt.getVaihtoehto2());
			System.out.println("3: " +rt.getVaihtoehto3());
			System.out.println("Oikea="+rt.getOikea());
			
		}
	}
	private static ArrayList<RadioTehtava> lueTiedostosta() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("Radiotdsto.dat");
			ois=new ObjectInputStream(fis);
			ArrayList<RadioTehtava> lista=(ArrayList<RadioTehtava>)ois.readObject();
			return lista;
		}
		catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
