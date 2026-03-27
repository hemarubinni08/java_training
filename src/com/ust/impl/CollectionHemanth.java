package com.ust.impl;

import java.util.ArrayList;
import java.util.List;

public class CollectionHemanth {
    private Object ArrayList;

    public void doIterate(List<String> batchNames) {
        /*for (String names : batchNames) {
            System.out.println(names);
        }*/
        //batchNames.forEach(name -> System.out.println(name));
        batchNames.forEach(System.out::println);
    }

    public void eliminateNeighbour(List<String> batchNames, List<String> names1) {
        /*for(String names : batchNames){
            if(names == "Ardra"){
                continue;
            }
            else{
                System.out.println(names);
            }
        }*/
        //batchNames.stream().filter(name -> !name.equals("Ardra") && !name.equals("Ritu")).forEach(System.out::println);


    }

    public List<String> duplicateElements(List<String> batchNames, List<String> batchNames1) {
        /*String temp = "";
        for (String names : batchNames1) {
            if(batchNames.contains(names)){
                batchNames.remove(names);
                temp=names;
                }
            if(!batchNames.contains(names) && !names.equals(temp)){
                batchNames.add(names);
            }
            }
        return  batchNames;*/

        List<String> returnList = new ArrayList<>();
       // batchNames.stream().filter(name-> !batchNames1.contains(name)).forEach(returnList::add);
        //batchNames1.stream().filter(name-> !batchNames.contains(name)).forEach(returnList::add);
        returnList.addAll(batchNames);
        returnList.addAll(batchNames1);
        return returnList.stream().filter(name -> !(batchNames.contains(name) && batchNames1.contains(name))).toList();
    }
}
