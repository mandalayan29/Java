package com.ayan.fp.section4;

import com.ayan.fp.section3.Course;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class P04_MINMAX_FIND {

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

        Comparator<Course> compareByNameLength= Comparator.comparing(c-> c.getName().length());

        List<Course> cources1= courses.stream()
                .sorted(compareByNameLength.reversed()).collect(Collectors.toList());
//        cources1.forEach(System.out::println);

        /*
        * max() -> max using some criteria - comparator
        *
        *   It returns optional because there might be a case where there are no value
        * example: filter predicate not returning any value
        *   courses.stream().filter(c-> c.getName().equals("NOTHING")).max(compareByNameLength);
        *   optional helps us to handle nullPointerException
        * */

        Optional<Course> maxVal = courses.stream().max(compareByNameLength);
        System.out.println(maxVal.get());

        Optional<Course> minVal = courses.stream().min(compareByNameLength);
        System.out.println(minVal.get());

        minVal.orElse(new Course("NEW NULL", "MY", 100, 0));

        /*
        *
        * findFirst
        *
        * findAny -> return one of the value from all which satiisfy the criteria
        *
        * */

        Optional<Course> first = courses.stream().filter(c-> c.getRating() < 91).findFirst();
        System.out.println(first.get());

        System.out.println(courses.stream().filter(c-> c.getRating() < 100).findAny());
//        nonDeterministic


    }
}
