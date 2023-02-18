package com.ayan.array;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensional {

    public static int[] getRandomArray(int n){
        Random rand= new Random();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= rand.nextInt(100);
        }
        return arr;
    }

    public static int[][] get2DArray(int n, int m){

//        3x4
//            x, x, x, x
//            x, x, x, x
//            x, x, x, x


        int[][] arr= new int[n][m];
        for(int i=0; i<n; i++){
            arr[i]= getRandomArray(m);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[][] arr1= new int[3][4];
        System.out.println(Arrays.deepToString(arr1));

        int[][] arr2= get2DArray(3,4);
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("-".repeat(20));

        for(int[] ele: arr2){
            System.out.println(Arrays.toString(ele));
        }

//        [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
//        [[48, 34, 13, 67], [97, 89, 58, 32], [19, 14, 31, 5]]
//                --------------------
//        [48, 34, 13, 67]
//        [97, 89, 58, 32]
//        [19, 14, 31, 5]

//      Arrays.deepToString(Array_name)
//      is used to print multidimensional array, It is a string representation of the content
        arr2[1]= new int[] {99,98,98,96,75,43};
//        arr2[1]= {99,98,98,96,75,43}; this will cause error annonymous array declaration wont work for this
        for(int[] ele: arr2){
            System.out.println(Arrays.toString(ele));
        }

//        [48, 34, 13, 67]
//        [99, 98, 98, 96, 75, 43]
//        [19, 14, 31, 5]


        int[][] arr3={
                {0,1},
                {1,2,3,4,5},
                {6,7,8,9},
        };

        for(int[] ele: arr3){
            System.out.println(Arrays.toString(ele));
        }

//        ------OUTPUT----
//        [0, 1]
//        [1, 2, 3, 4, 5]
//        [6, 7, 8, 9]






    }


}
