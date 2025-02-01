package com.ayan.fp.section3;

public class Course {
    private String name;
    private String category;
    private int rating;
    private int noOfStudent;

    public Course(String name, String category, int rating, int noOfStudent) {
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.noOfStudent = noOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", noOfStudent=" + noOfStudent +
                '}';
    }
}
