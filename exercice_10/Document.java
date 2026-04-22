package exercice_10;

public abstract class Document {
    int id;
    String titre;
    String auteur;
    boolean dispo;
    int nombreEmprunts;
    Document(int id,String titre,String auteur){
        this.id=id;
        this.auteur=auteur;
        this.titre=titre;
        this.dispo=true;
        this.nombreEmprunts=0;
    }


    void emprunter(String titre){

        dispo=false;
        nombreEmprunts++;
        System.out.println("le document "+titre+"a ete emprunte!");
    }
    int getNombreEmprunts() {
        return nombreEmprunts;
    }
    public String getTitre() {
        return titre;
    }
    void retourner(String titre){
        dispo =true;
        System.out.println(titre + " a ete retourne");

    }
    void afficherInformation(){
        System.out.println("id: "+id+" titre: "+titre+" auteur: "+auteur+" disponabilite: "+(dispo?"oui":"non"));
    }
    abstract int calculerDureeEmpruntMax();
}
