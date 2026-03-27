package com.ust;

import java.util.List;

public class CollectionNavya {
    //public static void iterationCollection(List<String> list) {
        //for (String name : list) {
            //System.out.println(name);
        //}
    //}

    public static void filterIteration(List<String> list) {
        for (String name : list) {
            if (!name.equals("Keerthi")) {
                System.out.println(name);
            }
        }


    }
}