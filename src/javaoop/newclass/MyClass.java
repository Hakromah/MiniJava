package javaoop.newclass;

public class MyClass {
    private final int age;
    private final String name;

    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is  " + name + " and I am " + age + " years old");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
