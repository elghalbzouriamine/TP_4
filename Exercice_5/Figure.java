package Exercice_5;

public abstract class Figure {
    double x;
    double y;
    Figure(double x, double y){
        this.x=x;
        this.y=y;
    }
     protected void dessiner(){
        System.out.println();
    }
    void deplacer(double x1,double y1){
        x=x1;
        y=y1;
    }
    void redimensionner(double facteur) {
        System.out.println("Redimensionnement générique");
    }
}
