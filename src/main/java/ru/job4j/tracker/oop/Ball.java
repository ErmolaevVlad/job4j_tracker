package ru.job4j.tracker.oop;

public class Ball {

    public void tryRun(Boolean condition) {
        if (condition) {
            System.out.println("The ball was eaten");
        } else {
            System.out.println("The ball escaped");
        }
    }
}
