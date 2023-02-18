package com.ayan.array;

import java.util.Arrays;

public class ArrayReference {

    public static void printArray(int[] arr){
        System.out.println("============  Printing Array  ============");
        System.out.println(Arrays.toString(arr));
        System.out.println("============ Printing complete ==============");
    }

    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        System.out.println("Arr1 : "+Arrays.toString(arr1));

//      Due to Java property arr1 and arr2 will refer to same object
        int[] arr2= arr1;
        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr2 : "+Arrays.toString(arr2));
//      Arr1 : [1, 2, 3, 4, 5]
//      Arr2 : [1, 2, 3, 4, 5]


//      As both arr1 and arr2 both are pointing to same array in memory
//      If we change any of arr1 or arr2
//      It will reflect for both array

        System.out.println("Changed the 3rd element of array2 to 678");
        arr2[2]= 678;
        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr2 : "+Arrays.toString(arr2));
//      Changed the 3rd element of array2 to 678
//      Arr1 : [1, 2, 678, 4, 5]
//      Arr2 : [1, 2, 678, 4, 5]


//      Even if we pass array as an argument it will point same address in memory
        System.out.println("Changing array index value using method");
        modifyArray(arr2);
        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr2 : "+Arrays.toString(arr2));

//      Changing array index value using method
//      Arr1 : [1, 2, 678, 999, 5]
//      Arr2 : [1, 2, 678, 999, 5]

//      If as per requirement we don't want to change the main array
//      Then we need to create a copy of main array and modify
//      We can do this by using  manual loop or Arrays.copyOf(array_name, no of element we want to copy);
//      for copyOf method if no of element are more than the length then those will be initialized by 0
        int[] arr3= Arrays.copyOf(arr1, arr1.length+5);
        arr2[3]= 678;
        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr3 : "+Arrays.toString(arr3));
//      Arr1 : [1, 2, 678, 678, 5]
//      Arr3 : [1, 2, 678, 999, 5]
    }

    public static void modifyArray(int[] arr){
        arr[3]=999;
    }

}
