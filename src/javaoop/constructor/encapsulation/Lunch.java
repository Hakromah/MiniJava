package javaoop.constructor.encapsulation;

public class Lunch {
    private Double price = null;
    private String nameOfDay = null;
    private static final double maxPrice = 5;
    private int numberOfTimeWeGotPrice = 0;
    private int lunchWeigh;

    Lunch(String nameOfDay, Double price) {
        this.nameOfDay = nameOfDay;
        this.price = price;
    }

    public void printLunchData() {
        System.out.println("Lunch price: " + price + "day: " + nameOfDay + " quantity: " + lunchWeigh);
    }

    //Setters and getters
    void setPrice(double price) {
        if (price > maxPrice) {
            System.out.println("Cannot set greater than max price" + "\n" + "MaxPrice: " + maxPrice);
        } else {
            this.price = price;
        }
    }
    
    Double getPrice() {
        numberOfTimeWeGotPrice = numberOfTimeWeGotPrice + 1;
        return this.price;
    }

    int getNumberOfTimeWeGotPrice() {
        return this.numberOfTimeWeGotPrice;
    }

    public String getNameOfDay() {
        return this.nameOfDay;
    }

    public int getLunchWeigh() {
        return this.lunchWeigh;
    }

    public static double getMaxPrice() {
        return maxPrice;
    }
}
