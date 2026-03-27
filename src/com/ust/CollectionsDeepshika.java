package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDeepshika {

    public void iteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void printNames(List<String> names) {
        for (String name : names) {
            if (!name.equalsIgnoreCase("Mamatha")) {
                System.out.println(name);
            }
        }
        System.out.println();
        names.stream().filter(name -> !name.equalsIgnoreCase("mamatha")).toList().forEach(System.out::println);
    }

    public List<String> compareNames(List<String> names, List<String> names2) {
        List<String> result = new ArrayList<>();
        for (String name1 : names) {
            if (!names2.contains(name1)) {
                result.add(name1);
            }
        }
        for (String name2 : names2) {
            if (!names.contains(name2)) {
                result.add(name2);
            }
        }
        result.clear();
        result.addAll(names.stream().filter(name1 -> !names2.contains(name1)).toList());
        result.addAll(names2.stream().filter(name2 -> !names.contains(name2)).toList());
        return result;
    }
}