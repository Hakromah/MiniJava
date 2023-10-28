package javaoop.constructor.encapsulation._exercise;

public class Student {
    private String name = null;
    private String surname = null;
    private Integer age = null;
    private Double grade = null;
    private Integer classLevel = null;


    Student(String name, Integer age, Double grade, String surname, Integer classLevel) {
        this.classLevel = classLevel;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.surname = surname;
    }

    public void printStudentData() {
        System.out.println("Student name: " + name + ", and age is: " + age);
    }

    void setAge(Integer age) {
        if (age <= -1) {
            System.out.println("You enter invalid age!");
        } else {
            this.age = age;
        }
    }

    void setGrade(Double grade) {
        if (grade < 50) {
            System.out.println("You failed 50 is the minimum grade to pass");
        } else {
            this.grade = grade;
        }
    }

    void setClassLevel(Integer classLevel) {
        if (classLevel <= 0) {
            System.out.println("You are not registered in our school!");
        } else {
            this.classLevel = classLevel;
        }
    }

    String getName() {
        return this.name;
    }

    String getSurname() {
        return this.surname;
    }

    Double getGrade() {
        return this.grade;
    }

    Integer getClassLevel() {
        return this.classLevel;
    }

    Integer getAge() {
        return this.age;
    }
}
