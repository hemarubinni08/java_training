package com.ust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortAlphabeticalArdraMain {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<String>(Arrays.asList("Ardra", "Hemanth", "Anu", "Ritu", "Yeshwanth", "Akash"));
        SortAlphabeticalArdra sorting = new SortAlphabeticalArdra();
        List<String> sortedList = sorting.sortNamesList(namesList);
        sorting.printList(sortedList);

        Set<String> namesSet = new HashSet<String>(Arrays.asList("Ardra", "Hemanth", "Anu", "Ritu", "Yeshwanth", "Akash"));
    }
}
