package personnages;

public class Ronnin extends Humain{

    int honneur = 1;

    public Ronnin(String nom, String boisson_fav, int argent) {
        super(nom, boisson_fav, argent);
    }

    public void donner(Commercant beneficiaire){
        parler(beneficiaire.getNom() + " prend ces " + getArgent() / 10 + " sous.");
        beneficiaire.recevoir(getArgent() / 10);
    }
    
}
