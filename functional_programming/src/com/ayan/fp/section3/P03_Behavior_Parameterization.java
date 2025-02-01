package com.ayan.fp.section3;

import java.util.List;
import java.util.function.Predicate;

public class P03_Behavior_Parameterization {

    public static void main(String[] args) {

        List<Integer> numbers= List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

/*
        numbers.stream().filter(n-> n%2==0).forEach(System.out::println);
        numbers.stream().filter(n-> n%2==1).forEach(System.out::println);

//        Above 2 lines has lots of duplication in code,
//        Everything is same, except the logic to determine odd and even no
*/
        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        Predicate<Integer> oddPredicate = n -> n % 2 == 1;
        filterAndPrint(numbers, evenPredicate);
        filterAndPrint(numbers, oddPredicate);
        filterAndPrint(numbers, n -> n%3==0);
//        passing the logic of the method as a argument
//        We are passing the behaviour of the method as a argument.
//        Passing the code as a parameter

//        Extract method

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }
}
