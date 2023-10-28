package javaoop.constructor.encapsulation._exercise;

public class Exercises {
    public static void main(String[] args) {
        exerciseOne();
    }

    public static void exerciseOne() {
        Student newStudent = new Student("Ahmet", 5, 2.5, "Kromah", 2);
        newStudent.printStudentData();
        System.out.println(newStudent.getAge());

        // set a new age
        Integer newAge = -1;
        newStudent.setAge(newAge);
        System.out.println("New age: " + newStudent.getAge());

        Integer newClassLevel = 0;
        newStudent.setClassLevel(newClassLevel);
        System.out.println(newStudent.getClassLevel());
    }


}
