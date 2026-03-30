package com.ust;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMapRohit {
    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("308237", "Rohit");
        newMap.put("308352", "Harsh");
        newMap.put("308330", "Deepak");
        newMap.put("308346", "Gokul");
        newMap.put("308344", "Keerthi");
        newMap.put("308342", "Navya");

        Map<String, String> newMap2 = new HashMap<>();
        newMap2.put("308001", "Sreelekshmi");
        newMap2.put("308237", "Rohit");
        newMap2.put("308003", "Suresh");
        newMap2.put("308004", "Gopi");
        newMap2.put("308005", "Narayan");
        newMap2.put("308006", "Ram");

        Map<String, String> newMap3 = new HashMap<>();
        newMap3.putAll(newMap);
        newMap3.putAll(newMap2);
        if (newMap3.containsKey(newMap2)) {
            newMap3.remove(newMap2);
        }

        System.out.println("Combined HashMap using stream:");
        newMap3.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "-->" + entry.getValue()));

        System.out.println("Combined HashMap using for loop and keyset:");
        for (String id : newMap3.keySet()) {
            System.out.println(id + "-->" + newMap3.get(id));
        }
        System.out.println("Remove duplicates:");

        for (String id : newMap2.keySet()) {
            if (!newMap.containsKey(id)) {
                newMap.put(id, newMap2.get(id));
            }
        }
        System.out.println("Single HashMap:");
        newMap.forEach((id, name) -> System.out.println(id + " - " + name));

        System.out.println("KeySet: ");
        for (String id : newMap.keySet()) {
            System.out.println(id + " - " + newMap.get(id));
        }

        System.out.println("EntrySet: ");

        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Without one Employee using just remove: ");

//        newMap.remove("308237", "Rohit");
//
//        newMap.forEach((id, name) ->
//                System.out.println(id + " - " + name));

//        System.out.println("Without one Employee using contains: ");
//        if(newMap.containsKey("308237")){
//            newMap.remove("308237");
//        }
//        newMap.forEach((id,name)->
//            System.out.println(id+"-"+name)
//        );
//        System.out.println("Without one Employee using stream:");

        newMap.entrySet().stream().filter(entry -> !"308237".equals(entry.getKey())).forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));


    }
}
