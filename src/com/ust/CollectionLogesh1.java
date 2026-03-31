package com.ust;

import java.util.HashMap;
import java.util.Map;

public class CollectionLogesh1 {

    public void podName(Map<String, String> podMembers) {
        for (Map.Entry<String, String> name : podMembers.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        System.out.println(" ");
        for (String name : podMembers.keySet()) {
            System.out.println(name + "-" + podMembers.get(name));
        }
        podMembers.entrySet().forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }

    public void removeOwn(Map<String, String> podMembers) {
        if (podMembers.containsKey("1")) {
            podMembers.remove("1");
        }
        System.out.println(" ");
        for (Map.Entry<String, String> name : podMembers.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        if (podMembers.containsValue("logesh")) {
            podMembers.values().remove("logesh");
        }
        System.out.println(" ");

        for (Map.Entry<String, String> name : podMembers.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        podMembers.entrySet().stream().filter(name -> name.getKey().equals("1") || name.getValue().equals("logesh"));
    }

    public void findDuplicates(Map<String, String> podMembers, Map<String, String> podMembers1) {
        Map<String, String> duplicateMap = new HashMap<>();
        for (Map.Entry<String, String> name : podMembers1.entrySet()) {
            if (podMembers.containsValue(name.getValue())) {
                duplicateMap.put(name.getKey(), name.getValue());
            }
        }
        System.out.println("Duplicate value");
        for (String key : podMembers.keySet()) {
            if (podMembers1.containsKey(key)) {
                podMembers.remove(key);
                podMembers1.remove(key);
            }
        }
        Map<String, String> resultMap = new HashMap<>(podMembers);
        resultMap.putAll(podMembers1);
        System.out.println(duplicateMap);
        System.out.println("\nWitout Duplicate");
        for (Map.Entry<String, String> name : resultMap.entrySet()) {
            if (duplicateMap.containsValue(name.getValue())) {
                continue;
            }
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        podMembers.entrySet().stream().filter(podMem -> !podMembers1.containsKey(podMem.getKey()) && !podMembers1.containsValue(podMem.getValue())).
                forEach(podMem -> System.out.println(podMem.getKey() + "-" + podMem.getValue()));
        podMembers1.entrySet().stream().filter(podMem -> !podMembers.containsKey(podMem.getKey()) && !podMembers.containsValue(podMem.getValue())).
                forEach(podMem -> System.out.println(podMem.getKey() + "-" + podMem.getValue()));
    }
}