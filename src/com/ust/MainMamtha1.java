package com.ust;

import java.util.*;

public class MainMamtha1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mamatha");
        names.add("Deepshi");
        names.add("Nagarajan");
        names.add("CJ");
        names.add("Aishu");
        names.add("Bew");

        List<String> names1 = new ArrayList<>();
        names1.add("hema");
        names1.add("nadhi");
        names1.add("deepak");
        names1.add("CJ");
        names1.add("Praneesh");
        names1.add("Visagan");

        CollectionsMamtha collectionsMamtha = new CollectionsMamtha();
        collectionsMamtha.toPrintPod2Names(names);
        System.out.println();
        collectionsMamtha.toPrintExceptDeepshika(names);
        System.out.println();
        System.out.println(collectionsMamtha.toRemoveDuplicatesFromLists(names, names1));
        System.out.println();
        collectionsMamtha.toRemoveDuplicateUsingSingleForLoop(names, names1);
        System.out.println();

        HashSet<String> hNames = new HashSet<>();
        hNames.add("Mamtha");
        hNames.add("Deepshi");
        hNames.add("Nagarajn");
        hNames.add("cj");
        hNames.add("aishu");
        hNames.add("bew");

        Set<String> hNames1 = new HashSet<>();
        hNames1.add("hema");
        hNames1.add("nadhi");
        hNames1.add("deepak");
        hNames1.add("cj");
        hNames1.add("Praneesh");
        hNames1.add("Visagan");

        collectionsMamtha.toIterateSet(hNames);
        System.out.println();
        collectionsMamtha.toRemoveDuplicateFromSets(hNames, hNames1);
        System.out.println();
        collectionsMamtha.toRemoveDuplicateUsingLambdaEx(hNames, hNames1);
        System.out.println();

        Map<String, String> mapNames = new HashMap<>();
        mapNames.put("308335", "Mamatha");
        mapNames.put("308341", "Deepshi");
        mapNames.put("308334", "Nagarajan");
        mapNames.put("308333", "cj");
        mapNames.put("308342", "aishu");
        mapNames.put("308343", "bew");

        Map<String, String> mapNames1 = new HashMap<>();
        mapNames1.put("308123", "hema");
        mapNames1.put("308124", "nadhi");
        mapNames1.put("308125", "deepak");
        mapNames1.put("308126", "praneesh");
        mapNames1.put("308342", "aishu");
        mapNames1.put("308127", "visagan");

        collectionsMamtha.toPrintingMap(mapNames);
        System.out.println();
        collectionsMamtha.printExceptMamthaMap(mapNames);
        System.out.println();
        collectionsMamtha.printExceptMyEmployeeId(mapNames);
        System.out.println();
        collectionsMamtha.toRemoveKeyUsingLambda(mapNames);
        System.out.println();
        collectionsMamtha.toRemoveDuplicateMap(mapNames, mapNames1);
        System.out.println();
        collectionsMamtha.toRemoveDuplicateFromTwoMapsLambdaEx(mapNames, mapNames1);


    }


}

