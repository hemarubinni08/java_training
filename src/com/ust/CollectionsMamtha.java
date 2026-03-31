package com.ust;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsMamtha {

    public void toPrintPod2Names(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        names.forEach(name -> System.out.println(name));
    }

    public void toPrintExceptDeepshika(List<String> names) {
        for (String name : names) {
            if (!name.equalsIgnoreCase("deepshi")) {
                System.out.println(name);
            }
        }
        System.out.println();
        names.stream().filter(name -> !name.equalsIgnoreCase("deepshi")).toList().forEach(name -> System.out.println(name));
    }

    public List<String> toRemoveDuplicatesFromLists(List<String> names, List<String> names1) {
        List<String> resultList = new ArrayList<>();
        for (String name1 : names) {
            if (!names1.contains(name1)) {
                resultList.add(name1);
            }
        }
        for (String name2 : names1) {
            if (!names.contains(name2)) {
                resultList.add(name2);
            }
        }
        resultList.clear();

        resultList.addAll(names.stream().filter(name1 -> !names1.contains(name1)).toList());
        resultList.addAll(names1.stream().filter(name2 -> !names.contains(name2)).toList());
        return resultList;
    }

    public void toRemoveDuplicateUsingSingleForLoop(List<String> names, List<String> names1) {
        List<String> resultList = new ArrayList<>();
        List<String> commonList = new ArrayList<>();
        commonList.addAll(names);
        commonList.addAll(names1);

        for (String n1 : commonList) {
            if (!(names.contains(n1) && names1.contains(n1))) {
                resultList.add(n1);
            }
        }

        System.out.println("list:" + resultList);
        System.out.println();
    }

    public void toIterateSet(Set<String> names) {
        names.forEach(System.out::println);
    }

    public void toRemoveDuplicateFromSets(Set<String> hNames, Set<String> hNames1) {
        List<String> commonList = new ArrayList<>();
        Set<String> resultSet = new HashSet<>();
        commonList.addAll(hNames);
        commonList.addAll(hNames1);

        for (String name : commonList) {
            if (!(hNames.contains(name) && hNames1.contains(name))) {
                resultSet.add(name);
            }
        }

        toIterateSet(resultSet);
    }

    public void toRemoveDuplicateUsingLambdaEx(Set<String> hNames, Set<String> hNames1) {
        Set<String> resultSet = Stream.concat(hNames.stream(), hNames1.stream()).collect(Collectors.toSet()).stream().filter(name -> !(hNames.contains(name) && hNames1.contains(name))).collect(Collectors.toSet());
        System.out.println("result:" + resultSet);
    }

    public void toPrintingMap(Map<String, String> mapNames) {
        for (Map.Entry<String, String> name : mapNames.entrySet()) {
            System.out.println(name.getKey() + "->" + name.getValue());
        }
        System.out.println();

        for (String name : mapNames.keySet()) {
            System.out.println(name + "->" + mapNames.get(name));
        }
    }

    public void printExceptMamthaMap(Map<String, String> mapNames) {
        for (String name : mapNames.keySet()) {
            if (!name.equalsIgnoreCase("308335")) {
                System.out.println(name + "-" + mapNames.get(name));
            }
        }
    }

    public void printExceptMyEmployeeId(Map<String, String> mapNames) {
        String myEmployeeId = "308333";
        if (mapNames.containsKey(myEmployeeId)) {
            mapNames.remove(myEmployeeId);
        }
        System.out.println(mapNames);
        System.out.println();

        for (Map.Entry<String, String> name : mapNames.entrySet()) {
            if (name.getKey().contains(myEmployeeId)) continue;

            else System.out.println(name.getKey() + "-" + name.getValue());
        }
        System.out.println();
        String myEmp = "308341";

        mapNames.entrySet().removeIf(entry -> entry.getKey().equals(myEmp));
        System.out.println(mapNames);
    }

    public void toRemoveKeyUsingLambda(Map<String, String> mapNames) {
        String empId = "308335";
        mapNames.entrySet().stream().filter(entry -> !entry.getKey().contains(empId)).
                forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }

    public void toRemoveDuplicateMap(Map<String, String> mapNames, Map<String, String> mapNames1) {
        for (String key : new HashSet<>(mapNames.keySet())) {
            if (mapNames1.containsKey(key)) {
                mapNames.remove(key);
                mapNames1.remove(key);
            }
        }
        System.out.println(mapNames);
        System.out.println(mapNames1);
    }

    public void toRemoveDuplicateFromTwoMapsLambdaEx(Map<String, String> mapNames, Map<String, String> mapNames1) {
        Set<String> duplicateKeys = mapNames.keySet().stream().filter(mapNames1::containsKey).collect(Collectors.toSet());
        duplicateKeys.forEach(key -> {
            mapNames.remove(key);
            mapNames1.remove(key);
        });
        System.out.println(mapNames);
        System.out.println(mapNames1);
    }
}


