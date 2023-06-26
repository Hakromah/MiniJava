package javabasics._4;

import java.util.Locale;

public class Main {
    static int age = 15;

    public static void main(String[] args) {
        System.out.println("My age is " + age);
        int age = 20;
        System.out.println("My age is " + age);
        age = 40;
        System.out.println("My age is " + age);
        printYourName();

    }

    public static void printYourName() {
        String myName = "Hassan S Kromah";
        System.out.println(myName.toUpperCase(Locale.ROOT));
    }

}
