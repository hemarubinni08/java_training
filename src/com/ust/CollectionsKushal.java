package com.ust;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsKushal {
    //LISTS
    public void doListIterationUsingForLoop(List<String> podMembersList) {
        for (String podMember : podMembersList) {
            System.out.println(podMember);
        }
        podMembersList.forEach(System.out::println);
    }

    public void doListIterationUsingStream(List<String> podMembersList) {
        System.out.println(podMembersList.stream().toList());
    }

    public void doListIterationExcludeNeighbourUsingLoop(List<String> podMembersList) {
        for (String podMember : podMembersList) {
            if (!podMember.equalsIgnoreCase("srujaN")) {
                System.out.println(podMember);
            }
        }
    }

    public void doListIterationExcludeNeighbourUsingStream(List<String> podMembersList) {
        podMembersList.stream().filter(podMember -> !podMember.equals("Srujan")).toList().
                forEach(System.out::println);
        System.out.println(podMembersList.stream().filter(podMember -> !podMember.equals("Srujan")).toList());
    }

    public void doListIterationRemoveDuplicatesFromTwoListsUsingForLoop(List<String> podMembers, List<String> nonPodMembers) {
        // USING 2 ForLoop
        System.out.println("Result Using Two For Loop:");
        List<String> resultList = new ArrayList<>();
        for (String name : podMembers) {
            if (!nonPodMembers.contains(name)) {
                resultList.add(name);
            }
        }
        for (String name : nonPodMembers) {
            if (!podMembers.contains(name)) {
                resultList.add(name);
            }
        }
        System.out.println(resultList);

        // USING 1 ForLoop
        List<String> resultList1 = new ArrayList<>();
        List<String> mergedList1 = new ArrayList<>();
        mergedList1.addAll(podMembers);
        mergedList1.addAll(nonPodMembers);
        System.out.println("Result Using One For Loop:");
        for (String memberName : mergedList1) {
            if (!(podMembers.contains(memberName) && nonPodMembers.contains(memberName))) {
                resultList1.add(memberName);
            }
        }
        resultList1.forEach(System.out::println);
    }

    public void doListIterationRemoveDuplicatesFromTwoListsUsingStream(List<String> podMembers, List<String> nonPodMembers) {
        //USING TWO STREAMS
        List<String> resultList = new ArrayList<>();
        System.out.println("Result Using Two Streams:");
        resultList.addAll(podMembers.stream().filter(name -> !nonPodMembers.contains(name)).toList());
        resultList.addAll(nonPodMembers.stream().filter(name -> !podMembers.contains(name)).toList());
        resultList.forEach(System.out::println);

        //USING ONE STREAM
        List<String> resultList1 = new ArrayList<>();
        System.out.println();
        System.out.println("Result Using One Stream:");
        resultList1.stream().filter(memberName -> !(podMembers.contains(memberName) && nonPodMembers.contains(memberName)));
        resultList1.forEach(System.out::println);
    }

    //SETS
    public void doSetIterationUsingForLoop(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        //USING ONE FOR LOOP
        System.out.println("Result Using One For Loops:");
        HashSet<String> resultSet = new HashSet<>();
        resultSet.addAll(podMembersSet);
        resultSet.addAll(nonPodMembersSet);
        for (String name : resultSet) {
            System.out.println(name);
        }

        //USING TWO FOR LOOPS
        System.out.println("Result Using Two For Loops:");
        HashSet<String> resultSet1 = new HashSet<>();
        for (String name : podMembersSet) {
            if (!nonPodMembersSet.contains(name)) {
                resultSet1.add(name);
            }
        }

        for (String name : nonPodMembersSet) {
            if (!podMembersSet.contains(name)) {
                resultSet1.add(name);
            }
        }
        resultSet1.forEach(System.out::println);
    }

    public void doSetIterationUsingStream(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        //USING ONE STREAM
        System.out.println("Result Using One Stream:");
        HashSet<String> resultSet = new HashSet<>();
        resultSet.forEach(System.out::println);

        //USING TWO STREAMS
        System.out.println();
        System.out.println("Result Using Two Streams:");
        HashSet<String> resultSet1 = new HashSet<>();
        resultSet1.addAll(podMembersSet.stream().filter(name -> !nonPodMembersSet.contains(name)).collect(Collectors.toSet()));
        resultSet1.addAll(nonPodMembersSet.stream().filter(name -> !podMembersSet.contains(name)).toList());
        resultSet1.forEach(System.out::println);
    }

    public void doSetIterationRemoveDuplicatesFromTwoSetsUsingForLoop(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        //USING ONE FOR LOOP
        System.out.println("Result Using One For Loop:");
        HashSet<String> resultSet = new HashSet<>();
        List<String> commonList = new ArrayList<>();
        resultSet.addAll(podMembersSet);
        resultSet.addAll(nonPodMembersSet);

        for (String podMember : podMembersSet) {
            if (nonPodMembersSet.contains(podMember)) {
                commonList.add(podMember);
            }
        }
        commonList.forEach(resultSet::remove);
        resultSet.forEach(System.out::println);
    }

    public void doSetIterationRemoveDuplicatesFromTwoSetsUsingStream(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        //USING ONE STREAM
        System.out.println("Result Using One Stream:");
        HashSet<String> resultSet = new HashSet<>();
        resultSet.addAll(podMembersSet);
        resultSet.addAll(nonPodMembersSet);
        podMembersSet.stream().filter(nonPodMembersSet::contains).toList().forEach(resultSet::remove);
        resultSet.forEach(System.out::println);

        //USING TWO STREAMS
    }

    //MAPS
    public void doMapIterationUsingForLoop(Map<Integer, String> podMembersMap) {
        System.out.println("Result Using For Loop");
        // Using keySet
        System.out.println("Result Using KeySet");
        for (int id : podMembersMap.keySet()) {
            System.out.println(id + " - " + podMembersMap.get(id));
        }

        // Using EntrySet
        System.out.println();
        System.out.println("Result Using EntrySet");
        for (Map.Entry<Integer, String> member : podMembersMap.entrySet()) {
            System.out.println(member.getKey() + " - " + member.getValue());
        }
    }

    public void doMapIterationUsingStreams(Map<Integer, String> podMembersMap) {
        System.out.println("Result Using Lambda Expression");
        podMembersMap.forEach((id, name) -> System.out.println(id + " - " + name));
    }

    public void doMapIterationExcludingMyNameUsingForLoop(Map<Integer, String> podMembersMap) {
        //REMOVE MY NAME BY CHECKING ID
        for (int id : podMembersMap.keySet()) {
            if (id != 308323) {
                System.out.println(id + " - " + podMembersMap.get(id));
            }
        }

        //REMOVE MY NAME BY CHECKING NAME
        int id1 = 308323;
        String name = "Srujan";
        if (podMembersMap.containsKey(id1) && podMembersMap.containsValue(name)) {
            podMembersMap.remove(id1);
            podMembersMap.values().remove(name);
        }
        podMembersMap.forEach((id, name1) -> System.out.println(id + " - " + name1));
    }

    public void doMapIterationExcludingMyNameUsingStream(Map<Integer, String> podMembersMap) {
        //REMOVE MY NAME BY CHECKING ID
        System.out.println("Result Using one stream and by id");
        podMembersMap.forEach((id, name) -> {
            if (id != 308323) {
                System.out.println(id + " - " + podMembersMap.get(id));
            }
        });

        //REMOVE MY NAME BY CHECKING VALUE

    }

    public void doMapIterationRemoveDuplicatesFromTwoMapsUsingLoop(Map<Integer, String> podMembersMap, Map<Integer, String> nonPodMembersMap) {
        Map<Integer, String> mergedMap = new HashMap<>();
        Map<Integer, String> resultMap = new HashMap<>();
        Map<Integer, String> resultMap1 = new HashMap<>();
        mergedMap.putAll(podMembersMap);
        mergedMap.putAll(nonPodMembersMap);

        //USING TWO FOR LOOP
        System.out.println("Result Using Two For Loops");
        for (Integer key : resultMap.keySet()) {
            if (!podMembersMap.containsKey(key)) {
                resultMap.put(key, resultMap.get(key));
            }
        }

        for (Integer key : resultMap.keySet()) {
            if (!nonPodMembersMap.containsKey(key)) {
                resultMap.put(key, resultMap.get(key));
            }
        }
        resultMap.forEach((id, name) -> System.out.println(id + " - " + name));

        //USING ONE FOR LOOP
        System.out.println("Result Using One For Loop");
        for (Map.Entry<Integer, String> id : mergedMap.entrySet()) {
            if (!(((podMembersMap.containsKey(id.getKey())) && (nonPodMembersMap.containsKey(id.getKey())))
                    || (podMembersMap.containsValue(id.getValue()) && nonPodMembersMap.containsValue(id.getValue())))) {
                resultMap1.put(id.getKey(), id.getValue());
            }
        }
        resultMap1.forEach((id, name) -> System.out.println(id + " - " + name));
    }

    public void doMapIterationRemoveDuplicatesFromTwoMapsUsingStream(Map<Integer, String> podMembersMap, Map<Integer, String> nonPodMembersMap) {
        Map<Integer, String> mergedMap = new HashMap<>();
        Map<Integer, String> resultMap = new HashMap<>();
        mergedMap.putAll(podMembersMap);
        mergedMap.putAll(nonPodMembersMap);
        System.out.println("Result Using Stream");
        mergedMap.entrySet().stream().filter(myKey ->
                        !((podMembersMap.containsKey(myKey.getKey()) && nonPodMembersMap.containsKey(myKey.getKey())) ||
                                (podMembersMap.containsValue(myKey.getValue()) && nonPodMembersMap.containsValue(myKey.getValue()))))
                .forEach(entry -> resultMap.put(entry.getKey(), entry.getValue()));
        resultMap.forEach((id, name) -> System.out.println(id + " - " + name));
    }
}
