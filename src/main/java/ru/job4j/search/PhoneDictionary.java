package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person value : this.person) {
            if (value.getPhone().contains(key) || value.getSurname().contains(key)
                    || value.getAddress().contains(key) || value.getName().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }
}
