import java.util.Scanner;


public class Tp2 {
    
    private static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // fibonacciFirstMethod();
        fibonacciSecondMethod();
        // fibonacciThirdMethod();

        scanner.close();

    }

    public static void fibonacciFirstMethod() {

        System.out.println("FIBO PREMIERE METHODE");
        System.out.print("Entrez un nombre entier positif : ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Un entier POSITIF on a dit !");
        } 
        else {
            int fibo0 = 0;
            int fibo1 = 1;
    
            switch (number) {
                case 0:
                    System.out.println("F" + number + " vaut " + fibo0);
                    break;
                case 1:
                    System.out.println("F" + number + " vaut " + fibo1);
                    break;
                default:
                    int storedValue;
                    //On avance dans la suite de Fibonacci en ne gardant en mémoire que les 3 derniers termes calculés.
                    for (int i = 2 ; i <= number ; i++) {
                        storedValue = fibo0;
                        fibo0 = fibo1;
                        fibo1 = storedValue + fibo0;
                    }
                    System.out.println("F" + number + " = " + fibo1);
            }
        }

    }

    public static void fibonacciSecondMethod() {

        System.out.println("FIBO DEUXIEME METHODE");
        System.out.print("Entrez un nombre entier positif : ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Un entier POSITIF on a dit !");
        } 
        else {
            // On crée un tableau correspondant à la taille du nombre saisi, pour stocker les valeurs de la suite
            int[] fiboArray = new int[number + 1];

            //On entre les premières valeurs de la suite de Fibonacci dans le tableau.
            fiboArray[0] = 0;
            if (number > 0) fiboArray[1] = 1;
            
            //On calcule les termes restants nécessaires
            for (int i = 2 ; i <= number ; i++) {
                fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
            }

            System.out.println("F" + number + " = " + fiboArray[fiboArray.length - 1]);
        }

    }

    public static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n-1) + calculateFibonacci(n-2);
        }
    }

    public static void fibonacciThirdMethod() {

        System.out.println("FIBO TROISIEME METHODE");
        System.out.print("Entrez un nombre entier positif : ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Un entier POSITIF on a dit !");
        } 
        else {
            int result = calculateFibonacci(number);
            System.out.println("F" + number + " = " + result);
        }
    }

}
