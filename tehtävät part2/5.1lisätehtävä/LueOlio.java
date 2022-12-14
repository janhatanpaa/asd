package app;

import java.io.*;
import java.util.ArrayList;

import data.Kala;

public class LueOlio {

	public static void main(String[] args) {
		
		lueKala();
	}
		
		private static void lueKala() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("kalatdsto.dat");
			ois=new ObjectInputStream(fis);
			ArrayList<Kala> lista=(ArrayList<Kala>)ois.readObject();
			System.out.println(lista);
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
		
	}

}