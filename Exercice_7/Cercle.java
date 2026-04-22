package Exercice_7;

public class Cercle extends Forme {
    private double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
    double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    boolean validerDimensions() {
        return rayon > 0;
    }
}
