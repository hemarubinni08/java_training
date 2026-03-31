package com.ust.impl;

import java.util.HashMap;
import java.util.Map;

public class CollectionAnu01 {
    public void hashMapIteration(Map<String , String> new1){
        // Key Set
        for (String key : new1.keySet()){
            String value = new1.get(key);
            System.out.println(key + "-" + value);
//            System.out.println(key + "-" + new1.get(key));
        }
        // using lambda
        new1.keySet().stream().forEach(key-> System.out.println(key +"-"+new1.get(key)));
        // Using entry set
        for(Map.Entry<String , String> entry : new1.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        // Using lambda
        new1.entrySet().stream().forEach(entry-> System.out.println(entry.getKey() +"-"+entry.getValue()));

    }
    public void remove(Map<String, String>new1){
        if(new1.containsKey("01")){
            new1.remove("01");
        }
        for (Map.Entry<String,String> entry : new1.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        //lambda
    }
    public void duplicates(Map<String , String>new1,Map<String, String>new2){
        Map<String, String> result = new HashMap<>();
        Map<String, String> duplicates = new HashMap<>();
        for (String key : new1.keySet()) {
            if (!new2.containsKey(key)) {
                result.put(key, new1.get(key));
            }
        }
        for (String key : new2.keySet()) {
            if (!new1.containsKey(key)) {
                result.put(key, new2.get(key));
            }
        }
        for (String key : result.keySet()) {
            System.out.println(key + "-" + result.get(key));
        }
    }
}