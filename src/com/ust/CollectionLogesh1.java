package com.ust;

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
}