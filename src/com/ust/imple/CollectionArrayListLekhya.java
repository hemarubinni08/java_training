package com.ust.imple;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayListLekhya {
    public void namesOfThePodMembers(List<String> names) {
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.equalsIgnoreCase("Lekhya")) {
                filteredNames.add(name);
            }
        }
        System.out.println(filteredNames);
        names.stream().filter(name -> !name.equalsIgnoreCase("Lekhya")).forEach(name -> System.out.println(name));
    }

    public void filteredNames(List<String> names) {
        System.out.println(names.stream().filter(name -> !name.equalsIgnoreCase("Chaila")).toList());
    }

    public void removeDuplicatesOfTheList(List<Integer> numbers1, List<Integer> numbers2) {
        List<Integer> result = new ArrayList<>(numbers1);
        result.addAll(numbers2);
        /*for(int num1 : numbers1){
            if(!numbers2.contains(num1)){
                result.add(num1);
            }
        }*/
        //numbers1.stream().filter(num1 -> !numbers2.contains(num1)).forEach(num1 -> result.add(num1));
        /*for(int num2 : numbers2){
            if(!numbers1.contains(num2)){
                result.add(num2);
            }
        }
        System.out.println(result);*/
        //numbers2.stream().filter(num2 -> !numbers1.contains(num2)).forEach(num2 -> result.add(num2));
        System.out.println(result.stream().filter(num -> !(numbers1.contains(num) && numbers2.contains(num))).toList());
    }
}
