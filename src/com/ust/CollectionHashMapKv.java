package com.ust;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionHashMapKv {

//    public static void hashMapIteration(HashMap<String, String> map){
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//        for(String key:map.keySet()){
//            System.out.println(key+"-"+map.get(key));
//
//        }
//       map.forEach((key,value)->{
//            System.out.println(key+"-"+value);
//        });
//    }
//
//    public static void checkEmployee(HashMap<String, String> map) {
//        for(String key: map.keySet()){
//            if(key.equals("1")){
//                continue;
//            }
//            System.out.println(key+"-"+map.get(key));
//        }
//        if(map.containsKey("1"))
//        {
//            map.remove("1");
//        }
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//        for(String key:map.keySet()){
//            System.out.println(key+"-"+map.get(key));
//        }
//        if (map.containsValue("keerthi")){
//            map.values().remove("keerthi");
//        }
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            if(!(entry.getValue().equals("keerthi"))) {
//                System.out.println(entry.getKey() + "-" + entry.getValue());
//            }
//        }
//        map.entrySet().removeIf(entry -> (entry.getValue().equals("keerthi")));
//        System.out.println(map);
//        map.entrySet().stream().filter(entry ->
//                !(entry.getValue().equals("keerthi"))).forEach(entry ->
//                System.out.println(entry.getKey()+"->"+entry.getValue()));
//    }

    public static void removeDupilcateValues(HashMap<String, String> map1,HashMap<String, String> map2) {
        Map<String, String> result = new HashMap<>();
//        for (String key : map1.keySet()) {
//            if (!map2.containsKey(key)) {
//                result.put(key, map1.get(key));
//            }
//        }
//        for (String key : map2.keySet()) {
//            if (!map1.containsKey(key)) {
//                result.put(key, map2.get(key));
//            }
//        }
//        for (String key : result.keySet()) {
//            System.out.println(key + "-" + result.get(key));
//        }
        Map<String, String> result1 =
                Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                        .filter(e -> !(map1.containsKey(e.getKey()) && map2.containsKey(e.getKey())))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result1);




    }


}
