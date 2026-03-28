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
//        obj.doIteration(names);
//        obj.doIterationByStream(names);
//        obj.igonreNeighbour(names);
//        System.out.println();
//        obj.ignoreNeighbourForLoop(names);
//        System.out.println( obj.removeDuplicate6(names,names2));

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

       // System.out.println(obj.removeDuplicateInSetByCombine2(nameSet1,nameSet2));

        Map<String,String> newMap = new HashMap<>();
        newMap.put("308227","Harshavardhan");
        newMap.put("898766","Pranav");
        newMap.put("454656","Deepa");
        newMap.put("456366","Varsha");
        newMap.put("234256","Navneeth");
        newMap.put("234553","Chandra");
        obj.StreamMap(newMap);

//        System.out.println(obj.findOtherPodMembersNotincludeMe3(newMap));

    }
}
