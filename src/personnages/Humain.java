package personnages;

import myUtil.Util;

public class Humain {
	private String nom;
	private String boisson_fav;
	
	private int argent;

	
	
	public Humain(String nom, String boisson_fav, int argent) {
		super();
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}

//getters
	public String getNom() {
		return nom;
	}

	public String getBoisson_fav() {
		return boisson_fav;
	}

	public int getArgent() {
		return argent;
	}
	
//methods
	private void parler(String phrase) {
		Util.println("(" + nom + ") - " + phrase);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom+ "et j'aime boire du " + boisson_fav + ".");
	}
	
	public void boire() {
		parler("Mmmmm, un bon verre de " + boisson_fav + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix> argent) {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'orir un "+bien+" à"+ prix+" sous.");
		}
		else {
			parler ("j'ai "+ argent+" sous en poche. Je vais pouvoir m'offrir un "+ bien + 	"à " + prix + "sous !");
			perdreArgent(prix);
		}
	}
	
	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int perte) {
		argent -= perte;
	}

}
