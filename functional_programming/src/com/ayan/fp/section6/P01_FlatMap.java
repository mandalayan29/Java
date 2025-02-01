package com.ayan.fp.section6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P01_FlatMap {

    public static void main(String[] args) {
        List<String> names= List.of("Ayan", "Sumana", "Tanu", "Bulti", "Sumunu");

        String s1= names.stream().collect(Collectors.joining());
        String s= names.stream().collect(Collectors.joining(" : "));
        System.out.println(s);

//        To get a string array
        System.out.println(Arrays.toString("Ayan".split("")));

        List<Object> res= names.stream().map(c-> c.split("")).collect(Collectors.toList());
        System.out.println(res);

        List<Object> res1= names.stream().map(c-> c.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(res1);

        List<Object> res2= names.stream().map(c-> c.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(res2);

        /*
            FlatMap: each element of stream replaced with content of mapped stream
            MappingFunction: Arrays::stream

             map() is used for transformation only, but flatMap() is used for both transformation and flattening.

             Example 1 :
                The list before flattening :

                [ [2, 3, 5], [7, 11, 13], [17, 19, 23] ]
                The list has 2 levels and consists of 3 small lists. After Flattening, it gets transformed into “one level” structure as shown :

                [ 2, 3, 5, 7, 11, 13, 17, 19, 23 ]
                Example 2 :
                The list before flattening :

                [ ["G", "E", "E"], ["K", "S", "F"], ["O", "R", "G"], ["E", "E", "K", "S"] ]
                The list has 3 levels and consists of 4 small lists. After Flattening, it gets transformed into “one level” structure as shown :

                ["G", "E", "E", "K", "S", "F", "O", "R", "G", "E", "E", "K", "S"]

               In short, we can say that if there is a Stream of List of <<Data Type>> before flattening, then on applying flatMap(), Stream of <<Data Type>> is returned after flattening.
        */
        List<String> names1= List.of("Ayan", "Sumana", "Tanu", "Bulti", "Sumunu");
        Object o= names.stream().flatMap(n-> names1.stream().map(n1-> List.of(n, n1))).collect(Collectors.toList());
        System.out.println(o);

        Object o1= names.stream().flatMap(n-> names1.stream().filter(n1-> !n.equals(n1)).map(n1-> List.of(n, n1))).collect(Collectors.toList());
        System.out.println(o1);

    }
}
