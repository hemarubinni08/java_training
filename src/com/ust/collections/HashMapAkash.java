package com.ust.collections;

import java.util.Map;
import java.util.stream.Collectors;

public class HashMapAkash {
    public void printValues(Map<Integer, String> record) {
        for (int key : record.keySet()) {
            System.out.println();
            System.out.println(key + " - " + record.get(key));
        }
    }

    public void filterEmployeeUsingForLoop(Map<Integer, String> record, int empid, String name) {
        for (int key : record.keySet()) {
            String currentName = record.get(key);
            if (!(key == empid && currentName.equalsIgnoreCase(name))) {
                System.out.println();
                System.out.println(key + " - " + record.get(key));
            }
        }
    }

    public void filterEmployeeUsingFunctions(Map<Integer, String> record, int empid, String name) {
        if (record.containsKey(empid) && record.containsValue(name)) {
            record.remove(empid);
        }
        for (int key : record.keySet()) {
            {
                System.out.println();
                System.out.println(key + " - " + record.get(key));
            }
        }
    }

    public void filterEmployeeUsingLambda(Map<Integer, String> record, int empid, String name) {
        Map<Integer, String> filteredMap = record.entrySet().stream()
                .filter(detail -> !(detail.getKey().equals(empid) && detail.getValue().equalsIgnoreCase(name)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,   // Function to extract the key
                        Map.Entry::getValue  // Function to extract the value
                ));

        System.out.println(filteredMap);
    }
}
