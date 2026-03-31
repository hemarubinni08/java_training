package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsHarsha {
    //Array List
    public void doIteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void doIterationByStream(List<String> names) {
        names.forEach(System.out::println);
    }

    public void igonreNeighbour(List<String> names) {
        String neighbourName = "Pranav";
        names.stream().filter(name -> !name.equalsIgnoreCase(neighbourName)).forEach(System.out::println);
    }

    public void ignoreNeighbourForLoop(List<String> names) {
        String neighbourName = "Pranav";
        for (String name : names) {
            if (!name.equalsIgnoreCase(neighbourName)) {
                System.out.println(name);
            }
        }
    }

    public List<String> removeDuplicateByTwoLoop(List<String> nameList1, List<String> nameList2) {
        List<String> result = new ArrayList<>();
        int count = 0;
        for (String name : nameList1) {
            for (String name2 : nameList2) {
                if (name.equalsIgnoreCase(name2)) {
                    count = count + 1;
                    break;
                } else {
                    count = 0;
                }
            }
            if (count == 0) {
                result.add(name);
            } else {
                System.out.println("Not added");
            }
        }
        for (String name2 : nameList2) {
            for (String name : nameList1) {
                if (name2.equalsIgnoreCase(name)) {
                    count = count + 1;
                    break;
                } else {
                    count = 0;
                }
            }
            if (count == 0) {
                result.add(name2);
            } else {
                System.out.println("Not added");
            }
        }
        Collections.sort(result);
        return result;
    }

    public List<String> removeDuplicateByContainsMethod(List<String> nameList1, List<String> nameList2) {
        List<String> result = new ArrayList<>();
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
        return result;
    }

    public List<String> removeDuplicateByStreamMethods(List<String> nameList1, List<String> nameList2) {
        List<String> newList = new ArrayList<>();
        newList.addAll(nameList1.stream().filter(name -> !nameList2.contains(name)).toList());
        newList.addAll(nameList2.stream().filter(name -> !nameList1.contains(name)).toList());
        return newList;
    }

    public List<String> removeDuplicateByStreamConcat(List<String> nameList1, List<String> nameList2) {
        return Stream.concat(nameList1.stream().filter(name -> !nameList2.contains(name)), nameList2.stream().filter(name -> !nameList1.contains(name))).toList();
    }

    public List<String> removeDuplicateByCombiningLists(List<String> nameList1, List<String> nameList2) {
        List<String> combine = new ArrayList<>();
        combine.addAll(nameList1);
        combine.addAll(nameList2);
        List<String> result = new ArrayList<>();
        for (String name : combine) {
            if (!(nameList1.contains(name) && nameList2.contains(name))) {
                result.add(name);
            }
        }
        return result;
    }

    //sets
    public void GetElementsFromSetLoop(Set<String> nameSet) {
        for (String name : nameSet) {
            System.out.println(name);
        }
        // nameSet.stream().forEach(name-> System.out.println(name));
    }

    public Set<String> removeDuplicateInSet(Set<String> nameSet1, Set<String> nameSet2) {
        Set<String> result = new HashSet<>();
        for (String name : nameSet1) {
            if (!nameSet2.contains(name)) {
                result.add(name);
            }
        }
        for (String name : nameSet2) {
            if (!nameSet1.contains(name)) {
                result.add(name);
            }
        }
        return result;
    }

    public Set<String> removeDuplicateInSetByStream(Set<String> nameSet1, Set<String> nameSet2) {
        Set<String> result = new HashSet<>();
        result.addAll(nameSet1.stream().filter(name -> !nameSet2.contains(name)).toList());
        result.addAll(nameSet2.stream().filter(name -> !nameSet1.contains(name)).toList());
        return result;
    }

    public Set<String> removeDuplicateInSetByCombine(Set<String> nameSet1, Set<String> nameSet2) {
        Set<String> combine = new HashSet<>();
        combine.addAll(nameSet1);
        combine.addAll(nameSet2);
        nameSet1.stream().filter(nameSet2::contains).toList().forEach(combine::remove);
        return combine;
    }

    public Set<String> removeDuplicateInSetOnlyByStream(Set<String> nameSet1, Set<String> nameSet2) {
        Set<String> combine = new HashSet<>();
        combine.addAll(nameSet1);
        combine.addAll(nameSet2);
        return combine.stream().filter(name -> !(nameSet1.stream().filter(nameSet2::contains).toList()).contains(name)).collect(Collectors.toSet());
    }

    //Maps
    public void displayMapKeyValuesUsingEntrySet(Map<String, String> nameMap) {
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public void displayMapKeyValuesUsingKeySet(Map<String, String> nameMap) {
        for (String key : nameMap.keySet()) {
            String value = nameMap.get(key);
            System.out.println(key + "->" + value);
        }
    }

    public void displayMapKeyValuesUsingForEach(Map<String, String> nameMap) {
        nameMap.forEach((Key, Value) -> System.out.println(Key + "->" + Value));
    }

    public void findOtherPodMembersNotIncludeMeUsingEntrySet(Map<String, String> nameMap) {
        String keyToFind = "308227";
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            if (!(entry.getKey().equalsIgnoreCase(keyToFind))) {
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }

    public void findOtherPodMembersNotIncludeMeUsingKeySet(Map<String, String> nameMap) {
        String nameToCheck = "Harshavardhan";
        for (String key : nameMap.keySet()) {
            if (!(nameMap.get(key).equalsIgnoreCase(nameToCheck))) {
                System.out.println(key + "->" + nameMap.get(key));
            }
        }
    }

    public Map<String, String> findOtherPodMembersNotIncludeMeUsingRemove(Map<String, String> nameMap) {
        String employeeName = "308227";
        if (nameMap.containsKey(employeeName)) {
            nameMap.remove(employeeName);
        }
        return nameMap;
    }

    public void StreamMap(Map<String, String> nameMap) {
        Set<Map.Entry<String, String>> entries = nameMap.entrySet();
//      System.out.println(entries.stream().filter(entry -> !(entry.getKey().equalsIgnoreCase("308227"))).collect(Collectors.toSet()));
        System.out.println(entries.stream().filter(entry -> !(entry.getKey().equalsIgnoreCase("308227"))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    public Map<String, String> removeDuplicateFromMap(Map<String, String> nameMap, Map<String, String> nameMap2) {
        Map<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            if (!(nameMap2.containsKey(entry.getKey()))) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry : nameMap2.entrySet()) {
            if (!(nameMap.containsKey(entry.getKey()))) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }
        return resultMap;
    }

    public Map<String, String> removeDuplicateFromMapByStream(Map<String, String> nameMap, Map<String, String> nameMap2) {
        Map<String, String> resultMap;
        resultMap = nameMap.entrySet().stream().filter(entry -> !(nameMap2.containsKey(entry.getKey()))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        resultMap.putAll(nameMap2.entrySet().stream().filter(entry -> !(nameMap.containsKey(entry.getKey()))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        return resultMap;
    }

    public Map<String, String> removeDuplicateWithDuplicateMapUsingForLoop(Map<String, String> nameMap, Map<String, String> nameMap2) {
        Map<String, String> duplicate = new HashMap<>();
        Map<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            if (nameMap2.containsKey(entry.getKey())) {
                duplicate.put(entry.getKey(), entry.getValue());
            }
        }
        resultMap.putAll(nameMap);
        resultMap.putAll(nameMap2);
        resultMap.entrySet().removeAll(duplicate.entrySet());
        return resultMap;
    }

    public Map<String, String> removeDuplicateWithDuplicateMapUsingStream(Map<String, String> nameMap, Map<String, String> nameMap2) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.putAll(nameMap);
        resultMap.putAll(nameMap2);
        Map<String, String> duplicate = nameMap.entrySet().stream().filter(entry -> nameMap2.containsKey(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return resultMap.entrySet().stream().filter(entry -> !duplicate.containsKey(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
