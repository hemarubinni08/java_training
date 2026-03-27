package com.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsNagarajan {

    public void itreateList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void itreateUsingLamda(List<String> names) {
        names.stream().forEach(name -> System.out.println(name));
    }

    public void filterNameUsingForEach(List<String> names) {
        for (String name : names) {
            if (name.equals("Chris")) continue;
            else System.out.println(name);
        }

    }

    public void filterNameUsingLamda(List<String> names) {

        names.stream().filter(
                name -> !name.equalsIgnoreCase("Chris")).toList().forEach(
                name -> System.out.println(name));
    }

    public void removeDuplicateUsingForEach(List<String> nameList1, List<String> nameList2) {
        List<String> common = new ArrayList<>(nameList1);
        common.retainAll(nameList2);
        List<String> result = new ArrayList<>(nameList1);
        result.addAll(nameList2);
        result.removeAll(common);
        itreateList(result);
    }

    public void removeDuplicateUsingLambda(List<String> nameList1, List<String> nameList2) {

        List<String> result = Stream.concat(nameList1.stream(), nameList2.stream()).filter(name -> !(nameList1.contains(name) && nameList2.contains(name))).toList();
        result.forEach(name -> System.out.println(name));
    }
}


