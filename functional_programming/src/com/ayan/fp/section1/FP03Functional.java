package com.ayan.fp.section1;

import java.util.List;

public class FP03Functional {

    public static void main(String[] args) {

        printAllEvenNumbers(List.of(12,85,4,8,6,9,5,58,2,5,57));

    }

    public static void printAllEvenNumbers(List<Integer> nums) {

//        for(int n: nums) if(n%2==0) System.out.println(n);

//      For additional logic we can use filter
        nums.stream()
                .filter( FP03Functional::isEven )
//                Declared that this is the method to be called for each of the elements
//                If it is true then only it will move to next line
                .forEach( System.out :: println );

        System.out.println("----- With lambda expression -----");
//      To add entire function inside filter
//      The simplest way to defining a specific thing is called Lambda Expression
//      Lambda expression is a simpler way of defining another method
//      It is a method
        nums.stream()
                .filter( n->  n%2 == 0)
                .forEach(System.out :: println);

    }
    private static boolean isEven(int n) {
        return n%2==0;
    }


}
