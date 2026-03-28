package com.ust;

import java.sql.SQLOutput;
import java.util.*;

public class MainDeepshika {
    public static void main(String[] args) {
//        System.out.println("The product of two numbers are:" +productOfTwoNumbers(5,10));
//
//   public static int productOfTwoNumbers(int a,int b){
//       return a*b;}
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
        names2.add("parneesh");
        names2.add("visagan");
        names2.add("Deepak");

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

        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(308341, "Deepshika");
        mapNames.put(308335, "Mamatha");
        mapNames.put(308331, "Chris");
        mapNames.put(308242, "Nagarajan");
        mapNames.put(308335, "Aishu");
        mapNames.put(308336, "Bewin");

        CollectionsDeepshika pod2 = new CollectionsDeepshika();
        pod2.iteration(names);
        System.out.println();

        pod2.printNames(names);
        System.out.println();

        System.out.println(pod2.compareNames(names, names2));
        System.out.println();


        pod2.removeDuplicateUsingForEach(names, names2);
        System.out.println();

        pod2.removeDuplicateSingleLoop(names, names2);
        //  pod2.hashIteration(hashNames, hashNames1);
        System.out.println();
        pod2.hashRemove(hashNames, hashNames1);
        System.out.println();
        pod2.removeDuplicateUsingLamda(hashNames, hashNames1);
        pod2.toPrintMapNames(mapNames);
        System.out.println();
        pod2.toPrintMapNamesKeySet(mapNames);
        System.out.println();
        pod2.toCheckWithKey(mapNames);
        System.out.println();
        pod2.toCheckWithKeyRemove(mapNames);
        System.out.println();
        pod2.toRemoveKeyUsingLamda(mapNames);
    }
}