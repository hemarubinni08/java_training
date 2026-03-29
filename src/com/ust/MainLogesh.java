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
        printname.podName(podMember);
        printname.removeOwn(podMember);

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
        collection.filterNeighbour(names);
        collection.doItration(names, names1);

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
        collection1.doItrationSet(memberNames, members1);
        collection1.filterNeighbourSet(memberNames);
        collection1.getNames(memberNames);
    }
}
