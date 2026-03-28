package com.ust;

import java.util.*;

public class MainNavya {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("Deepak");
//        list.add("Keerthi");
//        list.add("Navya");
//        list.add("Gokul");
//        list.add("Harsh");
//        list.add("Rohith");
//        List<Integer> l1=new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        List<Integer> l2=new ArrayList<>();
//        l2.add(2);
//        l2.add(5);
//        l2.add(6);
//        l2.add(7);
//
//
//        //CollectionNavya.iterationCollection(list);
//        //CollectionNavya.filterIteration(list);
//        CollectionNavya.mergeWithoutDuplicates(l1,l2);
//SETTTT

//        Set<String> name = new HashSet<>();
//        name.add("Deepak");
//        name.add("Keerthi");
//        name.add("Navya");
//        name.add("Gokul");
//        name.add("Harsh");
//        name.add("Rohith");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(7);
//        CollectionSetNavya.iterationCollection(name);
//        CollectionSetNavya.filterIteration(name);
//        CollectionSetNavya.mergeWithoutDuplicates(set1, set2);
        //CollectionSetNavya.tempDuplicates(set1, set2);


        //mapppp
        Map<String, String> newMap = new HashMap<>();
        newMap.put("1", "navya");
        newMap.put("2", "deepak");
        newMap.put("3", "rohith");
        newMap.put("4", "harhs");
        newMap.put("5", "gokul");
        newMap.put("6", "keerthi");
       // CollectionHashMapNavya.iterationLoop(newMap);
        CollectionHashMapNavya.checkEmployeeById(newMap);
    }
}
