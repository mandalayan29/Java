package com.ayan.fp.section7;

import java.util.ArrayList;
import java.util.List;

public class P01_replace {

    public static void main(String[] args) {
        List<String> namesImmutable= List.of("Ayan", "Sumana", "Tanu", "Bulti", "Sumunu");
        List<String> names= new ArrayList<>(namesImmutable);

        names.replaceAll(n-> n.toUpperCase());

        System.out.println(names);

        names.removeIf(n-> n.length() <= 4);

        System.out.println(names);
    }
}
