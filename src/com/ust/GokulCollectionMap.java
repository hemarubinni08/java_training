package com.ust;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GokulCollectionMap {
    public static void Names(Map<Integer,String> Map) {
//        for (Integer key : Map.keySet()) {
//            System.out.println(key);
//        }
//        for (String value :Map.values()) {
//            System.out.println(value);
//        }

//        Map.forEach((key, value) ->
//                System.out.println(key + ":" + value)
//        );


//        for (Map.Entry<Integer, String> entry : Map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        for (Integer key : Map.keySet()) {
//            if(key==308346){
//                continue;
//            }
//            System.out.println(key + ":" + Map.get(key));
//        }

        if (Map.containsKey(308346)) {
            Map.remove(308346);
        }
        for (Integer key : Map.keySet()) {
            System.out.println(key + ":" + Map.get(key));
        }

      for (Map.Entry<Integer, String> entry : Map.entrySet()) {
       System.out.println(entry.getKey() + ":" + entry.getValue());
       }










//        Map.entrySet().forEach(entry ->
//                System.out.println(entry.getKey() + ":" + entry.getValue())
//        );
//
//        Map.keySet().forEach(key ->
//                System.out.println(key + ":" +Map.get(key))
//        );




    }


}
