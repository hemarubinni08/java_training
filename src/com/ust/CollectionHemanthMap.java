package com.ust;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionHemanthMap {
    public void printMap(Map<String, String> batchNames) {
        Map<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, String> mapEntry : batchNames.entrySet()) {
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();
            System.out.println(key + "->" + value);
        }
        for (String name : batchNames.keySet()) {
            String key1 = name;
            System.out.println(key1);
        }
        batchNames.entrySet().forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
        batchNames.containsValue("Hemanth");
        // batchNames.entrySet().removeIf(entry -> (entry.getKey().equals("1")));
        batchNames.entrySet().stream().filter(entry -> !(entry.getKey().
                equals("1"))).forEach(entry ->
                System.out.println(entry.getKey() + "->" + entry.getValue()));
        Map<String, String> result = batchNames.entrySet().stream().filter(entry -> !(entry.getKey().
                equals("1"))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    public void removeDuplicateMap(Map<String, String> batchNames, Map<String, String> batchNames1) {
        Map<String, String> resultMap = new HashMap<>(batchNames1);
        Map<String, String> temporaryMap = new HashMap<>();
        resultMap.putAll(batchNames);
        /*for(String name : batchNames.keySet()){
            if(batchNames1.containsKey(name)){
                resultMap.remove(name);
            }
        }*/
        /*for (Map.Entry<String,String> name : batchNames.entrySet()){
            if(batchNames1.containsKey(name.getKey()) || batchNames1.containsValue(name.getValue()) ){
                resultMap.remove(name.getKey());
                resultMap.values().remove(name.getValue());
            }
        }
        for (Map.Entry<String,String>name : resultMap.entrySet()){
            System.out.println(name.getKey()+"->"+name.getValue());
        }*/
        batchNames.entrySet().stream().filter(entry -> (batchNames1.containsKey(entry.getKey())
                || batchNames1.containsValue(entry.getValue()))).forEach(entry -> temporaryMap.put(entry.getKey(), entry.getValue()));
        //resultMap.entrySet().stream().filter(entry-> !(temporaryMap.containsKey(entry.getKey()) ||
        //      temporaryMap.containsValue(entry.getValue()))).collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        resultMap.entrySet().stream().filter(entry -> !(temporaryMap.containsKey(entry.getKey()) ||
                temporaryMap.containsValue(entry.getValue()))).forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
        //resultMap.entrySet().removeIf(entry-> temporaryMap.containsKey(entry.getKey()) || temporaryMap.containsValue(entry.getValue()));
    }
}