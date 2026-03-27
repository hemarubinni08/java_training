package com.ust.collections;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class CollectionsYesh  {
    public void doIterate(List<String> names){
        for(String member: names){
            //System.out.println(member);
        }
       //names.stream().forEach(name-> System.out.println(name));
    }
    public void EliminateNeighbor(List<String> names){
        /*for(String neighbor: names){
            if (neighbor.equals("Akash")){
                continue;
            }else{
                System.out.println(neighbor);
            }
        }*/
        //System.out.println(names.stream().filter( name->!name.equalsIgnoreCase("Akash")).toList());
    }
    public List<Integer> removingDuplicate(List<Integer> firstList, List<Integer> secondList){
        List<Integer> combinedList=new ArrayList<>();
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
        List<Integer> resultList=new ArrayList<>();
        for(int num : combinedList){
            if (!(firstList.contains(num) && secondList.contains(num))){
                resultList.add(num);
            }
        }


        return resultList;
       /*combinedList.addAll(firstList);
        combinedList.addAll(secondList);
        System.out.println(combinedList.stream().filter(name -> !(firstList.contains(name) && secondList.contains(name))).toList());*/

    }

}
