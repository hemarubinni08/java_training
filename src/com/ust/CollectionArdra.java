package com.ust;

import java.util.*;

public class CollectionArdra {
    void doIterateListFor(List<String> namesList) {
        for (String name : namesList) {
            System.out.println(name);
        }
    }

    void doIterateListLambda(List<String> namesList) {
        namesList.forEach((name) -> System.out.println(name));
    }

    void filterNeighbourList(List<String> namesList) {
        namesList.stream().filter((name) -> !name.equals("Hemanth")).forEach(System.out::println);
    }

    List<String> deleteDuplicatesListFor(List<String> fruitsList1, List<String> fruitsList2) {
        List<String> returnList = new ArrayList<>();
        for (String fruits : fruitsList2) {
            if (!fruitsList1.contains(fruits)) {
                returnList.add(fruits);
            }
        }
        for (String fruits : fruitsList1) {
            if (!fruitsList2.contains(fruits)) {
                returnList.add(fruits);
            }
        }
        return returnList;
    }

    List<String> deleteDuplicatesListLambda(List<String> fruitsList1, List<String> fruitsList2) {
        List<String> returnList = new ArrayList<>();
        fruitsList2.stream().filter((fruit) -> !fruitsList1.contains(fruit)).forEach(returnList::add);
        fruitsList1.stream().filter((fruit) -> !fruitsList2.contains(fruit)).forEach(returnList::add);
        return returnList;
    }

    List<String> deleteDuplicatesListMergeFor(List<String> fruitsList1, List<String> fruitsList2) {
        List<String> returnList = new ArrayList<String>();
        List<String> combinedList = new ArrayList<String>();
        combinedList.addAll(fruitsList1);
        combinedList.addAll(fruitsList2);
        for (String fruit : combinedList) {
            if (!(fruitsList1.contains(fruit) && fruitsList2.contains(fruit))) {
                returnList.add(fruit);
            }
        }
        return returnList;
    }

    List<String> deleteDuplicatesListMergeLambda(List<String> fruitsList1, List<String> fruitsList2) {
        List<String> returnList = new ArrayList<String>();
        List<String> combinedList = new ArrayList<String>();
        combinedList.addAll(fruitsList1);
        combinedList.addAll(fruitsList2);
        combinedList.stream().filter((fruit) -> !(fruitsList1.contains(fruit) && fruitsList2.contains(fruit))).forEach(returnList::add);
        return returnList;
    }

    void doIterateHashsetFor(Set<String> namesSet) {
        for (String name : namesSet) {
            System.out.println(name);
        }
    }

    void doIterateHashsetLambda(Set<String> namesSet) {
        namesSet.forEach((name) -> System.out.println(name));
    }

    void filterNeighbourSetFor(Set<String> namesSet) {
        for (String name : namesSet) {
            if (!name.equals("Hemanth")) {
                System.out.println(name);
            }
        }
    }

    void filterNeighbourSetLambda(Set<String> namesSet) {
        namesSet.stream().filter((name) -> !name.equals("Hemanth")).forEach(System.out::println);
    }

    Set<String> deleteDuplicatesSetFor1(Set<String> fruitsSet1, Set<String> fruitsSet2) {
        Set<String> returnSet = new HashSet<>();

        for (String fruit : fruitsSet2) {
            if (!fruitsSet1.contains(fruit)) {
                returnSet.add(fruit);
            }
        }

        for (String fruit : fruitsSet1) {
            if (!fruitsSet2.contains(fruit)) {
                returnSet.add(fruit);
            }
        }
        return returnSet;
    }

    Set<String> deleteDuplicatesSetFor2(Set<String> fruitsSet1, Set<String> fruitsSet2) {
        Set<String> duplicatesSet = new HashSet<>();
        for (String fruit : fruitsSet1) if (fruitsSet2.contains(fruit)) duplicatesSet.add(fruit);
        fruitsSet1.addAll(fruitsSet2);

        for (String fruit : duplicatesSet) {
            fruitsSet1.remove(fruit);
        }

        return fruitsSet1;
    }

    Set<String> deleteDuplicatesSetLambda(Set<String> fruitsSet1, Set<String> fruitsSet2) {
        Set<String> duplicatesSet = new HashSet<>();
        fruitsSet1.stream().filter((fruit) -> ((fruitsSet2.contains(fruit)))).forEach(duplicatesSet::add);
        fruitsSet1.addAll(fruitsSet2);
        duplicatesSet.stream().filter(fruit -> fruitsSet1.contains(fruit)).forEach(fruitsSet1::remove);
        return fruitsSet1;
    }

    void doIterateMapForKeyset(Map<Integer, String> namesMap) {
        for (Integer employeeID : namesMap.keySet()) {
            System.out.printf(employeeID + " - " + namesMap.get(employeeID));
        }
    }

    void doIterateMapForEntrySet(Map<Integer, String> namesMap) {
        for (Map.Entry<Integer, String> entry : namesMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    void doIterateMapLambdaKeyset(Map<Integer, String> namesMap) {
        namesMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    void doIterateMapLambdaEntryset(Map<Integer, String> namesMap) {
        namesMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    void filterMemberMapFor(Map<Integer, String> namesMap) {
        for (Integer employeeID : namesMap.keySet()) {
            if (employeeID != 308339) System.out.println(employeeID + " - " + namesMap.get(employeeID));
        }
    }

    void filterMemberMapLambda(Map<Integer, String> namesMap) {
        namesMap.entrySet().stream().filter(entry -> entry.getKey() != 308339).forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }

    Map<Integer, String> deleteDuplicatesMapFor(Map<Integer, String> fruitsMap1, Map<Integer, String> fruitsMap2) {
        Map<Integer, String> duplicatesMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : fruitsMap1.entrySet()) {
            if (fruitsMap2.containsValue(entry.getValue())) {
                duplicatesMap.put(entry.getKey(), entry.getValue());
            }
        }
        fruitsMap1.putAll(fruitsMap2);

        for (String fruit : duplicatesMap.values()) {
            fruitsMap1.entrySet().removeIf(entry -> entry.getValue().equals(fruit));
        }
        return fruitsMap1;
    }

    Map<Integer, String> deleteDuplicatesMapLambda(Map<Integer, String> fruitsMap1, Map<Integer, String> fruitsMap2) {
        Map<Integer, String> duplicatesMap = new HashMap<>();
        fruitsMap1.entrySet().stream().filter(entry -> ((fruitsMap2.containsValue(entry.getValue())))).forEach(entry -> duplicatesMap.put(entry.getKey(), entry.getValue()));
        fruitsMap1.putAll(fruitsMap2);
        duplicatesMap.forEach((key, value) -> fruitsMap1.entrySet().removeIf(entry1 -> entry1.getValue().equals(value)));
        return fruitsMap1;
    }
}