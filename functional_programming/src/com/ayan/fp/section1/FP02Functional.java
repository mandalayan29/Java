package com.ayan.fp.section1;

import java.util.List;

public class FP02Functional {
    //  In functional approach we focus on what to do.
    //  We need to convert list of numbers to a stream of numbers
    //  Streams are sequence of elements

    public static void main(String[] args) {
        printAllNumbersFunctional(List.of(12,85,4,8,6,9,5,58,2,5, 58));
    }

    private static void printAllNumbersFunctional(List<Integer> nums) {
    //  Convert list to a sequence of element, Create a stream of element

    //  To make a stream of numbers
    //  After creating the stream of numbers, implement what to do with each one of them
    //  To define the behaviour or what to do with the element, we need to use Method reference.
        nums.stream()
                .forEach( FP02Functional::print );
    //  :: -> syntax for method reference
    //  Method reference is only for static methods
        System.out.println("Using sout");
        nums.stream().forEach(System.out::println);
        System.out.println("Using sout -- 2");
        nums.forEach(System.out::println);
    }
    public static void print(int n) {
        System.out.println(n);
    }





}
