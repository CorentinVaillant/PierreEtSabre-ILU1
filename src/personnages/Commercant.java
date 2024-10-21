package personnages;


//pour une raison inexplicable mon éditeur pense que Commercant n'existe pas, mais que Commercant1 oui 

public class Commercant extends Humain{

	public Commercant(String nom,int argent) {
		super(nom, "thé", argent);
	}
	
	public void seFaireExtorquer() {
		parler(getArgent() + " !! Non, ce monde est si cruelle envers mes profits colossaux !!");
		perdreArgent(getArgent());
	}
	
	public void recevoir(int somme) {
		parler("Merci humble ronnin, tu aurrais pu me donner plus que " + somme + "sous tout de même !");
		gagnerArgent(somme);
	}
	

}
