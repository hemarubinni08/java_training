package com.ust;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionHemanthMap {
    public void printMap(Map<String, String> batchNames) {
        Map<String, String> resultMap = new HashMap<>();
        /*for (Map.Entry<String, String> mapEntry : batchNames.entrySet()) {
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();
            System.out.println(key + "->" + value);*/
        /*for (String mapEntry : batchNames.keySet()) {
            String key = mapEntry;
            System.out.println(key);*/
        //batchNames.entrySet().forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
        //.stream().filter(entry -> !(batchNames.containsKey(1))).forEach();

        /*for (Map.Entry<String, String> mapEntry : batchNames.entrySet()) {
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();
            /*if (!(key.equals("1"))) {      //batchNames.containsKey("1");
                System.out.println(key + "->" + value);
            }*/
            /*if(!(value).equals("Hemanth")){  //batchNames.containsValue("Hemanth");
                System.out.println(key + "->" + value);
            }
        }
        batchNames.containsValue("Hemanth");*/
        // batchNames.entrySet().removeIf(entry -> (entry.getKey().equals("1")));
        batchNames.entrySet().stream().filter(entry -> !(entry.getKey().
                equals("1"))).forEach(entry ->
                System.out.println(entry.getKey() + "->" + entry.getValue()));
        Map<String, String> result = batchNames.entrySet().stream().filter(entry -> !(entry.getKey().
                equals("1"))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

    public void removeDuplicateMap(Map<String, String> batchNames, Map<String, String> batchNames1) {
        Map<String,String> resultMap= new HashMap<>(batchNames1);
        resultMap.putAll(batchNames);
        for (Map.Entry<String,String> name : batchNames.entrySet()){
            if(batchNames1.containsKey(name.getKey())){
                resultMap.remove(name.getKey());
            }
        }
        for (Map.Entry<String,String>name : resultMap.entrySet()){
            System.out.println(name.getKey()+"->"+name.getValue());
        }
    }
}