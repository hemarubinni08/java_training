package com.ust;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public void setPrintNames(Set<String> setNames, Set<String> setNames1) {
        Set<String> mergedSet = new HashSet<>(setNames);
        mergedSet.addAll(setNames1);

        System.out.println("printing names via set");
        for (String name : mergedSet) {
            System.out.println(name);
        }
        System.out.println("printing names via set in lambda expression");
        mergedSet.forEach(name -> System.out.println(name));
    }

    public void setRemoveNeighbour(Set<String> setNames) {
        System.out.println("printing remove neighbour via set");
        for (String name : setNames) {
            if (!name.equalsIgnoreCase("b"))
                System.out.println(name);
        }
    }

    public void setPrintUniqueName(Set<String> setNames, Set<String> setNames1) {
        Set<String> duplicateName = new HashSet<>();

        Set<String> mergedSet = new HashSet<>(setNames);
        mergedSet.addAll(setNames1);
        System.out.println("printing duplicate name");
        for (String name : setNames) {
            if (setNames1.contains(name)) {
                duplicateName.add(name);
                System.out.println(name);
            }
        }
        System.out.println("printing duplicate name via lambda expression from set");
        setNames.stream().filter(name -> setNames1.contains(name)).forEach(name -> System.out.println(name));
        System.out.println("printing unique name via lambda expression from set1");
        setNames.stream().filter(name -> !setNames1.contains(name)).forEach(name -> System.out.println(name));
        System.out.println("printing unique name via lambda expression from set2");
        setNames1.stream().filter(name1 -> !setNames.contains(name1)).forEach(name1 -> System.out.println(name1));

        System.out.println("printing only unique name");
        for (String name : mergedSet) {
            if (duplicateName.contains(name)) {
                continue;
            }
            System.out.println(name);
        }
        System.out.println("printing unique name via lambda expression from merged set");
        mergedSet.stream().filter(mergeSet -> !(setNames.contains(mergeSet) && setNames1.contains(mergeSet))).forEach(mergeSet -> System.out.println(mergeSet));
        System.out.println("printing unique name via lambda expression from merged set ver2");
        mergedSet.stream().filter(mergeSet -> !setNames.contains(mergeSet) || !setNames1.contains(mergeSet)).forEach(mergeSet -> System.out.println(mergeSet));
    }
}