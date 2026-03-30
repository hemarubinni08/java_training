package com.ust;

import java.awt.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionHashsetChaila {
    public void hashset(HashSet<Integer> list1, HashSet<Integer> list2) {
        /*Set<Integer> set = new HashSet<>(list1);
        set.addAll(list2);
        for(int number1 : list1){
            if(!list2.contains(number1)){
                set.add(number1);
            }
        }

        System.out.println(set);

        set.stream().filter(num -> !(list1.contains(num) && list2.contains(num))).forEach(num -> System.out.println(num));*/

    }

    public void removeDuplicate(HashSet<Integer> list1, HashSet<Integer> list2) {
        HashSet<Integer> temp = new HashSet<Integer>();
        HashSet<Integer> result = new HashSet<>(list1);
        result.addAll(list2);
        list1.stream().filter(num -> list2.contains(num)).forEach(temp::add);
        temp.stream().forEach(result::remove);
        System.out.println(result);
    }

    public void mapPodMembers() {
        Map<Integer, String> idAndName = new HashMap<>();
        idAndName.put(1, "Chaila shree");
        idAndName.put(2, "Lekhya");
        idAndName.put(3, "Aron");
        idAndName.put(4, "Preetham");
        idAndName.put(5, "Logesh");
        for (Map.Entry<Integer, String> entry : idAndName.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        for (Integer key : idAndName.keySet()) {
            System.out.println(key + "-" + idAndName.get(key));
        }
        idAndName.forEach((id, name) -> System.out.println(id + "-" + name));

    }

    public void removeMyNameUsingKey() {
        Map<Integer, String> idAndName = new HashMap<>();
        idAndName.put(1, "Chaila shree");
        idAndName.put(2, "Lekhya");
        idAndName.put(3, "Aron");
        idAndName.put(4, "Preetham");
        idAndName.put(5, "Logesh");

        if (idAndName.containsKey(1)) {
            idAndName.remove(1);

        }
        for (Map.Entry<Integer, String> entry : idAndName.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        idAndName.forEach((id, name) -> System.out.println(id + "-" + name));

    }

    public void checkUsingId() {
        Map<Integer, String> idAndName = new HashMap<>();
        idAndName.put(1, "Chaila shree");
        idAndName.put(2, "Lekhya");
        idAndName.put(3, "Aron");
        idAndName.put(4, "Preetham");
        idAndName.put(5, "Logesh");
        int id = 3;
        if (idAndName.containsKey(3)) {
            idAndName.remove(3);
        }
        for (int key : idAndName.keySet()) {
            if (key != 4) {
                System.out.println(key + "-" + idAndName.get(key));
            }
        }
        for (Map.Entry<Integer, String> entry : idAndName.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }

    public void removeMyNameUsingValue() {
        Map<Integer, String> idAndName = new HashMap<>();
        idAndName.put(1, "Chaila shree");
        idAndName.put(2, "Lekhya");
        idAndName.put(3, "Aron");
        idAndName.put(4, "Preetham");
        idAndName.put(5, "Logesh");

        if (idAndName.containsValue("Aron")) {
            idAndName.values().remove("Aron");
        }
        for (Map.Entry<Integer, String> entry : idAndName.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}




