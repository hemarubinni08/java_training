package com.ust;

import java.sql.SQLOutput;
import java.util.Map;

public class CollectionsHashMapDeepak {

    static void printHashMap(Map<Integer, String> map) {
        map.forEach((key, value) ->
                System.out.println(key + " = " + value));
        System.out.println("EntrySet");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());//entryset
        }

        System.out.println("KeySet");
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));//keyset
        }

        System.out.println("Remove my key and value");
        for (Integer key:map.keySet()){
            if(key == 2)
            {
                continue;
            }
            System.out.println(key+" = "+ map.get(key));
        }

        System.out.println("Using contains kw");
        if (map.containsKey(2)) {
            map.remove(2);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(!(entry.getValue().equals("Deepak"))) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
        map.entrySet().removeIf(entry -> (entry.getValue().equals("Deepak")));
        System.out.println(map);
        map.entrySet().stream().filter(entry ->
                !(entry.getValue().equals("Deepak"))).forEach(entry ->
                System.out.println(entry.getKey()+"->"+entry.getValue()));

    }
}



