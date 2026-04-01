package com.ust.collections;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CollectionRitika {

    public void doIterate(List<String> lists) {
        for (String list : lists) {
            System.out.println(list);
        }
        //Lambda expression
        lists.forEach(list -> System.out.println(list));
        lists.forEach(System.out::println); //same thing only
    }

    //  Doing iterate using List
    public void filterIterate(List<String> members) {

        for (String name : members) {
            if (!name.equalsIgnoreCase("Anu")) {
                System.out.println(name);
            }
        }
    }

    //  Removing duplicate using List
    public List<String> removeCommon(List<String> list1, List<String> list2) {
        List<String> newL1 = new ArrayList<>();
        List<String> newL2 = new ArrayList<>();
        newL1.addAll(list1);
        newL1.addAll(list2);

        for (String value : list1) {
            if (!list2.contains(value)) {
                newL1.add(value);
            }
        }

        for (String value : list2) {
            if (!list1.contains(value)) {
                newL1.add(value);
            }
        }

        // Combined list
        for (String value : newL1) {
            if (!(list2.contains(value) && (list1.contains(value)))) {
                newL2.add(value);
            }
        }

        //Lambda expression
        newL1.addAll(list1.stream().filter(value -> !list2.contains(value)).toList());
        newL1.addAll(list2.stream().filter(value -> !list1.contains(value)).toList());
        return newL1.stream().filter(value -> !(list2.contains(value) && (list1.contains(value)))).toList();//combined
        //return newL2;
    }

    public List<String> sortedList(ArrayList<String> newlist){
        int num=newlist.size();
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1-i;j++){
                if(newlist.get(j).compareTo(newlist.get(j+1))>0){
                    String t=newlist.get(j);
                    newlist.set(j, newlist.get(j + 1));
                    newlist.set(j + 1, t);

                }
            }
        }
        return newlist;
    }

    //Set
    public Set<String> mergeSets(Set<String> set1, Set<String> set2) {
        Set<String> newSet = new HashSet<>();
        Set<String> newSet2 = new HashSet<>();
        newSet.addAll(set1);
        newSet.addAll(set2);
        //for each loop
        for (String value : newSet) {
            if (!(set2.contains(value) && (set1.contains(value)))) {
                newSet2.add(value);
            }
        }
        return newSet2;
    }

    //mergedSet using Lambda
    public Set<String> mergeSetsLambdaRitu(Set<String> set1, Set<String> set2) {
        Set<String> newSet = new HashSet<>();
        Set<String> newSet2 = new HashSet<>();
        newSet.addAll(set1);
        newSet.addAll(set2);
        return newSet.stream().filter(value -> !(set2.contains(value) && (set1.contains(value)))).collect(Collectors.toSet());//combined
    }

    // Deleting duplicates using set
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
    public void doIterate(Map<String, String> newmap) {
        //ForEach
        newmap.forEach((empid, name) -> System.out.println(empid + "-" + name));
        //Keyset
        for (String empid : newmap.keySet()) {
            System.out.println(empid + "-" + newmap.get(empid));
        }
        //entryset
        for (Map.Entry<String, String> entry : newmap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase("101") && entry.getValue().equalsIgnoreCase("Ritu")) {
                continue;
            }
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        //Lambda expression
        newmap.forEach((key, value) -> System.out.println(key + "-" + value));
    }

    public void removeByKey(Map<String, String> newMap) {
        if (newMap.containsKey("101")) {
            newMap.remove("101");
        }
        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public void removeByKeyLambda(Map<String, String> newMap) {
        newMap.entrySet().stream().filter(entry -> !(entry.getKey().equalsIgnoreCase("101"))).forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }

    // remove duplicate using Map
    public void duplicateMapRitu(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> merged = new HashMap<>();
        Map<String, String> duplicates = new HashMap<>();
        merged.putAll(map1);
        merged.putAll(map2);
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                duplicates.put(key, duplicates.get(key));
            }
        }
        for (String key : duplicates.keySet()) {
            merged.remove(key);
        }
        System.out.println(merged);
    }

    // remove duplicate using Map with lambda expression
    public void duplicateLambdaMapRitu(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> merged = new HashMap<>(map1);
        merged.putAll(map2);
        Map<String, String> duplicates =
                map1.keySet().stream().filter(map2::containsKey).collect(Collectors.toMap(key -> key, map1::get));
        duplicates.keySet().forEach(merged::remove);
        System.out.println(merged);
    }

    public void doiterateException(List<String> list1){
        try{
            for (String name: list1){
                list1.add("Ardra1");
                System.out.println(list1);
            }
        }catch (ConcurrentModificationException e){
            System.out.println(e);
        }
    }
    public void doiterateExceptionMethod(List<String> list1) {
            try{
                System.out.println(list1.get(list1.size()));
                for(String name:list1){
                    list1.remove("Akash");
                    System.out.println(list1);
                }
            }catch(IndexOutOfBoundsException e){
                System.out.println(e);
        }
    }
}