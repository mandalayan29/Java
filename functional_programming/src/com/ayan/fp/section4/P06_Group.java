package com.ayan.fp.section4;

import com.ayan.fp.section3.Course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P06_Group {

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

//        we can group by category

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
/*
        {
        Microservice=
            [Course{name='Microservice', category='Microservice', rating=98, noOfStudent=2001},
             Course{name='Spring boot', category='Microservice', rating=95, noOfStudent=2002},
             Course{name='API', category='Microservice', rating=90, noOfStudent=200}],
        Cloud=
            [Course{name='Azure', category='Cloud', rating=82, noOfStudent=30012},
             Course{name='AWS', category='Cloud', rating=99, noOfStudent=30012},
             Course{name='GCP', category='Cloud', rating=100, noOfStudent=4012}],
        Programming=
            [Course{name='Java', category='Programming', rating=98, noOfStudent=20012},
             Course{name='Python', category='Programming', rating=91, noOfStudent=30000}],
        DB=
            [Course{name='MongoDB', category='DB', rating=93, noOfStudent=5012},
             Course{name='POSTGRES', category='DB', rating=100, noOfStudent=1200}]
         }
*/
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

//        To get the highest review course for each category -> this gives entire course
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getRating)))));
//        To get only the map
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));



    }

}
