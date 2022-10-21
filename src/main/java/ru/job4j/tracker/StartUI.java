package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item currentDateTime = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        Item currentTime = new Item(1, "first");
        System.out.println(currentTime);
    }
}