package com.ust.impl;

import java.util.ArrayList;
import java.util.List;

public class CollectionHemanth {
    public void doIterate(List<String> batchNames) {
        /*for (String names : batchNames) {
            System.out.println(names);
        }*/
        //batchNames.forEach(name -> System.out.println(name));
        batchNames.forEach(System.out::println);
    }
    public void eliminateNeighbour(List<String> batchNames){
        /*for(String names : batchNames){
            if(names == "Ardra"){
                continue;
            }
            else{
                System.out.println(names);
            }
        }*/
        batchNames.stream().filter(name -> !name.equals("Ardra") && !name.equals("Ritu")).forEach(System.out::println);
    }
}