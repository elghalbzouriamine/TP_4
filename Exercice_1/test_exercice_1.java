package Exercice_1;

public class test_exercice_1 {
    public static void main(String[] args){
        Etudiant e=new Etudiant("amine","El ghalbzouri",21,"3em anne",16);
        System.out.println("==================================");
        e.afficherInformation();
        System.out.println("==================================");

        System.out.println(e.estMajeur());
        System.out.println("==================================");
        e.sePresenter();
        System.out.println("==================================");
        System.out.println(e.calculerMontion());
        System.out.println("==================================");
        System.out.println(e.estAdmis());
        System.out.println("==================================");
        e.afficheProfile();
        System.out.println("==================================");

    }
}
