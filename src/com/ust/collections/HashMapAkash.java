package com.ust.collections;

import java.util.Map;

public class HashMapAkash {
    public void printValues(Map<Integer, String> record) {
        for (int key : record.keySet()) {
            System.out.println();
            System.out.println(key + " - " + record.get(key));
        }
    }
}
