package javaoop._constructor;

public class Main {
    public static void main(String[] args) {
        ConstructorLunch todayLunch = new ConstructorLunch(Math.floor(4 + Math.random() * 20), "Saturday");
        ConstructorLunch tomorrowLunch = new ConstructorLunch(Math.floor(3 + Math.random() * 10), "Sunday");

        todayLunch.printConstructor();
        System.out.println("\n");
        tomorrowLunch.printConstructor();
    }
}
