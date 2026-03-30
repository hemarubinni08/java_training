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
        collection.doIteration(names1);
        // Call the method filteredIteration
        collection.filteredIteration(names1);
        // Call the method uniqueElement
        collection.uniqueElement(names1, names2);
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
        collection.traverseSet(setNames1, setNames2);
        System.out.println();
        // Call method filterSet
        collection.filterSet(setNames1);
        System.out.println();
        // Call method removeDuplicateSet
        collection.removeDuplicateSet(setNames1, setNames2);
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
        // Adding values
        employeesMap2.put("308336", "Aron");
        employeesMap2.put("308239", "Ram");
        employeesMap2.put("308331", "Charan");
        // call to method traverseMap
        collection.traverseMap(employeesMap1);
        // call to method removeMeMapKey
        collection.removeMeMapKey(employeesMap1, "308336");
        // call to method removeMeMapValue
        collection.removeMeMapValue(employeesMap1, "Aron");
        // call to method removeDuplicatesValueMap
        collection.removeDuplicatesValueMap(employeesMap1, employeesMap2);
        // call to method removeDuplicatesKeyMap
        collection.removeDuplicatesKeyMap(employeesMap1, employeesMap2);
    }
}
