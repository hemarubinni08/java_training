package com.ust.impl;

import java.util.ArrayList;

public class CollectionsDeepakMain {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Deepak");
//        list.add("Navya");
//        list.add("Gokul");
//        list.add("Rohit");
//        list.add("Harsh");
//        list.add("Keerthi");....


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        CollectionsDeepak.iterationCollections(list1, list2);

    }
}