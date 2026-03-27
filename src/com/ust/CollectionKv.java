package com.ust;

import java.util.ArrayList;
import java.util.List;


public class CollectionKv {
     public void collectionIterations(List<String> names) {
         for (String name : names) {
             System.out.println(name);
         }
     }
    public void listIteration(List<String> sree) {
       for (String name : sree) {
            System.out.println(sree);
        }
    }

    public List<String> getNonDuplicate(List<String> names1, List<String> names2){
        List<String> mergedList = new ArrayList<>();
        names1.forEach(name -> mergedList.add(name));
        names2.forEach(name -> {
            if (!mergedList.contains(name)) {
                mergedList.add(name);
            }
        });
        return mergedList;



    }

     //public static void collectionIteration(List<String> names) {
     // for(String name: names) {
       // if (!name.equals("navya")) {
         //   System.out.println(name);
        //}
      //}
      //names.stream().filter(name->!name.equals("navya")).toList().forEach( name-> System.out.println(name));
      //}
}







