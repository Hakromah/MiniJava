package javabasics;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Loops {
    public static void main(String[] args) {
        forLoop();
    }

    public static void forLoop() {
        ArrayList<Integer> ourNumbers = new ArrayList<>();
        IntStream.range(0, 20).forEach(ourNumbers::add);

        for (Integer ourNumber : ourNumbers) {
            System.out.println("The current number is=" + ourNumber);
        }

        ArrayList<String> numbers = new ArrayList<>();
        IntStream.range(0, 100).forEach(i -> numbers.add(i + " - " + (char) i));
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
