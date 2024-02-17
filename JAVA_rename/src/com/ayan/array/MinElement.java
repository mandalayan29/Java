package com.ayan.array;

import java.util.Arrays;
import java.util.Random;

public class MinElement {

    public static void method1(int[] arr){
//      For max element set max=0 and compare
        int min= Integer.MAX_VALUE;
        for(int ele: arr){
            if(min > ele){
                min= ele;
            }
        }
        System.out.println("Minimum element is : "+min);
    }

    public static void method2(int[] arr){
        int min= arr[0];
        int index= 0;
        for(int i=1; i< arr.length; i++){
            if(min> arr[i]){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("Minimum element : "+min+". at Index : "+index);
    }


    public static void main(String[] args) {
        Random r= new Random();
        int[] arr= new int[10];
        for(int i=0; i< arr.length; i++){
            arr[i]= r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        method1(arr);
        method2(arr);
    }

}
