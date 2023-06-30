package javabasics._11;

import javabasics._2.Main;

public class CustomNumber {

    public static void customNumber(int randomNumber) {
        System.out.println("Generated random number:" + randomNumber);
    }

    public static void main(String[] args) {
        int min = 1, max = 12, randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        customNumber(randomNumber);
        getMultiplicationTable(randomNumber);

    }

    public static void getMultiplicationTable(int randomNumber) {
        for (int i = 12; i >= 1; i--) {
            System.out.println(randomNumber + " * " + i + " = " + randomNumber * i);
        }
    }

}
