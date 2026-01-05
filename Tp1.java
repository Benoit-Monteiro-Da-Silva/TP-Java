import java.util.Random;
import java.util.Scanner;

public class Tp1 {

	// Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
    private static Scanner scanner;

	// Méthode principale obligatoire
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // exercice1_1();
        // exercice1_2();
        exercice2_1();

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
        age = scanner.nextInt();

		// 3° - Utilisation
        System.out.println("Bonjour " + prenom + " " + nom); //Contrairement à 'print', 'println' passe à la ligne après le texte qu'on lui donne
        System.out.println("Alors comme ça vous avez " + age + " ans ?" );

    }


    public static void exercice1_2() {

        int x;
        int y;

        System.out.print("Saisir valeur de x : ");
        x = scanner.nextInt();
        System.out.print("Saisir la valeur de y : ");
        y = scanner.nextInt();

        int storedValue = x;
        x = y;
        y = storedValue;

        System.out.println("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y);

    }

    public static void exercice2_1() {

        String firstWord;
        String secondWord;

        System.out.print("Saisir un premier mot : ");
        firstWord = scanner.next();
        System.out.print("Saisir un second mot : ");
        secondWord = scanner.next();

        if (firstWord.length() == secondWord.length()) {
            System.out.println("Les deux mots ont le même nombre de caractères.");
        } else if (firstWord.length() > secondWord.length()) {
            System.out.println(firstWord + " est le mot avec le plus de caractères.");
        } else {
            System.out.println(secondWord + " est le mot avec le plus de caractères.");
        }

    }

}