package com.ust;

import java.util.ArrayList;
import java.util.List;

public class ListChaila {
    public static List<Integer> mergelist(List<Integer>list1,List<Integer>list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);

        /*for(int number1 : list1){
            if(!list2.contains(number1)){
                result.add(number1);
            }
        }
        for(int number2 : list2){
            if(!list1.contains(number2)){
                result.add(number2);
            }
        }
        return result;*/
        return result.stream().filter(num -> !(list1.contains(num) && list2.contains(num))).toList();


    }
}
