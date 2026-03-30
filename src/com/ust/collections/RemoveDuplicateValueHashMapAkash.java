package com.ust.collections;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateValueHashMapAkash {
    public void removeDuplicatesUsingForLoop(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> combineMap = new HashMap<>();
        combineMap.putAll(map1);
        combineMap.putAll(map2);
        for (Map.Entry<Integer, String> detail : map1.entrySet()) {
            if (map2.containsKey(detail.getKey()) || map2.containsValue(detail.getValue())) {
                combineMap.remove(detail.getKey());
                combineMap.values().remove(detail.getValue());
            }
        }
        for (int key : combineMap.keySet()) {
            System.out.println(key + " - " + combineMap.get(key));
        }
    }

    public void removeDuplicatesUsingLambda(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> combineMap = new HashMap<>();
        combineMap.putAll(map1);
        combineMap.putAll(map2);
        combineMap.entrySet().stream().filter(entry -> !map1.containsValue(entry.getValue()) || !map2.containsValue(entry.getValue())).forEach(filteredEntry -> System.out.println(filteredEntry.getKey() + " - " + filteredEntry.getValue()));
    }
}
