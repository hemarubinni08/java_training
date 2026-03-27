package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionCJ {

    //    public void iterateNames(List<String> names) {
//        for(String name : names){
//            if(name.equalsIgnoreCase("Nagarajan")){
//                continue;
//            }
//            else{
//                System.out.println(name);
//            }
//        names.stream().filter(name -> !name.equalsIgnoreCase("Nagarajan")).toList().forEach(name -> System.out.println(name));
//    }
    public void removeCommonName(List<String> nameLst1, List<String> nameLst2) {
        List<String> mergedLst = new ArrayList<>(nameLst1);
        mergedLst.retainAll(nameLst2);
        List<String> result = new ArrayList<>(nameLst1);
        result.addAll(nameLst2);

        result.removeAll(mergedLst);
        for (String name : result) {
            System.out.println(name);
        }
    }

    public void removeDuplicateLambda(List<String> nameLst1, List<String> nameLst2) {
        List<String> result = Stream.concat(nameLst1.stream(), nameLst2.stream()).filter(name -> !(nameLst1.contains(name) && nameLst2.contains(name))).toList();
        result.forEach(System.out::println);
    }
}





