package histoire;

import personnages.Humain;
import personnages.Commercant1;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant1 marco = new Commercant1("Marco", Integer.MAX_VALUE);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

		
	}
	
	private void scenar1() {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}

}
