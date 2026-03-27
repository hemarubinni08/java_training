package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionBew {
    public void doIteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void filterName(List<String> names) {
        for (String name : names) {
            if (name.equals("Aishu")) {
                continue;
            } else {
                System.out.println(name);
            }
        }
    }

    public void filterUsingLambda(List<String> names) {
        names.stream().filter(name -> !name.equalsIgnoreCase("Aishu")).toList().forEach(name -> System.out.println(name));
    }

    public void filter2Lists(List<String> names1, List<String> names2) {
        List<String> result = new ArrayList<>();
        for (String name : names1) {
            if (!names2.contains(name)) {
                result.add(name);
            }
        }
        for (String name : names2) {
            if (!names1.contains(name)) {
                result.add(name);
            }
        }
        System.out.println(result);


    }

    public void filter2ListsUsingLambda(List<String> names1, List<String> names2){
        List<String> result = new ArrayList<>();

        result.addAll(names1.stream().filter(name -> !names2.contains(name)).toList());
        result.addAll(names2.stream().filter(name -> !names1.contains(name) ).toList());

        System.out.println(result);
    }

    public void filterUsing1ForLoop(List<String> names1, List<String> names2){
        List<String> commonList = new ArrayList<>(names1);
        commonList.retainAll(names2);
        List<String> result = new ArrayList<>(names1);
        result.addAll(names2);
        result.removeAll(commonList);

        for(String name : result){
            System.out.println(name);
        }
    }

    public void filterUsing1Stream(List<String> names1, List<String> names2){

        List<String> result = Stream.concat(names1.stream(), names2.stream()).filter(name -> !(names1.contains(name) && names2.contains(name))).toList();
        result.forEach(System.out::println);
    }
}
