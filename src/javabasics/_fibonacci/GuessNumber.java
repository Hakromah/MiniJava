package javabasics._fibonacci;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("random number is = ---");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nGuess a number between 1 - 10 to match our number");
            int userData = scanner.nextInt();

            if (userData == number) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Try again");
            }
        }

    }
}
