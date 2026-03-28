package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainLogesh {
    public static void main(String[] args) {
        Map<String, String> podMember = new HashMap<>();
        podMember.put("1", "logesh");
        podMember.put("2", "shashi");
        podMember.put("3", "Aron");
        podMember.put("4", "chaila");
        podMember.put("5", "Lekhya");
        CollectionLogesh1 printname = new CollectionLogesh1();
        printname.removeOwn(podMember);

//        List<String> names = new ArrayList<>();
//        names.add("Logesh");
//        names.add("Shashi");
//        names.add("Aron");
//        names.add("Lekhya");
//        names.add("Chaila");
//        CollectionLogesh collection = new CollectionLogesh();
////        collection.filterNeighbour(names);
//        List<String> names1 = new ArrayList<>();
//        names1.add("Logesh");
//        names1.add("Nagarajan");
//        names1.add("Virat");
//        names1.add("Ronaldo");
//        names1.add("Rohit");
//        names1.add("Vijay");
//        collection.doItration(names, names1);

//        HashSet<String> names = new HashSet<>();
//        names.add("Logesh");
//        names.add("Shashi");
//        names.add("Aron");
//        names.add("Lekhya");
//        names.add("Chaila");
//
//        HashSet<String> names1 = new HashSet<>();
//        names1.add("Logesh");
//        names1.add("Nagarajan");
//        names1.add("Virat");
//        names1.add("Ronaldo");
//        names1.add("Rohit");
//        CollectionLogesh collection = new CollectionLogesh();
//        collection.doItration(names, names1);
//        collection.filterNeighbour(names);
//        collection.loopingNames(names);
    }
}
