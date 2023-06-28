package javabasics._10;

public class Main {
    public static void main(String[] args) {
        String petType = "bear collie";
        switch (petType) {
            case "pug", "bear collie" -> System.out.println("special dog say");
            case "dog" -> System.out.println("Woof");
            case "cat" -> System.out.println("Meow meow");
            case "fish" -> System.out.println("blue and blue");
            case "cow" -> System.out.println("Boo boo");
            case "bird" -> System.out.println("swish");
            default -> System.out.println("no body knos");
        }
    }
}
