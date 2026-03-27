package com.ust;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionArdraMain {
    public static void main(String[] args) {
        CollectionArdra collection = new CollectionArdra();
        List<String> firstList = new ArrayList<>(List.of("apple", "mango","banana","strawberry","cherry"));
        List<String> secondList = new ArrayList<>(List.of("mango", "orange","grapes","watermelon","blueberry"));
        List<String> finalList = collection.deleteDuplicates(firstList, secondList);
        collection.doIterate(finalList);
        /*
        List<String> podMembers = new List<String>();
        podMembers.add("Ardra");
        podMembers.add("Hemanth");
        podMembers.add("Anu");
        podMembers.add("Ritika");
        podMembers.add("Yeshwanth");
        podMembers.add("Akash");
        collection.filterNeighbour(podMembers);
        collection.doIterate(podMembers);
        collection.doIterateLambda(podMembers);
        */

    }
}
