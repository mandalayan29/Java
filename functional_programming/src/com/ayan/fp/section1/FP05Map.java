package com.ayan.fp.section1;

import java.util.List;

public class FP05Map {
//  Problem : Print square of even numbers
//    We can get each of the elements and map those to its square
    public static void main(String[] args) {

        List<Integer> numbers= List.of(5,2,58,45,2,88,5,2,58,55,2,5,54,25,5,55,2,23,69,78,5);

        numbers.stream()
                .filter(n -> n%2==0 )
                .map(n-> n*n)
                .forEach(System.out :: println);

//        map( mapper lambda expression )
    }

}
