package Exercice_3;

public class Compte {
    double sold;
    Compte(double sold){
        this.sold=sold;
    }
    void deposer(double montant){
        if (montant > 0) {
            sold += montant;
            System.out.println("valide!!!!!!");
        } else {
            System.out.println("invalide!!!!!!!");
        }
    }
    void retirer(double montant){
        if (montant > 0 && montant <= sold) {
            sold -= montant;
            System.out.println("valide!!!");
        } else {
            System.out.println("invalide!!!");
        }
    }
    double consulterSold(){
        return sold;
    }
    void afficher(){
        System.out.println("votre sold est: "+sold);
    }
}
