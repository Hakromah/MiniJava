package javaoop._1;

public class Main {
    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch();
        Lunch tomorrowLunch = new Lunch();

        todaysLunch.dayOfDayEaten = "Saturday";
        tomorrowLunch.dayOfDayEaten = "Sunday";

        todaysLunch.printData();
        tomorrowLunch.printData();
    }

}
