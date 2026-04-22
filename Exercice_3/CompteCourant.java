package Exercice_3;

public class CompteCourant extends Compte{
    double decouvertAutorise;
    CompteCourant(double sold,double decouvertAutorise){
        super(sold);
        this.decouvertAutorise=decouvertAutorise;
    }
    void autoriseDecouvert(double montant){
        decouvertAutorise=montant;
    }
    void retirer(double montant) {
        if (montant <= sold + decouvertAutorise) {
            sold -= montant;
        } else {
            System.out.println("Invalid!!!");
        }
    }
    double calculerFrais(){
        return 10;
    }

    @Override
    void afficher() {

        System.out.println("votre sold (compte courant) est: " + sold);
    }
    }
