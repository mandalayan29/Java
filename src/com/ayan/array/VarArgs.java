package com.ayan.array;

//For command line arguments
//        compile by > javac {{class_name.java}}
//        run by > java {{class_name}}.java arguments
//        java VarArgs.java hello my name is ayan mandal [1,2,3,4,5]

public class VarArgs {


    public static void getVerargs(String... strings){
        System.out.println("========  In varargs  ==========");
        for(String s: strings){
            System.out.println(s);
        }
        System.out.println("========  Out of varargs  ==========");
    }

    public static void main(String[] args) {

        System.out.println("Printing args from command line");
        for(String s: args){
            System.out.println(s);
        }

        System.out.println("======== Done ========");

        getVerargs();

        getVerargs("Str1");

        getVerargs("Str1","Str2","Str3");

        String[] s= new String[]{"Str1","Str2","Str3","Str1","Str2","Str3"};
        getVerargs(s);

    }


}
