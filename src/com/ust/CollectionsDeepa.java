package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDeepa {

    public void printNames(List<String> namesList) {

        for (String name : namesList) {
            System.out.println(name);
        }

        namesList.forEach(name -> System.out.println(name));
    }
    public void ignoreName(List<String> namesList) {

        for (String nameIgnored : namesList) {
            if (!nameIgnored.equals("Varsha")) {
                System.out.println(nameIgnored);
            }
        }
        namesList.stream().filter(name->!name.equalsIgnoreCase("Varsha")).toList().forEach(name->System.out.println(name));
//        System.out.println(namesList.stream().filter(name->!name.equalsIgnoreCase("Varsha")).toList());
    }

    public List removeDuplicates(List<String> nameList1,List<String> nameList2, List<String> result,List<String> combineList){

        combineList.addAll(nameList1);
        combineList.addAll(nameList2);
//        for(String name:nameList1){
//            if(!nameList2.contains(name)){
//                result.add(name);
//            }
//        }
//        for(String name: nameList2){
//            if(!nameList1.contains(name)){
//                result.add(name);
//            }
//        }
        for(String name: combineList){
            if(!(nameList2.contains(name) && nameList1.contains(name))){
                result.add(name);
            }
        }

        //result.clear();
//        nameList1.stream().filter(name->!nameList2.contains(name)).forEach(name->result.add(name));
//        nameList2.stream().filter(name->!nameList1.contains(name)).forEach(name->result.add(name));
//
        combineList.stream().filter(name->!(nameList1.contains(name) && nameList2.contains(name))).forEach(name->result.add(name));
        return result;
    }
}
