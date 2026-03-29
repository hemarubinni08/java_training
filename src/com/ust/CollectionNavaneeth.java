package com.ust;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionNavaneeth {

    public List<String> skipDuplicates(List<String> names, List<String> names1) {
        List<String> result = new ArrayList<>();

        for (String s : names) {
            if (!names1.contains(s))
                result.add(s);
        }

        for (String s : names1) {
            if (!names.contains(s))
                result.add(s);
        }

        result.forEach(System.out::println);

//        Lamda

        names.stream().filter(s -> !names1.contains(s)).forEach(result::add);
        names1.stream().filter(s -> !names.contains(s)).forEach(result::add);
        System.out.println(result);
        return result;

//        List<String> combinedLamda = Stream.concat(names.stream(), names1.stream())
//                .filter(s -> !(names.contains(s) && names1.contains(s))).toList();
//        System.out.println(combinedLamda);
//        return combinedLamda;

    }
//
//
    public void skipNeighbour(List<String> names){

        names.stream().filter(name -> !name.equalsIgnoreCase("Chandu")).forEach(name-> System.out.println(name));

        for(String name : names){
            if(!name.equalsIgnoreCase("Chandu")){
                System.out.println(name);
            }
        }
    }
////
    public void iteration(List<String> names) {

        System.out.println(names.stream().filter(name ->
                !name.equals("navaneeth")).toList());


        for (String name : names) {
            if (!name.equals("navaneeth")) {
                System.out.println(name);
            }
        }
    }


    public Set<String> setIteration(Set<String> set1, Set<String> set2){
        for (String num : set1) {
            System.out.println(num);
        }

        System.out.println(set1.stream().toList());
        Set<String> result = new HashSet<>();
        for (String num1: set1 ){
            if (!set2.contains(num1)){
                result.add(num1);;
            }
        }

        for (String num2: set2 ){
            if (!set1.contains(num2)){
                result.add(num2);
            }
        }
        return result;

//        Set<String> duplicateSet = new HashSet<>();
//        Set<String> combinedSet = new HashSet<>();
//        for (String num1: set1 ) {
//            if (set2.contains(num1)) {
//                duplicateSet.add(num1);
//            }
//        }
//
//        combinedSet.addAll(set1);
//        combinedSet.addAll(set2);
//
//        combinedSet.removeAll(duplicateSet);
//        return combinedSet;

    }
    public void hashMap(Map<Integer, String> members) {
        for (Integer key : members.keySet()) {
            System.out.println(key + " - " + members.get(key));
        }

        for (Map.Entry<Integer, String> entry : members.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        members.forEach((Key, Value) ->
                System.out.println(Key + " - " + Value));
    }

    public Map<Integer, String> removeMe(Map<Integer, String> members){

        if(members.containsValue("Navaneeth")){
            members.values().remove("Navaneeth");
        }
        return members;
    }
    public Map<Integer, String> removeSpecificUsingStreamMethod(Map<Integer, String> map) {
        map.entrySet().removeIf(entry -> entry.getKey() == 6);
        return map;
    }

    public void removeSpecificUsingStreamMethodUsingFilter(Map<Integer, String> map) {
        map.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals(6))
                .forEach(entry ->
                        System.out.println(entry.getKey() + " - " + entry.getValue())
                );
    }
    public Map<Integer, String> removeSpecificUsingToMap(Map<Integer, String> map) {
        Map<Integer, String> newmap = map.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals(6))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        return newmap;
    }
}

