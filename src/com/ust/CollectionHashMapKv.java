package com.ust;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMapKv {

    public static void hashMapIteration(HashMap<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        for(String key:map.keySet()){
            System.out.println(key+"-"+map.get(key));

        }
       map.forEach((key,value)->{
            System.out.println(key+"-"+value);
        });
    }

    public static void checkEmployee(HashMap<String, String> map) {
        for(String key: map.keySet()){
            if(key.equals("1")){
                continue;
            }
            System.out.println(key+"-"+map.get(key));
        }
        if(map.containsKey("1"))
        {
            map.remove("1");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for(String key:map.keySet()){
            System.out.println(key+"-"+map.get(key));
        }
        if (map.containsValue("keerthi")){
            map.values().remove("keerthi");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(!(entry.getValue().equals("keerthi"))) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
        map.entrySet().removeIf(entry -> (entry.getValue().equals("keerthi")));
        System.out.println(map);
        map.entrySet().stream().filter(entry ->
                !(entry.getValue().equals("keerthi"))).forEach(entry ->
                System.out.println(entry.getKey()+"->"+entry.getValue()));
    }

}
