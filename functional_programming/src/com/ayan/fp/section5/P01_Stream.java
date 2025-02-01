package com.ayan.fp.section5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P01_Stream {

    public static void main(String[] args){

        List<Integer> numbers= List.of(12,15,48,5,96,3,5,23,6,52,3,6);
        System.out.println(numbers.stream());   //java.util.stream.ReferencePipeline$Head@65ab7765

        System.out.println(Stream.of(12,15,48,5,96,3,5,23,6,52,3,6));   //java.util.stream.ReferencePipeline$Head@1b28cdfa

        System.out.println(Stream.of(12,15,48,5,96,3,5,23,6,52,3,6).count());   //12

        System.out.println(Stream.of(12,15,48,5,96,3,5,23,6,52,3,6).reduce(0, (a,b)-> a+b));    //274

//        To get stream of primitive data type
        int[] ints= new int[] {1,2,3,4,5,56,67,7,7,8,9};
        System.out.println(Arrays.stream(ints));    //java.util.stream.IntPipeline$Head@3b07d329

//        ReferencePipeline -->  when we use wrapper classes
        System.out.println(Arrays.stream(ints).min());
        System.out.println(Arrays.stream(ints).max());
        System.out.println(Arrays.stream(ints).average());
        System.out.println(Arrays.stream(ints).sum());
//        With primitive, we can directly call methods -> return optional



    }

}
