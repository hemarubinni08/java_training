package com.ust;

import java.util.HashSet;

import java.util.Set;
import java.util.stream.Stream;

public class CollectionSetNavya {

    public void iterationCollectionSet(Set<String> setName) {
        for (String name : setName) {
            System.out.println(name);
        }
        setName.stream().forEach(names -> System.out.println(names));
    }

    public void filterIterationByName(Set<String> names) {

        for (String name : names) {
            if (!name.contains("Keerthi")) {
                System.out.println(name);
            }
        }
        names.stream().filter(name -> !name.equals("Keerthi")).toList().forEach(name -> System.out.println(name));
    }

    public void mergeWithoutDuplicates(Set<Integer> setName1, Set<Integer> setName2) {
        Set<Integer> result = new HashSet<>();

        for (Integer num : setName1) {
            if (!setName2.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : setName2) {
            if (!setName1.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : result) {
            System.out.println(num);
        }
        setName1.stream().filter(num -> !setName2.contains(num)).forEach(num -> System.out.println(num));
        setName2.stream().filter(num -> !setName1.contains(num)).forEach(num -> System.out.println(num));
        Stream.concat(setName1.stream().filter(num -> !setName2.contains(num)), setName2.stream().filter(num -> !setName1.contains(num))).forEach(System.out::println);
    }

    public void tempDuplicates(Set<Integer> set1, Set<Integer> set2) {
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