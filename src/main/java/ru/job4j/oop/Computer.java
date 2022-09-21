package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public void printInfo() {
        System.out.println("Много монитор: " + multiMonitor);
        System.out.println("SSd: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public Computer() {
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        computer.printInfo();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
        Computer third = new Computer();
        third.printInfo();
    }
}
