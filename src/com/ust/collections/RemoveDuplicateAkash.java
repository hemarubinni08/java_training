package com.ust.collections;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateAkash {
    public void removeUSingFor(List<String> names1, List<String> names2) {
        List<String> unique = new ArrayList<>();
        for (String name : names1) {
            if (!names2.contains(name)) {
                unique.add(name);
            }
        }
        for (String name : names2) {
            if (!names1.contains(name)) {
                unique.add(name);
            }
        }
        unique.forEach(System.out::println);
    }

    public void removeUSingStream(List<String> names1, List<String> names2) {
        List<String> combineList = new ArrayList<>();
        combineList.addAll(names1);
        combineList.addAll(names2);
        System.out.println(combineList.stream().filter(name -> !(names1.contains(name) && names2.contains(name))).toList());
    }

    public void removeUSingForOptimised(List<String> names1, List<String> names2) {
        List<String> combineList = new ArrayList<>();
        combineList.addAll(names1);
        combineList.addAll(names2);
        List<String> ansList = new ArrayList<>();
        for (String name : combineList) {
            if (!(names2.contains(name) && names1.contains(name))) {
                ansList.add(name);
            }
        }
        ansList.forEach(System.out::println);
    }

    public void removeUSingHashSetForLoop(Set<String> names1, Set<String> names2) {
        Set<String> combineList = new HashSet<>(names1);
        combineList.addAll(names2);
        Set<String> ansList = new HashSet<>();
        for (String name : combineList) {
            if (!(names1.contains(name) && names2.contains(name))) {
                ansList.add(name);
            }
        }
        ansList.forEach(System.out::println);
    }

    public void removeUSingHashSet(Set<String> names1, Set<String> names2) {
        Set<String> combine = new HashSet<>(names1); // combine list formation
        combine.addAll(names2);
        Set<String> duplicates = new HashSet<>(names1); // getting the duplicates
        duplicates.retainAll(names2);
        combine.removeAll(duplicates);
        combine.forEach(System.out::println);
    }

    public void removeUSingHashSetLambda(Set<String> names1, Set<String> names2) {
        Set<String> combine = new HashSet<>();
        combine.addAll(names1);
        combine.addAll(names2);
        Set<String> temp = names1.stream().filter(name -> names2.contains(name)).collect(Collectors.toSet());
        Set<String> ansList = combine.stream().filter(name -> !temp.contains(name)).collect(Collectors.toSet());
        ansList.forEach(System.out::println);
    }


}
