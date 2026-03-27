package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionArdra {
    void doIterate(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    void doIterateLambda(List<String> list) {
        list.stream().forEach((name) -> System.out.println(name));
    }

    void filterNeighbour(List<String> list){
        list.stream().filter((name) -> !name.equals("Hemanth")).forEach(System.out::println);
    }

    List<String> deleteDuplicates (List<String> list1, List<String> list2){
        List<String> returnList = new ArrayList<String>();
        for (String s : list2){
            if (!list1.contains(s)){
                returnList.add(s);
            }
        }
        for (String s : list1){
            if (!list2.contains(s)){
                returnList.add(s);
            }
        }
        return returnList;
    }
    List<String> deleteDuplicatesStream (List<String> list1, List<String> list2){
        List<String> returnList = new ArrayList<String>();
        list2.stream().filter((s)->!list1.contains(s)).forEach(returnList::add);
        list1.stream().filter((s)->!list2.contains(s)).forEach(returnList::add);
        return returnList;
    }
    /*
    List<String> deleteDuplicatesStream (List<String> list1, List<String> list2){
        List<String> returnList = new ArrayList<String>();
        list2.stream().forEach((s)->{
            if (!list1.contains(s)){
                returnList.add(s);
            }
        });
        list1.stream().forEach((s)->{
            if (!list2.contains(s)){
                returnList.add(s);
            }
        });
        return returnList;
    }
     */

}