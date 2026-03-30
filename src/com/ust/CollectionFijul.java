package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionFijul {
    public void doIteration(List<String> names) {
        System.out.println("simple iteration using for loop" );
        System.out.println("-----------------------------------------");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("simple iteration using for loop(Stream)" );
        System.out.println("-----------------------------------------");
        names.forEach(name -> System.out.println(name));
    }

    public void filterWithFor(List<String> names) {
        System.out.println("filter a name and print rest" );
        System.out.println("-----------------------------------------");
        List<String> templist = new ArrayList<>();
        for(String name: names){
            if(!name.equals("shoaib")){
                templist.add(name);
            }
        }
        System.out.println(templist);
        System.out.println("filter a name and print rest(Stream)" );
        System.out.println("-----------------------------------------");
        System.out.println(names.stream().filter(name -> !name.equalsIgnoreCase("shoaib")).toList());
    }

    public void twoListIteration(List<String> names1, List<String> names2) {
        System.out.println("filtering with 2 lists" );
        System.out.println("-----------------------------------------");
        List<String> newlist2 = new ArrayList<>();
        for (String name1 : names1) {
            if (!names2.contains(name1)) {
                newlist2.add(name1);
            }
        }
        for (String name2 : names2) {
            if (!names1.contains(name2)) {
                newlist2.add(name2);
            }
        }
        for(String name : newlist2){
            System.out.println(name);
        }
        System.out.println("filtering with 2 lists(Stream)" );
        System.out.println("-----------------------------------------");
        newlist2.addAll(names1.stream().filter(name -> !(names2.contains(name) && names1.contains(name))).toList());
        System.out.println(newlist2);
    }

    public void twoListIterationMergeFirst(List<String> names3, List<String> names4) {
        System.out.println("filtering with 2 lists but merge first" );
        System.out.println("-----------------------------------------");
        List<String> newlist = new ArrayList<>();
        String d1 = "";
        String d2 = "";
        newlist.addAll(names4);
        newlist.addAll(names3);
        for(String name : newlist){
            for(String name1 : newlist) {
                if (name.equals(name1)) {
                    d1 = name;
                    d2 = name1;
                }
            }
        }
        newlist.remove(d1);
        newlist.remove(d2);
        System.out.println(newlist);

        System.out.println("filtering with 2 lists but merge first(Stream)" );
        System.out.println("-----------------------------------------");
        List<String> newlist3 = new ArrayList<>();
        newlist3.addAll(names3);
        newlist3.addAll(names4);
        var temp1 = newlist3.stream().filter(name -> !names3.contains(name));
        var temp2 = newlist3.stream().filter(name -> !names4.contains(name));
        Stream.concat(temp1, temp2).forEach(System.out::println);
    }

    public void usingHashSet(HashSet<String> names1, HashSet<String> names2) {
        System.out.println("filtering with 2 sets" );
        System.out.println("-----------------------------------------");
        List<String> temp = new ArrayList<>();
        for (String name : names1) {
            for (String name1 : names2) {
                if (name.equals(name1)) {
                    temp.add(name);
                }
            }
        }
        names1.addAll(names2);
        names1.removeAll(temp);
        System.out.println(names1);

        System.out.println("filtering with 2 sets(Stream)" );
        System.out.println("-----------------------------------------");
        Set<String> duplicates = names1.stream()
                .filter(names2::contains)
                .collect(Collectors.toSet());
        List<String> result = Stream.concat(names1.stream(), names2.stream())
                .filter(name -> !duplicates.contains(name))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public void usingHashmap(Map<Integer, String> hashes) {
        System.out.println("printing key and its corresponding value in map with simple for loop" );
        System.out.println("-----------------------------------------");
        for (Integer keyValue : hashes.keySet()) {
            System.out.println(keyValue + "-" + hashes.get(keyValue));
        }
        System.out.println("printing key and its corresponding value in map with entry set for loop" );
        System.out.println("-----------------------------------------");
        for (Map.Entry<Integer, String> keyValue : hashes.entrySet()) {
            Integer keyval = keyValue.getKey();
            String nameval = keyValue.getValue();
            System.out.println(keyval + "-" + nameval);
        }
    }

    public void filterInMap(Map<Integer, String> hashes, int e_id) {
        System.out.println("remove certain key and its value from map by accessing key" );
        System.out.println("-----------------------------------------");
        if (hashes.containsKey(308351)) {
            hashes.remove(308351);
        }
        for (Integer keyValue : hashes.keySet()) {
            System.out.println(keyValue + "-" + hashes.get(keyValue));
        }
        System.out.println("remove certain key and its value from map by accessing value" );
        System.out.println("-----------------------------------------");
        if (hashes.containsValue("Shoaib")) {
            hashes.values().remove("Shoaib");
        }
        for (Integer keyValue : hashes.keySet()) {
            System.out.println(keyValue + "-" + hashes.get(keyValue));
        }
        System.out.println("remove certain key and its value from map by accessing key(Stream)" );
        System.out.println("-----------------------------------------");
        hashes.entrySet().stream().filter(name -> name.getKey() != e_id).forEach(System.out::println);

    }

    public void duplicateKeyRemoveInMap(Map<Integer, String> hashes1, Map<Integer, String> hashes2) {
        System.out.println("remove key and value if found in both hash maps" );
        System.out.println("-----------------------------------------");
        List<Integer> tempkey = new ArrayList<>();
        for (Integer id1 : hashes1.keySet()) {
            if (hashes2.containsKey(id1)) {
                tempkey.add(id1);
            }
        }
        hashes1.keySet().removeAll(tempkey);
        hashes2.keySet().removeAll(tempkey);
        hashes1.putAll(hashes2);
        for (Integer keyValue : hashes1.keySet()) {
            System.out.println(keyValue + "-" + hashes1.get(keyValue));
        }
        System.out.println("remove key and value if found in both hashmaps(Stream)" );
        System.out.println("-----------------------------------------");
        List<Integer> tempkeystream = hashes1.keySet().stream().filter(hashes2::containsKey).toList();
        hashes1.keySet().removeAll(tempkeystream);
        hashes2.keySet().removeAll(tempkeystream);
        hashes1.putAll(hashes2);
        hashes1.forEach((key, value)-> System.out.println(key + "-" + value));
    }
}