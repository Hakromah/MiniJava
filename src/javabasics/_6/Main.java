package javabasics._6;

public class Main {
    public static void main(String[] args) {
        double lunchPrice = 8.6;
        var lunchPriceSqrtRoot = Math.sqrt(lunchPrice);
        System.out.println("lunch price " + lunchPrice + ", lunch price squire root " + lunchPriceSqrtRoot);
        maxValue();
        mathExercises();
    }

    //max value of different numbers
    public static void maxValue() {
        int lunchMonday = 12;
        int lunchTuesday = 15;
        int maxLunchPrice = Math.max(lunchMonday, lunchTuesday);
        System.out.println(maxLunchPrice);
    }

    public static void mathExercises() {
        double ourValue = 4.5;
        System.out.println(ourValue + "after ceiling 4.5 the result is = " + Math.floor(ourValue));
        System.out.println(ourValue + "after ceiling 4.5 the result is = " + Math.ceil(ourValue));
        System.out.println(ourValue + "after ceiling 4.5 the result is = " + Math.round(ourValue));
        System.out.println(ourValue + "after ceiling 4.5 the result is = " + Math.pow(ourValue, 2));
        System.out.println(ourValue + "after ceiling 4.5 the result is = " + Math.pow(ourValue, 3));
        System.out.println(ourValue + "after ceiling 4.5 the result is = " + Math.random() * ourValue);
    }
}
