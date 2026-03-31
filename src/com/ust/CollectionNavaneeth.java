package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionNavaneeth {

    public void skipDuplicates(List<String> names, List<String> names1) {
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

        names.stream().filter(s -> !names1.contains(s)).forEach(result::add);
        names1.stream().filter(s -> !names.contains(s)).forEach(result::add);
        System.out.println(result);
    }

    public List<String> combinedListLambda(List<String> names, List<String> names1) {

        List<String> combinedLamda = Stream.concat(names.stream(), names1.stream())
                .filter(s -> !(names.contains(s) && names1.contains(s))).toList();
        System.out.println(combinedLamda);
        return combinedLamda;
    }

    public void skipNeighbour(List<String> names) {

        names.stream().filter(name -> !name.equalsIgnoreCase("Chandu")).forEach(System.out::println);

        for (String name : names) {
            if (!name.equalsIgnoreCase("Chandu")) {
                System.out.println(name);
            }
        }
    }

    public void iteration(List<String> names) {

        System.out.println(names.stream().filter(name ->
                !name.equals("navaneeth")).toList());

        for (String name : names) {
            if (!name.equals("navaneeth")) {
                System.out.println(name);
            }
        }
    }

    public Set<String> setIteration(Set<String> employeeSet1, Set<String> employeeSet2) {
        for (String num : employeeSet1) {
            System.out.println(num);
        }
        System.out.println(employeeSet1.stream().toList());

        Set<String> result = new HashSet<>();
        for (String num1 : employeeSet1) {
            if (!employeeSet2.contains(num1)) {
                result.add(num1);
            }
        }

        for (String num2 : employeeSet2) {
            if (!employeeSet1.contains(num2)) {
                result.add(num2);
            }
        }
        return result;
    }

    public boolean findDuplicatesInSet(Set<String> employeeSet1, Set<String> employeeSet2) {
        Set<String> result1 = new HashSet<>();
        Set<String> result2 = new HashSet<>();

        for (String num1 : employeeSet1) {
            if (!(employeeSet2.contains(num1))) {
                result1.add(num1);
            }
        }

        for (String num2 : employeeSet2) {
            if (!(employeeSet1.contains(num2))) {
                result1.add(num2);
            }
        }

        employeeSet1.stream().filter(num -> !employeeSet2.contains(num)).forEach(result2::add);
        employeeSet2.stream().filter(num -> !employeeSet1.contains(num)).forEach(result2::add);
        return false;
    }

    public Set<String> combinedDuplicatesSet(Set<String> employeeSet1, Set<String> employeeSet2) {
        Set<String> duplicateSet = new HashSet<>();
        Set<String> combinedSet = new HashSet<>();

        for (String num1 : employeeSet1) {
            if (employeeSet2.contains(num1)) {
                duplicateSet.add(num1);
            }
        }

        combinedSet.addAll(employeeSet1);
        combinedSet.addAll(employeeSet2);
        combinedSet.removeAll(duplicateSet);
        return combinedSet;
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

    public Map<Integer, String> removeMe(Map<Integer, String> members) {
        if (members.containsValue("Navaneeth")) {
            members.values().remove("Navaneeth");
        }
        return members;
    }

    public Map<Integer, String> removeSpecificUsingStreamMethod(Map<Integer, String> employeeMap) {
        employeeMap.entrySet().removeIf(entry -> entry.getKey() == 6);
        return employeeMap;
    }

    public void removeSpecificUsingStreamMethodUsingFilter(Map<Integer, String> employeeMap) {
        employeeMap.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals(6))
                .forEach(entry ->
                        System.out.println(entry.getKey() + " - " + entry.getValue())
                );
    }

    public Map<Integer, String> removeSpecificUsingToMap(Map<Integer, String> employeeMap) {
        Map<Integer, String> newMap;
        newMap = employeeMap.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals(6))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        return newMap;
    }

    public Map<Integer, String> removeDuplicatesUsingMap(Map<Integer, String> members, Map<Integer, String> members1) {
        Map<Integer, String> result = new HashMap<>();

        for (Map.Entry<Integer, String> e : members.entrySet()) {
            if (!members1.containsKey(e.getKey()) || !members1.get(e.getKey()).equals(e.getValue())) {
                result.put(e.getKey(), e.getValue());
            }
        }

        for (Map.Entry<Integer, String> e : members1.entrySet()) {
            if (!members.containsKey(e.getKey()) || !members.get(e.getKey()).equals((e.getValue()))) {
                result.put(e.getKey(), e.getValue());
            }
        }
        return result;
    }

    public void removeDuplicatesUsingStreamMap(Map<Integer, String> members, Map<Integer, String> members1) {
        Map<Integer, String> result = Stream.concat(
                members.entrySet().stream()
                        .filter(e -> !members1.containsKey(e.getKey()) ||
                                !members1.get(e.getKey()).equals(e.getValue())),
                members1.entrySet().stream()
                        .filter(e -> !members.containsKey(e.getKey()) ||
                                !members.get(e.getKey()).equals(e.getValue()))
        ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
        ));
        System.out.println(result);
    }

    public Map<Integer, String> removeDuplicatesCombineUsingForLoopMap(Map<Integer, String> members, Map<Integer, String> members1) {
        Map<Integer, String> duplicate = new HashMap<>();

        for (Map.Entry<Integer, String> e : members.entrySet()) {
            if (members1.containsKey(e.getKey()) && members1.get(e.getKey()).equals(e.getValue())) {
                duplicate.put(e.getKey(), e.getValue());
            }
        }

        Map<Integer, String> combine = new HashMap<>(members);
        combine.putAll(members1);

        for (Integer key : duplicate.keySet()) {
            combine.remove(key);
        }
        return combine;

    }

    public Map<Integer, String> removeDuplicatesCombineUsingStreamMap(Map<Integer, String> members,
                                                                      Map<Integer, String> members1) {
        Map<Integer, String> duplicates = members.entrySet().stream().
                filter(entry -> members1.containsKey(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<Integer, String> combined = new HashMap<>(members);
        combined.putAll(members1);
        combined.entrySet().stream().filter(entry -> !duplicates.containsKey(entry.getKey())).
                forEach(System.out::println);
        combined.entrySet().removeAll(duplicates.entrySet());
        return combined;
    }
}