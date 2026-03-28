package com.ust;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CollectionRitika {
    public void doIterate(List<String> lists) {
        for (String list : lists) {
            System.out.println(list);
        }
        //Lambda expression
        lists.forEach(list-> System.out.println(list));
         lists.forEach(System.out::println); //same thing only
    }

    public void filterIterate(List<String> members) {

        for (String name : members) {
            if (name == "Anu") {
                continue;
            } else {
                System.out.println(name);
            }
        }
    }

    public List<String> removeCommon(List<String> list1, List<String> list2) {
        List<String> newL1 = new ArrayList<>();
        List<String> newL2 = new ArrayList<>();
        newL1.addAll(list1);
        newL1.addAll(list2);
        for(String value:list1){
            if(!list2.contains(value)){
                newL1.add(value);
            }
        }
        for(String value:list2){
            if(!list1.contains(value)){
                newL1.add(value);
            }
        }
        // Combined list
          for(String value: newL1){
              if(!(list2.contains(value) && (list1.contains(value)))){
                  newL2.add(value);
              }
          }
        //Lambda expression
        newL1.addAll(list1.stream().filter(value -> !list2.contains(value)).toList());
        newL1.addAll(list2.stream().filter(value -> !list1.contains(value)).toList());
        return newL1.stream().filter(value -> !(list2.contains(value) && (list1.contains(value)))).toList();//combined
//         return newL2;

    }
    //Set
    public Set<String> mergeSets(Set<String> set1, Set<String> set2) {
        Set<String> newSet = new HashSet<>();
        Set<String> newSet2 = new HashSet<>();
        newSet.addAll(set1);
        newSet.addAll(set2);
        //for each loop
//        for (String value : newSet) {
//            if (!(set2.contains(value) && (set1.contains(value)))) {
//                newSet2.add(value);
//            }
//        }
//        return newSet2;
        //lambda expression
        return newSet.stream().filter(value -> !(set2.contains(value) && (set1.contains(value)))).collect(Collectors.toSet());//combined
    }

    public Set<String> deleteDuplicateSet(Set<String> set1, Set<String> set2) {
        Set<String> duplicate = new HashSet<>();
        Set<String> combineSet = new HashSet<>();
        combineSet.addAll(set1);
        combineSet.addAll(set2);

        set1.stream().filter(value -> set2.contains(value)).forEach(duplicate::add);
        duplicate.forEach(combineSet::remove);
        return combineSet;

    }
    //Map
    public void idRitu(Map<String, String> newmap) {

        //ForEach
//        newmap.forEach((empid, name) -> System.out.println(empid + "-" + name));
        //Keyset
//        for (String empid : newmap.keySet()) {
//            System.out.println(empid + "-" + newmap.get(empid));
//        }
        //Entryset
        for (Map.Entry<String, String> entry : newmap.entrySet()) {
            if(entry.getKey().equalsIgnoreCase("101") && entry.getValue().equalsIgnoreCase("Ritu")){
                continue;
            }
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        //Lambda expression
//        newmap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }
    public void specificId(Map<String, String> newMap) {
//        if(newMap.containsKey("101") ){
//            newMap.remove("101");
//        }
//        for (Map.Entry<String, String> entry : newMap.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }
        //lambda expression

        newMap.entrySet().stream().filter(entry ->
                !(entry.getKey().equalsIgnoreCase("101"))).forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }
}
