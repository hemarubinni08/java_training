package com.ust;

import java.util.*;

// function to print all the names of people in your pod
public class CollectionsAron {
    public void doIteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(System.out::println);
    }

    // function to print names that excluding the person sitting near you in your pod
    public void filteredIteration(List<String> names) {
        for (String name : names)
            if (!name.equals("Shashi"))
                System.out.println(name);
        // Lambda expression
        names.stream().filter(name -> !name.equals("Shashi")).forEach(System.out::println);
    }

    public void uniqueElement(List<String> names1, List<String> names2) {
        // Create a list to store non duplicated values of both lists
        List<String> nonUnique = new ArrayList<>();
        // for each loop to add elements of names1 that are not in names2
        for (String name1 : names1) {
            if (!names2.contains(name1)) nonUnique.add(name1);
        }
        // for each loop to add elements of names2 that are not in names1
        for (String name2 : names2) {
            if (!names1.contains(name2)) nonUnique.add(name2);
        }
//        nonUnique.forEach(System.out::println);
        nonUnique.clear();
        nonUnique.addAll(names1);
        nonUnique.addAll(names2);
        //Lambda expression to print non-duplicate numbers in the merged list
        nonUnique.stream().filter(nu -> !names1.contains(nu) || !names2.contains(nu)).forEach(System.out::println);
    }

    public void traverseSet(HashSet<String> setNames1, HashSet<String> setNames2) {
        // for each loop to add elements of names1 that are not in names2
        HashSet<String> mergedSet = new HashSet<>();
        mergedSet.addAll(setNames1);
        mergedSet.addAll(setNames2);
        for (String setIterator : mergedSet) {
            System.out.println(setIterator);
        }
        System.out.println();
        // Lambda expression
        mergedSet.forEach(System.out::println);
    }

    public void filterSet(HashSet<String> setNames1) {
        for (String setName1 : setNames1)
            if (!setName1.equals("Shashi"))
                System.out.println(setName1);
    }

    public void removeDuplicateSet(HashSet<String> setNames1, HashSet<String> setNames2) {
        HashSet<String> duplicateSet = new HashSet<>();
        for (String setName1 : setNames1)
            if (setNames2.contains(setName1))
                duplicateSet.add(setName1);
        HashSet<String> mergedSet = new HashSet<>();
        mergedSet.addAll(setNames1);
        mergedSet.addAll(setNames2);
        mergedSet.removeAll(duplicateSet);
        mergedSet.forEach(System.out::println);
        System.out.println();
        mergedSet.stream().filter(Iterator -> !duplicateSet.contains(Iterator)).forEach(System.out::println);
    }

    public void traverseMap(Map<String, String> employeesMap) {
        for (Map.Entry<String, String> employee : employeesMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
        System.out.println();
        for (String key : employeesMap.keySet()) {
            System.out.println(key + " - " + employeesMap.get(key));
        }

    }

    public void removeMeMapKey(Map<String, String> employeesMap, String employeeKey) {
        for (String key : employeesMap.keySet()) {
            if (!key.equals("308336"))
                System.out.println(key + " - " + employeesMap.get(key));
        }
        System.out.println();
        if (employeesMap.containsKey(employeeKey))
            employeesMap.remove(employeeKey);
        for (Map.Entry<String, String> employee : employeesMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
    }

    public void removeMeMapValue(Map<String, String> employeesMap, String employeeName) {
        if (employeesMap.containsValue(employeeName)) {
            employeesMap.values().remove(employeeName);
        }
        System.out.println();
        for (Map.Entry<String, String> employee : employeesMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
    }

    public void removeDuplicatesMap(Map<String, String> employeesMap1, Map<String, String> employeesMap2) {
        HashSet<String> duplicateSet = new HashSet<>();
        for (Map.Entry<String, String> employee : employeesMap1.entrySet()) {
            if (employeesMap2.containsValue(employee.getValue())) {
                employeesMap2.values().remove(employee.getValue());
                duplicateSet.add(employee.getValue());
            }
        }
        for(String duplicate: duplicateSet)
            employeesMap2.values().remove(duplicate);

    }
}