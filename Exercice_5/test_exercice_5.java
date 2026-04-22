package Exercice_5;

public class test_exercice_5 {
    public static void main(String[] args) {

        Figure f1 = new Cercle(0, 0, 5);
        Figure f2 = new Triangle(1, 1, 3, 4, 5);

        f1.dessiner();
        f2.dessiner();
        f1.redimensionner(13);
        f2.redimensionner(67);
    }

}
