package com.ust.imple;

import java.util.ArrayList;
import java.util.List;

public class CollectionLekhya {
    public void namesOfThePodMembers(List<String> names) {
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.equalsIgnoreCase("Lekhya")) {
                filteredNames.add(name);
            }
        }
        System.out.println(filteredNames);
        System.out.println(names.stream().filter(name -> !name.equalsIgnoreCase("Lekhya")).toList());
    }
}
