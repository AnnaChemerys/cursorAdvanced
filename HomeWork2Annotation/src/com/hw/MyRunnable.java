package com.hw;

@Repeat(7)
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
