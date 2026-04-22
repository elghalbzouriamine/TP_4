package Exercice_1;

public class Personne {
    String nom;
    String prenom;
    double age;
    Personne(String nom,String prenom,double age ){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    void afficherInformation(){
        System.out.println("le nom est: "+nom);
        System.out.println("le prenom est: "+prenom);
        System.out.println("l'age est :"+age);
    }
    boolean estMajeur(){
        return age>=18;
    }
    void sePresenter(){
        System.out.println("bonjour tout le monde,je suis "+nom+" "+prenom+",j'ai"+age+"ans.je suis un etudiant ingenieur!!!");
    }
}
