package com.ayan.fp.section4;


import com.ayan.fp.section3.Course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P03_Other {


    public static void main(String[] args) {

        List<Course> courses= List.of(
                new Course("Java", "Programming", 98, 20012),
                new Course("Python", "Programming", 91, 30000),
                new Course("Microservice", "Microservice", 98, 2001),
                new Course("Spring boot", "Microservice", 95, 2002),
                new Course("API", "Microservice", 90, 200),
                new Course("Azure", "Cloud", 82, 30012),
                new Course("AWS", "Cloud", 99, 30012),
                new Course("GCP", "Cloud", 100, 4012),
                new Course("MongoDB", "DB", 93, 5012),
                new Course("POSTGRES", "DB", 100, 1200)
        );


//        If I want only top 5 courses I can use limit

        List<Course> limitList= courses.stream().sorted(Comparator.comparing(Course::getNoOfStudent)).limit(4).collect(Collectors.toList());

       limitList.stream().forEach(System.out::println);
//       If I want to skip top 5 courses I can use limit

        List<Course> skipList= courses.stream().sorted(Comparator.comparing(Course::getNoOfStudent)).skip(7).collect(Collectors.toList());

        skipList.stream().forEach(System.out::println);

//        Can use skip and limit with each other
        List<Course> skipLimitList= courses.stream().sorted(Comparator.comparing(Course::getNoOfStudent)).skip(7).limit(2).collect(Collectors.toList());

        skipLimitList.stream().forEach(System.out::println);

//        Check the P02_Comparator, few are misplaced there


    }
}
