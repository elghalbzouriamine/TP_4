package Exercice_4;

public class Chat extends Animal{

    @Override
    void crier() {
        System.out.println("meow meow!");;
    }

    public void ronronner() {
        System.out.println("Le chat ronronne");
    }

    public void grimper() {
        System.out.println("Le chat grimpe");
    }
}
