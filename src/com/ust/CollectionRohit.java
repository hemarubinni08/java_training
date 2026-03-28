package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Set;
import java.util.HashSet;

public class CollectionRohit {
    public void printValues(List<String> l1) {
        System.out.println("List of names:");
        for (String name : l1) {
            System.out.println(name);
        }
    }

    public void combinedListFor(List<String> l1, List<String> l2) {
        List<String> result = new ArrayList<>();
        for (String item : l1) {
            if (!l2.contains(item)) {
                result.add(item);
            }
        }

        for (String item : l2) {
            if (!l1.contains(item)) {
                result.add(item);
            }
        }

        System.out.println("Combined list without duplicates using for loop:");
        for (String item : result) {
            System.out.println(item);
        }

    }

    public void combinedList(List<String> l1, List<String> l2) {
        List<String> result = new ArrayList<>();
        Stream.concat(l1.stream().filter(item -> !l2.contains(item)), l2.stream().filter(item -> !l1.contains(item))).forEach(result::add);

        System.out.println("Combined list without duplicates:");
        for (String item : result) {
            System.out.println(item);
        }
        System.out.println("Combined list with LAMBDA:");
        result.forEach(System.out::println);

    }

    public void removeNeighbour(List<String> l1) {
        System.out.println("Without neighbour:");
        for (String name : l1) {
            if (!name.contains("Harsh")) {
                System.out.println(name);
            }


        }
        System.out.println("Using lambda");
        l1.stream().filter(name -> !name.contains("Rohit")).forEach(name -> System.out.println(name));

    }

    public void combinedListUsingHashSet(List<String> l1, List<String> l2) {
        Set<String> result = new HashSet<>();
        result.addAll(l1);
        result.addAll(l2);
        System.out.println(result);
    }

    public void combinedHashSetForLoop(List<String> l1, List<String> l2) {
        Set<String> result = new HashSet<>();
        for (String item : l1) {
            if (!l2.contains(item)) {
                result.add(item);
            }
        }

        for (String item : l2) {
            if (!l1.contains(item)) {
                result.add(item);
            }
        }

        System.out.println("HashForLoop:");
        System.out.println(result);
    }

    public void hashSetLambda(List<String> l1, List<String> l2) {
        Set<String> result = new HashSet<>();
        Stream.concat(l1.stream().filter(item -> !l2.contains(item)), l2.stream().filter(item -> !l1.contains(item))).forEach(result::add);
        System.out.println("HashLambda:" + result);
    }

    public void hashSetRemoveDupe(List<String> l1, List<String> l2) {

        Set<String> result = new HashSet<>();

        Set<String> duplicates = new HashSet<>();

        result.addAll(l1);

        for (String item : l2) {
            if (!result.add(item)) {
                result.remove(item);
            }
        }

        System.out.println("Without dupes:");
        System.out.println(result);
    }

    public void hashSetRemoveDupeLambda(List<String> l1, List<String> l2) {

        Set<String> result = new HashSet<>();

        result.addAll(l1);
        result.addAll(l2);

        result.removeAll(l1.stream().filter(item->l2.contains(item)).toList());
        System.out.println(result);


        System.out.println("Without dupes:");
        System.out.println(result);
    }



}
