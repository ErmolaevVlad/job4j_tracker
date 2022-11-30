package ru.job4j.tracker;

import java.util.ArrayList;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<>();
    private int size = 0;

    public Item add(Item item) {
        items.add(item);
        size++;
        return item;
    }

    public ArrayList<Item> findAll() {
        return this.items;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> rsl = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            if (key.equals(this.items.get(index).getName())) {
                rsl.add(this.items.get(index));
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                    rsl = index;
                    break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            this.items.set(index, item);
            item.setId(id);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            this.items.remove(index);
            size--;
        }
        return rsl;
    }
}
