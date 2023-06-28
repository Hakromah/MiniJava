package javabasics._10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {

        String userInput;
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the desired string");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "size":
                    System.out.println("The list has " + list.size() + " item" + (list.size() == 1 ? "!" : "s!"));
                    break;
                case "clear":
                    list.clear();
                    System.out.println("Remove all the elements from the list!");
                    break;
                case "print":
                    System.out.println("This is the list" + list);
                    break;
                default:
                    list.add(userInput);
                    System.out.println("Add <" + userInput + "> to the list!");

            }
            System.out.println("-----");
        }


    }
}
