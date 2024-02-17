package com.ayan.streams;

import java.util.List;

public class P01_sum_using_reduce {

    public static int addAllStructured(List<Integer> nums) {
        int sum=0;
        for(int n: nums) {
            sum+=n;
        }
        return sum;
    }

    private static int sum(int a, int b) {
        return a+b;
    }
    public static int addAllFunctional(List<Integer> nums) {
//        Combine then to a single result or one value
        return nums.stream()
                .reduce(0, (a,b)-> a+b);
    }

    public static int addAllFunctional1(List<Integer> nums) {
//        Combine then to a single result or one value
        return nums.stream()
                .reduce(0, P01_sum_using_reduce::sum);
    }

    /*
    reduce()
        ---> it performs reduction on the elements of the streams
        it aggregate and it into a single result
     */

    public static void main(String[] args) {
        List<Integer> numbers= List.of(12,9,21,32,1,3,4,53);
        System.out.println("Sum : "+addAllStructured(numbers));
        System.out.println("Sum functional : "+addAllFunctional(numbers));
        System.out.println("Sum functional : "+addAllFunctional1(numbers));
    }
}
