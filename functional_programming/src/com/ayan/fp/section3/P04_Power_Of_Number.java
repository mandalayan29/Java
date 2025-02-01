package com.ayan.fp.section3;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04_Power_Of_Number {

    public static void main(String[] args) {
        Random random= new Random();
//        int num= random.nextInt(50);
        List<Integer> numbers= List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int power= random.nextInt(5);

        Function<Integer, Integer> getSquare= x-> x*x;
        Function<Integer, Integer> getCube= x-> x*x*x;
        Function<Integer, String> getDouble= x-> x*2 + " -";
//        List<Integer> result=  numbers.stream()
//                                .map(getSquare)
//                                .collect(Collectors.toList());
        mapAndCreateNewList(numbers, getSquare);
        mapAndCreateNewList(numbers, getCube);
        mapAndCreateNewList1(numbers, getDouble);
//        System.out.println(result);
    }

    private static void mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> func) {
        numbers.stream()
                .map(func)
                .forEach(System.out::print);
    }


    private static void mapAndCreateNewList1(List<Integer> numbers, Function<Integer, String> func) {
        numbers.stream()
                .map(func)
                .forEach(System.out::println);
    }

//    We can return a functional interface also

}
