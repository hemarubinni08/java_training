package com.ust.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsYesh  {
    public void doIterate(List<String> names){
        for(String member: names){
            //System.out.println(member);
        }
       names.stream().forEach(name-> System.out.println(name));
    }
    public void EliminateNeighbor(List<String> names){
        /*for(String neighbor: names){
            if (neighbor.equals("Akash")){
                continue;
            }else{
                System.out.println(neighbor);
            }
        }*/
        System.out.println(names.stream().filter( name->!name.equalsIgnoreCase("Akash")).toList());
    }

}
