package exercice_10;
import javax.print.Doc;
import java.util.*;
public class Logic {
    public static void rechercherParTitre(ArrayList<Document> docs, String titre) {
        for (Document d : docs) {
            if (d.titre.equalsIgnoreCase(titre)) {
                d.afficherInformation();
            }
        }
    }

    public static void afficherDisponibles(ArrayList<Document> docs) {
        for (Document d : docs) {
            if (d.dispo) {
                d.afficherInformation();
            }
        }
    }

    public static void afficherPlusEmprunte(ArrayList<Document> docs) {
        Document max = docs.get(0);

        for (Document d : docs) {
            if (d.getNombreEmprunts() > max.getNombreEmprunts()) {
                max = d;
            }
        }

        System.out.println("Document le plus emprunté: " + max.getTitre() +
                " (" + max.getNombreEmprunts() + " emprunts)");
    }

    public void gererPenalite(ArrayList<Document> docs) {

        for (Document d : docs) {
            if (d.calculerDureeEmpruntMax() > 7) {
                System.out.println("depasse de duree emprunt max!!!!!!!!");
            }
        }

    }

}

