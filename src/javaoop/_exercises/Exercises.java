package javaoop._exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
    }


    private static void exerciseOne() {
        System.out.println("Exercise 1:");
        List<String> studentName = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentAges.size(); i++) {
            System.out.println(studentName);
        }

    }


    private static void exerciseTwo() {
        System.out.println("Exercise 2:");

        List<Student> student = Arrays.asList(
                new Student("Alice", 33),
                new Student("Bob"),
                new Student(33),
                new Student()
        );

    }

}
