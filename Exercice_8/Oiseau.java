package Exercice_8;

public class Oiseau implements Volant{
        private double altitude;
        @Override
        public void voler() {
            System.out.println("L'oiseau vole");
        }

        @Override
        public void atterrir() {
            System.out.println("L'oiseau atterrit");
            altitude = 0;
        }

        @Override
        public void changerAltitude(double altitude) {
            this.altitude = altitude;
            System.out.println("Oiseau à altitude : " + altitude);
        }

        public void migrer() {
            System.out.println("L'oiseau migre");
        }

        public void construireNid() {
            System.out.println("L'oiseau construit un nid");
        }
    }

