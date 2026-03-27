package com.ust;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CollectionsShashi {
    public void doIterate(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Printing via enhanced for loop");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("printing via lamda expression");
        names.forEach(name -> System.out.println(name));
        System.out.println("printing via stream");
    }

    public void filterNeighbour(List<String> names) {
        // filter name via for loop
        for (String name : names) {
            if (name.equals("Logesh")) {
                continue;
            }
            System.out.println(name);
        }
        // filter name via forEach loop in lamda format
        System.out.println("filter name via forEach loop in lamda format");
        names.stream().filter(name -> !name.equalsIgnoreCase("Logesh")).forEach(name -> System.out.println(name));
    }

    public void removeDuplicate(List<String> names, List<String> names1) {
        List<String> result = new ArrayList<>();
        List<String> mergedList = new ArrayList<>(names);
        mergedList.addAll(names1);

        System.out.println("printing only unique letters");
        for (String name : names) {
            if (!names1.contains(name)) {
                result.add(name);
            }
        }
        for (String name1 : names1) {
            if (!names.contains(name1)) {
                result.add(name1);
            }
        }
        for (String res : result) {
            System.out.println(res);
        }
        System.out.println(" printing only unique letters lamda format");
        names.stream().filter(name -> !names1.contains(name)).forEach(name -> System.out.println(name));
        names1.stream().filter(name1 -> !names.contains(name1)).forEach(name -> System.out.println(name));
        System.out.println(" printing only unique letters lamda format");
        mergedList.stream().filter(ml -> !names1.contains(ml) || !names.contains(ml)).forEach(ml -> System.out.println(ml));
        System.out.println(" printing only unique letters lamda format via and ");
        mergedList.stream().filter(ml -> !(names1.contains(ml) && names.contains(ml))).forEach(ml -> System.out.println(ml));

    }
}
