package com.ust;


import java.util.HashSet;
import java.util.Set;

public class GokulCollectionHashSet
{
    public static void displayNames(Set<String> names1, Set<String> names2) {
        Set<String> temp = new HashSet<>();
        Set<String> result=new HashSet<>();
//        for(String name:names1){
//            result.add(name);
//        }
//        for(String name:names2){
//            result.add(name);
//        }
//        for(String name:result){
//            System.out.println(name);
//        }

//        names1.forEach(name -> temp.add(name));
//        names2.forEach(name -> temp.add(name));
//        temp.forEach(name -> System.out.println(name));

        result.addAll(names1);
        result.addAll(names2);
        for (String name : names1) {
            if (names2.contains(name)) {
                temp.add(name);
            }
        }

        for (String name : names2) {
            if (names1.contains(name)) {
                temp.add(name);
            }
        }
        result.removeAll(temp);

        System.out.println(result);
    }

}
