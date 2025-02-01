package com.ayan.fp.section2;

import java.util.List;

public class P05_distinct {

    public static void main(String[] args) {
        List<Integer> nums= List.of(1,2,7,4,5,3,7);

        nums.stream().distinct().forEach(System.out::println);
//        Remove all duplicate

        nums.stream().sorted().forEach(System.out::println);


        nums.stream().distinct().sorted().forEach(System.out::println);
//        We can also sort string also
    }
}
