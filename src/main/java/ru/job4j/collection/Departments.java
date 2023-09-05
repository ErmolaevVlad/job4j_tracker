package ru.job4j.collection;

import java.util.*;

public class Departments {

    /**
     * Метод принимает список кодов подразделений и формирует новый список
     * который уже содержит возможно отсутвующие коды подразделений
     * @param deps список кодов подразделений
     * @return возвращает список кодов подразделений с возможно отсутсвующими
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Метод принимает на вход список кодов подразделений и сортирует их
     * в порядке возрастания.
     * @param orgs список кодов подраздений
     */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    /**
     * Метод принимает на вход список кодов подразделений и сортирует их
     * в порядке убывания
     * @param orgs список кодов подраздений
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}