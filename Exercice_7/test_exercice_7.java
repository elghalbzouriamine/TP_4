package Exercice_7;

public class test_exercice_7 {

        public static void main(String[] args) {

            Rectangle r = new Rectangle(5, 3);
            Cercle c = new Cercle(4);

            r.afficherDescription();
            System.out.println("Surface rectangle: " + r.calculerSurface());
            System.out.println("Surface cercle: " + c.calculerSurface());
            r.comparerSurface(c);
            System.out.println("Périmètre rectangle: " + r.calculerPerimetre());

            System.out.println("Périmètre cercle: " + c.calculerPerimetre());
        }
    }

