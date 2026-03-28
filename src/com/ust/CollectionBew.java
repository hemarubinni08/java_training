package com.ust;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionBew {
    public void doIteration(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void filterName(List<String> names) {
        for (String name : names) {
            if (name.equals("Aishu")) {
                continue;
            } else {
                System.out.println(name);
            }
        }
    }

    public void filterUsingLambda(List<String> names) {
        names.stream().filter(name -> !name.equalsIgnoreCase("Aishu")).toList().forEach(name -> System.out.println(name));
    }

    public void filter2Lists(List<String> names1, List<String> names2) {
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
        System.out.println(result);
    }

    public void filter2ListsUsingLambda(List<String> names1, List<String> names2) {
        List<String> result = new ArrayList<>();
        result.addAll(names1.stream().filter(name -> !names2.contains(name)).toList());
        result.addAll(names2.stream().filter(name -> !names1.contains(name)).toList());
        System.out.println(result);
    }

    public void filterUsing1ForLoop(List<String> names1, List<String> names2) {
        List<String> commonList = new ArrayList<>(names1);
        commonList.retainAll(names2);
        List<String> result = new ArrayList<>(names1);
        result.addAll(names2);
        result.removeAll(commonList);

        for (String name : result) {
            System.out.println(name);
        }
    }

    public void filterUsing1Stream(List<String> names1, List<String> names2) {
        List<String> result = Stream.concat(names1.stream(), names2.stream()).filter(name -> !(names1.contains(name) && names2.contains(name))).toList();
        result.forEach(System.out::println);
    }

    public void filterUsingSet(HashSet<String> players1, HashSet<String> players2) {
        List<String> temp = new ArrayList<>();
        for (String player : players1) {
            for (String player1 : players2) {
                if (player.equals(player1)) {
                    temp.add(player);
                }
            }
        }

        HashSet<String> result = new HashSet<>(players1);
        result.addAll(players2);
        result.removeAll(temp);
        for (String name : result) {
            System.out.println(name);
        }
    }

    public void filterSetStream(HashSet<String> players1, HashSet<String> players2) {
        Set<String> result = Stream.concat(players1.stream(), players2.stream()).filter(name -> !(players1.contains(name) && players2.contains(name))).collect(Collectors.toSet());
        result.forEach(System.out::println);
    }

    public void employeeMap(Map<Integer, String> employee) {
        //  if(employee.containsKey(308230)){
        //      employee.remove(308230, "Bewin");
        //  }
        for (Map.Entry<Integer, String> member : employee.entrySet()) {
            if (member.getKey().equals(308230)) {
                continue;
            }
            System.out.println(member.getKey() + "-" + member.getValue());
        }
        //  for (Integer hash : employee.keySet()) {
        //      System.out.println(hash + "-" + employee.get(hash));
        //  }
    }

    public void employeeMapStream(Map<Integer, String> employee) {
        employee.entrySet().stream().filter(entry -> !entry.getKey().equals(308230)).forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }
}
