package com.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsHarsha {
    public void doIteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void doIterationByStream(List<String> names) {
        names.forEach(System.out::println);
    }

    public void igonreNeighbour(List<String> names) {
        names.stream().filter(name -> !name.equalsIgnoreCase("Pranav")).forEach(System.out::println);
    }

    public void ignoreNeighbourForLoop(List<String> names) {
        for (String name : names) {
            if (!name.equalsIgnoreCase("Pranav")) {
                System.out.println(name);
            }
        }
    }

    public List<String> removeDuplicate2(List<String> nameList1, List<String> nameList2) {
        List<String> result = new ArrayList<>();
        int count = 0;
        for (String name : nameList1) {
            for (String name2 : nameList2) {
                if (name.equalsIgnoreCase(name2)) {
                    System.out.println(name2 + " " + name);
                    count = count + 1;
                    break;

                } else if (!name.equalsIgnoreCase(name2)) {
                    System.out.println(name2 + " " + name);
                    count = 0;

                }
            }
            System.out.println(count);
            if (count == 0) {
                result.add(name);
                System.out.println("added");
            } else {
                System.out.println("Not added");
            }
        }
        System.out.println("-------------");
        System.out.println(nameList1);
        System.out.println(nameList2);

        for (String name2 : nameList2) {
            for (String name : nameList1) {
                if (name2.equalsIgnoreCase(name)) {
                    System.out.println(name2 + " " + name);
                    count = count + 1;
                    break;

                } else if (!name2.equalsIgnoreCase(name)) {
                    System.out.println(name2 + " " + name);
                    count = 0;

                }
            }
            System.out.println(count);
            if (count == 0) {
                result.add(name2);
                System.out.println("added");
            } else {
                System.out.println("Not added");
            }
        }
        Collections.sort(result);
        return result;
    }

    public List<String> removeDuplicate3(List<String> nameList1, List<String> nameList2){
        List<String> result = new ArrayList<>();

        for (String name : nameList1){
            if (!nameList2.contains(name)){
                result.add(name);
            }
        }

        for (String name : nameList2){
            if (!nameList1.contains(name)){
                result.add(name);
            }
        }

        return result;
    }

    public List<String> removeDuplicate4(List<String> nameList1, List<String> nameList2){

        List<String> newList = new ArrayList<>();

        newList.addAll(nameList1.stream().filter(name->!nameList2.contains(name)).toList());

        newList.addAll(nameList2.stream().filter(name->!nameList1.contains(name)).toList());

        return newList;

    }

    public List<String> removeDuplicate5(List<String> nameList1, List<String> nameList2){

        List<String> combineList = Stream.concat(nameList1.stream().filter(name->!nameList2.contains(name)),nameList2.stream().filter(name->!nameList1.contains(name))).toList();

        return combineList;

    }

    public List<String> removeDuplicate6(List<String> nameList1, List<String> nameList2){
        List<String> combine = new ArrayList<>();
        combine.addAll(nameList1);
        combine.addAll(nameList2);
        List<String> result = new ArrayList<>();

        for (String name:combine){
            if(!(nameList1.contains(name) && nameList2.contains(name))){
                result.add(name);
            }
        }

        return result;
    }

    //facing some exception issue  in the below removeDuplicate7() method
    public List<String> removeDuplicate7(List<String> nameList1, List<String> nameList2){
        List<String> result = new ArrayList<>();
        result.addAll(nameList1);
        result.addAll(nameList2);
        int count = 0;
        for (String name : result){
            count = result.stream().filter(name2-> name.equalsIgnoreCase(name2)).toList().size();
            if (count!=1){
                result.remove(name);
            }
        }
        return result;
    }
}
