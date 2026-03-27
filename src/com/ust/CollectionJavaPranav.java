package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionJavaPranav {


//    public void doForIteration(List<String> list) {
//        for (String name : list) {
//            System.out.println(name);
//        }
//    }
//
//    public void doStreamIteration(List<String> list) {
//        list.forEach(System.out::println);
//    }
//
//    public void doConditionIteration(List<String> list) {
//        list.stream().filter(name -> name.equals("Pranav")).forEach(System.out::println);
//    }
//
//    public void doForNewIteration(List<String> list) {
//        for (String name : list) {
//            if(name.equalsIgnoreCase("Harsha")){
//                continue;
//            }
//            System.out.println(name);
//        }
//    }
//
//    public void doNewIteration(List<String> list){
//        list.stream().filter(name->!name.equalsIgnoreCase("Harsha")).forEach(System.out::println);
//    }

    public void findDuplicate(List<String> list1, List<String> list2) {


        List<String> result = new ArrayList<>();
//        for (String s : list1) {
//            if (!list2.contains(s)) {
//                result.add(s);
//            }
//        }
//        for (String s : list2) {
//            if (!list1.contains(s)) {
//                result.add(s);
//            }
//        }
//        combinedList.addAll(list1.stream().filter(name->!list2.contains(name)).toList());
//        combinedList.addAll(list2.stream().filter(name->!list1.contains(name)).toList());

//        List<String> combinedList = Stream.concat(list1.stream(),
//                list2.stream()).filter(name->!(list2.contains(name) && list1.contains(name))).toList();
//
//
//        combinedList.forEach(System.out::println);
        List<String> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(list2);

        for (String s : combined) {
            if (!(list1.contains(s) && list2.contains(s))) {
                result.add(s);
            }
        }
        result.forEach(System.out::println);

    }

}
