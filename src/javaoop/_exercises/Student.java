package javaoop._exercises;

public class Student {
    String name = null;
    int age;

    Student(String name, int age) {
        System.out.println("Constructing");
        this.name = name;
        this.age = age;
        System.out.println("Constructed");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    Student() {
    }

    static void printStudentData() {

    }
    
}
