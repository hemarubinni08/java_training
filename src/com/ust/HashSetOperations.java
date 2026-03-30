package com.ust;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperations {

    public void printElements(Set<String> hashSet) {
        for (String value : hashSet) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Using Lambda");

        hashSet.stream().forEach(System.out::println);
        System.out.println("**************************************");
    }

    public void combineHashSetValues(Set<String> firstSet, Set<String> secondSet) {

        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> combinedSet = new HashSet<>();

        combinedSet.addAll(firstSet);
        combinedSet.addAll(secondSet);
        System.out.println("The Combined values are:" + combinedSet);

        for (String value : firstSet) {
            if (!secondSet.contains(value)) {
                uniqueElements.add(value);
            }
        }

        for (String value : secondSet) {
            if (!firstSet.contains(value)) {
                uniqueElements.add(value);
            }
        }

        System.out.println("unique element" + uniqueElements);

        System.out.println();
        System.out.println("************** COMBINE HASHSET USING LAMBDA **************");
        System.out.println();

        combinedSet.removeAll(firstSet.stream().filter(value -> secondSet.contains(value)).toList());
        System.out.println("result of combined" + combinedSet);
    }
}