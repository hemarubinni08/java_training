package com.ust;

import java.awt.desktop.SystemEventListener;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsDeepa {

    public void printNamesUsingList(List<String> namesList) {
        System.out.println("printing names using Arraylist with for loop");

        for (String name : namesList) {
            System.out.println(name);
        }

        System.out.println("printing names using Arraylist with Lambda expression");
        namesList.forEach(name -> System.out.println(name));
    }

    public void ignoreNameUsingList(List<String> namesList) {
        System.out.println("ignoring specific name using ArrayList with for loop");

        for (String nameIgnored : namesList) {
            if (!nameIgnored.equals("Varsha")) {
                System.out.println(nameIgnored);
            }
        }

        System.out.println("ignoring specific name using ArrayList with lambda expression");
        namesList.stream().filter(name -> !name.equalsIgnoreCase("Varsha")).toList().forEach(name -> System.out.println(name));
    }

    public void removeDuplicatesUsingList(List<String> nameList1, List<String> nameList2, List<String> result, List<String> combineList) {

        combineList.addAll(nameList1);
        combineList.addAll(nameList2);

        for (String name : nameList1) {
            if (!nameList2.contains(name)) {
                result.add(name);
            }
        }

        for (String name : nameList2) {
            if (!nameList1.contains(name)) {
                result.add(name);
            }
        }

        for (String name : result) {
            System.out.println(name);
        }

        for (String name : combineList) {
            if (!(nameList2.contains(name) && nameList1.contains(name))) {
                System.out.println(name);
            }
        }

        nameList1.stream().filter(name -> !nameList2.contains(name)).forEach(System.out::println);
        nameList2.stream().filter(name -> !nameList1.contains(name)).forEach(System.out::println);

        combineList.stream().filter(name -> !(nameList1.contains(name) && nameList2.contains(name))).forEach(System.out::println);
    }

    public void printNamesUsingSet(Set<String> nameSet) {

        System.out.println("printing names using HashSet with for loop");
        for (String name : nameSet) {
            System.out.println(name);
        }
        System.out.println("printing names using HashSet with Lambda expression");
        nameSet.forEach(name -> System.out.println(name));
    }

    public void ignoreNameUsingSet(Set<String> nameSet) {

        System.out.println("ignoring specific name using HashSet with for loop");
        for (String nameIgnored : nameSet) {
            if (!nameIgnored.equals("Varsha")) {
                System.out.println(nameIgnored);
            }
        }
        System.out.println("ignoring specific name using HashSet with lambda expression");
        nameSet.stream().filter(name -> !name.equalsIgnoreCase("varsha")).toList().forEach(name -> System.out.println(name));
    }

    public void removeDuplicatesSet(Set<String> nameSet1, Set<String> nameSet2, Set<String> combineSet, Set<String> duplicateSet) {

        System.out.println("removing duplicates using HashSet with for loop");
        for (String name : nameSet1) {
            if (!nameSet2.contains(name)) {
                nameSet1.add(name);
            } else {
                duplicateSet.add(name);
            }
        }
        for (String name : nameSet2) {
            if (!nameSet1.contains(name)) {
                nameSet2.add(name);
            }
        }
        combineSet.addAll(nameSet1);
        combineSet.addAll(nameSet2);

        for (String name : combineSet) {
            if (!duplicateSet.contains(name)) {
                System.out.println(name);
            }
        }
        System.out.println("combining and removing duplicates using HashSet with lamba expressions");
        duplicateSet.stream().filter(name -> (nameSet1.contains(name) && nameSet2.contains(name))).toList();

        combineSet.stream().filter(name -> !duplicateSet.contains(name)).forEach(name -> System.out.println(name));
    }

    public void printMembersUsingMap(Map<String, String> members) {
        System.out.println("printing names using HashMap with for loop");

        for (Map.Entry<String, String> name : members.entrySet()) {
            System.out.println(name.getKey() + " - " + name.getValue());
        }

        for (String key : members.keySet()) {
            System.out.println(key + " - " + members.get(key));
        }

        System.out.println("printing names using HashMap with Lambda expression");
        members.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    public void ignoreNameUsingMap(Map<String, String> members) {
        System.out.println("ignoring specific name using HashMap with for loop");

        for (String nameIgnore : members.keySet()) {
            if (!nameIgnore.equals("2")) {
                System.out.println(nameIgnore + " - " + members.get(nameIgnore));
            }
        }

        if (members.containsKey("2")) {
            members.remove("2");
        }

        for (String name : members.keySet()) {
            System.out.println(name + " - " + members.get(name));
        }

        for (String nameIgnore : members.keySet()) {
            if (!members.get(nameIgnore).equals("Varsha")) {
                System.out.println(nameIgnore + " - " + members.get(nameIgnore));
            }
        }

        if (members.containsValue("Varsha")) {
            members.remove("Varsha");
        }

        for (String name : members.keySet()) {
            System.out.println(name + " - " + members.get(name));
        }

        System.out.println("ignoring specific name using HashMap with lambda expression");
        members.entrySet().stream().filter(name -> !name.getKey().equalsIgnoreCase("2")).toList()
                .forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));

        members.entrySet().stream().filter(name -> !name.getValue().equalsIgnoreCase("Varsha")).toList()
                .forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));

        members.entrySet().stream().filter(name -> !name.getKey().equalsIgnoreCase("2"))
                .collect(Collectors.toMap(name -> name.getKey(), name -> name.getValue()))
                .forEach((key, value) -> System.out.println(key + " - " + value));
    }

    public void removeDuplicateFromTwoMaps(Map<String, String> map1, Map<String, String> map2, Map<String, String> combinedMap) {
        System.out.println("removing duplicates using HashMap with for loops");

        for (String name : map1.keySet()) {
            if (!(map2.containsKey(name) && map2.containsValue(map2.get(name)))) {
                combinedMap.put(name, map1.get(name));
            }
        }

        for (String name : map2.keySet()) {
            if (!(map1.containsKey(name) && map1.containsValue(map1.get(name)))) {
                combinedMap.put(name, map2.get(name));
            }
        }

        for (String name : combinedMap.keySet()) {
            System.out.println(name + " - " + combinedMap.get(name));
        }

        combinedMap.putAll(map1);
        combinedMap.putAll(map2);

        System.out.println("combining and removing duplicates using HashMap with lamba expressions");
        combinedMap.entrySet().stream().filter(name -> !(map1.containsValue(name.getValue()) && map2.containsValue(name.getValue())))
                .forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));
    }
}