package com.ayan.fp.section1;

import java.util.List;

public class FP01structured {


    public static void main(String[] args) {
//      Traditional approach
        printAllNumbers(List.of(12,85,4,8,6,9,5,58,2,5));

        
    }

//    public static void printAllNumbersFP(List<Integer> list) {
//
//    }

    public static void printAllNumbers(List<Integer> list) {
        for(int n: list) {
            System.out.println(n);
        }
    }
    
    
}
