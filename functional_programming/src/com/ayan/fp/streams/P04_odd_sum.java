package com.ayan.streams;

import java.util.List;

public class P04_odd_sum {



    public static void main(String[] args) {
        List<Integer> nums= List.of(1,2,3,4,5,6,7);
        int oddSum= nums.stream().filter(r-> r%2==1).reduce(0, (a,b)-> a+b);
        System.out.println(oddSum);
    }

}
