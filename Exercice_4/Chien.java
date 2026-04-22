package Exercice_4;

public class Chien extends Animal{
    @Override
    void crier(){
        System.out.println("haw haw !!");
    }
    void garder(){
        System.out.println("Le chien garde la maison");
    }

    public void jouer() {
        System.out.println("Le chien joue");
    }

}
