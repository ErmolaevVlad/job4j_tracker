package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        Predicate<Person> containsPhone = p -> p.getPhone().contains(key);
        Predicate<Person> containsSurname = p -> p.getSurname().contains(key);
        Predicate<Person> containsAddress = p -> p.getAddress().contains(key);
        Predicate<Person> containsName = p -> p.getName().contains(key);
        Predicate<Person> combine = containsPhone.or(containsName).or(containsSurname).or(containsAddress);

        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}