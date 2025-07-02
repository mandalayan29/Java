package org.example.generics;

import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {
        PracGenerics<Integer, String, List<String>> a= new PracGenerics<Integer, String, List<String>>(1,"Ayan", List.of("Ayan", "mandal"));
        a.print();

        PracGenerics<String, String, Integer> b= new PracGenerics<>("Sumana","Ayan", 1);
        b.print();
    }
}
