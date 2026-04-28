import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        File monFichier = new File("monfichier.txt");
        int nombreTotalMots = 0;

        try {

            Scanner lecteur = new Scanner(monFichier);


            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                String[] mots = ligne.split(" ");

                nombreTotalMots += mots.length;
            }
            System.out.println("Le fichier contient " + nombreTotalMots + " mots.");

            lecteur.close();
        } catch (FileNotFoundException e) {

            System.out.println("Erreur : Le fichier est introuvable !");
            System.out.println("Détail technique : " + e.getMessage());
        }
    }
}
