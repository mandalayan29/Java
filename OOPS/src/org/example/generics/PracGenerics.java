package org.example.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class PracGenerics<T, A, B> {
    private T var1;
    private A var2;
    public B[] arr3;
    public PracGenerics(T a, A b, B s) {
        this.var1= a;
        this.var2= b;
    }

    void print() {
        System.out.println(var1);
        System.out.println(var2);
//        System.out.println(Arrays.toString(var3));
    }



}
