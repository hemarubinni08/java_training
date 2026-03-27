package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainNavya {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Deepak");
        list.add("Keerthi");
        list.add("Navya");
        list.add("Gokul");
        list.add("Harsh");
        list.add("Rohith");
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        List<Integer> l2=new ArrayList<>();
        l2.add(2);
        l2.add(5);
        l2.add(6);
        l2.add(7);


        //CollectionNavya.iterationCollection(list);
        //CollectionNavya.filterIteration(list);
        CollectionNavya.mergeWithoutDuplicates(l1,l2);
    }

}
