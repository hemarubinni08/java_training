package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionMainRohit {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Rohit");
        l1.add("Harsh");
        l1.add("Keerthi");
        l1.add("Navya");
        l1.add("Deepak");
        l1.add("Gokul");
        CollectionRohit C = new CollectionRohit();

        List<String> l2 = new ArrayList<>();
        l2.add("Sreelekshmi");
        l2.add("Gokul");
        l2.add("Pranav");
        l2.add("Chris");

        C.printValues(l1);
        C.removeNeighbour(l1);
        C.combinedList(l1, l2);
        C.combinedListUsingHashSet(l1, l2);
        C.combinedHashSetForLoop(l1, l2);
        C.hashSetLambda(l1,l2);

    }

}

