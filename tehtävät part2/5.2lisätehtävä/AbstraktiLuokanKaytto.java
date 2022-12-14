package app;
import java.util.ArrayList;

import abstrakti.Tasokuvio;
import data.Kolmio;
import data.Suorakaide;
import data.Ellipsi;

public class AbstraktiLuokanKaytto {

	public static void main(String[] args) {
		ArrayList<Tasokuvio> lista = new ArrayList<>();
		Tasokuvio ellipsi= new Ellipsi();
		ellipsi.setLyhyempiPuoliakseli(5);
		ellipsi.setPitempiPuoliakseli(7);
		lista.add(ellipsi);
		
		Tasokuvio suoraKaide=new Suorakaide();
		suoraKaide.setPituus(4);
		suoraKaide.setLeveys(9);
		lista.add(suoraKaide);
		
		Tasokuvio kolmio=new Kolmio();
		kolmio.setKorkeus(7);
		kolmio.setKanta(8);
		lista.add(kolmio);
		
		
		for (Tasokuvio k:lista)
		{
			System.out.println(k);
		}

	}

}
