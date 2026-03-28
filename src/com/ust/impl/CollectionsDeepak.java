package com.ust.impl;//package com.ust.impl;
//
//import java.util.List;
//
//public class CollectionsDeepak {
//
//    public static void iterationCollections(List<String> list) {
////        for (String name : list) {
////            if (name.equalsIgnoreCase("Gokul")) {
////                continue;
////            }
////            System.out.println(name);
////        }
//
////        list.stream()
////                .filter(name -> !name.equalsIgnoreCase("rohit"))
////                .forEach(name -> System.out.println(name));
//
//
//    }
//}

import java.util.List;
import java.util.stream.Stream;


public class CollectionsDeepak {

    public static void iterationCollections(List<Integer> list1, List<Integer> list2) {
//
//        for (Integer num : list1) {
//            if (list2.contains(num)) {
//                continue;
//            }
//            System.out.println(num);
//        }
//        for (Integer num : list2) {
//            if (!list1.contains(num)) {
//                System.out.println(num);
//            }
//        } for loop.
//        list1.stream()
//                .filter(num -> !list2.contains(num))
//                .forEach(num -> System.out.println(num));
//
//        list2.stream()
//                .filter(num -> !list1.contains(num))
//                .forEach(num -> System.out.println(num));
        Stream.concat(
                list1.stream().filter(num -> !list2.contains(num)),
                list2.stream().filter(num -> !list1.contains(num))
        ).forEach(System.out::println);

    }
}
