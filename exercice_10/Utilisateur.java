package exercice_10;
import java.util.*;
public class Utilisateur {
    int id;
    String nom;
    Utilisateur(int id,String nom){
        this.id=id;
        this.nom=nom;
    }
    void emprunterDocument(Document d){
        if(d.dispo) {
            System.out.println("emprunt valid!!!");
            d.dispo = false;
        }
        else
            System.out.println("emprunt invalid!!");
    }
    void retournerDocument(Document d){
        System.out.println("le live a ete retourner!!!");
        d.dispo=true;
    }

}
