package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsOperationJavaPranav {
    //variables
    String emp_name = "Pranav";
    String emp_id = "308257";

    //Method to print list elements
    public void printUsingForLoopIteration(List<String> emp_name_list) {
        for (String name : emp_name_list) {
            System.out.println(name);
        }
    }

    //Method to print list elements using foreach loop
    public void printUsingforEachIteration(List<String> emp_name_list) {
        emp_name_list.forEach(System.out::println);
    }

    //Method to print list elements using stream method
    public void printUsingStreamIteration(List<String> emp_name_list) {
        emp_name_list.stream().filter(name -> name.equals(emp_name)).forEach(System.out::println);
    }

    //Method to print list elements using combined list
    public void printUsingCombinedForIteration(List<String> emp_name_list) {
        for (String name : emp_name_list) {
            if (name.equalsIgnoreCase(emp_name)) {
                continue;
            }
            System.out.println(name);
        }
    }

    //Method to print list elements using stream foreach filter
    public void printUsingStreamForEachIteration(List<String> emp_name_list) {
        emp_name_list.stream().filter(name -> !name.equalsIgnoreCase(emp_name)).forEach(System.out::println);
    }

    //Method to remove duplicate in list using foreach loop
    public void removeDuplicateUsingList(List<String> list1, List<String> emp_name_list2) {
        List<String> result = new ArrayList<>();

        for (String name : list1) {
            if (!emp_name_list2.contains(name)) {
                result.add(name);
            }
        }

        for (String name : emp_name_list2) {
            if (!list1.contains(name)) {
                result.add(name);
            }
        }

        List<String> combinedList = Stream.concat(list1.stream(),
                emp_name_list2.stream()).filter(name -> !(emp_name_list2.contains(name) && list1.contains(name))).toList();
        combinedList.forEach(System.out::println);
        List<String> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(emp_name_list2);
        for (String name : combined) {
            if (!(list1.contains(name) && emp_name_list2.contains(name))) {
                result.add(name);
            }
        }
        result.forEach(System.out::println);
    }

    //Method to print set elements using for loop
    public void printUsingSetIteration(Set<Integer> set1, Set<Integer> emp_name_set2) {
        for (int num : set1) {
            System.out.println(num);
        }

        for (int num : emp_name_set2) {
            System.out.println(num);
        }

        System.out.println(set1.stream().toList());
        set1.forEach(System.out::println);
        set1.addAll(emp_name_set2);
        set1.forEach(System.out::println);
    }

    //Method to remove duplicates using foreach loop
    public void removeDuplicatesInSet(Set<Integer> set1, Set<Integer> emp_name_set2) {
        Set<Integer> result1 = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();

        for (int num1 : set1) {
            if (!(emp_name_set2.contains(num1))) {
                result1.add(num1);
            }
        }

        for (int num2 : emp_name_set2) {
            if (!(set1.contains(num2))) {
                result1.add(num2);
            }
        }
        set1.stream().filter(num -> !emp_name_set2.contains(num)).forEach(result2::add);
        emp_name_set2.stream().filter(num -> !set1.contains(num)).forEach(result1::add);
        result2.forEach(System.out::println);
        result1.forEach(System.out::println);
        Set<Integer> duplicateSet = new HashSet<>();
        Set<Integer> combinedSet = new HashSet<>();
        for (int num : set1) {
            if (emp_name_set2.contains(num)) {
                duplicateSet.add(num);
            }
        }
        combinedSet.addAll(set1);
        combinedSet.addAll(emp_name_set2);
        Set<Integer> result = combinedSet.stream().filter(num -> !duplicateSet.contains(num)).collect(Collectors.toSet());
        System.out.println(result);
        for (int num : duplicateSet) {
            if (combinedSet.contains(num)) {
                combinedSet.removeAll(duplicateSet);
            }
        }
        combinedSet.forEach(System.out::println);
    }

    //Method to print map elements using for loop
    public void printUsingMapIteration(Map<String, String> emp_name_map) {
        for (Map.Entry<String, String> entry : emp_name_map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();
        for (String key : emp_name_map.keySet()) {
            System.out.println(key + "-" + emp_name_map.get(key));
        }
        System.out.println();
        emp_name_map.forEach((key, value) -> System.out.println(key + "-" + value));
        System.out.println();
        for (String value : emp_name_map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    //Method to remove specific element in map
    public void removeSpecificElementInMap(Map<String, String> emp_name_map) {
        for (Map.Entry<String, String> entry : emp_name_map.entrySet()) {
            if (!(entry.getKey().equalsIgnoreCase(emp_id))) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }

    //Method to remove specific element in map//Method to remove specific element in map
    public Map<String, String> removeSpecificElementWithoutUsingForLoop(Map<String, String> emp_name_map) {
        emp_name_map.remove(emp_id);
        emp_name_map.forEach((key, value) -> System.out.println(key + "-" + value));
        return emp_name_map;
    }

    //Method to remove specific element in map using map methods
    public Map<String, String> removeSpecificElementUsingMethod(Map<String, String> emp_names_map) {
        emp_names_map.entrySet().removeIf(entry ->
                entry.getKey().equalsIgnoreCase(emp_id));
        return emp_names_map;
    }

    //Method to remove specific element in emp_names_map using stream
    public void removeSpecificElementUsingFilter(Map<String, String> emp_names_map) {
        emp_names_map.entrySet().stream().filter(entry -> !entry.getKey().equalsIgnoreCase(emp_id))
                .forEach((entry -> System.out.println(entry.getKey() + "-" + entry.getValue() + entry.getClass())));
    }

    //Method to remove specific element in emp_names_map using collectors emp_names_map
    public Map<String, String> removeSpecificElementUsingToMap(Map<String, String> emp_names_map) {
        Set<Map.Entry<String, String>> entry1 = emp_names_map.entrySet();
        return entry1.stream()
                .filter(entry -> !entry.getKey()
                        .equalsIgnoreCase(emp_id))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    //Method to remove duplicate using for loop
    public Map<String, String> removeDuplicateUsingMap(Map<String, String> emp_names_map1, Map<String, String> emp_name_map2) {
        Map<String, String> result = new HashMap<>();

        for (Map.Entry<String, String> entry : emp_names_map1.entrySet()) {
            if (emp_name_map2.containsKey(entry.getKey())) {
                continue;

            }
            result.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, String> entry : emp_name_map2.entrySet()) {
            if (emp_names_map1.containsKey(entry.getKey())) {
                continue;
            }
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    //Method to remove duplicate using stream methods
    public Map<String, String> removeDuplicatesUsingStreamHashMap(Map<String, String> emp_name_map1, Map<String, String> emp_name_map2) {
        Map<String, String> finalResult = emp_name_map1.entrySet().stream().filter(entry1 ->
                        !emp_name_map2.containsKey(entry1.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        emp_name_map2.entrySet().stream().filter(entry ->
                        !emp_name_map1.containsKey(entry.getKey()))
                .forEach(entry -> finalResult.put(entry.getKey(), entry.getValue()));
        return finalResult;
    }

    //Method to remove duplicates in map using combined for loop
    public Map<String, String> removeDuplicateUsingCombinedForLoopMap(Map<String, String> emp_name_map1, Map<String, String> emp_name_map2) {

        Map<String, String> duplicate = new HashMap<>();

        for (Map.Entry<String, String> entry : emp_name_map1.entrySet()) {
            if (emp_name_map2.containsKey(entry.getKey())) {
                duplicate.put(entry.getKey(), entry.getValue());
            }
        }

        Map<String, String> combined = new HashMap<>(emp_name_map1);
        combined.putAll(emp_name_map2);
        System.out.println(duplicate);
        combined.entrySet().removeAll(duplicate.entrySet());
//      duplicate.keySet().forEach(combined::remove);
        return combined;
    }

    //Method to remove duplicate in map using combined and stream methods
    public Map<String, String> removeDuplicateUsingCombinedStreamHashMap(Map<String, String> emp_name_map1, Map<String, String> emp_name_map2) {
        Map<String, String> combined = new HashMap<>(emp_name_map1);
        combined.putAll(emp_name_map2);

        //finding duplicates
        Map<String, String> duplicate = emp_name_map1.entrySet().stream()
                .filter(entry -> emp_name_map2.containsKey(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //filtering duplicates from combined map
        combined.entrySet().stream()
                .filter(entry -> !duplicate.containsKey(entry.getKey())).forEach(System.out::println);

        //removing duplicates from combined map
        combined.entrySet().removeAll(duplicate.entrySet());
        return combined;
    }
}
