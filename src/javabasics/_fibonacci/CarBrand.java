package javabasics._fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class CarBrand {
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Ford");
        carBrands.add("BMW");
        carBrands.add("MERCEDES");
        carBrands.add("NISSAN");
        carBrands.add("HONDA");

        System.out.println(carBrands.size());
        System.out.println(carBrands.get(2));

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }


    }
}
