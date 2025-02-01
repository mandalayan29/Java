package com.ayan.fp.section7;

public class P03_Threads {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9999; i++) {
                    System.out.println(Thread.currentThread().getId() + " : " + i);
                }
            }
        };

        Runnable runnable1 = () -> {
            for (int i = 0; i < 9999; i++) {
                System.out.println(Thread.currentThread().getId() + " : " + i);
            }
        };

        Thread thread1= new Thread(runnable1);
        thread1.start();

    }
}
