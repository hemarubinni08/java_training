package com.ust;

import java.sql.Array;
import java.util.*;

public class CollectionArdraMain {
    public static void main(String[] args) {
        CollectionArdra collection = new CollectionArdra();
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        map1.put(1, "apple");
        map1.put(2, "mango");
        map1.put(3, "banana");
        map1.put(4, "orange");
        map1.put(5, "cherry");
        map2.put(6, "mango");
        map2.put(7, "blueberry");
        map2.put(8, "pineapple");
        map2.put(9, "strawberry");
        map2.put(10, "watermelon");
        Map<Integer, String> map3 = collection.deleteDuplicatesMapLambda(map1, map2);
        collection.doIterateMapLambdaKeyset(map3);

//        Map<Integer,String> podMembersMap=new HashMap<>();
//        podMembersMap.put(308260, "Ritu");
//        podMembersMap.put(308347, "Anu");
//        podMembersMap.put(308279, "Hemanth");
//        podMembersMap.put(308339, "Ardra");
//        podMembersMap.put(308303, "Akash");
//        podMembersMap.put(308331, "Yeshwanth");

//        if(podMembersMap.containsKey("308339")) podMembersMap.remove("308339");

//        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "mango", "banana", "strawberry", "cherry"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("mango", "orange", "grapes", "watermelon", "blueberry"));
//        Set<String> finalSet = collection.deleteDuplicatesSetFor2(set1, set2);
//        collection.doIterateHashsetFor(finalSet);

//        Set<String> podMembersSet = new HashSet<>(Arrays.asList("Ardra", "Hemanth","Anu","Ritu","Yeshwanth","Akash"));
//        collection.filterNeighbourSet(podMembersSet);

//        List<String> firstList = new ArrayList<>(List.of("apple", "mango","banana","strawberry","cherry"));
//        List<String> secondList = new ArrayList<>(List.of("mango", "orange","grapes","watermelon","blueberry"));
//        List<String> finalList = collection.deleteDuplicatesMergeLambda(firstList, secondList);
//        collection.doIterate(finalList);

//        List<String> podMembers = new List<String>();
//        podMembers.add("Ardra");
//        podMembers.add("Hemanth");
//        podMembers.add("Anu");
//        podMembers.add("Ritika");
//        podMembers.add("Yeshwanth");
//        podMembers.add("Akash");
//        collection.filterNeighbour(podMembers);
//        collection.doIterate(podMembers);
//        collection.doIterateLambda(podMembers);
    }
}