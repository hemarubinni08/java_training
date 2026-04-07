package com.ust;

import java.util.Map;

public class GokulCollectionMap {

    public void Names(Map<Integer, String> map) {


        for (Integer key : map.keySet()) {
            System.out.println(key);
        }


        for (String value : map.values()) {
            System.out.println(value);
        }


        map.forEach((key, value) ->
                System.out.println(key + ":" + value)
        );


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        for (Integer key : map.keySet()) {
            if (key == 308346) {
                continue;
            }
            System.out.println(key + ":" + map.get(key));
        }


        if (map.containsKey(308346)) {
            map.remove(308346);
        }


        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        map.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + ":" + entry.getValue())
        );


        map.keySet().forEach(key ->
                System.out.println(key + ":" + map.get(key))
        );
    }
}