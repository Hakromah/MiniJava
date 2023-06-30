package javabasics._11;

import java.util.ArrayList;

public class LessonArrayCourse {
    public static void main(String[] args) {
        System.out.println("Array and List");
        myFirstArray();
        secondArray();
        arrayListString();
    }

    public static void myFirstArray() {
        System.out.println("for loop");
        int[] mealPrices = new int[]{15, 65, 20, 21, 30};

        for (int i = 0; i < mealPrices.length; i++) {
            System.out.println(mealPrices[i]);
        }

        System.out.println("END OF THE LOOP");
    }

    public static void secondArray() {
        double[] foodPrices = new double[5];
        foodPrices[0] = 15;
        foodPrices[1] = 25;
        foodPrices[2] = 30;
        foodPrices[3] = 20;
        foodPrices[4] = 82;
        System.out.println(foodPrices[4]);
    }

    public static void arrayListString() {
        ArrayList<String> ourMenuItems = new ArrayList<>();
        ourMenuItems.add("Good Coffee");
        ourMenuItems.add("Döner");
        ourMenuItems.add("Pizza");
        ourMenuItems.add("Fanta");
        ourMenuItems.remove(0);

        System.out.println(ourMenuItems.get(2));

    }
}
