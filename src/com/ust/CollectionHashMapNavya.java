package com.ust;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMapNavya {

    public void iterationCollectionMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }

        map.forEach((key, value) -> {
            System.out.println(key + "-" + value);
        });
    }

    public void removeDuplicatesAndMergeNavya(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                result.put(key, map1.get(key));
            }
        }

        for (String key : result.keySet()) {
            System.out.println(key + "-" + result.get(key));
        }

        map1.entrySet().stream().filter(entry -> !map2.containsKey(entry.getKey())).
                forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        map2.entrySet().stream().filter(entry -> !map1.containsKey(entry.getKey())).
                forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        result.forEach((key, value) -> System.out.println(key + "-" + value));
    }

    public static HashMap doIteration2MapsNavya(Map<String, String> mapName1, Map<String, String> mapName2) {
        HashMap<String, String> mergedMap = new HashMap<>();
        HashMap<String, String> temporaryMap = new HashMap<>();
        mergedMap.putAll(mapName1);
        mergedMap.putAll(mapName2);

        HashMap<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, String> keyValues : mergedMap.entrySet()) {
            if (!((mapName1.containsKey(keyValues.getKey()) && mapName2.containsKey(keyValues.getKey()))
                    || (mapName1.containsValue(keyValues.getValue()) && mapName2.containsValue(keyValues.getValue())))) {
                resultMap.put(keyValues.getKey(), keyValues.getValue());
            }
        }
        return resultMap;
    }

    public void checkEmployeeById(Map<String, String> map) {
        for (String key : map.keySet()) {
            if (key.equals("1")) {
                continue;
            }
            System.out.println(key + " " + map.get(key));
        }

        if (map.containsKey("1")) {
            map.remove("1");
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }

        if (map.containsValue("navya")) {
            map.values().remove("navya");
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!(entry.getValue().equals("navya"))) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }

        map.entrySet().removeIf(entry -> (entry.getValue().equals("navya")));
        System.out.println(map);
        map.entrySet().stream().filter(entry -> !(entry.getValue().equals("navya"))).forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
    }
}

