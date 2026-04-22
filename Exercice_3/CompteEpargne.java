package Exercice_3;

public class CompteEpargne extends Compte{
    private double tauInteret;
    CompteEpargne(double sold,double tauInteret){
        super(sold);
        this.tauInteret=tauInteret;
    }
    double calculerInterets(){
        return sold *tauInteret;
    }
    void ajouterInteret(){
        sold+=calculerInterets();
    }
    @Override
    void afficher() {

        System.out.println("votre sold (compte Epargne) est: " + sold);
    }

}
