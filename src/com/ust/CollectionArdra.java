package com.ust;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionArdra {
    void doIterate(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    void doIterateLambda(List<String> list) {
        list.forEach((name) -> System.out.println(name));
    }

    void filterNeighbour(List<String> list) {
        list.stream().filter((name) -> !name.equals("Hemanth")).forEach(System.out::println);
    }

    List<String> deleteDuplicatesFor(List<String> list1, List<String> list2) {
        List<String> returnList = new ArrayList<String>();
        for (String s : list2) {
            if (!list1.contains(s)) {
                returnList.add(s);
            }
        }
        for (String s : list1) {
            if (!list2.contains(s)) {
                returnList.add(s);
            }
        }
        return returnList;
    }

    List<String> deleteDuplicatesLambda(List<String> list1, List<String> list2) {
        List<String> returnList = new ArrayList<String>();
        list2.stream().filter((s) -> !list1.contains(s)).forEach(returnList::add);
        list1.stream().filter((s) -> !list2.contains(s)).forEach(returnList::add);
        return returnList;
    }

    List<String> deleteDuplicatesMergeFor(List<String> list1, List<String> list2) {
        List<String> returnList = new ArrayList<String>();
        List<String> combinedList = new ArrayList<String>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        for (String s : combinedList) {
            if (!(list1.contains(s) && list2.contains(s))) {
                returnList.add(s);
            }
        }
        return returnList;
    }

    List<String> deleteDuplicatesMergeLambda(List<String> list1, List<String> list2) {
        List<String> returnList = new ArrayList<String>();
        List<String> combinedList = new ArrayList<String>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        combinedList.stream().filter((s) -> !(list1.contains(s) && list2.contains(s))).forEach(returnList::add);
        return returnList;
    }

    void doIterateHashsetFor(Set<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    void doIterateHashsetLambda(Set<String> set) {
        set.forEach((s) -> System.out.println(s));
    }

    void filterNeighbourSet(Set<String> set) {
        set.stream().filter((name) -> !name.equals("Hemanth")).forEach(System.out::println);
    }

    Set<String> deleteDuplicatesSetFor1(Set<String> set1, Set<String> set2) {
        Set<String> returnSet = new HashSet<>();
        for (String s : set2) {
            if (!set1.contains(s)) {
                returnSet.add(s);
            }
        }
        for (String s : set1) {
            if (!set2.contains(s)) {
                returnSet.add(s);
            }
        }
        return returnSet;
    }

    Set<String> deleteDuplicatesSetFor2(Set<String> set1, Set<String> set2) {
        Set<String> duplicatesSet = new HashSet<>();
        for (String s : set1) if (set2.contains(s)) duplicatesSet.add(s);
        set1.addAll(set2);
        for (String s : duplicatesSet) if (set1.contains(s)) set1.remove(s);
        return set1;
    }

    Set<String> deleteDuplicatesSetLambda(Set<String> set1, Set<String> set2) {
        Set<String> duplicatesSet = new HashSet<>();
        set1.stream().filter((s) -> ((set2.contains(s)))).forEach(duplicatesSet::add);
        set1.addAll(set2);
        //return set1.stream().filter((s)->(!duplicatesSet.contains(s))).collect(Collectors.toSet());
        duplicatesSet.stream().filter(s -> set1.contains(s)).forEach(set1::remove);
        return set1;
    }

    void doIterateMapForKeyset(Map<Integer, String> map) {
        for (Integer k : map.keySet()) {
            System.out.printf(k + " - " + map.get(k));
        }
    }

    void doIterateMapForEntrySet(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    void doIterateMapLambdaKeyset(Map<Integer, String> map) {
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    void doIterateMapLambdaEntryset(Map<Integer, String> map) {
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }

    void filterMemberMapFor(Map<Integer, String> map) {
        for (Integer k : map.keySet()) {
            if (k != 308339) System.out.println(k + " - " + map.get(k));
        }
    }

    void filterMemberMapLambda(Map<Integer, String> map) {
        map.entrySet().stream().filter(entry -> entry.getKey() != 308339).forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }

    Map<Integer, String> deleteDuplicatesMapFor(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> duplicatesMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            if (map2.containsValue(entry.getValue())) {
                duplicatesMap.put(entry.getKey(), entry.getValue());
            }
        }
        map1.putAll(map2);
        for (String s : duplicatesMap.values()) {
            map1.entrySet().removeIf(entry -> entry.getValue().equals(s));
        }
        return map1;
    }

    Map<Integer, String> deleteDuplicatesMapLambda(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> duplicatesMap = new HashMap<>();
        map1.entrySet().stream().filter(entry -> ((map2.containsValue(entry.getValue())))).forEach(entry -> duplicatesMap.put(entry.getKey(), entry.getValue()));
        map1.putAll(map2);
        duplicatesMap.forEach((key, value) -> map1.entrySet().removeIf(entry1 -> entry1.getValue().equals(value)));
        return map1;
    }
}