package javaoop.constructor._1;

public class Lunch {
    Double price = null;
    String nameOfDayEaten = null;
    int lunchQuantity;

    static Double maxLunchPrice = 8.5;

    Lunch(Double price, String nameOfDayEaten) {
        System.out.println("We ran our constructor 1");
        this.lunchQuantity = 500;
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    Lunch(Double price) {
        System.out.println("We ran our constructor 2");
        this.price = price;
    }

    Lunch() {
        System.out.println("We ran our constructor 3");
    }


    public void printLunchData() {
        System.out.println(" On " + nameOfDayEaten +
                " the lunch price was: " + price + "\n" +
                " and the lunch quantity was: " + lunchQuantity);
    }
}

