package javabasics._fibonacci;

import java.util.Scanner;

public class FibonacciExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter a number");

            int number = scanner.nextInt();

            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 0; i < number; i++) {
                if (i == 10) {
                    break;
                }
                System.out.println(c);

                a = b;
                b = c;
                c = a + b;
            }
        }

    }
}
