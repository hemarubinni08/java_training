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


    }
}
