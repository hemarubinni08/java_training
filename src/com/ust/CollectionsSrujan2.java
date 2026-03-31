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
    }

    public void doIterationContainValueLambda(Map<Integer, String> podMembersMap) {

        podMembersMap.entrySet().stream().filter(myName -> !(myName.getValue().equals("Srujan"))).
                forEach(name -> System.out.println(name.getKey() + "-" + name.getValue()));
    }

    public Map<Integer, String> doIteration2MapsSrujan(Map<Integer, String> podMembersMap1, Map<Integer, String> podMembersMap2) {
        HashMap<Integer, String> mergedMap = new HashMap<>();
        HashMap<Integer, String> temporaryMap = new HashMap<>();
        mergedMap.putAll(podMembersMap1);
        mergedMap.putAll(podMembersMap2);
        HashMap<Integer, String> resultMap = new HashMap<>();
        for (Map.Entry<Integer, String> keyValues : mergedMap.entrySet()) {
            if (!((podMembersMap1.containsKey(keyValues.getKey()) && podMembersMap2.containsKey(keyValues.getKey()))
                    || (podMembersMap1.containsValue(keyValues.getValue()) && podMembersMap2.containsValue(keyValues.getValue())))) {
                resultMap.put(keyValues.getKey(), keyValues.getValue());
            }
        }
        return resultMap;
    }

    public Map<Integer, String> doIteration2MapsSrujanLambda(Map<Integer, String> podMembersMap1, Map<Integer, String> podMembersMap2) {
        HashMap<Integer, String> mergedMap = new HashMap<>();
        HashMap<Integer, String> temporaryMap = new HashMap<>();
        mergedMap.putAll(podMembersMap1);
        mergedMap.putAll(podMembersMap2);
        HashMap<Integer, String> resultMap = new HashMap<>();
        mergedMap.entrySet().stream().filter(myKey -> !
                        ((podMembersMap1.containsKey(myKey.getKey()) && podMembersMap2.containsKey(myKey.getKey()))
                                || (podMembersMap1.containsValue(myKey.getValue()) && podMembersMap2.containsValue(myKey.getValue())))).
                forEach(entry -> resultMap.put(entry.getKey(), entry.getValue()));

        return resultMap;
    }
}