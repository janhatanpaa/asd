package data;

import abstrakti.Tasokuvio;

public class Kolmio extends Tasokuvio {

	@Override
	public int getPintaAla() {
		return (super.getKanta()*super.getKorkeus())/2;
	}

}
