package com.ust.Impl;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsShoaib {
    public void printNameUsingStream(List<String> names) {
        names.stream().forEach(iterate -> System.out.println(iterate));
    }

    public void printNameExcludingAny(List<String> names) {
        for (String iterator : names) {
            if (!iterator.equals("Fijul")) {
                System.out.println(iterator);
            }
        }
    }

    public void printNameExcludingAnyUsingStream(List<String> names) {
        names.stream().filter(name -> !name.equals("Fijul")).toList().forEach(name -> System.out.println(name));
    }

    public void removeCommonElement(List<String> names1, List<String> names2) {

        List<String> temp = new ArrayList<>();
        for (String iterator : names1) {
            if (!names2.contains(iterator)) {
                temp.add(iterator);
            }
        }
        for (String iterator : names2) {
            if (!names1.contains(iterator)) {
                temp.add(iterator);
            }

        }
        for (String iterator : temp) {
            System.out.println(iterator);
        }
    }

    public void removeCommonElementsUsingStreamForList(List<String> names1, List<String> names2) {
        System.out.println("--- Remove Elements Using Stream For List");

        List<String> temp = Stream.concat(
                names1.stream().filter(name -> !names2.contains(name)),
                names2.stream().filter(name -> !names1.contains(name))
        ).collect(Collectors.toList());


        temp.forEach(System.out::println);
    }
    public void mergedLists(List<String>names1,List<String>names2)
    {
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(names1);
        combinedList.addAll(names2);
        var temp1 = combinedList.stream().filter(name->!names1.contains(name));
        var temp2 = combinedList.stream().filter(name->!names2.contains(name));
        Stream.concat(temp1,temp2).forEach(System.out::println);
    }

    public void hashMethodPrintNames(HashSet<String> set1, HashSet<String> set2) {

        System.out.println("Priniting names from HashSet Using Stream");
        Stream.concat(set1.stream(), set2.stream()).forEach(i -> System.out.println(i));
    }

    public void removeCommonElementUsingForLoopForSet(HashSet<String> set1, HashSet<String> set2) {
        System.out.println("RemoveCommonElementBeforeMerge Using For Loop ");
        HashSet<String> commonElements = new HashSet<>();
        HashSet<String> tempSet = new HashSet<>();
        for (String name : set1) {
            if (set2.contains(name)) {
                System.out.println("Common Elements are" + " " + name);
            }
        }
        for (String name : set1) {
            if (!set2.contains(name)) {
                tempSet.add(name);
            }

        }
        for (String name : set2) {
            if (!set1.contains(name)) {
                tempSet.add(name);
            }

        }
        for (String name : tempSet) {
            System.out.println(name);
        }
    }

    public void removeCommonElementsUsingStreamForSet(HashSet<String> set1, HashSet<String> set2) {
        System.out.println("RemoveCommonElementBeforeMerge Using Stream ");
        set1.stream()
                .filter(set2::contains)
                .forEach(name -> System.out.println("Common Element: " + name));
        List<String> result = Stream.concat(
                        set1.stream().filter(name -> !set2.contains(name)),
                        set2.stream().filter(name -> !set1.contains(name))
                )
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
    public void  printingNamesViaHashMap(HashMap<Integer, String> map)
    {

            for(Integer keyValue:map.keySet())
            {
                System.out.println("Name->"+keyValue+"ID->"+map.get(keyValue));
            }
            for(Map.Entry<Integer, String> name : map.entrySet()){
                String nameval = name.getValue();
                Integer idval = name.getKey();
                System.out.println(nameval + "-" + idval);
            }
    }
    public void printingNameExcludingMy(HashMap<Integer, String> map)
    {
        System.out.println("Printing all names except mine");
        for(Map.Entry<Integer, String> name : map.entrySet()){
            String nameval = name.getValue();
            Integer idval = name.getKey();
            if(idval!=308232) {
                System.out.println(nameval + "-" + idval);
            }
        }


    }
    public void checkAndPrint(HashMap<Integer, String> map, int id) {
        System.out.println("Check & print method");
           if(map.containsKey(id))
           {
              // map.remove(id);
           }
           for(Integer name:map.keySet())
           {
              // System.out.println(name+"-"+map.get(name));
           }
           map.entrySet().stream().filter(name->name.getKey()!=id).forEach(System.out::println);
        }

    }


