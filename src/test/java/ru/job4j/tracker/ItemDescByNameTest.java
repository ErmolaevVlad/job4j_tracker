package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenAsc() {
        List<Item> list = Arrays.asList(
                new Item("2"),
                new Item("4"),
                new Item("6"),
                new Item("5"),
                new Item("1"),
                new Item("7"),
                new Item("3")

        );
        list.sort(new ItemDescByName());
        assertThat(list).hasSameElementsAs(List.of(
                new Item("7"),
                new Item("6"),
                new Item("5"),
                new Item("4"),
                new Item("3"),
                new Item("2"),
                new Item("1")
        ));
    }

}