package javaoop._1;

import org.w3c.dom.ls.LSOutput;

public class Lunch {
    double price = Math.floor(4.99 * Math.random());
    String dayOfDayEaten = null;

    void printData() {
        System.out.println("Today's lunch price " + price + ", and today is " + dayOfDayEaten);
    }


}





