package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionChailashree {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Chaila");
        names.add("shree");
        names.add("Lekhya");
        names.add("Aron");
        names.add("preetham");
        names.add("logesh");


        for (String name : names) {
            if (name.equalsIgnoreCase("chaila")) {
                System.out.println(names);
            }
        }

        names.stream().filter(name -> !name.equalsIgnoreCase("lekhya")).forEach(name -> System.out.println(name));

    }
    }


