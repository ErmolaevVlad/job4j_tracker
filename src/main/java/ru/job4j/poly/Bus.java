package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Bus rides");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Пассажиров в автобусе " + count);
    }

    @Override
    public int refuel(int fuel) {
        return 100;
    }
}
