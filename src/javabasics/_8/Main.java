package javabasics._8;

public class Main {
    public static void main(String[] args) {
        String ourNumber = String.valueOf(88);
        int numAsInt = Integer.valueOf(ourNumber);
        System.out.println(numAsInt * 2);
        System.out.println("88" + 2);

        StringBuilder myStrBuilder = new StringBuilder();

        String normalStrBuilder = "";
        normalStrBuilder = normalStrBuilder + "Hello there ";
        normalStrBuilder = normalStrBuilder + "I'm learning Java";
        System.out.println(normalStrBuilder);

        myStrBuilder.append("Hello there ");
        myStrBuilder.append("I am learning Java");
        System.out.println(myStrBuilder.toString().toUpperCase());
        System.out.println(myStrBuilder.reverse());


    }
}
