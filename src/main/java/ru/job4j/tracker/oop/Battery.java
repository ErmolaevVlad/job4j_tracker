package ru.job4j.tracker.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(25);
        System.out.println("first : " + first.getLoad() + ". second : " + second.getLoad());
        first.exchange(second);
        System.out.println("first : " + first.getLoad() + ". second : " + second.getLoad());
    }
}
