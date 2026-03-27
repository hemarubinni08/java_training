package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionChaila {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Chaila");
        names.add("shree");
        names.add("Lekhya");

       for(String name : names){
            if(name.equalsIgnoreCase("chaila")){
                System.out.println(names);
            }
        }

       names.stream().filter(name-> name.equalsIgnoreCase("shree")).forEach(name-> System.out.println(name));

    }
}
