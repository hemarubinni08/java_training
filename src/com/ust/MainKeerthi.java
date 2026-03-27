package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainKeerthi {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("keerthi");
        names.add("navya");
        names.add("deepak");
        names.add("gokul");
        names.add("harsh");
        names.add("rohit");
        List<String> sree = new ArrayList<>();
        sree.add("keerthi");
        sree.add("anu");
        sree.add("lekya");
        sree.add("lali");
        sree.add("jp");
        sree.add("kush");
        CollectionKv obj = new CollectionKv();
        List<String> result = obj.getNonDuplicate(names, sree);
        obj.collectionIterations(result);

        //CollectionKv.collectionIterations(names);
        //CollectionKv.collectionIteration(names);
        //CollectionKv.listIteration(sree);


    }
}