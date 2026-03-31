package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionListNavya {

    public void iterationCollection(List<String> nameList) {
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    public void filterIteration(List<String> namesList) {
        for (String name : namesList) {
            if (!name.equals("Keerthi")) {
                System.out.println(name);
            }
        }
        namesList.stream().filter(name -> !name.equals("Keerthi")).toList().forEach(name -> System.out.println(name));
    }

    public void mergeWithoutDuplicates(List<Integer> listName1, List<Integer> listName2) {

        List<Integer> result = new ArrayList<>();

        for (Integer num : listName1) {
            if (!listName2.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : listName2) {
            if (!listName1.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : result) {
            System.out.println(num);
        }
        listName1.stream().filter(num -> !listName2.contains(num)).forEach(result::add);
        listName2.stream().filter(num -> !listName1.contains(num)).forEach(result::add);
        Stream.concat(listName1.stream().filter(num -> !listName2.contains(num)), listName2.stream().filter(num -> !listName1.contains(num))).forEach(System.out::println);
    }
}

