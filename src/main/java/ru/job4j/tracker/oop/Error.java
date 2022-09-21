package ru.job4j.tracker.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printReport() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error first = new Error(true, 1, "Error message");
        first.printReport();
        Error second = new Error(false, 2, "Error mail");
        second.printReport();
        Error third = new Error();
        third.printReport();
    }
}
