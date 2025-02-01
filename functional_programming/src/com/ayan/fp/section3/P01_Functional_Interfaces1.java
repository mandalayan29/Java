package com.ayan.fp.section3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class P01_Functional_Interfaces1 {

    public static void main(String[] args) {
        List<Integer> numbers= List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        Print all even numbers
        numbers.stream().filter(n-> n%2==0).map(n-> n*n).forEach(System.out::println);

        /*
        *   Funcation interface: has only one abstract class
        *   Predicate has only one method test() rest are static
        *   this abstract method is called function descriptor
        *   Predicate<Integer> isEven= new Predicate<Integer>() {
        *       @Override
        *       public boolean test(Integer x) {
        *           return x%2==0;
        *       }
        *   }
        *   PREDICATE USED TO TEST SOMETHING
        *
        *   Function: Function<T, R> Accepts one argument and produce a result
        *   has a method apply(T)
        *   Has one input and one output
        *   Function<Integer, Integer> squareFunction = Function<Integer, Integer>() {
        *       @Override
        *       public Integer apply(Integer x) {
        *           return x * x;
        *       }
         *   }
         *
         *  Consumer: Consumes whatever it gets
         *  takes an input and consumes it
         *  returns a void back.
         *  has a method apply(T)
         *
         *  Consumer<Integer> printConsumer= new Consumer<Integer>() {
         *      public void accept(Integer x) {
         *          sysout(x)
         *      }
         *  }
         *
        *
        *
        *
        * */

        Predicate<Integer> isEvenPredicate= x-> x%2==0;
        Function<Integer, Integer> squareFunction= x-> x*x;
        Consumer<Integer> printConsumer= System.out::println;

        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(printConsumer);

    }

}
