package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionJavaPranav {
    public void doForIteration(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }

    public void doStreamIteration(List<String> list) {
        list.forEach(System.out::println);
    }

    public void doConditionIteration(List<String> list) {
        list.stream().filter(name -> name.equals("Pranav")).forEach(System.out::println);
    }

    public void doForNewIteration(List<String> list) {
        for (String name : list) {
            if (name.equalsIgnoreCase("Harsha")) {
                continue;
            }
            System.out.println(name);
        }
    }

    public void doNewIteration(List<String> list) {
        list.stream().filter(name -> !name.equalsIgnoreCase("Harsha")).forEach(System.out::println);
    }

    public void findDuplicate(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        for (String name : list1) {
            if (!list2.contains(name)) {
                result.add(name);
            }
        }
        for (String name : list2) {
            if (!list1.contains(name)) {
                result.add(name);
            }
        }
        List<String> combinedList = Stream.concat(list1.stream(),
                list2.stream()).filter(name -> !(list2.contains(name) && list1.contains(name))).toList();
        combinedList.forEach(System.out::println);
        List<String> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(list2);
        for (String name : combined) {
            if (!(list1.contains(name) && list2.contains(name))) {
                result.add(name);
            }
        }
        result.forEach(System.out::println);
    }

    public void setIteration(Set<Integer> set1, Set<Integer> set2) {
        for (int num : set1) {
            System.out.println(num);
        }
        for (int num : set2) {
            System.out.println(num);
        }
        System.out.println(set1.stream().toList());
        set1.forEach(name -> System.out.println(name));
        set1.addAll(set2);
        set1.forEach(System.out::println);
    }

    public void findDuplicatesInSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result1 = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();
        for (int num1 : set1) {
            if (!(set2.contains(num1))) {
                result1.add(num1);
            }
        }
        for (int num2 : set2) {
            if (!(set1.contains(num2))) {
                result1.add(num2);
            }
        }
        set1.stream().filter(num -> !set2.contains(num)).forEach(result2::add);
        set2.stream().filter(num -> !set1.contains(num)).forEach(result2::add);
        MainPranav mp = new MainPranav();
        //mp.printResults(result1, result2);
        Set<Integer> duplicateSet = new HashSet<>();
        Set<Integer> combinedSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                duplicateSet.add(num);
            }
        }
        combinedSet.addAll(set1);
        combinedSet.addAll(set2);
//        combinedSet.removeAll(duplicateSet);
        Set<Integer> result = combinedSet.stream().filter(num -> !duplicateSet.contains(num)).collect(Collectors.toSet());

        for (int num : duplicateSet) {
            if (combinedSet.contains(num)) {
                combinedSet.removeAll(duplicateSet);
            }
        }
        combinedSet.forEach(System.out::println);
    }

    public void mapIteration(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();
        for (String key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println();
        map.forEach((key, value) -> System.out.println(key + "-" + value));
        System.out.println();
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    public void removeSpecificMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!(entry.getKey().equalsIgnoreCase("308257"))) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }

    public Map<String, String> removeSpecificUsingNoForLoop(Map<String, String> map) {
        if (map.containsKey("308257")) {
            map.remove("308257");
        }
        map.forEach((key, value) -> System.out.println(key + "-" + value));
        return map;
    }

    public Map<String, String> removeSpecificUsingStreamMethod(Map<String, String> map) {
        map.entrySet().removeIf(entry ->
                entry.getKey().equalsIgnoreCase("308257"));
        return map;
    }

    public void removeSpecificUsingStreamMethodUsingFilter(Map<String, String> map) {
//      Set<Map.Entry<String,String>> entry1 = map.entrySet();
        map.entrySet().stream().filter(entry -> !entry.getKey().equalsIgnoreCase("308257"))
                .forEach((entry -> System.out.println(entry.getKey() + "-" + entry.getValue() + entry.getClass())));

    }

    public Map<String, String> removeSpecificUsingToMap(Map<String, String> map) {
        Set<Map.Entry<String, String>> entry1 = map.entrySet();
        Map<String, String> newmap = entry1.stream()
                .filter(entry -> !entry.getKey()
                        .equalsIgnoreCase("308257"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return newmap;
    }
}
