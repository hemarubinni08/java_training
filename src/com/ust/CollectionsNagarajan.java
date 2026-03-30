package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsNagarajan {
    public int key = 308242;

    public void itreateList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void itreateUsingLamda(List<String> names) {
        names.stream().forEach(name -> System.out.println(name));
    }

    public void filterNameUsingForEach(List<String> names) {
        for (String name : names) {
            if (name.equals("Chris")) continue;
            else System.out.println(name);
        }

    }

    public void filterNameUsingLamda(List<String> names) {

        names.stream().filter(
                name -> !name.equalsIgnoreCase("Chris")).toList().forEach(
                name -> System.out.println(name));
    }

    public void removeDuplicateUsingForEach(List<String> nameList1, List<String> nameList2) {

        List<String> common = new ArrayList<>(nameList1);
        common.retainAll(nameList2);
        List<String> result = new ArrayList<>(nameList1);
        result.addAll(nameList2);
        result.removeAll(common);
        itreateList(result);
    }

    public void removeDuplicateUsingLambda(List<String> nameList1, List<String> nameList2) {

        List<String> result = Stream.concat(nameList1.stream(), nameList2.stream()).filter(name -> !(nameList1.contains(name) && nameList2.contains(name))).toList();
        result.forEach(name -> System.out.println(name));
    }

    public void toItreateSet(HashSet<String> nameSet) {
        nameSet.forEach(System.out::println);
    }

    public void removeDuplicateFromSetUsingForEach(HashSet<String> nameSet1, HashSet<String> nameSet2) {

        List<String> combined = new ArrayList<>();
        HashSet<String> commonSet = new HashSet<>();
        combined.addAll(nameSet1);
        combined.addAll(nameSet2);

        for (String name : combined) {
            if (nameSet1.contains(name) && nameSet2.contains(name)) {
                continue;
            }
            commonSet.add(name);
        }
        toItreateSet(commonSet);
    }

    public void removeDuplicateFromSetUsingLambda(HashSet<String> nameSet1, HashSet<String> nameSet2) {

        Set<String> resultSet = Stream.concat(nameSet1.stream(), nameSet2.stream()).collect(Collectors.toSet()).stream().filter(name -> !(nameSet1.contains(name) && nameSet2.contains(name))).collect(Collectors.toSet());
        resultSet.forEach(System.out::println);
    }

    public void toPrintMap(Map<Integer, String> nameMap) {

        for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void toPrintMapUsingLambda(Map<Integer, String> nameMap) {
        nameMap.entrySet().forEach(System.out::println);
    }

    public void toPrintMapUsingKeySet(Map<Integer, String> nameMap) {

        for (Integer key : nameMap.keySet()) {
            System.out.println(key + ":" + nameMap.get(key));
        }
    }

//    public void countOccurence(int[] numArr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : numArr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        map.entrySet().forEach(System.out::println);
//    }

    public void removeNameFromMap(Map<Integer, String> map) {
        if (map.containsKey(308242)) map.remove(key);
        toPrintMapUsingLambda(map);
    }

    public void removeNameFromMapUsingforEach(Map<Integer, String> map) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                continue;
            } else System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void removeNameFromMapUsingLambda(Map<Integer, String> map) {
//        map.entrySet().removeIf(name -> name.getKey()==key);
//        map.entrySet().forEach(System.out::println);
        Map<Integer, String> n = map.entrySet().stream().filter(name -> !(name.getKey().equals(key))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        map.entrySet().forEach(System.out::println);
    }
}




