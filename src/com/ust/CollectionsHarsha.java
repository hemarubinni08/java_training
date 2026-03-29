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
        names.stream().filter(name -> !name.equalsIgnoreCase("Pranav")).forEach(System.out::println);
    }

    public void ignoreNeighbourForLoop(List<String> names) {
        for (String name : names) {
            if (!name.equalsIgnoreCase("Pranav")) {
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
                } else if (!name.equalsIgnoreCase(name2)) {
                    count = 0;
                }
            }
            System.out.println(count);
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
                } else if (!name2.equalsIgnoreCase(name)) {
                    count = 0;
                }
            }
            System.out.println(count);
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
        List<String> combineList = Stream.concat(nameList1.stream().filter(name -> !nameList2.contains(name)), nameList2.stream().filter(name -> !nameList1.contains(name))).toList();
        return combineList;
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

    public Set<String> removeDuplicateInSet(Set<String> nameSet1,Set<String> nameSet2){
        Set<String> result = new HashSet<>();
        for (String name: nameSet1){
         if (!nameSet2.contains(name)){
             result.add(name);
         }
        }
        for (String name : nameSet2){
            if (!nameSet1.contains(name)){
                result.add(name);
            }
        }
        return result;
    }
    public Set<String> removeDuplicateInSetByStream(Set<String> nameSet1,Set<String> nameSet2){
        Set<String> result = new HashSet<>();
        result.addAll(nameSet1.stream().filter(name->!nameSet2.contains(name)).toList());
        result.addAll(nameSet2.stream().filter(name->!nameSet1.contains(name)).toList());
        return result;
    }
    public Set<String> removeDuplicateInSetByCombine(Set<String> nameSet1,Set<String> nameSet2){
        Set<String> combine = new HashSet<>();
        combine.addAll(nameSet1);
        combine.addAll(nameSet2);
//      System.out.println(nameSet1.stream().filter(name->nameSet2.contains(name)).toList());
        combine.removeAll(nameSet1.stream().filter(name->nameSet2.contains(name)).toList());
        return  combine;
    }
    public Set<String> removeDuplicateInSetOnlyByStream(Set<String> nameSet1,Set<String> nameSet2){
        Set<String> combine = new HashSet<>();
        combine.addAll(nameSet1);
        combine.addAll(nameSet2);
        return  combine.stream().filter(name->!(nameSet1.stream().filter(x->nameSet2.contains(x)).toList()).contains(name)).collect(Collectors.toSet());
    }

    //Maps

    public void displayMapKeyValuesUsingEntrySet(Map<String,String> nameMap){
        for (Map.Entry<String,String> entry : nameMap.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
    public void displayMapKeyValuesUsingKeySet(Map<String,String> nameMap){
        for (String key : nameMap.keySet()){
            String value = nameMap.get(key);
            System.out.println(key+"->"+value);
        }
    }
    public void displayMapKeyValuesUsingForEach(Map<String,String> nameMap){
        nameMap.forEach((Key, Value)->{
            System.out.println(Key+"->"+Value);
        });
    }
    public void findOtherPodMembersNotincludeMe(Map<String,String> nameMap){
        for(Map.Entry<String,String> entry : nameMap.entrySet()){
            if(!(entry.getKey() == "308227")){
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }
        }
    }
    public void findOtherPodMembersNotincludeMe2(Map<String,String> nameMap){
        for (String key : nameMap.keySet()){
            if (!(nameMap.get(key) == "Harshavardhan")){
                System.out.println(key+"->"+nameMap.get(key));
            }
        }
    }
    public Map<String,String> findOtherPodMembersNotincludeMe3(Map<String,String> nameMap){
        String employeeName = "308227";
        if (nameMap.containsKey(employeeName)){
            nameMap.remove(employeeName);
        }
        return nameMap;
    }
    public void StreamMap(Map<String,String> nameMap){
        Set<Map.Entry<String, String>> entries = nameMap.entrySet();
//      System.out.println(entries.stream().filter(entry -> !(entry.getKey().equalsIgnoreCase("308227"))).collect(Collectors.toSet()));
        System.out.println(entries.stream().filter(entry -> !(entry.getKey().equalsIgnoreCase("308227"))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}
