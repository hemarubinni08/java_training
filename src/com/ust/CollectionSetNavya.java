package com.ust;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Set;
import java.util.stream.Stream;

public class CollectionSetNavya {
    public static void iterationCollection(Set<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
        list.stream().forEach(names -> System.out.println(names));
    }


    public static void filterIteration(Set<String> names) {

        for (String name : names) {
            if (!name.contains("Keerthi")) {
                System.out.println(name);
            }
        }
        names.stream().filter(name -> !name.equals("Keerthi")).toList().forEach(name -> System.out.println(name));
    }

    public static void mergeWithoutDuplicates(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (Integer num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : set2) {
            if (!set1.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : result) {
            System.out.println(num);
        }
        set1.stream().filter(num -> !set2.contains(num)).forEach(num -> System.out.println(num));
        set2.stream().filter(num -> !set1.contains(num)).forEach(num -> System.out.println(num));
        Stream.concat(set1.stream().filter(num -> !set2.contains(num)), set2.stream().filter(num -> !set1.contains(num))).forEach(System.out::println);
    }

    public static void tempDuplicates(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> tempSet = new HashSet<>();
        Set<Integer> combinedSet = new HashSet<>();
        combinedSet.addAll(set1);
        combinedSet.addAll(set2);
        for (Integer num : set1) {
            if (set2.contains(num)) {
                tempSet.add(num);
            }
        }
        combinedSet.removeAll(tempSet);
        System.out.println(combinedSet);
        set1.stream().filter(num -> set2.contains(num)).forEach(tempSet::add);
        combinedSet.removeAll(tempSet);
        System.out.println(combinedSet);
    }
}