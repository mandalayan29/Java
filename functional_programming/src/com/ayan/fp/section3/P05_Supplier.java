package com.ayan.fp.section3;

import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class P05_Supplier {

    /*
    * Supplier: Don't have any input and return something back
    * Has only one abstract method as it is a function al interface
    * T get();
    *
    *
    * BinaryOperator: Operates on two parameters of same type, and returns a value of same type.
    * UnaryOperator: Operates on one parameter as input and returns a result of same type as output.
    * */

    public static void main(String[] args) {

        Supplier<Integer> randomIntegerSupplier= ()-> new Random().nextInt(100);
//        () -> to specify that no parameter is there

        System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator= (x) -> (int) Math.pow(x, 2);

        System.out.println(unaryOperator.apply(2));

        System.out.println(unaryOperator.apply(randomIntegerSupplier.get()));

    }

/*    java.util.function
    -> This package contains all the functional intefaces*/

}
