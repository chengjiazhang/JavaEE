package com.company;


import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author edz
 */
public class Main {

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        NavigableSet<Item> sort = new TreeSet<>(
                Comparator.comparing(Item::getDescription));
        sort.addAll(parts);
        System.out.println(sort);
    }
}
