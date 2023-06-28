package javabasics._10;

import java.util.Scanner;

public class SwitchSecond {
    public static void main(String[] args) {
        int userInput;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number between 1 and 10");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("Can not give you the name");
            }
            System.out.println("*-*-*-*");
        }
    }
}
