package Exercice_5;

public class Triangle extends Figure{
    double a;
    double b;
    double c;
    Triangle(double x,double y,double a,double b,double c){
        super(x,y);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    protected void dessiner(){
        System.out.println("Dessiner un tiangle!");
    }
    @Override
    void redimensionner(double facteur){
        a *= facteur;
        b *= facteur;
        c *= facteur;
    }
    double calculerPerimetre(){
        return a+b+c;
    }
    double calculerSurface(){
        double s = calculerPerimetre() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
