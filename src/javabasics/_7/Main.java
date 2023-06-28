package javabasics._7;

public class Main {
    public static void main(String[] args) {
        numbers();
        exercise3();
    }

    private static void numbers() {
        int d = 50;
        System.out.println(d);

        System.out.println("hello there".toUpperCase());

        String initials = "Our initials are= " + "H." + " S." + 'K';
        System.out.print(initials);
    }

    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int name = 4;
        String initial = "Muhammed was here yesterday and he was with Muhammed 2";
        String replace2 = "Amara";
        System.out.println("character at index " + name + " is " + initial.charAt(name));

        String replaceThem = "Muhammed";
        System.out.println(initial.replaceAll(replaceThem, replace2));


    }


}
