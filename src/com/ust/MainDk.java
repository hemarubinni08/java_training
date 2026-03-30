package com.ust;

import java.util.*;

public class MainDk {
    public static void main(String[] args) {
//        ArithmeticOperations a = new ArithmeticOperations();
//        System.out.println(a.addition(2, 3));
//        System.out.println(a.subtraction(5, 4));
//        System.out.println(a.multiplication(2, 3));
//        System.out.println(a.multiplication(3, 4, 5));
//        System.out.println(a.division(10, 2));
        List<String> namesList = new ArrayList<>();
        List<String> nameList1 = new ArrayList<>();
        List<String> nameList2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<String> combineList = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();
        Set<String> nameSet1 = new HashSet<>();
        Set<String> nameSet2 = new HashSet<>();
        Set<String> combineSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        Map<String, String> members = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> combinedMap = new HashMap<>();

        members.put("1", "Deepa");
        members.put("2", "Varsha");
        members.put("3", "Harsha");
        members.put("4", "Pranav");
        members.put("5", "Navaneeth");
        members.put("6", "Chandu");

        map1.put("1", "Deepa");
        map1.put("2", "Varsha");
        map1.put("3", "Harsha");
        map1.put("4", "Pranav");
        map1.put("5", "Navaneeth");
        map1.put("6", "Chandu");

        map2.put("1", "Deepa");
        map2.put("8", "karthika");
        map2.put("9", "thammi");
        map2.put("10", "chaila");
        map2.put("11", "Nava");
        map2.put("12", "sruthi");

        namesList.add("Deepa");
        namesList.add("Varsha");
        namesList.add("Harsha");
        namesList.add("Pranav");
        namesList.add("Navaneeth");
        namesList.add("Chandu");

        nameSet1.add("Deepa");
        nameSet1.add("Varsha");
        nameSet1.add("Harsha");
        nameSet1.add("Pranav");
        nameSet1.add("Navaneeth");
        nameSet1.add("Chandu");

        nameSet2.add("Deepa");
        nameSet2.add("karthika");
        nameSet2.add("thammi");
        nameSet2.add("chaila");
        nameSet2.add("Nava");
        nameSet2.add("sruthi");

        nameSet.add("Deepa");
        nameSet.add("Varsha");
        nameSet.add("Harsha");
        nameSet.add("Pranav");
        nameSet.add("Navaneeth");
        nameSet.add("Chandu");

        CollectionsDeepa cd = new CollectionsDeepa();
        cd.printNamesUsingList(namesList);
        cd.ignoreNameUsingList(namesList);
        cd.removeDuplicatesUsingList(nameList1, nameList2, result, combineList);

        cd.printNamesUsingSet(nameSet);
        cd.ignoreNameUsingSet(nameSet);
        cd.removeDuplicatesSet(nameSet1, nameSet2, combineSet, duplicateSet);

        cd.printMembersUsingMap(members);
        cd.ignoreNameUsingMap(members);
        cd.removeDuplicateFromTwoMaps(map1, map2, combinedMap);
    }
}
