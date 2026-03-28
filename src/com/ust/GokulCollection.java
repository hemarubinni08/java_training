package com.ust;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GokulCollection {
    public static void displayNames(List<String> names1, List<String> names2 ) {

        List<String> result = new ArrayList<>();

        for (String name : names1) {
            if (!names2.contains(name)) {
                result.add(name);
            }
        }

        for (String name : names2) {
            if (!names1.contains(name)) {
                result.add(name);
            }
        }

        for (String name : result) {
            System.out.println(name);
        }

        names1.stream().filter(name -> !names2.contains(name)).forEach(name->result.add(name));

        names2.stream().filter(name -> !names1.contains(name)).forEach(name->result.add(name));

        result.forEach(name->System.out.println(name));





        //   names.stream().filter(name -> !name.equalsIgnoreCase("deepak")).forEach(name ->System.out.println(name));
    }


}

