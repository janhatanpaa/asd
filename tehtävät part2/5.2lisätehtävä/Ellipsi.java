package data;

import abstrakti.Tasokuvio;

public class Ellipsi extends Tasokuvio {

	@Override
	public int getPintaAla() {
		return (int) (Math.PI)*this.getPitempiPuoliakseli()*this.getLyhyempiPuoliakseli();
	}
}
