package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionRohit {
    public void printValues(List<String> names) {
        System.out.println("List of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
        public void combinedList (List<String> names, List<String> names1) {
            List<String> result = new ArrayList<>();

            for (String item : names) {
                if (!result.contains(item)) {
                    result.add(item);
                }
            }

            for (String item : names1) {
                if (!result.contains(item)) {
                    result.add(item);
                }
            }
            System.out.println("Combined list without duplicates:");
            for (String item : result) {
                System.out.println(item);
            }
        }


            public void removeNeighbour (List < String > names) {
                System.out.println("Without neighbour:");
                for (String name : names) {
                    if (!name.contains("Harsh")) {
                        System.out.println(name);
                    }


                }
                System.out.println("Using lambda");
                names.stream().filter(name -> !name.contains("Rohit")).
                        forEach(name -> System.out.println(name));

            }
        }