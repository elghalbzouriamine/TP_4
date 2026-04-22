package Exercice_7;

public class Rectangle extends Forme{
    private double longueur;
    private double largeur;
    Rectangle(double longueur,double largeur){
        this.largeur=largeur;
        this.longueur=longueur;
    }
    @Override
    double calculerSurface() {
        return longueur * largeur;
    }
    double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
    boolean validerDimensions() {
        return longueur > 0 && largeur > 0;
    }
}
