package com.ust;

import java.util.*;

public class MainGokulHashSet {
    public static void main(String[] args) {

        ArrayList<String> num1 = new ArrayList<>();
        num1.add("gokul");
        num1.add("harsh");
        num1.add("rohit");
        num1.add("navya");
        num1.add("keerthi");
        num1.add("deepak");

        ArrayList<String> num2 = new ArrayList<>();
        num2.add("raina");
        num2.add("virat");
        num2.add("dhoni");
        num2.add("gokul");
        num2.add("bravo");

        GokulCollection list=new  GokulCollection();
        list.displayNames(num1, num2);

        Set<String> names1 = new HashSet<>();
        names1.add("gokul");
        names1.add("harsh");
        names1.add("rohit");
        names1.add("navya");
        names1.add("keerthi");
        names1.add("deepak");

        Set<String> names2 = new HashSet<>();
        names2.add("raina");
        names2.add("virat");
        names2.add("dhoni");
        names2.add("gokul");
        names2.add("bravo");

        GokulCollectionHashSet set=new GokulCollectionHashSet();
        set.displayNames(names1,names2);

        Map<Integer, String> Map = new HashMap<>();
        Map.put(308342, "navya");
        Map.put(308330, "deepak");
        Map.put(308344, "keerthi");
        Map.put(308346, "gokul");
        Map.put(308352, "harsh");
        Map.put(308237, "rohit");

        GokulCollectionMap map=new GokulCollectionMap();
        map.Names(Map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(308342, "navya");
        map1.put(308330, "deepak");
        map1.put(308344, "keerthi");
        map1.put(308346, "gokul");
        map1.put(308352, "harsh");
        map1.put(308237, "rohit");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(308301, "dhoni");
        map2.put(308302, "virat");
        map2.put(308303, "jaddu");
        map2.put(308346, "gokul");
        map2.put(308304, "raina");
        map2.put(308305, "gayle");

        GokulMergeMap merge=new  GokulMergeMap();
        merge.Names(map1, map2);
    }
}
