package com.ust.impl;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class CollectionsDeepakHashSet {

    public static void iterationCollections(HashSet<Integer> set1, HashSet<Integer> set2) {

//        HashSet<Integer> common = new HashSet<>(set1);
//        common.retainAll(set2);
//
//        set1.removeAll(common);
//        set2.removeAll(common);
//
//        for (Integer num : set1) {
//            System.out.println(num);
//        }
//
//        for (Integer num : set2) {
//            System.out.println(num);
//        }
//        for (Integer num : set1) {
//            if (set2.contains(num)) {
//                continue;
//            }
//            System.out.println(num);
//        }
//        for (Integer num : set2) {
//            if (!set1.contains(num)) {
//                System.out.println(num);
//            }
//        }
//        set1.stream().filter(num -> !set2.contains(num))
//                .forEach(System.out::println);
//        set2.stream().filter(num -> !set1.contains(num))
//                .forEach(System.out::println);
        HashSet<Integer> tempset=new HashSet<>();
        HashSet<Integer> combinedset=new HashSet<>();

        combinedset.addAll(set1);
        combinedset.addAll(set2);

        for (Integer num:set1)
        {
                if(set2.contains(num)){
                    tempset.add(num);
                }
        }
        combinedset.removeAll(tempset);
        System.out.println(combinedset);

        set1.stream().filter(num ->set2.contains(num)).forEach(tempset::add);
        combinedset.removeAll(tempset);
        System.out.println(combinedset);

    }
}
