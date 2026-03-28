package com.ust;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLogesh {
    public void loopingNames(Set<String> names) {
        System.out.println(" ");
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
    }
//    public void filterNeighbour(List<String> names) {
//        for (String name : names) {
//            if (name.contains("Shashi"))
//                continue;
//            System.out.println(name);
//        }
//        names.stream().filter(name -> !name.equalsIgnoreCase("Shashi")).forEach(name -> System.out.println(name));
//    }

//    public void doItration(List<String> names, List<String> names1) {
//
//        List<String> result = new ArrayList<>();
//        List<String> mergeList = new ArrayList<>(names);
//        mergeList.addAll(names1);
//
//        for (String n : names) {
//            if (!names1.contains(n)) result.add(n);
//        }
//        for (String n : names1) {
//            if (!names.contains(n)) result.add(n);
//        }
//        for (String s : result) {
//            System.out.println(s);
//        }
//        System.out.println(" ");
//        // names.stream().filter(name->!names.equals(names1)|| !names1.contains(names1)).forEach(names->System.out.println(names,names1));
//        mergeList.stream().filter(ml -> !names.contains(ml) || !names1.contains(ml)).forEach(ml -> System.out.println(ml));

    public void filterNeighbour(Set<String> names) {
        System.out.println(" ");
        for (String name : names) {
            if (name.contains("Shashi"))
                continue;
            System.out.println(name);
        }
        names.stream().filter(name -> !name.equalsIgnoreCase("Shashi")).forEach(name -> System.out.println(name));
    }

    public void doItration(Set<String> names, Set<String> names1) {
        HashSet<String> result = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();
        for (String n : names) {
            if (!names1.contains(n)) result.add(n);
            else {
                duplicate.add(n);
            }
        }
        for (String n : names1) {
            if (!names.contains(n)) result.add(n);
            else {
                duplicate.add(n);
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
//        mergeSet.forEach(ml -> System.out.println(ml));
//        mergeSet.stream().filter(ms -> !names.contains(ms) || !names1.contains(ms)).forEach(ms -> System.out.println(ms));
    }
}

