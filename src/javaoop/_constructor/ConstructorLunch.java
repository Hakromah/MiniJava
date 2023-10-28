package javaoop._constructor;

public class ConstructorLunch {
    Double price = null;
    String nameOfDayEaten = null;
    int lunchWeightInGram = 250;
    static Double maxLunchPrice = 5.5;

    ConstructorLunch(Double price, String nameOfDayEaten) {
        System.out.println("max lunch price: " + maxLunchPrice);

        if (price >= maxLunchPrice) {
            System.out.println("Warning you have exceeded the max lunch price");
        } else {
            System.out.println("Lunch price is ok, setting.");
            this.price = price;
        }
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void printConstructor() {
        System.out.println("Lunch price =" + price + ", for " + nameOfDayEaten + "\n" +
                ", lunch weight in gram = " + lunchWeightInGram + "\n");
    }
}
