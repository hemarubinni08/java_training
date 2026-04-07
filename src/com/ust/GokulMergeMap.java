package com.ust;

import java.util.HashMap;
import java.util.Map;

public class GokulMergeMap {

    public void Names(Map<Integer, String> map1,Map<Integer, String> map2) {

        Map<Integer, String> result = new HashMap<>();

        map1.forEach((k, v) -> {
            if (!map2.containsKey(k)) {
                result.put(k, v);
            }
        });

        map2.forEach((k, v) -> {
            if (!map1.containsKey(k)) {
                result.put(k, v);
            }
        });

        System.out.println(result);
    }
}