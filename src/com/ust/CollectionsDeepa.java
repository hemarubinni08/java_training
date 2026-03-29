package com.ust;

import java.awt.desktop.SystemEventListener;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsDeepa {

    public void printNames(List<String> namesList) {

        for (String name : namesList) {
            System.out.println(name);
        }

        namesList.forEach(name -> System.out.println(name));
    }

    public void ignoreName(List<String> namesList) {

        for (String nameIgnored : namesList) {
            if (!nameIgnored.equals("Varsha")) {
                System.out.println(nameIgnored);
            }
        }
        namesList.stream().filter(name -> !name.equalsIgnoreCase("Varsha")).toList().forEach(name -> System.out.println(name));
//        System.out.println(namesList.stream().filter(name->!name.equalsIgnoreCase("Varsha")).toList());
    }

    public List removeDuplicates(List<String> nameList1, List<String> nameList2, List<String> result, List<String> combineList) {

        combineList.addAll(nameList1);
        combineList.addAll(nameList2);
//        for(String name:nameList1){
//            if(!nameList2.contains(name)){
//                result.add(name);
//            }
//        }
//        for(String name: nameList2){
//            if(!nameList1.contains(name)){
//                result.add(name);
//            }
//        }
        for (String name : combineList) {
            if (!(nameList2.contains(name) && nameList1.contains(name))) {
                result.add(name);
            }
        }

        //result.clear();
//        nameList1.stream().filter(name->!nameList2.contains(name)).forEach(name->result.add(name));
//        nameList2.stream().filter(name->!nameList1.contains(name)).forEach(name->result.add(name));
//
        combineList.stream().filter(name -> !(nameList1.contains(name) && nameList2.contains(name))).forEach(name -> result.add(name));
        return result;
    }

    public void printNamesUsingSet(Set<String> nameSet) {
        for (String name : nameSet) {
            System.out.println(name);
        }
        nameSet.forEach(name -> System.out.println(name));
    }

    public void ignoreNameUsingSet(Set<String> nameSet) {
        for (String nameIgnored : nameSet) {
            if (!nameIgnored.equals("Varsha")) {
                System.out.println(nameIgnored);
            }
        }
        nameSet.stream().filter(name -> !name.equalsIgnoreCase("varsha")).toList().forEach(name -> System.out.println(name));
    }

    public void removeDuplicatesSet(Set<String> nameSet1, Set<String> nameSet2, Set<String> combineSet, Set<String> duplicateSet) {
//          nameSet1.addAll(nameSet2);
//        combineSet.addAll(nameSet1);
//        combineSet.addAll(nameSet2);

        for (String name : nameSet1) {
            if (!nameSet2.contains(name)) {
                nameSet1.add(name);
            } else {
                duplicateSet.add(name);
            }
        }
        for (String name : nameSet2) {
            if (!nameSet1.contains(name)) {
                nameSet2.add(name);
            }
//            else {
//                duplicateSet.add(name);
//            }
        }
        combineSet.addAll(nameSet1);
        combineSet.addAll(nameSet2);

        for (String name : combineSet) {
            if (!duplicateSet.contains(name)) {
                System.out.println(name);
            }
        }

//        for(String name:combineSet){System.out.println(name);}
        duplicateSet.stream().filter(name -> !(nameSet1.contains(name) && nameSet2.contains(name))).toList();

        combineSet.stream().filter(name -> !duplicateSet.contains(name)).forEach(name -> System.out.println(name));

//        nameSet1.forEach(name->System.out.println(name));

    }

    public void printMembers(Map<String, String> members) {
        for (Map.Entry<String, String> name : members.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        for (String key : members.keySet()) {
            System.out.println(key + "-" + members.get(key));
        }
//
//        Map<String,List<String>> mapList=new HashMap<>();
//        for(String name:mapList.keySet()){
//
//        }
    }

    public void ignoreNameMap(Map<String, String> members) {

//        for(String nameIgnore: members.keySet()){
//            if(!nameIgnore.equals("2")){
//                System.out.println(nameIgnore+"-"+members.get(nameIgnore));
//            }
//        }


//        if(members.containsKey("2")){
//            members.remove("2");
//        }
//        for(String name: members.keySet()) {
//            System.out.println(name+"-"+members.get(name));
//        }


//        for(String nameIgnore: members.keySet()){
//            if(!members.get(nameIgnore).equals("Varsha")){
//                System.out.println(nameIgnore+"-"+members.get(nameIgnore));
//            }
//        }

//        if(members.containsValue("Varsha")){
//            members.remove("Varsha");
//        }
//        for(String name: members.keySet()) {
//            System.out.println(name+"-"+members.get(name));
//        }


//        members.entrySet().stream().filter(name->!name.getKey().equalsIgnoreCase("2")).toList()
//                .forEach(name->System.out.println(name.getKey()+"-"+name.getValue()));
//
//        members.entrySet().stream().filter(name->!name.getValue().equalsIgnoreCase("Varsha")).toList()
//                .forEach(name->System.out.println(name.getKey()+"-"+name.getValue()));

        members.entrySet().stream().filter(name -> !name.getKey().equalsIgnoreCase("2"))
                .collect(Collectors.toMap(name -> name.getKey(), name -> name.getValue()))
                .forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
