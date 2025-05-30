package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {
    private MemTracker memTracker = new MemTracker();

    private static SingleTracker instance = null;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return memTracker.add(item);
    }

    public Item findById(int id) {
        return memTracker.findById(id);
    }

    public List<Item> findByName(String key) {
        return memTracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return memTracker.replace(id, item);
    }

    public boolean delete(int id) {
        //return memTracker.delete(id);
        boolean rsl = false;
        if (memTracker.findById(id) != null) {
            memTracker.delete(id);
            if (memTracker.findById(id) == null) {
                rsl = true;
            }
        }
        return rsl;
    }

    public List<Item> findAll() {
        return memTracker.findAll();
    }
}
