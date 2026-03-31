package com.ust;

import java.util.*;

public class MainNavya {
    public static void main(String[] args) {
//LIST
        List<String> list = new ArrayList<>();
        List<Integer> namesList = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        list.add("Deepak");
        list.add("Keerthi");
        list.add("Navya");
        list.add("Gokul");
        list.add("Harsh");
        list.add("Rohith");

        namesList.add(1);
        namesList.add(2);
        namesList.add(3);
        namesList.add(4);
        l2.add(2);
        l2.add(5);
        l2.add(6);
        l2.add(7);

        CollectionListNavya collectionListNavya = new CollectionListNavya();

        collectionListNavya.iterationCollection(list);
        collectionListNavya.filterIteration(list);
        collectionListNavya.mergeWithoutDuplicates(namesList, l2);
//SETTTT

        Set<String> names = new HashSet<>();
        Set<Integer> values1 = new HashSet<>();
        Set<Integer> values2 = new HashSet<>();
        names.add("Deepak");
        names.add("Keerthi");
        names.add("Navya");
        names.add("Gokul");
        names.add("Harsh");
        names.add("Rohith");

        values1.add(2);
        values1.add(3);
        values1.add(4);
        values1.add(5);

        values2.add(2);
        values2.add(3);
        values2.add(6);
        values2.add(7);

        CollectionSetNavya collectionSetNavya = new CollectionSetNavya();

        collectionSetNavya.iterationCollectionSet(names);
        collectionSetNavya.filterIterationByName(names);
        collectionSetNavya.mergeWithoutDuplicates(values1, values2);
        collectionSetNavya.tempDuplicates(values1, values2);
//MAPP
        Map<String, String> newMap1 = new HashMap<>();
        Map<String, String> newMap2 = new HashMap<>();
        newMap1.put("1", "navya");
        newMap1.put("2", "deepak");
        newMap1.put("3", "rohith");
        newMap1.put("4", "harhs");
        newMap1.put("5", "gokul");
        newMap1.put("6", "keerthi");

        newMap2.put("1", "navya");
        newMap2.put("7", "rajanna");
        newMap2.put("8", "saritha");
        newMap2.put("9", "nandini");
        newMap2.put("10", "varsha");

        CollectionHashMapNavya collectionHashMapNavya = new CollectionHashMapNavya();

        collectionHashMapNavya.iterationCollectionMap(newMap1);
        collectionHashMapNavya.checkEmployeeById(newMap1);
        collectionHashMapNavya.removeDuplicatesAndMergeNavya(newMap1, newMap2);
        CollectionHashMapNavya.doIteration2MapsNavya(newMap1, newMap2);
    }
}
