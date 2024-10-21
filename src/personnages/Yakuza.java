package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	
	int reputation = 0;

	public Yakuza(String nom,String clan ,String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()  + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.getArgent();
		gagnerArgent(gain);
		victime.seFaireExtorquer();
		parler("j’ai piqué les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
	public int getReputation() {
		return reputation;
	}

	// public void direBonjour(){
	// 	super.direBonjour();
	// }

	public int perdre(){
		int perte = getArgent();
		perdreArgent(perte);
		reputation -= 1;
		parler("J'ai perdu mon duel et mes "+ perte +" sous, snif... J'ai déshonoré le clan des "+clan);

		return perte;
	}

	public int gagner(int gain){
		gagnerArgent(gain);
		reputation += 1;

		parler("ce ronin pensait vraiment battre " + getNom() +" du clan des "+ clan+" ? je l'ai dépouillé de ses "+gain+" sous");

		return reputation;
	}
	
}
