package javabasics._10;

import java.util.Scanner;

public class NameOddOrEven {
    public static void main(String[] args) {
        String myName = "";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name");
            myName = scanner.nextLine();

            int nameTotal = myName.length();
            System.out.println(nameTotal);

            if (nameTotal % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.println("*--*---*---*");
        }
    }
}
