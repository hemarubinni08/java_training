package com.ust;

import java.util.*;
import java.util.stream.Stream;

// function to print all the names of people in your pod
public class CollectionsAron {
    public void doIteration(List<String> names) {
        // use for each to loop through the list and print
        for (String name : names) {
            System.out.println(name);
        }
        // printing the same in a single line
        names.forEach(System.out::println);
    }

    // function to print names that excluding the person sitting near you in your pod
    public void filteredIteration(List<String> names) {
        // use for each to loop through the list and print only if the name is not your neighbour's
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

    // function to print all names in the set excluding the name of your neighbor
    public void filterSet(HashSet<String> setNames1) {
        // loop to traverse the set
        for (String setName1 : setNames1)
            // condition that checks if the current value in the loop is your neighbor's name
            if (!setName1.equals("Shashi"))
                System.out.println(setName1);
    }

    // Function that receives two sets and print only the values that are not common in both sets
    public void removeDuplicateSet(HashSet<String> setNames1, HashSet<String> setNames2) {
        // create a set to store the duplicate values
        HashSet<String> duplicateSet = new HashSet<>();
        // loop to traverse one set
        for (String setName1 : setNames1)
            // check if the current name in setNames1 is in setNames2
            if (setNames2.contains(setName1))
                // add that value to duplicate set
                duplicateSet.add(setName1);
        // set to merge the values of both sets
        HashSet<String> mergedSet = new HashSet<>();
        mergedSet.addAll(setNames1);
        mergedSet.addAll(setNames2);
        // remove all duplicate values from the merged set
        mergedSet.removeAll(duplicateSet);
        // print values in the merged set
        mergedSet.forEach(System.out::println);
        System.out.println();
        // lambda expression
        mergedSet.stream().filter(Iterator -> !duplicateSet.contains(Iterator)).forEach(System.out::println);
    }

    // function to print all the values in the map
    public void traverseMap(Map<String, String> employeesMap) {
        for (Map.Entry<String, String> employee : employeesMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
        System.out.println();
        for (String key : employeesMap.keySet()) {
            System.out.println(key + " - " + employeesMap.get(key));
        }

    }

    // function to remove your data from the map using key and printing the rest
    public void removeMeMapKey(Map<String, String> employeesMap, String employeeKey) {
        // loop through the entire loop
        for (String key : employeesMap.keySet()) {
            // check if the key matches your employee id and print only if it's not
            if (!key.equals("308336"))
                System.out.println(key + " - " + employeesMap.get(key));
        }
        System.out.println();
        // check using containsKey method
        if (employeesMap.containsKey(employeeKey))
            employeesMap.remove(employeeKey);
        // print the map
        for (Map.Entry<String, String> employee : employeesMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
    }

    // function to remove your data from the map using value and printing the rest
    public void removeMeMapValue(Map<String, String> employeesMap, String employeeName) {
        // check of the passed employee name is in the map
        if (employeesMap.containsValue(employeeName)) {
            employeesMap.values().remove(employeeName);
        }
        System.out.println();
        // After removing just print rest of the values
        for (Map.Entry<String, String> employee : employeesMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
    }

    // Remove the common word from both maps by value
    public void removeDuplicatesValueMap(Map<String, String> employeesMap1, Map<String, String> employeesMap2) {
        // loop through the entire employeeMap1
        for (Map.Entry<String, String> employee : employeesMap1.entrySet()) {
            // check if the current value is in employeesMap2
            if (employeesMap2.containsValue(employee.getValue())) {
                // If yes remove that value from both the maps
                employeesMap1.values().remove(employee.getValue());
                employeesMap2.values().remove(employee.getValue());
            }
        }
        // print both maps
        for (Map.Entry<String, String> employee : employeesMap1.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
        for (Map.Entry<String, String> employee : employeesMap2.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
    }

    public void removeDuplicatesKeyMap(Map<String, String> employeesMap1, Map<String, String> employeesMap2) {
        // loop through the employeesMap1
        for (String key : employeesMap1.keySet()) {
            // check if the current key is in employeesMap2
            if (employeesMap2.containsKey(key)) {
                // if yes remove from both maps
                employeesMap1.remove(key);
                employeesMap2.remove(key);
            }
        }
        // create a map to merge both maps
        Map<String, String> mergedMap = new HashMap<>(employeesMap1);
        mergedMap.putAll(employeesMap2);
        // loop through the merged map and print the key-value pair
        for (Map.Entry<String, String> employee : mergedMap.entrySet()) {
            System.out.println(employee.getKey() + " - " + employee.getValue());
        }
        // Do the same with stream
        Stream.concat(employeesMap1.entrySet().stream().filter(e1 -> !employeesMap2.containsKey(e1.getKey())), employeesMap2.entrySet().stream().filter(e2 -> !employeesMap1.containsKey(e2.getKey()))).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}