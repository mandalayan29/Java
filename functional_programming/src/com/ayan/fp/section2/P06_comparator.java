package com.ayan.fp.section2;

import java.util.Comparator;
import java.util.List;

public class P06_comparator {
//    Using Comparator we can modify sorted result




    public static void main(String[] args) {

        List<String> strings= List.of("Ayan", "Mandal", "Tamluk", "Computer", "hello");
        strings.stream().sorted().forEach(System.out::println);     // It will sort in alphabetical order Ayan Computer Mandal Tamluk hello
        strings.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);        //This will also return same
        strings.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        Sort by length of length
        strings.stream().sorted(Comparator.comparing(str-> str.length())).forEach(System.out::println);

    }

}
