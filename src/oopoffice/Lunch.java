package oopoffice;

import org.w3c.dom.ls.LSOutput;

public class Lunch {
    double price = 5 * Math.random() * 100;
    String nameOfDayEaten = null;

    void printLunchPrice() {

        System.out.println("Price = " + price);
    }
}
