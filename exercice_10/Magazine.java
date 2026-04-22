package exercice_10;

public class Magazine extends Document implements Empruntable{
    int num;
    String datePublication;
    Magazine(int id, String titre, String auteur, int num, String date) {
        super(id, titre, auteur);
        this.num = num;
        this.datePublication = date;
    }
    public int calculerDureeEmpruntMax(){
        return 7;
    }
    boolean estRecent(){
        return datePublication.equals("Avril");
    }
    void afficherEdition(){
        System.out.println("Numéro: " + num + ", Date: " + datePublication);
    }
    public boolean estDisponible() {
        return dispo;
    }

    public void reserver() {
        System.out.println("Magazine réservé.");
    }




}
