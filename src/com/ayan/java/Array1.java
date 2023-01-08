package com.ayan.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array1 {

    public int[] arrayByUserInput(int len){
        System.out.println("Method: arrayByUserInput");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array element");
        int[] arr= new int[len];
        for(int i=0; i<len; i++){
            System.out.print("Enter element no "+(i+1)+" : ");
            arr[i]= s.nextInt();
        }
        return arr;
    }

    public int[] arrayByStringInput(){
        System.out.println("Method: arrayByStringInput");
        String str;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter an array as string seperated by ',' : ");
        str= s.nextLine();

        String[] stringArray= str.split(",");
        int[] integerArray= new int[stringArray.length];

        for(int i=0; i<integerArray.length; i++){
            integerArray[i]= Integer.parseInt(stringArray[i].trim());
        }
        return integerArray;
    }

    public int[] randomIntegerArray(int len){
        System.out.println("Method: randomIntegerArray");
        Random r= new Random();
        int[] arr= new int[len];
        for(int i=0; i<len; i++){
//            arr[i]= r.nextInt();
            arr[i]= r.nextInt(50);
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Array1 obj= new Array1();
        printArray(obj.arrayByUserInput(5));
        printArray(obj.arrayByStringInput());
        printArray(obj.randomIntegerArray(5));

    }
}
