package javabasics._functions;

import java.util.Arrays;
import java.util.List;


public class FunctionExercises {
    public static void main(String[] args) {
        System.out.println("Exercise 1:");
        String result = convertCelsiusToFahrenheit();
        System.out.println(result);

        arrayListFunction();

    }

    //exercise One
    static String convertCelsiusToFahrenheit() {

        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;

        return celsius + " Celsius is " + fahrenheit + " fahrenheit ";

    }

    private static void arrayListFunction() {
        System.out.println("Exercise 2");

        List<String> names = Arrays.asList("Alan", "Alice", "Ant0ni0", "Aziz");


        for (String name : names) {
            String formattedNames = name.trim().toUpperCase();
            if (formattedNames.matches(".*[0-9].*")) {
                System.out.println("Invalid Name ...");
            } else {
                System.out.println(formattedNames);
            }
        }


    }

}
