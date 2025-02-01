package com.ayan.fp.section4;

import com.ayan.fp.section3.Course;

import java.util.List;
import java.util.function.Predicate;

public class P01_Match {

    public static void main(String[] args) {
        List<Course> courses= List.of(
                                    new Course("Java", "Programming", 98, 20012),
                                    new Course("Python", "Programming", 91, 30000),
                                    new Course("Microservice", "Microservice", 98, 2001),
                                    new Course("Spring boot", "Microservice", 95, 2002),
                                    new Course("API", "Microservice", 90, 200),
                                    new Course("Azure", "Cloud", 82, 10012),
                                    new Course("AWS", "Cloud", 99, 30012),
                                    new Course("GCP", "Cloud", 100, 4012),
                                    new Course("MongoDB", "DB", 93, 5012),
                                    new Course("POSTGRES", "DB", 100, 1200)
                          );

        /*
        * allMatch:
        *   all courses has review score more than 90
        *   all the courses match the predicate
        * noneMatch:
        *   if not course is satisfying the predicate/condition it will return true
        *   opposite to the allMatch
        * anyMatch:
        *   if any of the courses matches the predicate
        *   even if one course matches it will return true
        * */

        System.out.println(courses.stream().allMatch(course-> course.getRating() > 90));
//        Here all the courses don't have rating more than 90. so it will print "false"
        System.out.println(courses.stream().allMatch(course-> course.getRating() > 80));
//        Here all the courses have rating more than 80. so it will print "true"

        Predicate<Course> _90Rating= course -> course.getRating()>90;
        System.out.println(courses.stream().allMatch(_90Rating));
        System.out.println(courses.stream().noneMatch(_90Rating));

        Predicate<Course> scoreGreaterPredicate= c-> c.getRating() < 20;

        System.out.println(courses.stream().noneMatch(scoreGreaterPredicate));
        System.out.println(courses.stream().anyMatch(scoreGreaterPredicate));
    }

}
