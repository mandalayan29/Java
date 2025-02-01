package com.ayan.fp.section3;

import java.util.List;
import java.util.function.BinaryOperator;

public class P02_Binary_Operator {
    /*
    * Find functional interface behind the second argument of reduce method.
    * Create an implementation for the functional interface.
    * int sun = numbers.stream().reduce(0, Integer::sum);
    * */

    /*
    * Binary operator: It is a function al interface
    * a method apply(T)
    * */

    public static void main(String[] args) {

        List<Integer> numbers= List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        BinaryOperator<Integer> sumBinaryOperator1= Integer::sum;
        int sum= numbers.stream()
                        .reduce(0, sumBinaryOperator);

        System.out.println("SUM : "+sum);
    }

    /*
    *
    * Operator-> Input and output are of same type
    * */


}
