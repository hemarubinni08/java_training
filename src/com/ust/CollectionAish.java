package com.ust;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionAish {
    public void doIteration(List<String> names) {
        for (String name : names) {
            if (name == "bewin") {
                continue;
            }
            System.out.println(name);
        }
    }

    public void doFilter(List<String> names) {
        names.stream().filter(name -> !name.equalsIgnoreCase("aishu")).toList().forEach(name -> System.out.println(name));

    }

    public void removeDuplicate(List<String> names, List<String> names1) {
        List<String> uniqueList = new ArrayList<>();
        for (String name : names) {
            if (!names1.contains(name)) {
                uniqueList.add(name);
            }
        }
        for (String name : names1) {
            if (!names.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println(uniqueList);
    }

    public void removeDuplicates(List<String> names, List<String> names1) {
        // List<String> uniqueList = new ArrayList<>();
        // names.stream().filter(name -> !names1.contains(name)).toList().add(names);
        // names.stream().filter(name -> !names.contains(name)).toList().add(names1);
        List<String> result = new ArrayList<>();
        result.addAll(names.stream().filter(name -> !names1.contains(name)).toList());
        result.addAll(names1.stream().filter(name -> !names.contains(name)).toList());
        System.out.println(result);
    }

    public void removeDuplicatesUsingForLoop(List<String> names, List<String> names1) {
        List<String> merged = new ArrayList<>(names);
        merged.retainAll(names1);
        List<String> result = new ArrayList<>(names);
        result.addAll(names1);
        result.removeAll(merged);
        for (String name : result) {
            System.out.println(name);
        }
    }

    public void removeDuplicatesUsingStream(List<String> names, List<String> names1) {
        List<String> result = Stream.concat(names.stream(), names1.stream()).filter(name -> !(names1.contains(name) && names.contains(name))).toList();
        result.forEach(System.out::println);

    }

    public void removeDuplicatesWithHashUsingForLoop(HashSet<String> names1, HashSet<String> names2) {
        List<String> temp = new ArrayList<>();
        for (String name : names1) {
            for (String name1 : names2) {
                if (name.equals(name1)) {
                    temp.add(name);
                }
            }
        }
        HashSet<String> result = new HashSet<>(names1);
        result.addAll(names2);
        result.removeAll(temp);
        for (String name : result) {
            System.out.println(name);
        }
    }

    public void removeDuplicatesUsingStreamWithHash(HashSet<String> names1, HashSet<String> names2) {
        Set<String> result = Stream.concat(names1.stream(), names2.stream()).filter(name -> !(names1.contains(name) && names2.contains(name))).collect(Collectors.toSet());
        result.forEach(System.out::println);
    }

    public void employeeNameAndIdUsingMap(Map<Integer, String> employee) {
        for (Map.Entry<Integer, String> number : employee.entrySet()) {
            System.out.println(number.getKey() + "-" + number.getValue());
        }
        for (Integer hash : employee.keySet()) {

            System.out.println(hash + "-" + employee.get(hash));

        }
    }

    public void employeeFilter(HashMap<Integer, String> employee) {
        for (Map.Entry<Integer, String> number : employee.entrySet()) {
            if (number.getKey().equals(308332)) {
                continue;
            }
            System.out.println(number.getKey() + "-" + number.getValue());
        }
    }
//        if (employee.containsKey(308332)) {
//            employee.remove(308332, "aishu");
//        }
//
//        for (Map.Entry<Integer, String> number : employee.entrySet()) {
//                System.out.println(number.getKey() + "-" + number.getValue());
//            }
//
//    }

    public void employeeFilterUsingStream(HashMap<Integer, String> employee) {
        employee.entrySet().stream().filter(entry -> !entry.getKey().equals(308332)).forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));

    }

    public void employeeFilterWithContainsKey(HashMap<Integer, String> employee) {
            if (employee.containsKey(308332)) {
                employee.remove(308332);
            }
            if (employee.containsValue("aishu")) {
                employee.values().remove("aishu");
            }
            for (Map.Entry<Integer, String> number : employee.entrySet()) {
            System.out.println(number.getKey()+"-"+number.getValue());
        }
    }
}











