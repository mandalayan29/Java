package com.ayan.fp.section2;

import java.util.List;
import java.util.stream.Collectors;

public class P07_collect {


    public static void main(String[] args) {
        List<Integer> nums= List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        List<Integer> doubleNums1= nums.stream().map(n-> n*2).toList();

        List<Integer> doubleNums= nums.stream().map(n-> n*2).collect(Collectors.toList());

        System.out.println(doubleNums1);
        System.out.println(doubleNums);

/*      Practice
        1. Create a list with even numbers filtered from the nums list
        2. Create a list of length of string list
*/
        List<Integer> filteredEven= nums.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(filteredEven);

        List<String> strings= List.of("Ayan", "Mandal", "Tamluk", "Computer", "hello");
        List<Integer> lengthStrList= strings.stream().map(str-> str.length()).collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(lengthStrList);
    }

}
