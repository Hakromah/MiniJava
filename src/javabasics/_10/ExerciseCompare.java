package javabasics._10;

public class ExerciseCompare {
    public static void main(String[] args) {
        exerciseOne("Java runs over 2 billion devices", 15);
        exerciseOne("+31 2 58765446", 50);
        exerciseOne("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exerciseTwo("sandwich", 2.5, 12.5);
        exerciseTwo("soup", 10, 30);
        exerciseTwo("soup", 1, 5);

    }

    public static void exerciseOne(String text, double expectedScore) {
        double yourScore = 0;
        //Start your code here
        yourScore = text.length();
        if (yourScore > 20) {
            yourScore = 20;
        }
        if (text.contains("a")) {
            yourScore = yourScore - 5;
        }
        if (text.equals(text.toLowerCase())) {
            yourScore += 10;
        }
        if (yourScore > 20) {
            yourScore = yourScore * 2;
        }
        // End your code here

        System.out.println("Expected score=" + expectedScore + "actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println("- Failed: Wrong score for '" + text + "'");
        } else {
            System.out.println("- Success!");
        }
        System.out.println(yourScore);
    }

    public static void exerciseTwo(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;
        // Start your code here
        if (mealType.equals("sandwich")) {
            yourMealScore = 5 * weight;
        }
        if (mealType.equals("soup")) {
            yourMealScore = 3 * weight;
        }
        if (yourMealScore < 5) {
            yourMealScore = 5;
        }

        // End your code here
        System.out.println("Expected score= " + expectedScore + " actual score= " + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println("- Failed: Wrong score for '" + yourMealScore + "'");
        } else {
            System.out.println("- Success!");
        }
        System.out.println(yourMealScore);


    }
}
