package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionCJ {
    public void iterateNames(List<String> names) {
        for (String name : names) {
            if (name.equalsIgnoreCase("Nagarajan")) {
                continue;
            } else {
                System.out.println(name);
            }
        }
        names.stream().filter(name -> !name.equalsIgnoreCase("Nagarajan")).
                toList().forEach(name -> System.out.println(name));
    }

    public void removeCommonName(List<String> nameLst1, List<String> nameLst2) {
        List<String> mergedLst = new ArrayList<>(nameLst1);
        mergedLst.retainAll(nameLst2);
        List<String> result = new ArrayList<>(nameLst1);
        result.addAll(nameLst2);

        result.removeAll(mergedLst);
        for (String name : result) {
            System.out.println(name);
        }
    }

    public void removeDuplicateLambda(List<String> nameLst1, List<String> nameLst2) {
        List<String> result = Stream.concat(nameLst1.stream(), nameLst2.stream()).
                filter(name -> !(nameLst1.contains(name) && nameLst2.contains(name))).toList();
        result.forEach(System.out::println);
    }

    public void removeDuplicateSet(HashSet<String> nameSet1, HashSet<String> nameSet2) {
        HashSet<String> commonSet = new HashSet<>(nameSet1);
        commonSet.retainAll(nameSet1);
        HashSet<String> resultSet = new HashSet<>(nameSet2);
        resultSet.addAll(nameSet2);

        resultSet.removeAll(commonSet);
        for (String name : resultSet) {
            System.out.println(name);
        }
    }

    public void removeDuplicateElementInSet(HashSet<String> nameSet1, HashSet<String> nameSet2) {
        HashSet<String> commonSet = new HashSet<>();
        for (String name : nameSet1) {
            if (nameSet2.contains(name)) {
                commonSet.add(name);
            }
        }
        nameSet1.addAll(nameSet2);
        nameSet1.removeAll(commonSet);
        nameSet1.forEach(System.out::println);

    }

    public void removeDuplicateSetUsingLambda(HashSet<String> nameSet1, HashSet<String> nameSet2) {
        Set<String> resultSet = Stream.concat(nameSet1.stream(), nameSet2.stream()).
                filter(name -> !(nameSet1.contains(name) && nameSet2.contains(name))).collect(Collectors.toSet());
        resultSet.forEach(System.out::println);
    }

    public void hashMapIteration(HashMap<Integer, String> inputMap) {
        for (Map.Entry<Integer, String> member : inputMap.entrySet()) {
            System.out.println(member.getKey() + " - " + member.getValue());
        }
    }

    public void hashMapIterationUsingLambda(HashMap<Integer, String> inputMap) {
        inputMap.entrySet().forEach(System.out::println);
    }

    public void hashMapIterationUsingKeySet(HashMap<Integer, String> inputMap) {
        for (Integer key : inputMap.keySet()) {
            System.out.println(key + "-" + inputMap.get(key));

        }
    }

    public void hashMapRemoveElementsUsingMethod(HashMap<Integer, String> inputMap) {
        int key = 308254;
        if (inputMap.containsKey(key)) {
            inputMap.remove(key);
        }
        for (Integer result : inputMap.keySet()) {
            System.out.println(result + " - " + inputMap.get(result));
        }
    }

    public void hashMapRemoveSpecifiedNameUsingLoops(HashMap<Integer, String> inputMap) {
        for (Map.Entry<Integer, String> object : inputMap.entrySet()) {
            if (object.getValue().equals("Chris Johnson")) {//object.getKey().equals(308254){
                continue;
            }
            System.out.println(object.getKey() + " - " + object.getValue());
        }
    }

    public void removeSpecificItemUsingLambdaFromHashMap(HashMap<Integer, String> inputMap) {
        Map<Integer,String> result = inputMap.entrySet().stream().filter(emp -> !emp.getKey()
                .equals(308254)).collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        System.out.println(result);
    }
}






