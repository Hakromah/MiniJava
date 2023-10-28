package javaoop.scope;

import javaoop.constructor.encapsulation.Lunch;

public class Main {
    public static void main(String[] args) {
        ScopeLunch todayLunch = new ScopeLunch("Monday", 3.99);

        System.out.println(todayLunch.getPrice());
        System.out.println(todayLunch.getNumberOfTimeWeGotPrice());
    }
}
