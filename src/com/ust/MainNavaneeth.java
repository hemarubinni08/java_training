package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainNavaneeth {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Chandu");
        names.add("Varsha");
        names.add("Deepa");
        names.add("Harsha");
        names.add("Pranav");
        names.add("Navaneeth");

        List<String> names1 = new ArrayList<>();
        names1.add("Vishal");
        names1.add("Hema");
        names1.add("Yash");
        names1.add("Mallik");
        names1.add("Ram");
        names1.add("Pranav");

        Set<String> employeeSet1 = new HashSet<>();
        employeeSet1.add("Chandu");
        employeeSet1.add("Varsha");
        employeeSet1.add("Deepa");
        employeeSet1.add("Harsha");
        employeeSet1.add("Pranav");
        employeeSet1.add("Navaneeth");

        Set<String> employeeSet2 = new HashSet<>();
        employeeSet2.add("1");
        employeeSet2.add("2");
        employeeSet2.add("3");
        employeeSet2.add("4");
        employeeSet2.add("5");
        employeeSet2.add("Navaneeth");

        Map<Integer, String> members = new HashMap<>();
        members.put(1, "Chandu");
        members.put(2, "Varsha");
        members.put(3, "Deepa");
        members.put(4, "Harsha");
        members.put(5, "Pranav");
        members.put(6, "Navaneeth");

        Map<Integer, String> members1 = new HashMap<>();
        members1.put(6, "Navaneeth");
        members1.put(7, "vishal");
        members1.put(8, "mallik");

        CollectionNavaneeth cn = new CollectionNavaneeth();
        cn.skipNeighbour(names);
        cn.iteration(names);
        cn.skipDuplicates(names, names1);
        cn.combinedListLambda(names, names1);

        cn.setIteration(employeeSet1, employeeSet2);
        System.out.println(cn.setIteration(employeeSet1, employeeSet2));
        System.out.println(cn.findDuplicatesInSet(employeeSet1, employeeSet2));
        System.out.println(cn.combinedDuplicatesSet(employeeSet1, employeeSet2));

        cn.hashMap(members);
        System.out.println(cn.removeMe(members));
        System.out.println(cn.removeSpecificUsingStreamMethod(members));

        cn.removeSpecificUsingStreamMethodUsingFilter(members);
        System.out.println(cn.removeSpecificUsingToMap(members));

        cn.removeDuplicatesUsingStreamMap(members, members1);
        System.out.println(cn.removeDuplicatesUsingMap(members, members1));
        System.out.println(cn.removeDuplicatesUsingMap(members, members1));
        System.out.println(cn.removeDuplicatesCombineUsingForLoopMap(members, members1));
        System.out.println(cn.removeDuplicatesCombineUsingStreamMap(members, members1));
    }
}
