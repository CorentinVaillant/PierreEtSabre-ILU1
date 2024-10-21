package personnages;

public class Ronnin extends Humain{

    int honneur = -1;

    public Ronnin(String nom, String boisson_fav, int argent) {
        super(nom, boisson_fav, argent);
    }

    public void donner(Commercant beneficiaire){
        parler(beneficiaire.getNom() + " prend ces " + getArgent() / 10 + " sous.");
        beneficiaire.recevoir(getArgent() / 10);
    }

    public void provoquer(Yakuza ennemie){
        if(honneur*2 >= ennemie.reputation){
            parler("Je t'ai eu petit Yakuza");
            ennemie.perdre();
            honneur++;
        }
        else{
            parler("j'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
            ennemie.gagner(getArgent());
            perdreArgent(getArgent());
            honneur--;
        }

    }
    
}
