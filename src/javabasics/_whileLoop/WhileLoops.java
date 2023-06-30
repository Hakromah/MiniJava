package javabasics._whileLoop;

public class WhileLoops {
    public static void main(String[] args) {
        int currentWeather = (int) Math.floor(Math.random() * 100);

        if (currentWeather < 30) {
            System.out.println("Today's weather is " + currentWeather + " C" + " You cannot go to the beach ");
        } else {
            System.out.println("Today's weather is " + currentWeather + " So you can go to the beach ");
        }

    }
}
