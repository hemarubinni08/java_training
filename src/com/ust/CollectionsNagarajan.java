package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsNagarajan {
    public int key = 1;

    public void iterateList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void iterateUsingLambda(List<String> names) {
        names.forEach(System.out::println);
    }

    public void filterNameUsingForEach(List<String> names) {
        for (String name : names) {
            if (name.equals("Chris")) continue;
            else System.out.println(name);
        }
    }

    public void filterNameUsingLambda(List<String> names) {

        names.stream().filter(
                name -> !name.equalsIgnoreCase("Chris")).toList().forEach(
                System.out::println);
    }

    public void removeDuplicateUsingForEach(List<String> nameList1, List<String> nameList2) {
        List<String> common = new ArrayList<>(nameList1);
        common.retainAll(nameList2);
        List<String> result = new ArrayList<>(nameList1);
        result.addAll(nameList2);
        result.removeAll(common);
        iterateList(result);
    }

    public void removeDuplicateUsingLambda(List<String> nameList1, List<String> nameList2) {
        List<String> result = Stream.concat(nameList1.stream(), nameList2.stream()).filter(name -> !(nameList1.contains(name) && nameList2.contains(name))).toList();
        result.forEach(System.out::println);
    }

    public void toIterateSet(HashSet<String> nameSet) {
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
        toIterateSet(commonSet);
    }

    public void removeDuplicateFromSetUsingLambda(HashSet<String> nameSet1, HashSet<String> nameSet2) {
        Set<String> resultSet = Stream.concat(nameSet1.stream(), nameSet2.stream()).collect(Collectors.toSet()).stream().filter(name -> !(nameSet1.contains(name) && nameSet2.contains(name))).collect(Collectors.toSet());
        resultSet.forEach(System.out::println);
    }

    public void toPrintMap(Map<Integer, String> namesMap) {
        for (Map.Entry<Integer, String> entry : namesMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void toPrintMapUsingLambda(Map<Integer, String> namesMap) {
        namesMap.entrySet().forEach(System.out::println);
    }

    public void toPrintMapUsingKeySet(Map<Integer, String> namesMap) {

        for (Integer key : namesMap.keySet()) {
            System.out.println(key + ":" + namesMap.get(key));
        }
    }

    public void removeNameFromMap(Map<Integer, String> namesMap) {
        if (namesMap.containsKey(key)) namesMap.remove(key);
        toPrintMapUsingLambda(namesMap);
    }

    public void removeNameFromMapUsingForEach(Map<Integer, String> namesMap) {
        for (Map.Entry<Integer, String> entry : namesMap.entrySet()) {
            if (entry.getKey().equals(key)) {
                continue;
            } else System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void removeNameFromMapUsingLambda(Map<Integer, String> namesMap) {
        Map<Integer, String> n = namesMap.entrySet().stream().filter(name -> !(name.getKey().equals(key))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        namesMap.entrySet().forEach(System.out::println);
    }

    public void removeDuplicateFromTwoMapUsingForEach(Map<Integer, String> nameMap1, Map<Integer, String> nameMap2) {
        Map<Integer, String> resultMap = new HashMap<>(nameMap1);
        resultMap.putAll(nameMap2);
        Set<String> values1 = new HashSet<>(nameMap1.values());
        Set<String> values2 = new HashSet<>(nameMap2.values());
        for (Map.Entry<Integer, String> entry : resultMap.entrySet()) {
            String values = entry.getValue();

            if (!(values1.contains(values) && values2.contains(values))) {
                System.out.println(entry.getKey() + "-" + values);
            }
        }
    }

    public void removeDuplicateFromTwoMapUsingLambda(Map<Integer, String> nameMap1, Map<Integer, String> nameMap2) {
        HashMap<Integer, String> resultMap = (HashMap<Integer, String>) Stream.concat(nameMap1.entrySet().stream(), nameMap2.entrySet().stream()).filter(
                        entry -> !(nameMap1.containsValue(entry.getValue()) && nameMap2.containsValue(entry.getValue())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        resultMap.entrySet().forEach(System.out::println);
    }
}




