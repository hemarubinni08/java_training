package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperations {

    public void printValues(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public void printNamesExcludingRohit(List<String> names) {
        for (String name : names) {
            if (!name.contains("Rohit")) {
                System.out.println(name);
            }
        }

        System.out.println("Using Lambda");
        names.stream().filter(n->!n.contains("Rohit")).forEach(System.out::println);

        names.stream()
                .filter(name -> !name.contains("Rohit"))
                .forEach(System.out::println);
    }

    public void removeDuplicatesUsingLoop(List<String> firstList, List<String> secondList) {
        List<String> resultList = new ArrayList<>();

        for (String value : firstList) {
            boolean found = false;
            for (String result : resultList) {
                if (value.equalsIgnoreCase(result)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                resultList.add(value);
            }
        }

        for (String value : secondList) {
            boolean found = false;
            for (String result : resultList) {
                if (value.equalsIgnoreCase(result)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                resultList.add(value);
            }
        }

        System.out.println(resultList);
    }

    public void removeDuplicatesUsingLambda(List<String> firstList, List<String> secondList) {
        List<String> resultList = new ArrayList<>();

        resultList.addAll(
                firstList.stream()
                        .filter(value -> !secondList.contains(value))
                        .toList()
        );

        resultList.addAll(
                secondList.stream()
                        .filter(value -> !firstList.contains(value))
                        .toList()
        );

        System.out.println(resultList);
        System.out.println("*****************************************************");
    }

    public void removeDuplicatesUsingCombinedList(List<String> firstList, List<String> secondList) {
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(firstList);
        combinedList.addAll(secondList);

        List<String> resultList = combinedList.stream()
                .filter(value -> !(firstList.contains(value) && secondList.contains(value)))
                .toList();

        System.out.println(resultList);
    }
}