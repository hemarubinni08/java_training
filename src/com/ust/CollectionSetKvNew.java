package com.ust;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionSetKvNew {
//    public void collectionSetIterations(Set<String> set1) {
//        for (String name : set1) {
//            System.out.println(name);
//        }
//        set1.stream().forEach(name -> System.out.println(name));
//    }
//
//
//    public  void hashIteration(Set<String> set1) {
//        HashSet<String> result = new HashSet<>();
//
//        for (String name : set1) {
//            if (!name.equals("navya")) {
//                result.add(name);
//            }
//        }
//        System.out.println(result);
//        set1.stream().filter(name -> !name.equals("navya")).toList().forEach(name -> System.out.println(name));
//    }
//
//        public  void getNonDuplicate (Set<String> set1, Set< String >set2){
//            HashSet<String> mergedList = new HashSet<>();
//            for (String name : set1) {
//                if (!set2.contains(name)) {
//                    mergedList.add(name);
//                }
//            }
//            for (String name : set2) {
//                if (!set1.contains(name)) {
//                    mergedList.add(name);
//                }
//            }
//            System.out.println(mergedList);
//            set1.stream().filter(name -> !set2.contains(name)).forEach(mergedList::add);
//            set2.stream().filter(name -> !set1.contains(name)).forEach(mergedList::add);
//
//            Stream.concat(
//                    set1.stream().filter(name -> !set2.contains(name)),
//                    set2.stream().filter(name -> !set1.contains(name))
//            ).forEach(System.out::println);
//        }

    public Set<String> removeDuplicateSet(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>();
        Set<String> tempset = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        for (String name : tempset) {
            if (!(set1.contains(name) && set2.contains(name))) {
                result.add(name);
            }
        }
        return result;
//        set1.stream().filter(name -> set2.contains(name)).forEach(tempset::add);
//      result.removeAll(tempset);
//        System.out.println(result);


    }


    }