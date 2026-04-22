package Exercice_7;

public abstract class Forme {
    abstract double calculerSurface();
    void afficherDescription(){
        System.out.println("i'm a geometric form!!!");
    }
    void comparerSurface(Forme f){
        if(this.calculerSurface()>f.calculerSurface()){
            System.out.println("cette forme est plus grand.");
        } else if (this.calculerSurface()<f.calculerSurface()) {
            System.out.println("l autre formz est plus grand!");

        }
        else
            System.out.println("les deux formes ont la meme surface!");
    }


}
