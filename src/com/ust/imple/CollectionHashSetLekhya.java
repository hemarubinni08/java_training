package com.ust.imple;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSetLekhya {
    public void addPodMembers(HashSet<String> names1, HashSet<String> names2) {
        Set<String> output = new HashSet<String>(names1);
        output.addAll(names2);
        for (String name : output) {
            System.out.println(name);
        }
        System.out.println("Pod names without the neighbour name:");
        output.stream().filter(name -> !name.equalsIgnoreCase("Chaila")).forEach(name -> System.out.println(name));
    }

    public void filterDuplicateNumbers(HashSet<Integer> numbers1, HashSet<Integer> numbers2) {
        HashSet<Integer> tempSet = new HashSet<Integer>();
        HashSet<Integer> result = new HashSet<Integer>(numbers1);
        result.addAll(numbers2);
        numbers1.stream().filter(num -> numbers2.contains(num)).forEach(tempSet::add);
        tempSet.stream().forEach(result::remove);
        System.out.println(result);
    }
}
