package com.ust;

import com.ust.impl.*;

import java.util.ArrayList;
import java.util.List;

public class MainHarshavardhan {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Harsha");
        names.add("Chandra");
        names.add("Pranav");
        names.add("Navneeth");
        names.add("Varsha");
        names.add("Deepa");

        List<String> names2 = new ArrayList<>();
        names2.add("Anjan");
        names2.add("Kushal");
        names2.add("Divya");
        names2.add("Harsha");
        names2.add("Rohan");
        names2.add("Moksha");
        names2.add("Harsha");
        names2.add("Deeksha");


        CollectionsHarsha obj = new CollectionsHarsha();
//        obj.doIteration(names);
//        obj.doIterationByStream(names);
//          obj.igonreNeighbour(names);
//          System.out.println();
//          obj.ignoreNeighbourForLoop(names);
        System.out.println( obj.removeDuplicate2(names,names2));
    }
}
