package com.ust;

import java.util.*;
import java.util.stream.Stream;

public class CollectionVarsha {

    public static void printNames(List<String> names1) {
        for (String name : names1) {
            System.out.println(name);
        }
    }

    public void ignoreNamesFromList(List<String> names1) {
        for (String nameIgnore : names1) {
            if (!nameIgnore.equals("deepa")) {
                System.out.println(nameIgnore);
            }
        }
        System.out.print(names1.stream().filter(name -> !name.equalsIgnoreCase("deepa")).toList());
    }

    public void removeDuplicatesFromList(List<String> names1, List<String> names2, List<String> combineList, List<String> result) {
        combineList.addAll(names1);
        combineList.addAll(names2);

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

        names1.stream().filter(names -> !names1.contains(names)).forEach(names -> result.add(names));
        names2.stream().filter(names -> !names2.contains(names)).forEach(names -> result.add(names));

        for (String name : combineList) {
            if (!(names2.contains(name) && (names1.contains(name)))) {
                result.add(name);
            }
        }

        List<String> combinedLamda = Stream.concat(names1.stream(), names2.stream()).filter(name -> !(names1.contains(name) && names2.contains(name))).toList();
        System.out.println(combinedLamda);
        result.forEach(System.out::println);
    }

    public void printNames(Set<String> namesSet) {
        for (String name : namesSet) {
            System.out.println(name);
        }
        namesSet.forEach(name -> System.out.println(name));//Lamda function
    }

    public void ignoreNamesFromSet(Set<String> namesSet) {
        for (String nameIgnore : namesSet) {
            if (!nameIgnore.equals("manju")) {
                System.out.println(nameIgnore);
            }
        }
        System.out.print(namesSet.stream().filter(name -> !name.equalsIgnoreCase("manju")).toList());
    }

    public static void removeDuplicatesFromSet(Set<String> namesSet, Set<String> namesSet1, Set<String> combineSet,
                                               Set<String> duplicateSet) {
        combineSet.addAll(namesSet);
        combineSet.addAll(namesSet1);

        for (String name : namesSet1) {
            if (!namesSet.contains(name)) {
                namesSet1.add(name);
            } else {
                duplicateSet.add(name);
            }
        }

        for (String name : namesSet) {
            if (!namesSet1.contains(name)) {
                namesSet.add(name);
            } else {
                duplicateSet.add(name);
            }
        }

        namesSet.stream().filter(name -> !namesSet.contains(name)).forEach(System.out::println);
        namesSet1.stream().filter(name -> !namesSet1.contains(name)).forEach(System.out::println);
        for (String name : combineSet) {
            if (!(namesSet.contains(name) && namesSet1.contains(name))) {
                combineSet.add(name);
            }
        }
        duplicateSet.stream().filter(name -> !(namesSet.contains(name) && namesSet1.contains(name))).toList();

        combineSet.stream().filter(name -> !duplicateSet.contains(name)).forEach(name -> System.out.println(name));
    }

    public void printMembers(Map<String, String> members) {
        for (Map.Entry<String, String> name : members.entrySet()) {
            System.out.println(name.getKey() + "-" + name.getValue());
        }

        for (String key : members.keySet()) {
            System.out.println(key + "-" + members.get(key));
        }
        members.forEach((key, value) -> System.out.println(key + "-" + value));
    }

    public void ignoreMembersFromMap(Map<String, String> members) {
        for (String key : members.keySet()) {
            if (!key.equals("1")) {
                System.out.println(key + " - " + members.get(key));
            }
        }

        if (members.containsKey("1")) {
            members.remove("1");
        }

        for (String key : members.keySet()) {
            System.out.println(key + " - " + members.get(key));
        }

        members.entrySet().stream().filter(name -> !(name.getKey()).equalsIgnoreCase("1")).
                toList().forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));
        members.entrySet().stream().filter(name -> !(name.getKey()).equalsIgnoreCase("varsha")).
                toList().forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));
    }

    public static void removeDuplicatesFromMap
            (Map<String, String> members, Map<String, String> members1, Map<String, String> combineMap) {
        combineMap.putAll(members);
        combineMap.putAll(members1);

        for (String key : members.keySet()) {
            if (!(members1.containsKey(key) && members1.containsValue(members1.get(key)))) {
                combineMap.put(key, members.get(key));
            }
        }

        for (String key : members1.keySet()) {
            if (!(members.containsKey(key) && members.containsValue(members.get(key)))) {
                combineMap.put(key, members1.get(key));
            }
        }

        for (String key : combineMap.keySet()) {
            System.out.println(key + "-" + combineMap.get(key));
        }
        combineMap.entrySet().stream().filter(key -> !(members.containsValue(key.getValue()) && members1.containsValue(key.getValue()))).
                forEach(key -> System.out.println(key.getKey() + "-" + key.getValue()));
    }
}