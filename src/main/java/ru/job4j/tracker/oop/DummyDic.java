package ru.job4j.tracker.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic first = new DummyDic();
        String say = first.engToRus("Hello");
        System.out.println(say);
    }
}
