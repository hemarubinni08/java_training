package com.ust;

import java.util.*;

import com.ust.impl.CollectionHemanth;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();
        names.add("Hemanth");
        names.add("Yesh");
        names.add("Ardra");
        names.add("Ritu");
        names.add("Anu");
        names.add("Akash");

        names1.add("Hemanth");
        names1.add("Yes");
        names1.add("Ardr");
        names1.add("Rit");
        names1.add("An");
        names1.add("Akas");
        CollectionHemanth collectionHemanth = new CollectionHemanth();
        collectionHemanth.doIterate(names);
        collectionHemanth.duplicateElements(names, names1);
        collectionHemanth.eliminateNeighbour(names, names1);

        Set<String> namesSet = new HashSet<>();
        Set<String> namesSet1 = new HashSet<>();
        namesSet.add("Hemanth");
        namesSet.add("Yesh");
        namesSet.add("Ardra");
        namesSet.add("Ritu");
        namesSet.add("Anu");
        namesSet.add("Akash");

        namesSet1.add("Hemanth");
        namesSet1.add("Yes");
        namesSet1.add("Ardr");
        namesSet1.add("Rit");
        namesSet1.add("An");
        namesSet1.add("Akas");
        System.out.print(collectionHemanth.setDuplicateElements(namesSet, namesSet1));

        Map<String, String> newMap = new HashMap<>();
        Map<String, String> newMap1 = new HashMap<>();
        newMap.put("1", "Hemanth");
        newMap.put("2", "Yesh");
        newMap.put("3", "Ardra");
        newMap.put("4", "Ritu");
        newMap.put("5", "Anu");
        newMap.put("6", "Akash");

        newMap1.put("7", "Hemant");
        newMap1.put("8", "Yes");
        newMap1.put("9", "Ardr");
        newMap1.put("10", "Ritu");
        newMap1.put("5", "Anu");
        newMap1.put("6", "Akash");
        CollectionHemanthMap printBatch = new CollectionHemanthMap();
        printBatch.printMap(newMap, newMap1);
        printBatch.removeDuplicateMap(newMap, newMap1);

        List<String> namesList = new ArrayList<>();
        namesList.add("Hemanth");
        namesList.add("Yesh");
        namesList.add("Ardra");
        namesList.add("Ritu");
        namesList.add("Anu");
        namesList.add("Akash");
        AlphabeticalOrderHemanth alphabeticalOrderHemanth = new AlphabeticalOrderHemanth();
        System.out.println(alphabeticalOrderHemanth.alphabetOrder(namesList));
    }
}