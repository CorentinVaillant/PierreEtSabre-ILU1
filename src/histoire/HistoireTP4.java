package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronnin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le noir", "Warsong", "Wisky", 20);
		Ronnin roro = new Ronnin("Roro", "sacke", 60);

		roro.provoquer(yaku);


	}
	
	private void scenar1() {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}
	
	private void scenar2() {
		Commercant marco = new Commercant("Marco", Integer.MAX_VALUE);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}

	private void scenar3(){
		Commercant marco = new Commercant("Marco", Integer.MAX_VALUE);

		Yakuza yaku = new Yakuza("Yaku Le noir", "graunuausse", "Wisky", 0);
		yaku.direBonjour();
		yaku.extorquer(marco);
	}

	private void scenar4(){
		Commercant marco = new Commercant("Marco", 65468);
		
		Ronnin roro = new Ronnin("Roro", "sacke", 60);
		roro.donner(marco);
	}

}
