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

        CollectionsMamtha pod2 = new CollectionsMamtha();
        pod2.printPod2Names(names);
        System.out.println();
        pod2.printExceptDeepshika(names);
        System.out.println();
        System.out.println(pod2.compareTwoLists(names, names1));
        System.out.println();
        pod2.removeDuplicate(names, names1);
        System.out.println();
        pod2.hashSetNames(hNames, hNames1);
        System.out.println();
        pod2.removeDuplicate(hNames, hNames1);
        System.out.println();
//          pod2.compareTwoLists(names,names1);

        Map<String, String> mapNames = new HashMap<>();
        mapNames.put("308335", "Mamatha");
        mapNames.put("308341", "Deepshi");
        mapNames.put("308334", "Nagarajan");
        mapNames.put("308333", "cj");
        mapNames.put("308342", "aishu");
        mapNames.put("308343", "bew");

        pod2.toRemoveKeyUsingLambda(mapNames);
        System.out.println();

        pod2.printingMap(mapNames);
        System.out.println();
        pod2.printExceptMamthaMap(mapNames);
        System.out.println();
        pod2.printExceptMyEmployeeId(mapNames);
        System.out.println();
//        pod2.toRemoveKeyUsingLambda(mapNames);


    }


}

