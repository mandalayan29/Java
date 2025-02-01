package com.ayan.fp.section5;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P02_Numbers {

    public static void main(String[] args) {

        System.out.println(IntStream.range(1, 20));


        System.out.println(IntStream.range(1, 20).sum());   // 1-19
        System.out.println(IntStream.rangeClosed(1, 20).sum()); //1-20

//        For some algorithm
        System.out.println(
                IntStream.iterate(1, e-> e+2).limit(10).sum()
        );
//        odd(1, e-> e+2) even (0, e+2)
        System.out.println(
                IntStream.iterate(1, e-> e+2).limit(10).peek(System.out::println).sum()
        );

//        calculate first 10 power of 2
        System.out.println(
                IntStream.iterate( 1, e-> e*2).limit(10).peek(System.out::println).sum()
        );

//        we can't use collect directly to a primitive stream. to convert we need to use a boxed
        System.out.println(
                IntStream.iterate( 1, e-> e*2).limit(10).boxed().collect(Collectors.toList())
        );

//        BigInteger
        System.out.println(
                IntStream.rangeClosed(1, 50).reduce(1, (x,y)-> x*y)
        );//it will return zero

        System.out.println(
                IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)
        );



    }

}
