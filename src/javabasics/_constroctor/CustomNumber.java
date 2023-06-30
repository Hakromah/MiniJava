package javabasics._constroctor;

public class CustomNumber {
    public int number;

    public CustomNumber() {
        int min = 1, max = 12, randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        this.number = randomNumber;

        System.out.println("Generated Number:" + randomNumber);
    }

    public void getMultiplicationTable() {
        for (int i = 12; i >= 1; i--) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
