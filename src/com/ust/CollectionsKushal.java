package com.ust;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsKushal {

    public void doIteration(List<String> podMembersList) {
        for (String podMember : podMembersList) {
            System.out.println(podMember);
        }

        podMembersList.forEach(podMember -> System.out.println(podMember));

        System.out.println(podMembersList.stream().toList());
    }

    public void doIterationExcludingNeighbour(List<String> podMembersList) {
        for (String podMember : podMembersList) {
            if (!podMember.equalsIgnoreCase("srujaN")) {
                System.out.println(podMember);
            }
        }

        System.out.println("c1");
        podMembersList.stream().filter(podMember -> !podMember.equals("Srujan")).toList().forEach(podMember -> System.out.println(podMember));
        System.out.println("c2");
        System.out.println(podMembersList.stream().filter(podMember -> !podMember.equals("Srujan")).toList());
    }

    public void doIterationRemoveDuplicatesFromTwoLists(List<String> podMembers, List<String> nonPodMembers) {
        System.out.println("Result Using For Loop:");
        System.out.println();
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

        System.out.println();
        System.out.println("Result Using Lambda Expression: ");
        System.out.println();
        List<String> resultList1 = new ArrayList<>();
        resultList1.addAll(podMembers.stream().filter(name -> !nonPodMembers.contains(name)).toList());
        resultList1.addAll(nonPodMembers.stream().filter(name -> !podMembers.contains(name)).toList());
        resultList1.forEach(name -> System.out.println(name));

    }

    public void doIterationRemoveDuplicatesFromTwoLists1(List<String> podMembers, List<String> nonPodMembers) {
        System.out.println("Result Using For Loop:");
        System.out.println();
        List<String> resultList = new ArrayList<>();
        resultList.addAll(podMembers);
        resultList.addAll(nonPodMembers);
        nonPodMembers.clear();
        podMembers.clear();
        System.out.println(List.of(resultList));
        for (String memberName : resultList) {
            if (!(podMembers.contains(memberName) && nonPodMembers.contains(memberName))) {
                podMembers.add(memberName);
            }
        }
        podMembers.forEach(name -> System.out.println(name));

        System.out.println();
        System.out.println();
        System.out.println("Result Using Lambda Expression: ");
        System.out.println();
        List<String> resultList1 = new ArrayList<>();
        resultList1.addAll(podMembers);
        resultList1.addAll(nonPodMembers);
        nonPodMembers.clear();
        podMembers.clear();
        resultList1.stream().filter(memberName -> !(podMembers.contains(memberName) && nonPodMembers.contains(memberName)));


    }

    public void doIteration(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        System.out.println("Result by using for loop");
        HashSet<String> resultSet = new HashSet<>();
        resultSet.addAll(podMembersSet);
        resultSet.addAll(nonPodMembersSet);
        for (String name : resultSet) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("Result by using for Lambda Expressio");

        resultSet.forEach(name -> System.out.println(name));
    }

    public void doIterationRemoveDuplicatesFromTwoSets(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        System.out.println("Result Using For Loop:");
        HashSet<String> resultSet = new HashSet<>();
        for (String name : podMembersSet) {
            if (!nonPodMembersSet.contains(name)) {
                resultSet.add(name);
            }
        }
        for (String name : nonPodMembersSet) {
            if (!podMembersSet.contains(name)) {
                resultSet.add(name);
            }
        }
        resultSet.forEach(name -> System.out.println(name));

        System.out.println();
        System.out.println("Output Using Lambda Function:");
        HashSet<String> resultSet1 = new HashSet<>();
        resultSet1.addAll(podMembersSet.stream().filter(name -> !nonPodMembersSet.contains(name)).collect(Collectors.toSet()));
        resultSet1.addAll(nonPodMembersSet.stream().filter(name -> !podMembersSet.contains(name)).toList());
        resultSet1.forEach(name -> System.out.println(name));
    }

    public void doIterationRemoveDuplicatesFromTwoSets1(HashSet<String> podMembersSet, HashSet<String> nonPodMembersSet) {
        System.out.println("Result Using For Loop:");
        HashSet<String> resultSet = new HashSet<>();
        List<String> commonList = new ArrayList<>();
        resultSet.addAll(podMembersSet);
        resultSet.addAll(nonPodMembersSet);
        for (String podMember : podMembersSet) {
            if (nonPodMembersSet.contains(podMember)) {
                commonList.add(podMember);
            }
        }
        resultSet.removeAll(commonList);
        resultSet.forEach(name -> System.out.println(name));

        System.out.println();
        System.out.println();
        System.out.println("Result Using Lambda Function: ");

        resultSet.removeAll(podMembersSet.stream().filter(name -> nonPodMembersSet.contains(name)).toList());
        resultSet.forEach(name -> System.out.println(name));

    }

    public void doIteration(Map<Integer, String> podMembersMap) {
        System.out.println("Result Using For Loop");
        System.out.println();
        System.out.println("Pod Member Details:");
        // Using keySet
        for (int id : podMembersMap.keySet()) {
            System.out.println(id + " - " + podMembersMap.get(id));
        }
        // Using EntrySet
        for (Map.Entry<Integer, String> member : podMembersMap.entrySet()) {
            System.out.println(member.getKey() + " - " + member.getValue());
        }


        System.out.println();
        System.out.println("Result Using Lambda Expression");
        System.out.println("Pod Member Details:");
        System.out.println();
        podMembersMap.forEach((id, name) -> System.out.println(id + " - " + name));
    }

    public void doIterationExcludingMyName(Map<Integer, String> podMembersMap) {
        for (int id : podMembersMap.keySet()) {
            if (id != 308323) {
                System.out.println(id + " - " + podMembersMap.get(id));
            }
        }
        podMembersMap.forEach((id, name) -> {
            if (id != 308323) {
                System.out.println(id + " - " + podMembersMap.get(id));
            }
        });

        int id1 = 308323;
        String name = "Srujan";
        if (podMembersMap.containsKey(id1) && podMembersMap.containsValue(name)) {
            podMembersMap.remove(id1);
            podMembersMap.values().remove(name);
        }
        podMembersMap.forEach((id, name1) -> System.out.println(id + " - " + name1));


        //  Map<Integer,String>resultMap = new HashMap<>();
    }
}
