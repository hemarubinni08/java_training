package com.ust;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionSetAnu {
    public void iterationSet(Set<String> set1){
        for (String name : set1){
            System.out.println(name);
        }
    }
    // Removing a particular name
    public void filterNameSet(Set<String> set1){
        for (String name : set1){
            if (name == "Ritika"){
                continue;
            }
            else{
                System.out.println(name);
            }
        }
    //Using lambda
        set1.stream().filter(name-> !name.equals("Ritika")).collect(Collectors.toSet()).forEach(System.out::println);
    }
    // Removing duplicates from two sets
    public void removeDuplicatesSet(Set<String> set1, Set<String>set2){
        Set<String> newSet = new HashSet<>();
        for (String name : set1){
            if (!set2.contains(name)){
                newSet.add(name);
            }
        }
        for(String name :set2){
            if(!set1.contains(name)){
                newSet.add(name);
            }
        }
        System.out.println(newSet);
    // Using lambda
        set1.stream().filter(name->!set2.contains(name)).forEach(newSet::add);
        set2.stream().filter(name->!set1.contains(name)).forEach(newSet::add);
        System.out.println(newSet);
    }
}
