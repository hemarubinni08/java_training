package com.ust;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLogesh {
    public void loopingNames(List<String> names) {
        System.out.println("\n---Using Array List---");
        System.out.println(" ");
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
    }

    public void filterNeighbour(List<String> names) {
        System.out.println(" ");
        for (String name : names) {
            if (name.contains("Shashi"))
                continue;
            System.out.println(name);
        }
        names.stream().filter(name -> !name.equalsIgnoreCase("Shashi")).forEach(name -> System.out.println(name));
    }

    public void doItration(List<String> names, List<String> names1) {
        List<String> result = new ArrayList<>();
        List<String> mergeList = new ArrayList<>(names);
        mergeList.addAll(names1);
        System.out.println(" ");
        for (String n : names) {
            if (!names1.contains(n)) result.add(n);
        }
        for (String n : names1) {
            if (!names.contains(n)) result.add(n);
        }
        for (String s : result) {
            System.out.println(s);
        }
        mergeList.stream().filter(ml -> !names.contains(ml) || !names1.contains(ml)).forEach(ml -> System.out.println(ml));
    }

    public void getNames(Set<String> memberNames) {
        System.out.println(" ");
        for (String name : memberNames) {
            System.out.println(name);
        }
        memberNames.forEach(name -> System.out.println(name));
    }

    public void filterNeighbourSet(Set<String> memberNames) {
        System.out.println(" ");
        for (String name : memberNames) {
            if (name.contains("Shashi"))
                continue;
            System.out.println(name);
        }
        memberNames.stream().filter(name -> !name.equalsIgnoreCase("Shashi")).forEach(name -> System.out.println(name));
    }

    public void doItrationSet(Set<String> memberNames, Set<String> members1) {
        HashSet<String> result = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();
        System.out.println("\n----USING SET---- ");
        for (String n : memberNames) {
            if (!members1.contains(n)) result.add(n);
            else {
                duplicate.add(n);
            }
        }
        for (String n : members1) {
            if (!memberNames.contains(n)) result.add(n);
            else {
                duplicate.add(n);
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
        result.stream().filter(ms -> !memberNames.contains(ms) || !members1.contains(ms)).forEach(ms -> System.out.println(ms));
    }
}

