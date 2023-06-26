package javabasics._3;

public class ExercisePrimitives {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
    }

    public static void exerciseOne() {
        char myIni = 'H';
        char myIni2 = 'S';
        char myIni3 = 'K';
        System.out.println(myIni);
        System.out.println(myIni2);
        System.out.println(myIni3);
    }

    public static void exerciseTwo() {
        int myAge = 28;
        System.out.print("My age = ");
        System.out.println(myAge);

        boolean hadLunch = true;
        System.out.print("He had lunch today: ");
        System.out.println(hadLunch);

        double myLunchPrice = 2.99;
        System.out.print("My today lunch price = ");
        System.out.println(myLunchPrice);
    }
}
