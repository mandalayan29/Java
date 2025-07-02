package com.ayan.fp.section1;

import java.util.List;

public class FP04Practice_Filter {

//    Print all odd numbers from a list
//    Print all String individually from a list
//    Print all String contains "spring"
//    Print all String with 4 words

    public static void main(String[] args) {
        List<String> list= List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllOdd(List.of(4,5,8,8,5,58,5,2,5,8,7,54,69,9,6,63,89,885,6,5));
        printAllStrings(list);
        printAllStringContains(list);
        printAllStringWith4letters(list);
    }

    private static void printAllStringWith4letters(List<String> list) {
        System.out.println("----- Print all strings with 4 letters -----");
        list.stream()
                .filter(s-> s.length()==4)
                .forEach(System.out::println);
    }

    private static void printAllStrings(List<String> list) {
        System.out.println("----- Print all strings -----");
        list.stream()
                .forEach(System.out::println);
    }

    private static void printAllStringContains(List<String> list) {
        System.out.println("----- Print all strings containing 'spring' -----");
        list.stream()
                .filter(s-> s.toLowerCase().contains("spring"))
                .forEach(System.out::println);
    }

    public static void printAllOdd(List<Integer> nums) {
        System.out.println("----- Print all odds -----");
        nums.stream()
                .filter(n-> n%2==1)
                .forEach(System.out::println);
    }

}
