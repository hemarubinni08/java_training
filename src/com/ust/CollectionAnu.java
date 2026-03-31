package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionAnu {
    public void iteration(List<String> list1) {
        for (String name : list1) {
            System.out.println(name);
        }
    }
    //Removing a particluar element from the list
    public void filterName(List<String> list1) {
        for (String name : list1) {
            if (name == "Ritika") {
                continue;
            } else {
                System.out.println(name);
            }
        }
        // Using lambda expression
        list1.stream().filter(name -> !name.equals("Ritika")).toList().forEach(System.out::println);
    }
    // Remove duplicates from 2 lists
    public void removeDuplicates(List<String> list1, List<String> list2) {
        List<String> newList = new ArrayList<>();
        for (String name : list1) {
            if (!list2.contains(name)) {
                newList.add(name);
            }
        }
        for (String name : list2) {
            if (!list1.contains(name)) {
                newList.add(name);
            }
        }
        System.out.println(newList);
        //Using lambda
        newList.stream().filter(name -> !list2.contains(name) && !list1.contains(name)).toList().forEach(System.out::println);
    }
}