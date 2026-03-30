package com.ust;

import java.util.HashMap;
import java.util.Map;

public class CollectionsSrujan2 {
    public void doIterationMap(Map<Integer, String> podMembersMap) {
        for (Integer keyValues : podMembersMap.keySet()) {
            System.out.println(keyValues + "-" + podMembersMap.get(keyValues));
        }
        for (Map.Entry<Integer, String> hashes : podMembersMap.entrySet()) {
            Integer idValues = hashes.getKey();
            String names = hashes.getValue();
            System.out.println(idValues + "-" + names);
        }
    }

    public void doIterationSkipMap(Map<Integer, String> podMembersMap) {
        for (Integer keyValues : podMembersMap.keySet()) {
            if (keyValues != 308348) {
                System.out.println(keyValues + "-" + podMembersMap.get(keyValues));
            }
        }
    }

    public void doIterationContainKey(Map<Integer, String> podMembersMap) {
        if (podMembersMap.containsKey(308348)) {
            podMembersMap.remove(308348);
        }
        for (Integer keyValues : podMembersMap.keySet()) {
            System.out.println(keyValues + "-" + podMembersMap.get(keyValues));
        }
    }

    public void doIterationContainValue(Map<Integer, String> podMembersMap) {
        if (podMembersMap.containsValue("Srujan")) {
            podMembersMap.values().remove("Srujan");
        }
        for (Integer keyValues : podMembersMap.keySet()) {
            System.out.println(keyValues + "-" + podMembersMap.get(keyValues));
        }

        podMembersMap.entrySet().stream().filter(myName ->
                !(myName.getValue().equals("Srujan"))).forEach(name ->
                System.out.println(name.getKey() + "-" + name.getValue()));
    }
}
