package com.ust.collections;

import java.util.ArrayList;
import java.util.List;

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
}
