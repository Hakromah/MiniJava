package javabasics._comparearr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] aliceTodo = {"Coding", "Reading", "Learning"};
        String[] bobTodo = {"Reading", "Coding", "Learning", "Sleeping"};
        String[] timTodo = {"Reading", "Learning", "Coding"};


        System.out.println("Is Alice's array equal to Bob array?- " + Arrays.equals(aliceTodo, bobTodo));
        System.out.println("Is Alice's array equal to Tim array?- " + Arrays.equals(aliceTodo, timTodo));

        System.out.println("Is Alice's array having the same length of Bob array?- " + (aliceTodo.length == bobTodo.length));
        System.out.println("Is Alice's array having the same length of Tim's array?- " + (aliceTodo.length == timTodo.length));


        for (String alice : aliceTodo) {
            System.out.println("Non Sorted Alice= " + alice);
        }
        System.out.println("Differece between sorted and non sorted");

        Arrays.sort(aliceTodo);
        for (String alice : aliceTodo) {
            System.out.println("Sorted Alice = " + alice);
        }
        //sort and compare
        Arrays.sort(timTodo);
        Arrays.sort(bobTodo);
        System.out.println("Is Alice having the same tasks of Bob ?- " + Arrays.equals(aliceTodo, bobTodo));
        System.out.println("Is Alice having the same tasks of Time ?- " + Arrays.equals(aliceTodo, timTodo));
    }
}
