package com.ust;

import java.util.*;

public class MainAron {
    public static void main(String[] args) {
        // Creating list names1
        List<String> names1 = new ArrayList<>();
        // Adding values to names1
        names1.add("Aron");
        names1.add("Lekhya");
        names1.add("Shashi");
        names1.add("Logesh");
        names1.add("Chaila");

        // Creating list names2
        List<String> names2 = new ArrayList<>();
        // Adding values to names2
        names2.add("Pranav");
        names2.add("Harsh");
        names2.add("Chandra");
        names2.add("Raja");
        names2.add("Chris");
        names2.add("Aron");

        // Class Object
        CollectionsAron collection = new CollectionsAron();

        // Call the method doIteration
        System.out.println("Print all the data in the list");
        collection.doIteration(names1);
        System.out.println();

        // Call the method filteredIteration
        System.out.println("Print all the names except your neighbor's");
        collection.filteredIteration(names1);
        System.out.println();

        // Call the method uniqueElement
        System.out.println("Print values that are not common in both lists");
        collection.uniqueElement(names1, names2);
        System.out.println();

        // Create a hashset to store names
        HashSet<String> setNames1 = new HashSet<>();
        // Add names to the set
        setNames1.add("Aron");
        setNames1.add("Lekhya");
        setNames1.add("Shashi");
        setNames1.add("Logesh");
        setNames1.add("Chaila");
        setNames1.add("Raja");

        // Create another hashset to store names
        HashSet<String> setNames2 = new HashSet<>();
        // Add names to the set
        setNames2.add("Pranav");
        setNames2.add("Harsh");
        setNames2.add("Chandra");
        setNames2.add("Raja");
        setNames2.add("Chris");
        setNames2.add("Aron");

        // Call method traverseSet
        System.out.println("Print all the names in the set");
        collection.traverseSet(setNames1, setNames2);
        System.out.println();

        // Call method filterSet
        System.out.println("Print all names except your neighbor's");
        collection.filterSet(setNames1, "Shashi");
        System.out.println();

        // Call method removeDuplicateSet
        System.out.println("Print all names that are not common in both sets");
        collection.removeDuplicateSet(setNames1, setNames2);
        System.out.println();

        // HashMap with key as employee id and value as team member name
        Map<String, String> employeesMap1 = new HashMap<>();
        // Adding values
        employeesMap1.put("308336", "Aron");
        employeesMap1.put("308238", "Shashi");
        employeesMap1.put("308337", "Lekhya");
        employeesMap1.put("308343", "Logesh");
        employeesMap1.put("308333", "Chaila");

        // create another hashmap to store id and names
        Map<String, String> employeesMap2 = new HashMap<>();
        // Adding values to the map
        employeesMap2.put("308336", "Aron");
        employeesMap2.put("308239", "Ram");
        employeesMap2.put("308331", "Charan");

        // call to method traverseMap
        System.out.println("Print all values in the map");
        collection.traverseMap(employeesMap1);
        System.out.println();

        // call to method removeMeMapKey
        System.out.println("Print all values in the map except your id");
        collection.removeMeMapKey(employeesMap1, "308336");
        System.out.println();

        // call to method removeMeMapValue
        System.out.println("Print all values in the map except your name");
        collection.removeMeMapValue(employeesMap1, "Aron");
        System.out.println();

        // call to method removeDuplicatesValueMap
        System.out.println("Print all values in both maps excluding the common values");
        collection.removeDuplicatesValueMap(employeesMap1, employeesMap2);
        System.out.println();

        // call to method removeDuplicatesKeyMap
        System.out.println("Print all values in both maps excluding the common keys");
        collection.removeDuplicatesKeyMap(employeesMap1, employeesMap2);
    }
}
