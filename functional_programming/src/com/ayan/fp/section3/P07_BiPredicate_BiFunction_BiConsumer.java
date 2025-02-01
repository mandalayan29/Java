package com.ayan.fp.section3;

import java.util.function.*;

public class P07_BiPredicate_BiFunction_BiConsumer {

    /*
    * Predicate: There is one input and output is boolean
    * BiPredicate: There are 2 inputs and output will be boolean
    * has one abstract method
    *   boolean test(T t, U u)
    *
    * BiFunction: Take 2 inputs and output can be of any type
    *
    *
    * */


    public static void main(String[] args) {

        BiPredicate<Integer, String> biPredicate= (Integer, String)-> true;
//        if no parenthesis no need to write "return"
        BiPredicate<Integer, String> compareIntStr= (num, str)->{
            return Integer.parseInt(str) == num;
        };
        System.out.println(compareIntStr.test(1, "5"));


        BiFunction<Integer, String, String> biFunction= (num1, str1) -> {
            return num1+ " "+str1;
        };

        System.out.println(biFunction.apply(10, "Hello"));

        BiConsumer<Integer, String> biConsumer= (num1, str1)-> {
            System.out.println(num1+ " "+str1);
        };

        biConsumer.accept(15, "Ayan");

        BinaryOperator<Integer> op1= (x, y) -> x+y;
        IntBinaryOperator op2= (x,y) -> x+y;

//      Type inference -> by default it is automatic
        IntBinaryOperator op3= (int x, int y) -> x+y;
    }


}
