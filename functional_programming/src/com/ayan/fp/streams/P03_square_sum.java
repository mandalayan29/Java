package com.ayan.streams;

import java.util.List;

public class P03_square_sum {

    public static void main(String[] args) {
        List<Integer> nums= List.of(1,2,3);

        int sum= nums.stream().reduce(0, (a,b)->{
          return a+b*b;
        });

        int sum2= nums.stream().map(x-> x*x).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum2);
    }

}
