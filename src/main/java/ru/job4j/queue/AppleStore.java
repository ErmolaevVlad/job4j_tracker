package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int index = 0; index < count; index++) {
            if (index == count - 1) {
                assert queue.peek() != null;
                return queue.peek().name();
            } else {
                queue.poll();
            }
        }
        return "";
    }

    public String getFirstUpsetCustomer() {
        for (int index = 0; index <= count; index++) {
            if (index == count) {
                assert queue.peek() != null;
                return queue.peek().name();
            } else {
                queue.poll();
            }
        }
        return "";
    }
}
