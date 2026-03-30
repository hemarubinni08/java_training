package com.ust;

import java.util.*;
import java.util.stream.Stream;
public class CollectionHarsh {


    public void printValues(List<String> names) {
        System.out.println("List of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }


    public void combinedListUsingForLoop(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        for (String item : list1) {
            if (!list2.contains(item)) {
                result.add(item);
            }
        }

        for (String item : list2) {
            if (!list1.contains(item)) {
                result.add(item);
            }
        }

        System.out.println("Combined list without duplicates (For Loop):");
        for (String item : result) {
            System.out.println(item);
        }
    }

    public void combinedListUsingLambda(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        Stream.concat(
                list1.stream().filter(item -> !list2.contains(item)),
                list2.stream().filter(item -> !list1.contains(item))
        ).forEach(result::add);

        System.out.println("Combined list without duplicates (Lambda):");
        result.forEach(System.out::println);
    }

    public void removeNeighbour(List<String> names) {
        System.out.println("Without specific name (For Loop):");
        for (String name : names) {
            if (!name.contains("Harsh")) {
                System.out.println(name);
            }
        }

        System.out.println("Without specific name (Lambda):");
        names.stream()
                .filter(name -> !name.contains("Rohit"))
                .forEach(System.out::println);
    }

    public void combineUsingHashSet(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>();
        result.addAll(list1);
        result.addAll(list2);

        System.out.println("Combined using HashSet:");
        System.out.println(result);
    }

    public void combineHashSetUsingForLoop(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>();

        for (String item : list1) {
            if (!list2.contains(item)) {
                result.add(item);
            }
        }

        for (String item : list2) {
            if (!list1.contains(item)) {
                result.add(item);
            }
        }

        System.out.println("HashSet with For Loop:");
        System.out.println(result);
    }

    public void combineHashSetUsingLambda(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>();

        Stream.concat(
                list1.stream().filter(item -> !list2.contains(item)),
                list2.stream().filter(item -> !list1.contains(item))
        ).forEach(result::add);

        System.out.println("HashSet with Lambda:");
        System.out.println(result);
    }

    public void removeDuplicatesUsingHashSet(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>();
        result.addAll(list1);

        for (String item : list2) {
            if (!result.add(item)) {
                result.remove(item);
            }
        }

        System.out.println("Without duplicates:");
        System.out.println(result);
    }


    public void removeDuplicatesUsingLambda(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>();
        result.addAll(list1);
        result.addAll(list2);

        result.removeAll(
                list1.stream()
                        .filter(list2::contains)
                        .toList()
        );

        System.out.println("Without duplicates (Lambda):");
        System.out.println(result);
    }

    public void printNameOfHashmap(Map<Integer, String> map) {
        map.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });
        System.out.println("**************************************************");
        map.entrySet().stream().forEach(System.out::println);
    }
    public void removingCommonFromTwoMap(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> newmap = new HashMap<>();
        newmap.putAll(map1);
        newmap.putAll(map2);
        newmap.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });
        System.out.println("**********************************");
    }

    public void removingBothDuplicateFromMap(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> newmap = new HashMap<>();
        map1.forEach((key, value) -> {
            if (!map2.containsKey(key)) {
                newmap.put(key, value);
            }
        });
        map2.forEach((key, value) -> {
            if (!map1.containsKey(key)) {
                newmap.put(key, value);
            }
        });
        newmap.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });

    }
}