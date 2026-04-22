package Exercice_1;
import java.awt.*;

public class Etudiant extends Personne{
    String niveau;
    double moyenne;
    Etudiant(String nom, String prenom, double age, String niveau, double moyenne) {
        super(nom, prenom, age);
        this.niveau=niveau;
        this.moyenne=moyenne;
    }
    String calculerMontion(){
        if(moyenne<12 & moyenne>0)
            return "ajournee!!!!";
        else if(moyenne>12 & moyenne<15)
            return "Assez bien";
        else if(moyenne>15 & moyenne<19)
            return "bien";
        else
            return "excelent!!!!!!";

    }
    boolean estAdmis(){
        return moyenne>12;
    }
    void afficheProfile(){
            System.out.println("nom : "+nom);
            System.out.println("prenom : "+prenom);
            System.out.println("Niveau : " + niveau);
            System.out.println("Moyenne : " + moyenne);
            System.out.println("Mention : " + calculerMontion());
            System.out.println("Admis : " + estAdmis() );

        }

    }




