package com.ust;

import java.util.*;
import java.util.ArrayList;

public class MainRitika {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.put("101", "Ritu");
        map1.put("102", "Yesh");
        map1.put("103", "Anu");
        map1.put("104", "Hemanta");
        map1.put("105", "Ardra");
        map1.put("106", "Akash");

        map2.put("106", "Akash");
        map2.put("202", "Piyush");
        map2.put("203", "Mansi");
        map2.put("204", "Ayushi");
        map2.put("205", "Shreya");
        map2.put("206", "Ritika");

        CollectionRitika collectionRitika = new CollectionRitika();
        collectionRitika.duplicateLambdaMapRitu(map1, map2);

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Kanha");
        set1.add("Shreya");
        set1.add("Piyush");
        set1.add("Rishav");
        set1.add("Mansi");
        set1.add("Anu");
        set1.add("Hemath");

        set2.add("Yesh");
        set2.add("Anu");
        set2.add("Akash");
        set2.add("Ritu");
        set2.add("Hemath");
        set2.add("Ardra");

        CollectionRitika collectionRitika1 = new CollectionRitika();
        System.out.println(collectionRitika1.deleteDuplicateSet(set1, set2));

        // LIST
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Ritu");
        list1.add("Anu");
        list1.add("Hemanth");
        list1.add("Yesh");
        list1.add("Ardra");
        list1.add("Akash");

        list2.add("Kushal");
        list2.add("Harsh");
        list2.add("Chandra");
        list2.add("Harsita");
        list2.add("Mansi");
        list2.add("Akash");

        CollectionRitika collectionRitika2 = new CollectionRitika();
        System.out.print(collectionRitika2.removeCommon(list1, list2));
    }
}