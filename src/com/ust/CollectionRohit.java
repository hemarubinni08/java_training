package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionRohit {
    public void printValues(List<String> l1) {
        System.out.println("List of names:");
        for (String name : l1) {
            System.out.println(name);
        }
    }
        public void combinedList (List<String> l1, List<String> l2) {
            List<String> result = new ArrayList<>();
            Stream.concat(
            l1.stream().filter(item->!l2.contains(item)),
                    l2.stream().filter(item->!l1.contains(item))
                           ).forEach(result::add);

            System.out.println("Combined list without duplicates:");
            for (String item : result) {
                System.out.println(item);
            }
            System.out.println("Combined list with LAMBDA:");
            result.forEach(System.out::println);
        }


            public void removeNeighbour (List < String > l1) {
                System.out.println("Without neighbour:");
                for (String name : l1) {
                    if (!name.contains("Harsh")) {
                        System.out.println(name);
                    }


                }
                System.out.println("Using lambda");
                l1.stream().filter(name -> !name.contains("Rohit")).
                        forEach(name -> System.out.println(name));

            }
        }