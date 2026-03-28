package com.ust;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionVarsha {
//        public void removeDuplicates(List<String> names1, List<String> names2, List<String> combineList) {
//        combineList.addAll(names1);
//        combineList.addAll(names2);
//
//        List<String> result = new ArrayList<>();
//        for (String name : names1) {
//            if (!names2.contains(name)) {
//                result.add(name);
//            }

//        }
//        for (String name : names2) {
//            if (!names1.contains(name)) {
//                result.add(name);
//            }
//        }

//        names1.stream().filter(names -> !names1.contains(names)).forEach(names -> result.add(names));
//        names2.stream().filter(names -> !names2.contains(names)).forEach(names -> result.add(names));
//        for (String name : combineList) {
//            if (!(names2.contains(name) && (names1.contains(name)))) ;
//            result.add(name);
//        }
//        List<String> combinedLamda = Stream.concat(names1.stream(), names2.stream()).filter(name -> !(names1.contains(name) && names2.contains(name))).toList();
//        System.out.println(combinedLamda);
//        result.forEach(System.out::println);
//        }
//    }
//
//    public void printNames(Set<String> namesSet){
//         for(String name: namesSet){
//            System.out.println(name);
//        }

//        namesSet.forEach(name -> System.out.println(name));//Lamda function
//
//   public void ignorenamesSet(Set<String> namesSet){
//        for(String nameIgnore: namesSet) {
//            if (!nameIgnore.equals("manju")) {
//                System.out.println(nameIgnore);
//            }
//        }
//            System.out.print(namesSet.stream().filter(name ->! name.equalsIgnoreCase("manju")).toList());
//    }
//    public static void removeDuplicates(Set<String> namesSet, Set<String> namesSet1, Set<String> result, Set<String> combineSet) {
//        combineSet.addAll(namesSet);
//        combineSet.addAll(namesSet1);
//
//        for (String name : namesSet1) {
//            if (!namesSet.contains(name)) {
//                result.add(name);
//            }
//        }
//        for (String name : namesSet) {
//            if (!namesSet1.contains(name)) {
//                result.add(name);
//            }
//        }

//        namesSet.stream().filter(names -> !namesSet.contains(names)).forEach(names -> result.add(names));
//        namesSet1.stream().filter(names -> !namesSet1.contains(names)).forEach(names -> result.add(names));
//        for (String name : combineSet) {
//            if (!(namesSet.contains(name) && namesSet1.contains(name))) {
//                result.add(name);
//            }
//            combineSet.stream().filter(name->! (namesSet.contains(name) && namesSet1.contains(name)) ).forEach(names -> result.add(names));
//            result.forEach(System.out::println);
//                 }

//           }
//  public static void removeDuplicates(Set<String> namesSet, Set<String> namesSet1, Set<String> result, Set<String> combineSet,Set<String> duplicateSet) {
//    combineSet.addAll(namesSet);
//    combineSet.addAll(namesSet1);
//    for (String name : namesSet1) {
//        if (!namesSet.contains(name)) {
//            result.add(name);
//        } else {
//            duplicateSet.add(name);
//        }
//    }
//    for (String name : namesSet) {
//        if (!namesSet1.contains(name)) {
//            result.add(name);
//        } else {
//            duplicateSet.add(name);
//        }
//    }
//    for (String name : combineSet) {
//        if (!duplicateSet.contains(name)) {
//            System.out.println(name);
//        }
//    }
//    duplicateSet.stream().filter(name -> !(namesSet.contains(name) && namesSet1.contains(name))).toList();
//    duplicateSet.stream().filter(name -> !duplicateSet.contains(name)).forEach(name -> System.out.println(name));
//    }

//  public void printMembers(Map<String, String> members) {
//        for (Map.Entry<String, String> name : members.entrySet()) {
//            System.out.println(name.getKey() + "-" + name.getValue());
//        }
//        for (String key : members.keySet()) {
//            System.out.println(key + "-" + members.get(key));
//        }
//    }
    public void ignoremembers(Map<String, String> members) {
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

        members.entrySet().stream().filter(name -> !(name.getKey()).equalsIgnoreCase("1")).toList().forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));
        members.entrySet().stream().filter(name -> !(name.getKey()).equalsIgnoreCase("varsha")).toList().forEach(name -> System.out.println(name.getKey() + " - " + name.getValue()));

    }
}











