package exercice_10;

import javax.print.Doc;

public  class DocumentNumerique extends Document implements Consultable {
    String format;
    double tailleFichier;
    DocumentNumerique(int id,String titre,String auteur,String format, double taillFichier){
        super(id, titre, auteur);
        this.format=format;
        this.tailleFichier=taillFichier;
    }

    @Override
    int calculerDureeEmpruntMax() {
        return 7;
    }
    void telecharger(){
        System.out.println("downloading...");
    }
    void afficherTaille(){
        System.out.println("la taille de fichier est: "+tailleFichier);
    }
    public void consulter() {
        System.out.println("Consultation en ligne...");
    }
    public void afficherResumer() {
        System.out.println("Résumé du document numérique.");
    }

}
