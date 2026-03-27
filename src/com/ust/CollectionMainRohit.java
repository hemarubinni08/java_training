package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionMainRohit {
    public static void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("Rohit");
        names.add("Harsh");
        names.add("Keerthi");
        names.add("Navya");
        names.add("Deepak");
        names.add("Gokul");
        CollectionRohit C=new CollectionRohit();

        List<String> names1=new ArrayList<>();
        names1.add("Sreelekshmi");
        names1.add("Gokul");
        names1.add("Pranav");
        names1.add("Chris");

        C.printValues(names);
        C.removeNeighbour(names);
        C.combinedList(names,names1);

    }

}

