package com.ust.collections;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsYesh {
    public void doIterate(List<String> names) {
        for (String member : names) {
            //System.out.println(member);
        }
        names.stream().forEach(name -> System.out.println(name));
    }

    public void EliminateNeighbor(List<String> names) {
        /*for(String neighbor: names){
            if (neighbor.equals("Akash")){
                continue;
            }else{
                System.out.println(neighbor);
            }
        }*/
        System.out.println(names.stream().filter(name -> !name.equalsIgnoreCase("Akash")).toList());
    }

    public List<Integer> removingDuplicate(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> combinedList = new ArrayList<>();
        /*for(Integer num : firstList){
            if (!secondList.contains(num)){
                combinedList.add(num);
            }
        }
        for(Integer num : secondList){
            if (!firstList.contains(num)){
                combinedList.add(num);
            }
        }
        return combinedList;*/

        combinedList.addAll(firstList);
        combinedList.addAll(secondList);
        List<Integer> resultList = new ArrayList<>();
        for (int num : combinedList) {
            if (!(firstList.contains(num) && secondList.contains(num))) {
                resultList.add(num);
            }
        }


        return resultList;
       /*combinedList.addAll(firstList);
        combinedList.addAll(secondList);
        System.out.println(combinedList.stream().filter(name -> !(firstList.contains(name) && secondList.contains(name))).toList());*/

    }

    public void removingDuplicateInSet(Set<Integer> firstSet, Set<Integer> secondSet) {
        int duplicate = 0;
        /*Set<Integer> resultSet=new HashSet<>();
        for(Integer num : firstSet){
            if (secondSet.contains(num)){
                duplicate=num;
            }else {
                resultSet.add(num);
            }
        }
        secondSet.remove(duplicate);
        resultSet.addAll(secondSet);
        System.out.println(resultSet)
        Set<Integer> streamSet = new HashSet<>();
        streamSet.addAll(firstSet);
        streamSet.addAll(secondSet);
        System.out.println(streamSet.stream().filter(num-> !(firstSet.contains(num) && secondSet.contains(num))).collect(Collectors.toSet()));
        firstSet.stream().filter(num -> !secondSet.contains(num)).forEach(streamSet::add);
        secondSet.stream().filter(num -> !firstSet.contains(num)).forEach(streamSet::add);
        System.out.println(streamSet);*/
        Set<Integer> tempSet=new HashSet<>();
        Set<Integer> combinedSet=new HashSet<>();
        combinedSet.addAll(firstSet);
        combinedSet.addAll(secondSet);
        for(int num : firstSet){
            if(secondSet.contains(num)){
                tempSet.add(num);
            }
        }
        System.out.println(combinedSet.stream().filter(num-> !(tempSet.contains(num))).collect(Collectors.toSet()));
    }
}
