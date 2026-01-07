import java.util.Scanner;


public class Tp2 {
    
    private static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // fibonacciFirstMethod();
        // fibonacciSecondMethod();
        // fibonacciThirdMethod();
        // histoSort();
        // bubbleSort();
        quickSort(0, (intArray.length - 1));

        for (int i = 0 ; i < intArray.length ; i++) {
            System.out.print(intArray[i] + " ");
        }

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
        } 
        if (n == 1) {
            return 1;
        }

        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
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

    public static void histoSort() {

        //On déclare et on remplit un tableau d'entiers
        int[] intArray = new int[7];
        intArray[0] = 9;
        intArray[1] = 4;
        intArray[2] = 6;
        intArray[3] = 4;
        intArray[4] = 7;
        intArray[5] = 2;
        intArray[6] = 7;

        //On créé un tableau représentant l'histogramme de chaque valeur présente dans le premier tableau.
        //Le nombre de cases de ce tableau correspond à la valeur max possible dans le premier tableau (ici 10 cases, pour une valeur max de 9)
        int[] histoArray = new int[10];
        for (int i = 0 ; i < intArray.length ; i++) {
            histoArray[ intArray[i] ]++;
        }

        //On créé et on remplit un troisième tableau, de la même taille que le premier.
        //On parcourt l'histogramme et on ajoute chaque valeur autant de fois que nécessaire dans ce troisième tableau.
        int[] orderedArray = new int[intArray.length];
        int track = 0;
        for (int i = 0 ; i < histoArray.length ; i++) {
            for (int j = 0 ; j < histoArray[i] ; j++) {
                orderedArray[track] = i;
                track++;
            }
        }

        //On affiche tous les éléments du troisième tableau, qui correspondent aux valeurs du premier tableau triées dans l'ordre croissant.
        for(int i = 0 ; i < orderedArray.length ; i++) {
            System.out.print(orderedArray[i] + " ");
        }

    }

    public static void bubbleSort() {

        //On déclare et on remplit un tableau d'entiers
        int[] intArray = new int[7];
        intArray[0] = 9;
        intArray[1] = 4;
        intArray[2] = 6;
        intArray[3] = 4;
        intArray[4] = 7;
        intArray[5] = 2;
        intArray[6] = 7;

        //On permute chaque paire d'entiers consécutifs du tableau lorsque le premier est supérieur au second.
        //Une fois le tableau parcouru entièrement, on a placé le plus grand entier à la fin du tableau.
        //On répète alors l'opération avec seulement les éléments restants pour trier le tableau entièrement.
        for (int j = 0 ; j < (intArray.length - 1) ; j++) {
            for (int i = 0 ; i < (intArray.length - 1 - j) ; i++) {
                if ( intArray[i] > intArray[i+1] ) {
                    int storedValue = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = storedValue;
                }
            }
        }

        //On affiche tous les éléments du tableau, qui se retrouvent triés dans l'ordre croissant.
        for (int i = 0 ; i < intArray.length ; i++) {
            System.out.print(intArray[i] + " ");
        }

    }


    private static int[] intArray = {6, 3, 7, 9, 1, 5, 4};

    public static void quickSort(int firstIndice, int lastIndice) {

        int pivotIndice = lastIndice;
        int pivotValue = intArray[pivotIndice];
        int valueToCompareIndice = firstIndice;
        int valueToCompare = intArray[valueToCompareIndice];

        while (pivotIndice > valueToCompareIndice) {
            
            if (pivotValue < valueToCompare) {

                if (pivotIndice - valueToCompareIndice != 1) {
                    //First permutation
                    intArray[pivotIndice] = intArray[pivotIndice - 1];
                    intArray[pivotIndice - 1] = pivotValue;
                    //Pivot position changed
                    pivotIndice--;
        
                    //Second permutation
                    intArray[valueToCompareIndice] = intArray[pivotIndice + 1];
                    intArray[pivotIndice + 1] = valueToCompare;
                    //Value to compare changed
                    valueToCompare = intArray[valueToCompareIndice];

                } else {
                    //Only one permutation is necessary
                    intArray[valueToCompareIndice] = pivotValue;
                    intArray[pivotIndice] = valueToCompare;
                    pivotIndice--;
                    valueToCompareIndice++;
                }
                
            } else {
                //No permutation necessary
                valueToCompareIndice++;
                valueToCompare = intArray[valueToCompareIndice];
            }

        }

        //On relance si nécessaire sur les parties du tableau à gauche et à droite de la position du pivot.
        if (pivotIndice - firstIndice >= 2) {
            quickSort(firstIndice, pivotIndice - 1);
        }

        if (lastIndice - pivotIndice >=2) {
            quickSort(pivotIndice + 1, lastIndice);
        }

    }

}
