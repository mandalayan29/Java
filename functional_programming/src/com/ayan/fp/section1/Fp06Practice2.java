package com.ayan.fp.section1;

import java.util.List;

public class Fp06Practice2 {
//    Print number of characters in course name

    public static void main(String[] args) {
        List<String> list= List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

//        Map each course to its length
        list.stream()
                .map(n-> n +" "+ n.length())
                .forEach(System.out :: println);
    }

}
