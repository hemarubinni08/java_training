package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainNavaneeth {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Chandu");
        names.add("Varsha");
        names.add("Deepa");
        names.add("Harsha");
        names.add("Pranav");
        names.add("Navaneeth");

        List<String> names1 = new ArrayList<>();
        names1.add("Vishal");
        names1.add("Hema");
        names1.add("Yash");
        names1.add("Mallik");
        names1.add("Ram");
        names1.add("Pranav");

        Set<String> set1 = new HashSet<>();
        set1.add("Chandu");
        set1.add("Varsha");
        set1.add("Deepa");
        set1.add("Harsha");
        set1.add("Pranav");
        set1.add("Navaneeth");

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("3");
        set2.add("4");
        set2.add("5");
        set2.add("Navaneeth");

        Map<Integer, String> members = new HashMap<>();
        members.put(1, "Chandu");
        members.put(2, "Varsha");
        members.put(3, "Deepa");
        members.put(4, "Harsha");
        members.put(5, "Pranav");
        members.put(6, "Navaneeth");

//        Map<Integer,String> members1 = new HashMap<>();
//        members1.put(6, "Navaneeth");
//        members1.put(7,"vishal");
//        members1.put(8,"mallik");

        CollectionNavaneeth cn = new CollectionNavaneeth();
////        cn.skipDuplicates(names,names1);
////        cn.setIteration(set1, set2);
//        System.out.println(cn.setIteration(set1,set2));
//        System.out.println(cn.removeMe(members));
//        System.out.println(cn.removeSpecificUsingStreamMethod(members));
//        cn.removeSpecificUsingStreamMethodUsingFilter(members);
        System.out.println(cn.removeSpecificUsingToMap(members));
    }

}
