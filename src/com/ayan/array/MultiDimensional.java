package com.ayan.array;

import java.util.Arrays;

public class MultiDimensional {

    public static void printArray(Object[] obj){
        System.out.println(Arrays.deepToString(obj));
    }

    public static void main(String[] args) {

        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        printArray(arr);
//      [[[1, 2], [3, 4]], [[5, 6], [7, 8]]]

        Object[] array= new Object[3];
        printArray(array);
//      [null, null, null]

        array[0]= new String[] {"a", "b", "c"};
        printArray(array);
//      [[a, b, c], null, null]

        array[1]= new int[][][] {{ {1,2,3}, {4,5,6} }, {{11,12,13}}};
        printArray(array);


    }
}
