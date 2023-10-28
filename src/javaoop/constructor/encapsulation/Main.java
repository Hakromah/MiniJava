package javaoop.constructor.encapsulation;

public class Main {
    public static void main(String[] args) {
        Lunch todayLunch = new Lunch("Sunday", 3.99);
        System.out.println(todayLunch.getPrice());
        double newPrice = 5.50;

        todayLunch.setPrice(newPrice);

        System.out.println(todayLunch.getPrice());
        System.out.println(todayLunch.getNumberOfTimeWeGotPrice());
    }
}
