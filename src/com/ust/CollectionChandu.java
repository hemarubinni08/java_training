package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionChandu {
    public void displayEmployee(Map<Integer, String> employeeMap) {
        employeeMap.forEach((Key, Value) -> {
            System.out.println(Key + "->" + Value);
        });

        for (Integer key : employeeMap.keySet()) {
            System.out.println(key + "->" + employeeMap.get(key));
        }

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public void findNeighbour(Map<Integer, String> employeeMap) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (!(entry.getKey() == 308239)) {
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }

    public Map<Integer, String> findNeighbour1(Map<Integer, String> employeeMap) {
        Integer employeeName = 308239;
        if (employeeMap.containsKey(employeeName)) {
            employeeMap.remove(employeeName);
        }
        return employeeMap;
    }

    public void streamMap(Map<Integer, String> employeeMap) {
        Set<Map.Entry<Integer, String>> entries = employeeMap.entrySet();
        System.out.println(entries.stream().filter(entry -> !(entry.getKey().equals(308239))).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    public Map<Integer, String> removeEmployee(Map<Integer, String> employeeMap, Map<Integer, String> employeeMap1) {
        if (employeeMap.containsValue("Chandu")) {
            employeeMap.values().remove("Chandu");
        }
        if (employeeMap1.containsValue("Chandu")) {
            employeeMap1.values().remove("Chandu");
        }
        return employeeMap;
    }

    public Map<Integer, String> removeEmployee1(Map<Integer, String> employeeMap, Map<Integer, String> employeeMap1) {
        Map<Integer, String> resultMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (!(employeeMap1.containsKey(entry.getKey()))) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<Integer, String> entry : employeeMap1.entrySet()) {
            if (!(employeeMap.containsKey(entry.getKey()))) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }
        return resultMap;
    }

    public Map<Integer, String> removeEmployee2(Map<Integer, String> employeeMap, Map<Integer, String> employeeMap1) {
        Map<Integer, String> resultMap1 = Stream.concat(
                employeeMap.entrySet().stream().filter(e -> !employeeMap1.containsKey(e.getKey())),
                employeeMap1.entrySet().stream().filter(e -> !employeeMap.containsKey(e.getKey()))
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return resultMap1;
    }

    public Map<Integer, String> removeEmployeeCombine(Map<Integer, String> employeeMap, Map<Integer, String> employeeMap1) {
        Map<Integer, String> duplicateMap = new HashMap<>();
        for (Integer key : employeeMap.keySet()) {
            if (employeeMap1.containsKey(key)) {
                duplicateMap.put(key, employeeMap.get(key));
            }
        }
        Map<Integer, String> combinedResult = new HashMap<>();
        combinedResult.putAll(employeeMap);
        combinedResult.putAll(employeeMap1);

        for (Integer key : duplicateMap.keySet()) {
            combinedResult.remove(key);
        }
        return combinedResult;
    }

    public Map<Integer, String> removeEmployeeCombine1(Map<Integer, String> employeeMap, Map<Integer, String> employeeMap1) {
        Map<Integer, String> combinedResult1 = new HashMap<>(employeeMap);
        combinedResult1.putAll(employeeMap1);
        Map<Integer, String> duplicate = employeeMap.entrySet().stream().
                filter(entry -> employeeMap1.containsKey(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //combinedResult1.entrySet().stream().filter(entry -> !duplicate.containsKey(entry.getKey()));
        combinedResult1.entrySet().removeAll(duplicate.entrySet());
        return combinedResult1;
    }

    public Set<Integer> setIteration(Set<Integer> number, Set<Integer> number1) {
        for (int num : number) {
            System.out.println(num);
        }
        for (int num : number1) {
            System.out.println(num);
        }

        System.out.println(number.stream().toList());

        number1.forEach(System.out::println);

        number.addAll(number1);
        number.forEach(System.out::println);

        Set<Integer> finalSet = new HashSet<>();
        number.stream().filter(s -> !number1.contains(s)).forEach(finalSet::add);
        number1.stream().filter(s -> !number.contains(s)).forEach(finalSet::add);
        System.out.println(finalSet);
        return finalSet;
    }

    public Set<Integer> setIteration2(Set<Integer> number, Set<Integer> number1) {
        Set<Integer> finalSet = new HashSet<>();
        for (int num : number) {
            if (!number1.contains(num)) {
                finalSet.add(num);
            }
        }
        for (int num : number1) {
            if (!number.contains(num)) {
                finalSet.add(num);
            }
        }
        return finalSet;
    }

    public Set<Integer> setIteration3(Set<Integer> number, Set<Integer> number1) {

        Set<Integer> finalSet = new HashSet<>();
        Set<Integer> dupliSet = new HashSet<>();
        for (int num : number) {
            if (!number1.contains(num)) {
                dupliSet.add(num);
            }
        }
        finalSet.addAll(number);
        finalSet.addAll(number1);
        return finalSet;
    }

    public List<String> iterate(List<String> names, List<String> naming) {
        List<String> finalList = Stream.concat(names.stream(), naming.stream()).
                filter(name -> !(names.contains(name) && naming.contains(name))).toList();

        finalList.forEach(System.out::println);
        System.out.println(finalList);
        return finalList;
    }

    public List<String> iterate2(List<String> names, List<String> naming) {

        List<String> finalList = new ArrayList<>();

        names.stream().filter(s -> !naming.contains(s)).forEach(finalList::add);
        naming.stream().filter(s -> !names.contains(s)).forEach(finalList::add);
        System.out.println(finalList);
        return finalList;
    }

    public List<String> iterate3(List<String> names, List<String> naming) {
        List<String> finalList = new ArrayList<>();

        for (String name : names) {
            if (!naming.contains(name)) {
                finalList.add(name);
            }
        }

        for (String name : naming) {
            if (!names.contains(name)) {
                finalList.add(name);
            }
        }
        return finalList;
    }

    public List<String> iterate4(List<String> names, List<String> naming) {
        List<String> finalList = new ArrayList<>();
        for (String name : names) {
            if (!name.equalsIgnoreCase("Navaneeth")) {
                System.out.println(name);
            }
        }
        System.out.println(naming.stream().filter(name ->
                !name.equalsIgnoreCase("Navaneeth")).toList());

        names.forEach(System.out::println);

        System.out.println(names.stream().toList());
        return finalList;
    }
}
