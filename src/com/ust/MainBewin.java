package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainBewin {
    public static void main(String[] args) {
        //        int diff = differenceTwoNumbers(5, 2);
//        int diff1 = differenceTwoNumbers(6, 3, 2) ;
//        System.out.println(diff);
//        System.out.println(diff1);
//    }
//
//    public static Integer differenceTwoNumbers(int a, int b) {
//        return a - b;
//    }
//
//    public static Integer differenceTwoNumbers(int num1, int num2, int num3){
//        return num1 - num2 - num3 ;
//    }

        CollectionBew collection = new CollectionBew();
        List<String> names1 = new ArrayList<>();
        names1.add("Bewin");
        names1.add("Aishu");
        names1.add("Chris");

        List<String> names2 = new ArrayList<>();
        names2.add("Cristiano");
        names2.add("Bewin");
        names2.add("Kanye");

        collection.filterUsing1Stream(names1, names2);


    }
}


