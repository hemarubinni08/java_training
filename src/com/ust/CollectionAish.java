package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionAish {
 //   public void doIteration(List<String> names) {
//        for (String name : names) {
//            if(name=="bewin"){
//                continue;
//            }
//            System.out.println(name);
//        }


//    public void doFilter(List<String> names) {
//        names.stream().filter(name -> !name.equalsIgnoreCase("aishu")).toList().forEach(name -> System.out.println(name));
//
//
//    }

//    public void removeDuplicate(List<String> names, List<String> names1) {
//        List<String> uniqueList = new ArrayList<>();
//        for (String name : names) {
//            if (!names1.contains(name)) {
//                uniqueList.add(name);
//            }
//        }
//        for (String name : names1) {
//            if (!names.contains(name)) {
//                uniqueList.add(name);
//            }
//        }
//        System.out.println(uniqueList);
//    }
//    public void removeDuplicates(List<String>names,List<String>names1){
//       List<String> uniqueList = new ArrayList<>();
//       names.stream().filter(name -> !names1.contains(name)).toList().add(names);
//       names.stream().filter(name -> !names.contains(name)).toList().add(names1);
//        List<String> result =new ArrayList<>();
//        result.addAll(names.stream().filter(name->!names1.contains(name)).toList());
//        result.addAll(names1.stream().filter(name->!names.contains(name)).toList());
//        System.out.println(result);

//}
//    public void removeDuplicatesUsingForLoop(List<String>names,List<String>names1) {
//        List<String> merged = new ArrayList<>(names);
//        merged.retainAll(names1);
//        List<String> result = new ArrayList<>(names);
//        result.addAll(names1);
//        result.removeAll(merged);
//        for (String name : result) {
//            System.out.println(name);
//
//        }
//    }
        public void removeDuplicatesUsingStream(List<String>names,List<String>names1){
            List<String>result= Stream.concat(names.stream(),names1.stream()).filter(name->!(names1.contains(name)&&names.contains(name))).toList();
               result.forEach(System.out::println);

        }

    }








