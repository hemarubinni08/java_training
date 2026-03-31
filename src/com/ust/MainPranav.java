package com.ust;

import java.util.*;

public class MainPranav {
    public static void main(String[] args) {

        //1st List Creation
        List<String> employees1 = new ArrayList<>();
        employees1.add("Pranav");
        employees1.add("Harsha");
        employees1.add("Chandu");
        employees1.add("Navaneeth");
        employees1.add("Varsha");
        employees1.add("Deepa");

        //2nd List creation
        List<String> employees2 = new ArrayList<>();
        employees2.add("Pranav");
        employees2.add("manu");
        employees2.add("kris");
        employees2.add("hari");
        employees2.add("ram");
        employees2.add("gopal");
        employees2.add("john");

        //1st Set creation
        Set<Integer> numSet1 = new HashSet<>();
        numSet1.add(5);
        numSet1.add(2);
        numSet1.add(3);
        numSet1.add(7);

        //2nd Set creation
        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(1);
        numSet2.add(4);
        numSet2.add(5);
        numSet2.add(9);

        //1st Map creation
        Map<String, String> employeesMap1 = new HashMap<>();
        employeesMap1.put("308257", "Pranav");
        employeesMap1.put("308256", "Harsha");
        employeesMap1.put("308255", "Chandra");
        employeesMap1.put("308254", "Navaneeth");
        employeesMap1.put("308253", "Varsha");
        employeesMap1.put("308252", "Deepa");

        //2nd Map creation
        Map<String, String> employeesMap2 = new HashMap<>();
        employeesMap2.put("308257", "Pranav");
        employeesMap2.put("308249", "Rohit");
        employeesMap2.put("308245", "lokah");
        employeesMap2.put("308244", "loki");
        employeesMap2.put("308243", "krishna");
        employeesMap2.put("308242", "hari");

        //object creation of CollectionOperationJavaPranav class
        CollectionsOperationJavaPranav cp = new CollectionsOperationJavaPranav();

        //Calling List Methods
        cp.printUsingCombinedForIteration(employees1);
        cp.printUsingForLoopIteration(employees1);
        cp.printUsingforEachIteration(employees1);
        cp.printUsingStreamForEachIteration(employees1);
        cp.removeDuplicateUsingList(employees1, employees2);
        cp.removeSpecificElementUsingFilter(employeesMap1);
        cp.printUsingMapIteration(employeesMap1);
        cp.removeDuplicateUsingCombinedStreamHashMap(employeesMap1, employeesMap2);
        cp.removeSpecificElementInMap(employeesMap1);
        cp.printUsingStreamIteration(employees1);

        //Calling Set Methods
        cp.printUsingSetIteration(numSet1, numSet2);
        cp.removeDuplicatesInSet(numSet1, numSet2);

        //Calling Map methods
        cp.removeSpecificElementInMap(employeesMap1);
        cp.printUsingMapIteration(employeesMap1);
        cp.removeSpecificElementUsingFilter(employeesMap1);
        System.out.println(cp.removeDuplicatesUsingStreamHashMap(employeesMap1, employeesMap2));
        System.out.println(cp.removeSpecificElementUsingMethod(employeesMap1));
        System.out.println(cp.removeDuplicateUsingMap(employeesMap1, employeesMap2));
        System.out.println(cp.removeDuplicateUsingCombinedForLoopMap(employeesMap1, employeesMap2));
        System.out.println(cp.removeDuplicateUsingCombinedStreamHashMap(employeesMap1, employeesMap2));
        System.out.println(cp.removeSpecificElementUsingToMap(employeesMap1));
        System.out.println(cp.removeSpecificElementWithoutUsingForLoop(employeesMap1));
    }
}

