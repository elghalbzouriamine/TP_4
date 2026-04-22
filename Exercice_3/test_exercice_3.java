package Exercice_3;

public class test_exercice_3 {
    public static void main(String[] args){
        Compte c=new Compte(3000);
        c.afficher();
        CompteEpargne ce=new CompteEpargne(1000,0.8);
        ce.ajouterInteret();
        ce.afficher();
        CompteCourant cc=new CompteCourant(2000,500);
        cc.autoriseDecouvert(200);
        System.out.println("les frais: "+cc.calculerFrais());
        cc.afficher();

    }
}
