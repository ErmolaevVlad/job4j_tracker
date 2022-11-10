package ru.job4j.oop;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{train, airplane, bus};
        for (Vehicle i : vehicles) {
            i.move();
        }
    }
}
