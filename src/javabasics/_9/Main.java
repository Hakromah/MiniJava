package javabasics._9;

public class Main {
    public static void main(String[] args) {
        drinkCondition();
    }

    public static void drinkCondition() {
        int age = 20;
        int minAgeToDrink = 18;
        boolean canDrink = age >= minAgeToDrink;
        if (canDrink) {
            System.out.println("You have enough age to drink");
        } else {
            System.out.println("You cannot drink at this age");
        }

    }
}
