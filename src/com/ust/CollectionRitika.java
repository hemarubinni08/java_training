package com.ust;

import java.util.*;
import java.util.ArrayList;

public class CollectionRitika {
    public void doIterate(List<String> lists) {
        for (String list : lists) {
            System.out.println(list);
        }
        //Lambda expression
        //lists.forEach(list-> System.out.println(list));
        // lists.forEach(System.out::println); //same thing only
    }

    public void filterIterate(List<String> members) {

        for (String name : members) {
            if (name == "Anu") {
                continue;
            } else {
                System.out.println(name);
            }
        }
    }

    public void removeCommon(List<String> list1, List<String> list2) {
        List<String> newL1= new ArrayList<>();
//        for(String value:list1){
//            if(!list2.contains(value)){
//                newL1.add(value);
//            }
//        }
//        for(String value:list2){
//            if(!list1.contains(value)){
//                newL1.add(value);
//            }
//        }
        //Lambda expression
        newL1.addAll(list1.stream().filter(value -> !list2.contains(value)).toList());
        newL1.addAll(list2.stream().filter(value -> !list1.contains(value)).toList());
        System.out.println(newL1);

    }
}
