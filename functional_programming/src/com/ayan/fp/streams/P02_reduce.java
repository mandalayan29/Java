package com.ayan.streams;

import java.util.List;
import java.util.Optional;

public class P02_reduce {
//            0 1
//            1 2
//            3 3
//            6 4
//            10 5
//            15 6
//            21 7
//            28 8
//            36 9
    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate+ " "+ nextNumber);
        return aggregate+nextNumber;
    }

    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4,5,6,7,8,9);
        Optional<Integer> sum= numbers.stream().reduce(0, P02_reduce::sum).describeConstable();
        Optional<Integer> sum1= numbers.stream().reduce(P02_reduce::sum);
        System.out.println("Sum : "+sum.get());
    }

}
