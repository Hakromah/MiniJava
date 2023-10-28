package javaoop.constructor._1;

import javaoop.constructor._1.Lunch;

public class Main {
    public static void main(String[] args) {
        Lunch yesterDayLunch = new Lunch();
        Lunch todayLunch = new Lunch(Math.floor(Math.random() * 15), "Sunday,");
        Lunch tomorrowLunch = new Lunch(Math.floor(Math.random() * 13));

        todayLunch.printLunchData();
        tomorrowLunch.printLunchData();
    }
}
