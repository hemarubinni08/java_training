package com.ust.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class CollectionHemanth {

    public void doIterate(List<String> batchNames) {
        for (String names : batchNames) {
            System.out.println(names);
        }
        batchNames.forEach(System.out::println);
    }

    public void eliminateNeighbour(List<String> batchNames, List<String> names1) {
        for (String names : batchNames) {
            if (!names.equals("Ardra")) {
                System.out.println(names);
            }
        }
        batchNames.stream().filter(name -> !name.equals("Ardra") && !name.equals("Ritu")).forEach(System.out::println);
    }

    public List<String> duplicateElements(List<String> batchNames, List<String> batchNames1) {
        List<String> returnList = new ArrayList<>();
        List<String> combinedList = new ArrayList<>();
        String temp = "";
        for (String names : batchNames1) {
            if (batchNames.contains(names)) {
                batchNames.remove(names);
                temp = names;
            }
            if (!batchNames.contains(names) && !names.equals(temp)) {
                batchNames.add(names);
            }
        }
        for (String names : combinedList) {
            if (!(batchNames.contains(names) && batchNames1.contains(names))) {
                returnList.add(names);
            }
        }
        batchNames.stream().
                filter(name -> !batchNames1.contains(name)).
                forEach(returnList::add);
        batchNames1.stream().
                filter(name -> !batchNames.contains(name)).
                forEach(returnList::add);
        returnList.addAll(batchNames);
        returnList.addAll(batchNames1);
        return returnList.stream().filter(name -> !(batchNames.contains(name) && batchNames1.contains(name))).toList();
    }

    public Set<String> setDuplicateElements(Set<String> batchNAmes, Set<String> batchNAmes1) {
        Set<String> combinedSet = new HashSet<>();
        Set<String> tempSet = new HashSet<>();

        combinedSet.addAll(batchNAmes);
        combinedSet.addAll(batchNAmes1);

        String temp = "";

        for (String names : batchNAmes) {
            if (batchNAmes1.contains(names)) {
                tempSet.add(names);
            }
        }

        batchNAmes.addAll(batchNAmes1);
        batchNAmes.remove(temp);
        batchNAmes.stream().filter((name -> batchNAmes1.contains(name))).forEach(tempSet::add);
        tempSet.forEach(combinedSet::remove);

        combinedSet.stream().filter(name -> !(tempSet.contains(name))).collect(Collectors.toSet());
        return combinedSet;
    }
}