package Exercice_8;

public class Avion implements Volant{
    private double altitude;
    @Override
    public void voler(){
        System.out.println("L'avion vole dans le ciel");
    }
    @Override
    public void atterrir(){
        System.out.println("landing!!!!");
        altitude=0;
    }
    @Override
    public void changerAltitude(double altitude){
        this.altitude=altitude;
        System.out.println("altitude changed!!.current altitude: "+altitude);
    }
    void embarquerPassagers(){
        System.out.println("Les passagers embarquent");
    }
    void afficherAltitude() {
        System.out.println("Altitude actuelle : " + altitude);
    }



}
