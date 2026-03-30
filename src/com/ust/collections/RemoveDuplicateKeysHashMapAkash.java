package com.ust.collections;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateKeysHashMapAkash {
    public void removeDuplicatesUsingForLoop(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> combineMap = new HashMap<>();
        combineMap.putAll(map1);
        combineMap.putAll(map2);
        Map<Integer, String> ansMap = new HashMap<>();
        for (int key : combineMap.keySet()) {
            if (!(map1.containsKey(key) && map2.containsKey(key))) {
                ansMap.put(key, combineMap.get(key));
            }
        }
        for (int key : ansMap.keySet()) {
            System.out.println(key + " - " + ansMap.get(key));
        }
    }

    public void removeDuplicatesUsingLambda(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> combineMap = new HashMap<>();
        combineMap.putAll(map1);
        combineMap.putAll(map2);
        combineMap.entrySet().stream().filter(entry -> !map1.containsKey(entry.getKey()) || !map2.containsKey(entry.getKey())).forEach(filteredEntry -> System.out.println(filteredEntry.getKey() + " - " + filteredEntry.getValue()));
    }
}
