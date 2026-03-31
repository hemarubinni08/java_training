package com.ust;

import java.util.*;

public class MainHarshavardhan {
    public static void main(String[] args) {

        List<String> namesList1 = new ArrayList<>();
        namesList1.add("Harsha");
        namesList1.add("Chandra");
        namesList1.add("Pranav");
        namesList1.add("Navneeth");
        namesList1.add("Varsha");
        namesList1.add("Deepa");
        namesList1.add("Rohan");

        List<String> namesList2 = new ArrayList<>();
        namesList2.add("Anjan");
        namesList2.add("Kushal");
        namesList2.add("Divya");
        namesList2.add("Harsha");
        namesList2.add("Rohan");
        namesList2.add("Moksha");
        namesList2.add("Harsha");
        namesList2.add("Deeksha");

        CollectionsHarsha obj = new CollectionsHarsha();

        Set<String> nameSet1 = new HashSet<>();
        nameSet1.add("Anjan");
        nameSet1.add("Kushal");
        nameSet1.add("Divya");
        nameSet1.add("Harsha");
        nameSet1.add("Rohan");
        nameSet1.add("Moksha");
        nameSet1.add("Harsha");
        nameSet1.add("Deeksha");

        Set<String> nameSet2 = new HashSet<>();
        nameSet2.add("Harsha");
        nameSet2.add("Chandra");
        nameSet2.add("Pranav");
        nameSet2.add("Navneeth");
        nameSet2.add("Varsha");
        nameSet2.add("Deepa");
        nameSet2.add("Rohan");

        Map<String, String> newMap = new HashMap<>();
        newMap.put("308227", "Harshavardhan");
        newMap.put("898766", "Pranav");
        newMap.put("454656", "Deepa");
        newMap.put("456366", "Varsha");
        newMap.put("234256", "Navneeth");
        newMap.put("234553", "Chandra");

        Map<String, String> newMap2 = new HashMap<>();
        newMap2.put("308227", "Harshavardhan");
        newMap2.put("897365", "Pushpa");
        newMap2.put("874565", "Rohith");
        newMap2.put("761556", "Sandesh");
        newMap2.put("764451", "Veenitha");
        newMap2.put("365783", "Sanvi");
        newMap2.put("234553", "Chandra");

//      Calling List Methods
        obj.doIteration(namesList1);
        obj.doIterationByStream(namesList1);
        obj.igonreNeighbour(namesList1);
        obj.ignoreNeighbourForLoop(namesList1);
        System.out.println(obj.removeDuplicateByTwoLoop(namesList1, namesList2));
        System.out.println(obj.removeDuplicateByContainsMethod(namesList1, namesList2));
        System.out.println(obj.removeDuplicateByContainsMethod(namesList1, namesList2));
        System.out.println(obj.removeDuplicateByStreamMethods(namesList1, namesList2));
        System.out.println(obj.removeDuplicateByStreamConcat(namesList1, namesList2));
        System.out.println(obj.removeDuplicateByCombiningLists(namesList1, namesList2));

//      Calling Set Methods
        obj.GetElementsFromSetLoop(nameSet1);
        System.out.println(obj.removeDuplicateInSet(nameSet1, nameSet2));
        System.out.println(obj.removeDuplicateInSetByStream(nameSet1, nameSet2));
        System.out.println(obj.removeDuplicateInSetByCombine(nameSet1, nameSet2));
        System.out.println(obj.removeDuplicateInSetOnlyByStream(nameSet1, nameSet2));
        System.out.println(obj.removeDuplicateInSetOnlyByStream(nameSet1, nameSet2));

//      Calling Map Methods
        obj.displayMapKeyValuesUsingEntrySet(newMap);
        obj.displayMapKeyValuesUsingKeySet(newMap);
        obj.displayMapKeyValuesUsingForEach(newMap);
        obj.findOtherPodMembersNotIncludeMeUsingEntrySet(newMap);
        obj.findOtherPodMembersNotIncludeMeUsingKeySet(newMap);
        System.out.println(obj.findOtherPodMembersNotIncludeMeUsingRemove(newMap));
        obj.StreamMap(newMap);
        System.out.println(obj.removeDuplicateFromMap(newMap, newMap2));
        System.out.println(obj.removeDuplicateFromMapByStream(newMap, newMap2));
        System.out.println(obj.removeDuplicateWithDuplicateMapUsingForLoop(newMap, newMap2));
        System.out.println(obj.removeDuplicateWithDuplicateMapUsingStream(newMap, newMap2));
    }
}
