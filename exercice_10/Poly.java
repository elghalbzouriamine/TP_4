package exercice_10;
import javax.print.Doc;
import java.util.ArrayList;
public class Poly {
    public static void main(String[] args) {
        ArrayList<Document> docs = new ArrayList<>();
        docs.add(new Livre(1, "Java", "Amine", 300, "Informatique"));
        docs.add(new Magazine(2, "Gitex", "Ali", 10, "2026"));
        docs.add(new DocumentNumerique(3, "python totu", "Sara", "PDF", 5.5));

        for (Document d : docs) {
            d.afficherInformation();
            System.out.println("Duree max: " + d.calculerDureeEmpruntMax());
        }
        Logic.rechercherParTitre(docs,"java");
        Logic.afficherDisponibles(docs);
        Logic.afficherPlusEmprunte(docs);





    }
}
