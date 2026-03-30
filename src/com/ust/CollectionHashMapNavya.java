package com.ust;

import java.util.Map;

public class CollectionHashMapNavya {
    public static void iterationLoop(Map<String, String> map) {
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

    public static void checkEmployeeById(Map<String, String> map) {
//        for (String key : map.keySet()) {
//            if (key.equals("1")) {
//                continue;
//            }
//            System.out.println(key + " " + map.get(key));
//        }
//
//        if (map.containsKey("1")) {
//            map.remove("1");
//        }
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }
//        for (String key : map.keySet()) {
//            System.out.println(key + "-" + map.get(key));
//        }
       /* if (map.containsValue("navya")){
            map.values().remove("navya");
        }*/
        /*for (Map.Entry<String, String> entry : map.entrySet()) {
            if(!(entry.getValue().equals("navya"))) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }*/
        //map.entrySet().removeIf(entry -> (entry.getValue().equals("navya")));
        System.out.println(map);
        map.entrySet().stream().filter(entry ->
                !(entry.getValue().equals("navya"))).forEach(entry ->
                System.out.println(entry.getKey()+"->"+entry.getValue()));
    }
}

