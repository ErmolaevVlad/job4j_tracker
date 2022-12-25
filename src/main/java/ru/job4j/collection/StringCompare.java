package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int index = 0; index < left.length(); index++) {
            int rslCompare = Character.compare(left.charAt(index), right.charAt(index));
            if (rslCompare != 0) {
                return rslCompare;
            }
        }
        if (left.length() < right.length()) {
            return -1;
        }
        return 0;
    }
}
