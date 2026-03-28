package com.ust;

import java.util.HashMap;
import java.util.Map;

public class CollectionHemanthMap {
    public void printMap(Map<String, String> batchNames) {
        Map<String,String> resultMap= new HashMap<>();
        /*for (Map.Entry<String, String> mapEntry : batchNames.entrySet()) {
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();
            System.out.println(key + "->" + value);*/
        /*for (String mapEntry : batchNames.keySet()) {
            String key = mapEntry;
            System.out.println(key);*/
        batchNames.entrySet().forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
        //.stream().filter(entry -> !(batchNames.containsKey(1))).forEach();
    }
}
