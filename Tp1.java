import java.util.Random;
import java.util.Scanner;

public class Tp1 {

	// Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
    private static Scanner scanner;

	// Méthode principale obligatoire
    public static void main(String[] args) {

        scanner new Scanner(system.in);

        exercice1_1();

        scanner.close();
    }

    public static void exercice1_1() {

		// 1° - Déclaration
        String prenom;
        String nom;
        int age;

		// 2° - Initialisation
        System.out.print("Prénom : ");
        prenom = scanner.next();

        System.out.print("Nom : ");
        nom = scanner.next();

        System.out.print("Âge : ");
        age = scanner.next();

		// 3° - Utilisation
        System.out.println("Bonjour " + prenom + nom); //Contrairement à 'print', 'println' passe à la ligne avant d'écrire
        System.out.println("Alors comme ça vous avez " + age + " ans ?" );

    }

}