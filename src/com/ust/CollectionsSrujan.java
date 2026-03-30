package com.ust;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsSrujan {
    public void doIterationSrujan(List<String> podMembersNames) {
        for (String podMemberName : podMembersNames) {
            System.out.println(podMemberName);
        }
        podMembersNames.forEach(podMemberName -> System.out.println(podMemberName));

    }

    public void doIteration_2_Srujan(List<String> podMembersNames) {
        for (String podMemberName : podMembersNames) {
            if (!podMemberName.equalsIgnoreCase("kushal")) {
                System.out.println(podMemberName);
            } else {
                continue;
            }
        }
        podMembersNames.stream().filter(podMemberName ->
                        !podMemberName.equalsIgnoreCase("kushal")).toList().
                forEach(podMemberName -> System.out.println(podMemberName));

    }

    public void doIterationNames1Names2(List<String> podMembersNames1, List<String> podMembersNames2) {
        List<String> emptyResult = new ArrayList<>();

        for (String podMemberName1 : podMembersNames1) {
            if (!podMembersNames2.contains(podMemberName1)) {
                emptyResult.add(podMemberName1);
            }
        }
        for (String podMemberName2 : podMembersNames2) {
            if (!podMembersNames1.contains(podMemberName2)) {
                emptyResult.add(podMemberName2);
            }
        }
        for (String emptyResultName : emptyResult) {
            System.out.println(emptyResultName);
        }

        emptyResult.clear();

        emptyResult.addAll(podMembersNames1.stream().filter(podMemberName1 ->
                !podMembersNames2.contains(podMemberName1)).toList());
        emptyResult.addAll(podMembersNames2.stream().filter(podMemberName2 ->
                !podMembersNames1.contains(podMemberName2)).toList());

        emptyResult.forEach(resultNames -> System.out.println(resultNames));
    }

    public void doIterationNames1Names2Merged(List<String> podMembersNames1, List<String> podMembersNames2) {
        List<String> emptyResult = new ArrayList<>();
        List<String> returnResult = new ArrayList<>();
        emptyResult.addAll(podMembersNames2);
        emptyResult.addAll(podMembersNames1);
        for (String name : emptyResult) {
            if (!(podMembersNames1.contains(name) && podMembersNames2.contains(name))) {
                returnResult.add(name);
            }
        }

        System.out.println(emptyResult.stream().filter(name ->
                !(podMembersNames1.contains(name) && podMembersNames2.contains(name))).toList());
    }

    public void doIterationHashSet(HashSet<String> podMembersNames1) {
        for (String podMemberName : podMembersNames1) {
            System.out.println(podMemberName);
        }
        podMembersNames1.forEach(podMemberName -> System.out.println(podMemberName));
    }

    public void doIteration2NamesSet(HashSet<String> podMembersNames1, HashSet<String> podMembersNames2) {
        HashSet<String> emptyResult = new HashSet<>();

        for (String podMemberName1 : podMembersNames1) {
            if (!podMembersNames2.contains(podMemberName1)) {
                emptyResult.add(podMemberName1);
            }
        }
        for (String podMemberName2 : podMembersNames2) {
            if (!podMembersNames1.contains(podMemberName2)) {
                emptyResult.add(podMemberName2);

            }
        }
        for (String emptyResultName : emptyResult) {
            System.out.println(emptyResultName);
        }

        emptyResult.addAll(podMembersNames1.stream().filter(podMemberName1 ->
                !podMembersNames2.contains(podMemberName1)).collect(Collectors.toSet()));
        emptyResult.addAll(podMembersNames2.stream().filter(podMemberName2 ->
                !podMembersNames1.contains(podMemberName2)).collect(Collectors.toSet()));

        emptyResult.forEach(resultNames -> System.out.println(resultNames));
    }

    public void doIterationMergedSet(HashSet<String> podMembersNames1, HashSet<String> podMembersNames2) {
        HashSet<String> emptyResult = new HashSet<>();
        HashSet<String> returnResult = new HashSet<>();
        emptyResult.addAll(podMembersNames2);
        emptyResult.addAll(podMembersNames1);
        for (String name : emptyResult) {
            if (!(podMembersNames1.contains(name) && podMembersNames2.contains(name))) {
                returnResult.add(name);
            }
        }

        System.out.println(emptyResult.stream().filter(name ->
                !(podMembersNames1.contains(name) && podMembersNames2.contains(name))).collect(Collectors.toSet()));
    }

    public void doIterationTempSet(HashSet<String> podMembersNames1, HashSet<String> podMembersNames2) {
        HashSet<String> tempSet = new HashSet<>();
        HashSet<String> combinedSet = new HashSet<>();

        combinedSet.addAll(podMembersNames1);
        combinedSet.addAll(podMembersNames2);

        for (String podMemberName1 : podMembersNames1) {
            if (podMembersNames2.contains(podMemberName1)) {

                tempSet.add(podMemberName1);
            }
        }
        combinedSet.removeAll(tempSet);

        podMembersNames1.stream().filter(podMemberName1 ->
                podMembersNames2.contains(podMemberName1)).forEach(tempSet::add);
        System.out.println(combinedSet.stream().filter(combinedSetName ->
                !tempSet.contains(combinedSetName)).collect(Collectors.toSet()));
    }
}
