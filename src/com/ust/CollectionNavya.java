package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionNavya {
    //public static void iterationCollection(List<String> list) {
    //for (String name : list) {
    //System.out.println(name);
    //}
    //}

//    public static void filterIteration(List<String> names) {
//        for (String name : names) {
//            if (!name.equals("Keerthi")) {
//                System.out.println(name);
//            }
//        }

    // names.stream().filter(name -> !name.equals("Keerthi")).toList().forEach(name -> System.out.println(name));
//
//
//    }

    public static void mergeWithoutDuplicates(List<Integer> l1, List<Integer> l2) {

        List<Integer> result = new ArrayList<>();
//
//        for (Integer num : l1) {
//            if (!l2.contains(num)) {
//                result.add(num);
//            }
//        }
//
//        for (Integer num : l2) {
//            if (!l1.contains(num)) {
//                result.add(num);
//            }
//        }

//        for (Integer num : result) {
//            System.out.println(num);
//        }


        l1.stream()
                .filter(num -> !l2.contains(num))
                .forEach(result::add);

        l2.stream()
                .filter(num -> !l1.contains(num))
                .forEach(result::add);

        result.forEach(System.out::println);
    }
}

