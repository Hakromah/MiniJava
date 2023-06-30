package javabasics._11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LoopsExercises {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        optionalExercise();
    }

    private static void exerciseOne() {
        //1a: Use a FOR EACH loop to the total sum all the elements of the Array List items
        //1b: Use a FOR EACH loop to the total sum all the elements of the int array arrItems
        //1c: Use a FOR EACH loop to the total sum all the elements of the int ArrayList items
        // Notice how can we use the same code for arrays and ArrayLists

        System.out.println("\nExercise 1a:");
        List<Integer> items = Arrays.asList(1, 56, 23);

        int sumForA = 0;
        for (Integer item : items) {
            sumForA += item;
        }
        System.out.println(sumForA);


        System.out.println("\nExercise 1b:");
        int[] arryIems = new int[]{1, 56, 23};

        int sumForB = 0;
        for (int arryIem : arryIems) {
            sumForB += arryIem;
        }
        System.out.println(sumForB);

        int sumForC = 0;
        System.out.println("\nExercise 1c:");
        for (int i = 0; i < items.size(); i++) {
            sumForC += items.get(i);
        }
        System.out.println(sumForC);

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    private static void exerciseTwo() {
        //Find the smallest and largest in the arrayList using a for each loop and an if statement/ Math.min
        System.out.println("\nExercise 2: ...");
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);

        int minNumber = Integer.MIN_VALUE;
        int maxNumber = Integer.MAX_VALUE;

        maxNumber = items.get(0);
        minNumber = items.get(0);

        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) > maxNumber) {
                maxNumber = items.get(i);
            }
            if (items.get(i) < minNumber) {
                minNumber = items.get(i);
            }
        }
        System.out.println("Maximum: " + maxNumber);
        System.out.println("Minimum: " + minNumber);


    }

    private static void exerciseThree() {
        System.out.println("\nExercise Three 3: ---");
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (int i = 0; i < names.size(); i++) {
            if (i < 2) {
                System.out.println(names.get(i));
            }
        }
    }

    private static void exerciseFour() {
        System.out.println("\nExercise Four 4:---");
        int n = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    private static void exerciseFive() {
        System.out.println("\nExercise Five 5:---");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "  x  " + j + "  =  " + i * j);
            }

        }
    }

    private static void optionalExercise() {
        System.out.println("\nExercise but optional");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Monday");
        arr.add("Tuesday");
        arr.add("Wednesday");
        arr.add("Thursday");
        arr.add("Friday");
        arr.add("Saturday");
        arr.add("Sunday");

        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(arr.get(i).toUpperCase());
            }
        }

    }


}
