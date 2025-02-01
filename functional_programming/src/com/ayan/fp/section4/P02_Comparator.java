package com.ayan.fp.section4;

import com.ayan.fp.section3.Course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P02_Comparator {

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

        Comparator<Course> compareByNoOfStudents= Comparator.comparing(Course::getNoOfStudent);
        Comparator<Course> compareByNoOfStudentsReverse= Comparator.comparing(Course::getNoOfStudent).reversed();
        List<Course> c= courses.stream().sorted(compareByNoOfStudents).collect(Collectors.toList());
//        System.out.println(c);
        List<Course> c1= courses.stream().sorted(compareByNoOfStudentsReverse).collect(Collectors.toList());
//        System.out.println(c1);

//        If courses have same no of student, higher rating will be first
        Comparator<Course> comparingNoOfStudentAndRating= Comparator.comparing(Course::getNoOfStudent)
                                                                    .thenComparing(Course::getRating).reversed();
//        System.out.println(courses.stream().sorted(comparingNoOfStudentAndRating).collect(Collectors.toList()));

//        To get limited no of items--> we can use limit()
//        To get the top 4 courses

        List<Course> c2= courses.stream().sorted(compareByNoOfStudentsReverse)
                .limit(4)
                .collect(Collectors.toList());

        courses.stream().sorted(compareByNoOfStudentsReverse)
                .limit(4)
                .collect(Collectors.toList()).stream().forEach(System.out::println);
//        System.out.println(c2);
        System.out.println("--".repeat(20));
//        We can also skip items using skip(no)
//
        courses.stream().sorted(compareByNoOfStudentsReverse)
                .skip(2)
                .limit(4)
                .collect(Collectors.toList()).stream().forEach(System.out::println);

//        Take while
//        Consider all the element from starting until I get a element which meet some condition
//            takeWhile(predicate) -> after successful predicate it will return all the element till this
        System.out.println("--".repeat(20));



        courses.stream()
                .forEach(System.out::println);
        System.out.println("--".repeat(20));
        courses.stream()
                .takeWhile(co-> co.getRating() > 90)
                .forEach(System.out::println);

//        takeWhile -> I will take all the courses until I get a course whose rating is 90
//        even if there are courses with more review score it wont consider after a review score less than 90
        courses.stream()
                .dropWhile(cc-> cc.getRating() < 10)
                .skip(1)
                .forEach(System.out::println);
//        takeWhile -> I skip take all the courses until I get a course whose rating is 90, and will take after that

        /*
        * Primitive Comparing
        *
        * comparingInt/float/double etc
        *
        * */
    }
}
