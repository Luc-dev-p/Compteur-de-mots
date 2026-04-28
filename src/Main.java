import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        File monFishier = new File("monFichier.txt");
        int nombreTotalMots = 0;

        try {

            Scanner lecture = new Scanner(monFishier);


            while (lecture.hasNextLine()) {
                String ligne = lecture.nextLine();

                String[] mots = ligne.split(" ");

                nombreTotalMots += mots.length;
            }
            System.out.println("Le fichier contient " + nombreTotalMots + " mots.");

            lecture.close();
        } catch (FileNotFoundException e) {

            System.out.println("Erreur : Le fichier est introuvable !");
            System.out.println("Détail technique : " + e.getMessage());
        }
    }
}
