package javaoop.constructor._exercises;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
    }

    private static void exerciseOne() {
        System.out.println("\n Exercise 1");
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentAges.size(); i++) {
            System.out.println(studentNames.get(i));
        }

    }

    private static void exerciseTwo() {
        System.out.println("\n Exercise 2");
        List<Student> students = Arrays.asList(
                new Student("Alice", 33),
                new Student("Bob"),
                new Student(33),
                new Student()
        );
        for (Student student : students) {
            System.out.println(" Name: " + student.name + " Age: " + student.age);
        }
    }


}
