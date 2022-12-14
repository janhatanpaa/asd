package data;

import abstrakti.Tasokuvio;

public class Suorakaide extends Tasokuvio {

	@Override
	public int getPintaAla() {
		return super.getPituus()*super.getLeveys();
	}
}
