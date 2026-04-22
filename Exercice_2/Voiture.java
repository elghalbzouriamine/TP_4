package Exercice_2;

public class Voiture extends Vehicule {
    int nbrPortes;
    double carburant;
    Voiture(String marque, int nbrPortes, double carburant) {
        super(marque);
        this.nbrPortes = nbrPortes;
        this.carburant = carburant;
    }
    void afficherDetails(){
        System.out.println("le nombre de portes est: "+nbrPortes);
        System.out.println("actual carburant: "+carburant);

    }
    void  klaxonner(){
        System.out.println("Bip Bip!!!!!");
    }


}




