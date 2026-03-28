package com.ust.imple;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class CollectionHashMapLekhya {
    public void addEmployee(HashMap<Integer, String> newMap) {
        System.out.println("Using keySet:");
        for (int id : newMap.keySet()) {
            System.out.println(id + "-" + newMap.get(id));
        }
        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> data : newMap.entrySet()) {
            System.out.println(data.getKey() + "-" + data.getValue());
        }
        System.out.println("Using lambda expression:");
        newMap.forEach((id, name) -> System.out.println(id + "-" + name));
    }

    public void filteredNames(HashMap<Integer, String> newMap) {
        System.out.println("Using if:");
        int id1 = 2;
        if (newMap.containsKey(id1)) {
            newMap.remove(id1);
        }
        newMap.forEach((id, name) -> System.out.println(id + "-" + name));
    }

    public void filteredNamesOne(HashMap<Integer, String> newMap) {
        System.out.println("Using for loop:");
        for (int id : newMap.keySet()) {
            if (id != 1) {
                System.out.println(id + "-" + newMap.get(id));
            }
        }
    }

    public void filteredNamesTwo(HashMap<Integer, String> newMap) {
        System.out.println("Using contains Value:");
        if (newMap.containsValue("Logesh")) {
            newMap.values().remove("Logesh");
        }
        newMap.forEach((id, name) -> System.out.println(id + "-" + name));
    }
}
