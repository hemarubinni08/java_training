package com.ust;

import java.sql.Array;
import java.util.*;

public class CollectionArdraMain {
    public static void main(String[] args) {
        CollectionArdra collection = new CollectionArdra();
        List<String> podMembers = new ArrayList<String>(Arrays.asList("Ardra", "Hemanth", "Anu", "Ritu", "Yeshwanth", "Akash"));
        List<String> list1 = new ArrayList<>(List.of("apple", "mango", "banana", "strawberry", "cherry"));
        List<String> list2 = new ArrayList<>(List.of("mango", "orange", "grapes", "watermelon", "blueberry"));

        collection.doIterateListFor(podMembers);
        collection.doIterateListLambda(podMembers);
        collection.filterNeighbourList(podMembers);

        List<String> list3 = collection.deleteDuplicatesListFor(list1, list2);
        List<String> list4 = collection.deleteDuplicatesListLambda(list1, list2);
        List<String> list5 = collection.deleteDuplicatesListMergeFor(list1, list2);
        List<String> list6 = collection.deleteDuplicatesListMergeLambda(list1, list2);

        Set<String> podMembersSet = new HashSet<>(Arrays.asList("Ardra", "Hemanth", "Anu", "Ritu", "Yeshwanth", "Akash"));
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "mango", "banana", "strawberry", "cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("mango", "orange", "grapes", "watermelon", "blueberry"));

        collection.doIterateHashsetFor(podMembersSet);
        collection.doIterateHashsetLambda(podMembersSet);
        collection.filterNeighbourSetFor(podMembersSet);
        collection.filterNeighbourSetLambda(podMembersSet);

        Set<String> set3 = collection.deleteDuplicatesSetFor1(set1, set2);
        Set<String> set4 = collection.deleteDuplicatesSetFor2(set1, set2);
        Set<String> set5 = collection.deleteDuplicatesSetLambda(set1, set2);

        Map<Integer, String> podMembersMap = new HashMap<>();
        podMembersMap.put(308260, "Ritu");
        podMembersMap.put(308347, "Anu");
        podMembersMap.put(308279, "Hemanth");
        podMembersMap.put(308339, "Ardra");
        podMembersMap.put(308303, "Akash");
        podMembersMap.put(308331, "Yeshwanth");

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

        collection.doIterateMapForKeyset(podMembersMap);
        collection.doIterateMapForEntrySet(podMembersMap);
        collection.doIterateMapLambdaKeyset(podMembersMap);
        collection.doIterateMapLambdaEntryset(podMembersMap);
        collection.filterMemberMapFor(podMembersMap);
        collection.filterMemberMapLambda(podMembersMap);

        Map<Integer, String> map3 = collection.deleteDuplicatesMapFor(map1, map2);
        Map<Integer, String> map4 = collection.deleteDuplicatesMapLambda(map1, map2);
    }
}