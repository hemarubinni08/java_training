package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainLogesh {
    public static void main(String[] args) {
        Map<String, String> podMembers = new HashMap<>();
        podMembers.put("1", "Logesh");
        podMembers.put("2", "shashi");
        podMembers.put("3", "Aron");
        podMembers.put("4", "chaila");
        podMembers.put("5", "Lekhya");

        Map<String, String> podMembers1 = new HashMap<>();
        podMembers1.put("6", "Logesh");
        podMembers1.put("5", "Vijay");
        podMembers1.put("8", "Rohit");
        podMembers1.put("9", "rgff");
        podMembers1.put("10", "Lekhvbvya");

        CollectionLogesh1 printname = new CollectionLogesh1();
        printname.findDuplicates(podMembers, podMembers1);
        printname.podName(podMembers);
        printname.removeOwn(podMembers);

        List<String> names = new ArrayList<>();
        names.add("Logesh");
        names.add("Shashi");
        names.add("Aron");
        names.add("Lekhya");
        names.add("Chaila");

        List<String> names1 = new ArrayList<>();
        names1.add("Logesh");
        names1.add("Nagarajan");
        names1.add("Virat");
        names1.add("Ronaldo");
        names1.add("Rohit");
        names1.add("Vijay");

        CollectionLogesh collection = new CollectionLogesh();
        collection.loopingNames(names);
        collection.sortedList(names);
        collection.filterNeighbour(names);
        collection.findDuplicatesList(names, names1);

        HashSet<String> memberNames = new HashSet<>();
        memberNames.add("Logesh");
        memberNames.add("Shashi");
        memberNames.add("Aron");
        memberNames.add("Lekhya");
        memberNames.add("Chaila");

        HashSet<String> members1 = new HashSet<>();
        members1.add("Logesh");
        members1.add("Nagarajan");
        members1.add("Virat");
        members1.add("Ronaldo");
        members1.add("Rohit");

        CollectionLogesh collection1 = new CollectionLogesh();
        collection1.findDuplicateSet(memberNames, members1);
        collection1.filterNeighbourSet(memberNames);
        collection1.getNames(memberNames);
    }
}