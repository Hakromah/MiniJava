package javabasics._11;

import java.util.ArrayList;

public class ArrayListExercises {
    public static void main(String[] args) {
        exerciseOne();
        correspondArrays();
        exerciseThree();


    }

    public static void exerciseOne() {
        ArrayList<Integer> myIntegers = new ArrayList<>();
        myIntegers.add(52);
        myIntegers.add(12);
        myIntegers.add(19);
        myIntegers.add(63333);
        myIntegers.add(50);
        myIntegers.add(22);
        myIntegers.add(14);
        myIntegers.add(30);

        myIntegers.remove(2);
        myIntegers.remove(1);
        myIntegers.remove(0);
        System.out.println(myIntegers.get(0));
    }

    public static void correspondArrays() {
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Bread");
        menuItems.add("Water");
        menuItems.add("Fanta");
        menuItems.add("Drinks");

        ArrayList<Double> menuPrices = new ArrayList<>();
        menuPrices.add(1.5);
        menuPrices.add(3.5);
        menuPrices.add(2.5);
        menuPrices.add(6.5);

        System.out.println("Product name: " + menuItems);
        System.out.println("Price: " + menuPrices);
    }

    public static void exerciseThree() {
        System.out.println("\nExercise 3:....");
        ArrayList<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(10404);
        items.add(-234348);
        items.add(-53);
        items.add(9);
        items.add(91);
        items.add(92);
        items.add(34534);
        items.add(12334);
        items.add(1435);


        double sum = 0;
        for (double number : items) {
            sum += number;
        }

        System.out.println(sum);
    }
}
