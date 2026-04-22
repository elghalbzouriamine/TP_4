package Exercice_8;

public class test_exercice_8 {
        public static void main(String[] args) {
            Volant v1 = new Oiseau();
            Volant v2 = new Avion();
            v1.voler();
            v1.changerAltitude(100);

            v1.atterrir();

            v2.voler();
            v2.changerAltitude(10000);
            v2.atterrir();
            Oiseau o = new Oiseau();
            o.migrer();
            o.construireNid();
            Avion a = new Avion();
            a.embarquerPassagers();
            a.afficherAltitude();
        }
    }

