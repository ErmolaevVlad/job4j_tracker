package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    /**
     * Метод принимает на вход 2 строки, первые элементы сравниваются по убыванию
     * если они равны, то последующие сравниваются в возрастающем порядке.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return возвращает результат сравнения строк
     */
    @Override
    public int compare(String o1, String o2) {
        String [] tmp1 = o1.split("/");
        String [] tmp2 = o2.split("/");
        int rsl =0;
        for (int index = 0; index < tmp1.length; index++ ) {
            if (index > tmp2.length -1) {
                rsl = 1;
                break;
            }
            if (index == 0) {
                rsl = tmp2[index].compareTo(tmp1[index]);
            } else {
                rsl = tmp1[index].compareTo(tmp2[index]);
            }
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0 && tmp1.length < tmp2.length) {
            rsl = -1;
        }
        return rsl;
    }
}

