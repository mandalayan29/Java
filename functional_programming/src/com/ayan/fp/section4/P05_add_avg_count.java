package com.ayan.fp.section4;

import com.ayan.fp.section3.Course;

import java.util.List;
import java.util.OptionalDouble;

public class P05_add_avg_count {

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

        int total= courses.stream().mapToInt(c-> c.getNoOfStudent()).sum();
        System.out.println(total);

        OptionalDouble avg= courses.stream().mapToDouble(c-> c.getNoOfStudent()).average();
        System.out.println(avg);

        long count= courses.stream().mapToInt(c-> c.getNoOfStudent()).count();
        System.out.println(count);
    }

}
