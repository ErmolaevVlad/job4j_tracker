package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            int rslCompare = Character.compare(left.charAt(index), right.charAt(index));
            if (rslCompare != 0) {
                return rslCompare;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
