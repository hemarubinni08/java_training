package com.ust;

import java.sql.SQLOutput;
import java.util.*;

public class MainDeepshika {
    public static void main(String[] args) {
//        System.out.println("The product of two numbers are:" + productOfTwoNumbers(5, 10));
//
//        public static int productOfTwoNumbers ( int a, int b){
//            return a * b;
//        }
        List<String> names = new ArrayList<>();
        names.add("Deepshika");
        names.add("Mamatha");
        names.add("Nagarajan");
        names.add("Bewin");
        names.add("chris");
        names.add("aishu");

        List<String> names2 = new ArrayList<>();
        names2.add("Deepshika");
        names2.add("Hema");
        names2.add("NathiPriya");
        names2.add("praneesh");
        names2.add("visagan");
        names2.add("Deepak");

        CollectionsDeepshika collectionsDeepshika = new CollectionsDeepshika();
        collectionsDeepshika.iteration(names);
        System.out.println();
        collectionsDeepshika.printNames(names);
        System.out.println();
        System.out.println(collectionsDeepshika.toRemoveDuplicateUsingLoop(names, names2));
        System.out.println();
        collectionsDeepshika.removeDuplicateUsingForEach(names, names2);
        System.out.println();
        collectionsDeepshika.removeDuplicateUsingSingleLoop(names, names2);

        HashSet<String> hashNames = new HashSet<>();
        hashNames.add("Deepshika");
        hashNames.add("hema");
        hashNames.add("visagan");
        hashNames.add("Mamtha");

        HashSet<String> hashNames1 = new HashSet<>();
        hashNames1.add("hema");
        hashNames1.add("nagarajan");
        hashNames1.add("priya");
        hashNames1.add("praneesh");

        collectionsDeepshika.hashIteration(hashNames, hashNames1);
        System.out.println();
        collectionsDeepshika.hashRemoveDuplicateUsingLoop(hashNames, hashNames1);
        System.out.println();
        collectionsDeepshika.hashRemoveDuplicateUsingLambda(hashNames, hashNames1);
        System.out.println();

        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(308341, "Deepshika");
        mapNames.put(308335, "Mamatha");
        mapNames.put(308331, "Chris");
        mapNames.put(308242, "Nagarajan");
        mapNames.put(308335, "Aishu");
        mapNames.put(308336, "Bewin");

        Map<Integer,String> mapNames1 = new HashMap<>();
        mapNames1.put(330822,"Hema");
        mapNames1.put(308341,"Deepshika");
        mapNames1.put(308263,"nathipriya");
        mapNames1.put(308273,"Bhavana");

        collectionsDeepshika.toPrintMapNames(mapNames);
        System.out.println();
        collectionsDeepshika.toPrintMapNamesKeySet(mapNames);
        System.out.println();
        collectionsDeepshika.toRemoveWithKeyUsingCondition(mapNames);
        System.out.println();
        collectionsDeepshika.toRemoveWithKey(mapNames);
        System.out.println();
        collectionsDeepshika.toRemoveKeyUsingLambda(mapNames);
        System.out.println();
        collectionsDeepshika.toRemoveDuplicateMap(mapNames, mapNames1);
        System.out.println();
        collectionsDeepshika.toRemoveDuplicateMapSingleLoop(mapNames, mapNames1);
        System.out.println();
        collectionsDeepshika.toRemoveDuplicateMapUsingLambda(mapNames, mapNames1);
        System.out.println();

        List<String> lnames = new ArrayList<>();
        lnames.add("Deepshika");
        lnames.add("Mamatha");
        lnames.add("Nagarajan");
        lnames.add("Chris");
        lnames.add("Aishu");
        lnames.add("Bewin");
        lnames.add("Deepak");
        lnames.add("Hema");
        lnames.add("visagan");

        collectionsDeepshika.toSortNames(lnames);

    }
}