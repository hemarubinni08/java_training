package com.ust.impl;

import java.util.ArrayList;

public class CollectionsDeepakMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Deepak");
        list.add("Navya");
        list.add("Gokul");
        list.add("Rohit");
        list.add("Harsh");
        list.add("Keerthi");

        CollectionsDeepak.iterationCollections(list);
    }
}