package Exercice_4;

import Exercice_5.Figure;

public class test_exercice_4 {
    public static void main(String[] args){
        Chat cat=new Chat();
        Chien dog=new Chien();
        cat.dormir();

        cat.manger();

        cat.grimper();
        cat.ronronner();
        dog.dormir();
        dog.garder();
        dog.manger();
        dog.jouer();
        cat.crier();
        dog.crier();
    }
}
