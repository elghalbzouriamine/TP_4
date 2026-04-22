package Exercice_5;

public class Cercle extends Figure {
    double rayon;
    Cercle(double x,double y,double rayon){
        super(x,y);
        this.rayon=rayon;
    }
    @Override
     public void dessiner() {
        System.out.println("Dessiner un cercle");
    }

    @Override
    void redimensionner(double facteur) {
        rayon *= facteur;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

}
