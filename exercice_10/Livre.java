package exercice_10;

import javax.print.Doc;

public  class Livre extends Document implements Empruntable {
    int nbDePages;
    String genre;
    Livre(int id,String titre, String auteur, int nbDePages,String genre){
        super(id,titre,auteur);
        this.nbDePages=nbDePages;
        this.genre=genre;

    }
    @Override
    public boolean estDisponible() {
        return dispo;
    }

    public void reserver() {
        System.out.println("Livre réservé.");
    }
    @Override
    int calculerDureeEmpruntMax(){
        return 7;
    }
    public void afficherDetails(){
        System.out.println("Livre - " + titre + " (" + genre + ") - " +
                nbDePages + " pages");
    }
    public void recommander() {

        System.out.println("Nous recommandons '" + titre + "' de " + auteur);
    }
}
