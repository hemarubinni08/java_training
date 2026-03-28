package com.ust;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.ust.GokulCollectionHashSet.*;

public class MainGokulHashSet {
    public static void main(String[] args) {
//        Set<String> names1 = new HashSet<>();
        Map<Integer, String> Map = new HashMap<>();
        Map.put(308342,"navya");
        Map.put(308330,"deepak");
        Map.put(308344,"keerthi");
        Map.put(308346,"gokul");
        Map.put(308352,"harsh");
        Map.put(308237,"rohit");







//        names1.add("gokul");
//        names1.add("harsh");
//        names1.add("rohit");
//        names1.add("navya");
//        names1.add("keerthi");
//        names1.add("deepak");
//
//        Set<String> names2 = new HashSet<>();
//        names2.add("raina");
//        names2.add("virat");
//        names2.add("dhoni");
//        names2.add("gokul");
//        names2.add("bravo");
//
//        GokulCollectionHashSet.displayNames(names1, names2);
        GokulCollectionMap.Names(Map);
    }
}
