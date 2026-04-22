package Exercice_2;

public class Vehicule {
    String marque;
    Vehicule(String marque){
        this.marque=marque;
    }
    void afficherMarque(){
        System.out.println("la marque est: "+marque);
    }
    void demarrer(){
        System.out.println("Vrum Vrum");
    }
    void arreter(){
        System.out.println("vroom… vrrr… pff");
    }




}
