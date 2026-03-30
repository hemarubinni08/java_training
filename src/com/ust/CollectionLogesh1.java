package com.ust;

import java.util.HashMap;
import java.util.Map;

public class CollectionLogesh1 {
    public void podName(Map<String, String> podMember) {
        for (Map.Entry<String, String> name : podMember.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        System.out.println(" ");
        for (String name : podMember.keySet()) {
            System.out.println(name + "-" + podMember.get(name));
        }
        podMember.entrySet().forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }

    public void removeOwn(Map<String, String> podMember) {
        if (podMember.containsKey("1")) {
            podMember.remove("1");
        }
        System.out.println(" ");
        for (Map.Entry<String, String> name : podMember.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
        if (podMember.containsValue("logesh")) {
            podMember.values().remove("logesh");
        }
        System.out.println(" ");
        for (Map.Entry<String, String> name : podMember.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
    }

    public void findDuplicates(Map<String, String> podMember, Map<String, String> podMember1) {
        Map<String, String> mergeMap = new HashMap<>(podMember);
        mergeMap.putAll(podMember1);
        Map<String, String> result = new HashMap<>();
        System.out.println("\nunique");
        for (Map.Entry<String, String> name : mergeMap.entrySet()) {
            if (mergeMap.containsValue(name.getValue())) {
                result.put(name.getKey(), name.getValue());
            }
        }
        for (Map.Entry<String, String> name : result.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }
//        for (Map.Entry<String, String> name : podMember1.entrySet()){
//            if(result.containsValue(name.getValue())){
//                continue;
//            }
//            System.out.println(name.getKey()+"-"+name.getValue());
//        }
    }
}
