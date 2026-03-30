package com.ust;

import com.sun.jdi.Value;

import java.security.Key;
import java.sql.SQLOutput;
import java.util.Map;

public class MapOperations {
        public void printingHashMapValues(Map<Integer, String> map) {
        map.forEach((Key, Value) -> {
            System.out.println(Key + "->" + Value);
        });
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
    public void printRemainingNameAndId(Map<Integer, String> map) {

        if (map.containsKey(308352)) {
            map.remove(308352);
        }
        map.forEach((key,value)->{
            System.out.println(key+"->"+value);
        });
        System.out.println("*******************");


        for(Integer key:map.keySet()){
           if( key == 308352){
               System.out.println(map.get(key));
           }
        }
    }
}
