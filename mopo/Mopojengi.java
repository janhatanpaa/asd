package app;

import java.util.ArrayList;

import data.Mopo;

public class Mopojengi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mopo> mopot=new ArrayList<>();
		Mopo m=new Mopo();
		m.setHita(100);
		m.setMaksimiNopeus(45);
		m.setMoottorimerkki("Generic");
		m.setTyyppi("pappa");
		m.setVari("sininen");
		mopot.add(m);
		
		m=new Mopo();
		m.setHita(10000);
		m.setMaksimiNopeus(45);
		m.setMoottorimerkki("honda");
		m.setTyyppi("enduro");
		m.setVari("kirjava");
		mopot.add(m);
		
		tulosta(mopot);
	}

	private static void tulosta(ArrayList<Mopo> mopot) {
		for (Mopo m:mopot) {
			System.out.println(m);
		}
		
	}

}
