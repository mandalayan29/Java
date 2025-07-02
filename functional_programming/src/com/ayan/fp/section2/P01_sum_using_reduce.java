package com.ayan.fp.section2;

import java.util.List;

public class P01_sum_using_reduce {
    /*
    * Reduce: Reduction of elements using an associative accumulation function
    *           it returns and Optional.
    *  --> It is commonly used to aggregate or combine elements into a single result,
    *  such as computing the maximum, minimum, sum, or product.
    *
    *   List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        Optional<String> longestString = words.stream()
            .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
    * */

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
//        return nums.stream()
//                .reduce(0, (a,b)-> a+b);

        return nums.stream()
                .reduce(0, (a,b)-> {
                    System.out.println(a + " : "+b);
                    return a+b;
                });
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
//        System.out.println("Sum : "+addAllStructured(numbers));
        System.out.println("Sum functional : "+addAllFunctional(numbers));
//        System.out.println("Sum functional : "+addAllFunctional1(numbers));
    }
}
