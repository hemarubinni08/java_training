package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsDeepshika {

    public void iteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        names.forEach(name -> System.out.println(name));
    }

    public void printNames(List<String> names) {
        for (String name : names) {
            if (!name.equalsIgnoreCase("Mamatha")) {
                System.out.println(name);
            }

        }
        System.out.println();

        names.stream().filter(name -> !name.equalsIgnoreCase("mamatha")).toList().forEach(System.out::println);
    }

    public List<String> toRemoveDuplicateUsingLoop(List<String> names, List<String> names2) {
        List<String> result = new ArrayList<>();

        for (String name1 : names) {
            if (!names2.contains(name1)) {
                result.add(name1);
            }
        }

        for (String name2 : names2) {
            if (!names.contains(name2)) {
                result.add(name2);
            }
        }

        result.clear();
        result.addAll(names.stream().filter(name1 -> !names2.contains(name1)).toList());
        result.addAll(names2.stream().filter(name2 -> !names.contains(name2)).toList());
        return result;
    }

    public void removeDuplicateUsingSingleLoop(List<String> names, List<String> names2) {
        List<String> newList1 = new ArrayList<>();
        List<String> newList2 = new ArrayList<>();
        newList2.addAll(names);
        newList2.addAll(names2);

        for (String name : newList1) {
            if (!(names.contains(name) && names2.contains(name))) {
                newList1.add(name);
            }
        }

        System.out.println("List" + newList1);
    }

    public void removeDuplicateUsingForEach(List<String> names, List<String> names2) {
        List<String> newList = new ArrayList<>();
        newList.addAll(names);

        for (String name : names2) {
            if (!newList.contains(name)) {
                newList.add(name);
            }
        }

        newList.clear();
        newList.addAll(names);
        newList.addAll(names2.stream().filter(name -> !newList.contains(name)).toList());
        iteration(newList);
    }

    public void hashIteration(Set<String> hashNames, Set<String> hashNames1) {
        for (String name : hashNames) {
            if (hashNames1.contains(name)) {
                hashNames1.remove(name);
            }
            System.out.println(name);
        }
        System.out.println();
    }

    public void hashRemoveDuplicateUsingLoop(Set<String> hashNames, Set<String> hashNames1) {
        Set<String> resultSet = new HashSet<>();
        Set<String> resultSet1 = new HashSet<>();
        resultSet.addAll(hashNames);
        resultSet.addAll(hashNames1);

        for (String name : resultSet) {
            if (!(hashNames.contains(name) && hashNames1.contains(name))) {
                resultSet1.add(name);
            }
        }

        resultSet1.forEach(name -> System.out.println(name));
    }

    public void hashRemoveDuplicateUsingLamda(Set<String> hashNames, Set<String> hashNames1) {
        Set<String> resultSet = Stream.concat(hashNames.stream(), hashNames1.stream()).collect(Collectors.toSet()).stream().filter(name -> !(hashNames.contains(name) && hashNames1.contains(name))).collect(Collectors.toSet());
        System.out.println(resultSet);
    }

    public void toPrintMapNames(Map<Integer, String> mapNames) {
        for (Map.Entry<Integer, String> name : mapNames.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
    }

    public void toPrintMapNamesKeySet(Map<Integer, String> mapNames) {
        for (Integer name : mapNames.keySet()) {
            System.out.println(name + "-" + mapNames.get(name));
        }
    }

    public void toRemoveWithKeyUsingCondition(Map<Integer, String> mapNames) {
        for (Integer name : mapNames.keySet()) {
            if (name != 308341) {
                System.out.println(name + "-" + mapNames.get(name));
            }
        }
    }

    public void toRemoveWithKey(Map<Integer, String> mapNames) {
        int empId = 308341;

        if (mapNames.containsKey(empId)) {
            mapNames.remove(empId);
        }
        System.out.println(mapNames);

        mapNames.entrySet().removeIf(entry -> entry.getKey() == empId);
        System.out.println(mapNames);
    }

    public void toRemoveKeyUsingLamda(Map<Integer, String> mapNames) {
        int eId = 308341;
        mapNames.entrySet().stream().filter(entry -> entry.getKey() != eId).forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }

    public void toRemoveDuplicateMap(Map<Integer, String> mapNames, Map<Integer, String> mapNames1) {
        Set<Integer> keys = new HashSet<>();

        for (Map.Entry<Integer, String> entry : mapNames.entrySet()) {
            Integer key = entry.getKey();
            if (mapNames1.containsKey(key)) {
                keys.add(key);
            }
        }

        for (Integer key : keys) {
            mapNames.remove(key);
            mapNames1.remove(key);
        }

        System.out.println(mapNames);
        System.out.println(mapNames1);
    }

    public void toRemoveDuplicateMapSingleLoop(Map<Integer, String> mapNames, Map<Integer, String> mapNames1) {
        for (Integer key : new HashSet<>(mapNames.keySet())) {
            if (mapNames1.containsKey(key)) {
                mapNames.remove(key);
                mapNames1.remove(key);
            }
        }
        System.out.println(mapNames);
        System.out.println(mapNames1);
    }

    public void toRemoveDuplicateMapUsingLamda(Map<Integer, String> mapNames, Map<Integer, String> mapNames1) {
        Set<Integer> duplicateKeys = mapNames.keySet().stream().filter(mapNames1::containsKey).collect(Collectors.toSet());
        duplicateKeys.forEach(key -> {
            mapNames.remove(key);
            mapNames1.remove(key);
        });
        System.out.println(mapNames);
        System.out.println(mapNames1);
    }
    public void toSortNames(List<String> lnames){
        for(int i=0; i<lnames.size();i++){
            for(int j=0; j<lnames.size()-1;j++){
                String names1=lnames.get(j);
                String names2= lnames.get(j+1);
                if(names1.charAt(0)>names2.charAt(0)) {
                    lnames.set(j, names2);
                    lnames.set(j + 1, names1);
                }
            }
        }
        for(String name:lnames)
        System.out.println(name);
    }
}
