package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionHema {

    public void forIterationHema(List<String> namesPod1) {
        for (String name : namesPod1) {
            System.out.println(name);
        }
    }

    public void lambdaIterationHema(List<String> namesPod1) {
        namesPod1.forEach(podMember -> System.out.println(podMember));
    }

    public void filterForIteration(List<String> namesPod1) {
        for (String name : namesPod1) {
            if (name.equalsIgnoreCase("Gopi")) {
                continue;
            }
            System.out.println(name);
        }
    }

    public void filterLambdaIteration(List<String> namesPod1) {
        namesPod1.stream().filter(name -> !name.equalsIgnoreCase("Gopi")).toList().
                forEach(podMember -> System.out.println(podMember));
        System.out.println(namesPod1.stream().filter(name -> !name.equalsIgnoreCase("Gopi")).toList());
    }

    public void removeDuplicatesForHema(List<String> namesPod1, List<String> namesPod2) {
        List<String> newList = new ArrayList<>();

        for (String name : namesPod1) {
            if (!namesPod2.contains(name)) {
                newList.add(name);
            }
        }

        for (String name : namesPod2) {
            if (!namesPod1.contains(name)) {
                newList.add(name);
            }
        }
        forIterationHema(newList);
    }

    public void removeDuplicatesHema(List<String> namesPod1, List<String> namesPod2) {
        List<String> newList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        result.addAll(namesPod2);
        result.addAll(namesPod1);

        for (String name : result) {
            if (!(namesPod1.contains(name) && namesPod2.contains(name))) {
                newList.add(name);
            }
        }

        forIterationHema(newList);
    }

    public void removeDuplicatesTwoLambda(List<String> namesPod1, List<String> namesPod2) {
        List<String> result = Stream.concat(
                namesPod1.stream().filter(name -> !namesPod2.contains(name)),
                namesPod2.stream().filter(name -> !namesPod1.contains(name))
        ).toList();

        result.forEach(name -> System.out.println(name));
    }

    public void removeDuplicatesLambda(List<String> namesPod1, List<String> namesPod2) {
        List<String> result = Stream.concat(namesPod1.stream(), namesPod2.stream()).filter(
                name -> !(namesPod1.contains(name) && namesPod2.contains(name))).toList();

        result.forEach(name -> System.out.println(name));
    }

    public void hashSetSingleForLoopHema(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> newHashSet = new HashSet<>();
        HashSet<String> newHashSet1 = new HashSet<>();
        newHashSet.addAll(hashSet1);
        newHashSet.addAll(hashSet2);

        for (String name : newHashSet) {
            if (!(hashSet1.contains(name) && hashSet2.contains(name))) {
                newHashSet1.add(name);
            }
        }

        newHashSet1.forEach(System.out::println);
        System.out.println();
        System.out.println("Using single lambda: ");
        Stream<String> result1 = Stream.concat(hashSet1.stream(), hashSet2.stream()).collect(Collectors.toSet()).stream().
                filter(name -> !(hashSet1.contains(name) && hashSet2.contains(name)));
        result1.forEach(System.out::println);

    }
    public void hasSetTwoForLoopsHema(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> newList = new HashSet<>();

        for (String name : hashSet1) {
            if (!hashSet2.contains(name)) {
                newList.add(name);
            }
        }

        for (String name : hashSet2) {
            if (!hashSet1.contains(name)) {
                newList.add(name);
            }
        }

        System.out.println(newList);
        System.out.println();
        System.out.println("Remove Duplicates Using Two lambda Expressions in hashSet : ");
        Set<String> result = Stream.concat(
                hashSet1.stream().filter(name -> !hashSet2.contains(name)),
                hashSet2.stream().filter(name -> !hashSet1.contains(name))
        ).collect(Collectors.toSet());

        result.forEach(System.out::println);
    }

    public void MapIterationHema(Map<String, String> namesMap1) {
        for (Map.Entry<String, String> employee : namesMap1.entrySet()) {
            //   if(employee.getValue()=="hema")
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
        System.out.println();
        System.out.println("Map Iteration Using KeySet");
        for (String values : namesMap1.keySet()) {
            System.out.println(values + " - " + namesMap1.get(values));
        }
    }

    public void FilterMap(Map<String, String> namesMap1) {
        System.out.println("Map Iteration Using contains key: ");
        String id = "308250";
        String name = "Gopi";
        namesMap1.remove(id);
        namesMap1.values().remove(name);
        System.out.println();
        for (Map.Entry<String, String> employee : namesMap1.entrySet()) {

            if (!namesMap1.containsKey("308250")) {
                System.out.println(employee.getKey() + " - " + employee.getValue());

            }
        }
        // namesMap1.entrySet().stream().filter(entry->!namesMap1.containsKey("308250")).forEach(entry-> System.out.println(entry.getKey()+" - "+entry.getValue()));
        // namesMap1.entrySet().stream().filter(entry ->!namesMap1.containsValue("Gopi")).forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));
        System.out.println();
        System.out.println("Using Lambda: ");
        Map<String, String> newmap = namesMap1.entrySet().stream().filter(entry -> !namesMap1.containsKey("308250")).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        newmap.entrySet().forEach(name1 -> System.out.println(name1.getKey() + " - " + name1.getValue()));
        System.out.println();
        System.out.println("Using contains Value: ");

        for (Map.Entry<String, String> employee : namesMap1.entrySet()) {
            if (!namesMap1.containsValue("Gopi")) {
                System.out.println(employee.getKey() + " - " + employee.getValue());
            }
        }
    }

    public void RemoveDuplicatesSingleLoop(Map<String, String> namesMap1, Map<String, String> namesMap2) {
        Map<String, String> newMap = new HashMap<>();
        newMap.putAll(namesMap1);
        newMap.putAll(namesMap2);
        System.out.println();
        System.out.println("Remove Duplicates Using single for loop in HashMap ");

        for (Map.Entry<String, String> keyValues : newMap.entrySet()) {
            if (!((namesMap1.containsKey(keyValues.getKey()) && namesMap2.containsKey(keyValues.getKey()))
                    || (namesMap1.containsValue(keyValues.getValue()) && (namesMap2.containsValue(keyValues.getValue()))))) {
                System.out.println(keyValues.getKey() + " - " + keyValues.getValue());
            }
        }

        System.out.println();
        System.out.println("Remove duplicates Using Lambda in HashMap ");
        Map<String, String> newmap = newMap.entrySet().stream().
                filter(keyVaulues -> !(namesMap1.containsKey(keyVaulues.getKey()) && (namesMap2.containsKey(keyVaulues.getKey())) || (namesMap1.containsValue(keyVaulues.getValue()) && (namesMap2.containsValue(keyVaulues.getValue()))))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        newmap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        System.out.println();
    }

    public void RemoveDuplicatesTwoLoops(Map<String, String> namesMap1, Map<String, String> namesMap2) {
        Map<String, String> mergedMap = new HashMap<>();
        System.out.println();
        System.out.println("Remove Duplicates Using two for loop in HashMap  ");
        for (Map.Entry<String, String> entry : namesMap1.entrySet()) {
            if (!namesMap2.containsValue(entry.getValue())) {
                mergedMap.put(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<String, String> entry : namesMap2.entrySet()) {
            if (!namesMap1.containsValue(entry.getValue())) {
                mergedMap.put(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<String, String> newdata : mergedMap.entrySet()) {
            System.out.println(newdata.getKey() + " - " + newdata.getValue());
        }
    }
}


