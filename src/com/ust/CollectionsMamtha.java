package com.ust;


import java.util.ArrayList;
import java.util.List;

public class CollectionsMamtha {

    public void printPod2Names(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }

    }
    public void printExceptDeepshika(List<String> names){
        for(String name:names){
            if(!name.equalsIgnoreCase("deepshi")){
                System.out.println(name);
            }
        }

        System.out.println();
        names.stream().filter(name->!name.equalsIgnoreCase("deepshi")).toList().forEach(name-> System.out.println(name));
    }
    public List<String> compareTwoLists(List<String> names,List<String> names1){
        List<String> resultList=new ArrayList<>();

        for(String n1:names){
            if(!names1.contains(n1)){
                resultList.add(n1);
            }
        }
        for (String n2:names1){
            if(!names.contains(n2)){
                resultList.add(n2);
            }
        }

        resultList.clear();

        resultList.addAll(names.stream().filter(n1->!names1.contains(n1)).toList());
        resultList.addAll(names1.stream().filter(n2->!names.contains(n2)).toList());
        return resultList;
    }

    public void removeDuplicate(List<String> names,List<String> names1){
        List<String> common=new ArrayList<>(names);
        common.retainAll(names1);

        List<String> result=new ArrayList<>(names);
        result.addAll(names1);

        result.removeAll(common);
//        System.out.println(result);
        printPod2Names(result);

    }
}

