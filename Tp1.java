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
        // exercice2_1();
        // exercice2_2();
        // exercice3_1();
        exercice4_1();

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

        System.out.print("Saisir la valeur de x : ");
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
        } else {
            String longerWord = (firstWord.length() > secondWord.length()) ? firstWord : secondWord;
            System.out.println(longerWord + " est le mot avec le plus de caractères.");
        }

    }

    public static void exercice2_2() {

        int year;

        System.out.print("Saisir une année : ");
        year = scanner.nextInt();

        //Les années bissextiles sont divisbles par 4 et PAS par 100, ou bien divisibles par 400
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Oui, l'année " + year + " est bien une année bissextile !");
        } else {
            System.out.println("Non, l'année " + year + " n'est pas une année bissextile");
        }

    }

    public static void exercice3_1() {

        //On initialise le min a la plus grande valeur possible des nombres qui vont être générés.
        int min = 100;
        //On initialise le max a la plus petite valeur possible des nombres qui vont être générés.
        int max = 0;

        for (int i = 1 ; i <= 10 ; i++) {
            
            //On génère un nombre entier aléatoire compris entre 0 et 100 inclus.
            double randomDouble = Math.random() * 101;
            int randomInt = (int) randomDouble;
            
            System.out.println("Le nombre " + i + " vaut " + randomInt);

            if (randomInt > max) {
                max = randomInt;
            }
            if (randomInt < min) {
                min = randomInt;
            } 
        }

        System.out.println("Le maximum vaut " + max + " et le minimum vaut " + min);

    }

    public static void exercice4_1() {

        //On génère un entier aléatoire compris entre 0 et 100 inclus.
        double randomDouble = Math.random() * 101;
        int randomInt = (int) randomDouble;

        //On initialise une valeur différente à coup sûr du nombre aléatoire obtenu (pour rentrer dans la boucle).
        int guess = 101;

        int trials = 0;
        int diff;

        while (guess != randomInt) {
            System.out.print("Entrez un nombre : ");
            guess = scanner.nextInt();
            trials++;

            diff = Math.abs(guess - randomInt);

            if (diff > 20) {
                System.out.println("froid");
            } else if (diff >= 6 && diff <= 20) {
                System.out.println("tiède");
            } else if (diff >=1 && diff <= 5) {
                System.out.println("chaud");
            } else {
                System.out.println("Gagné ! Nombre de tentatives : " + trials); 
            }

        }

    }

}