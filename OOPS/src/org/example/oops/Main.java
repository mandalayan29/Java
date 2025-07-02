package org.example.oops;

public class Main {

    public static void main(String[] args) {
        Vehicle v= new Bike();

        v.start();

        Bike b= new Bike();
        b.ride();
        b.start();
    }
}
