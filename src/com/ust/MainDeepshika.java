package com.ust;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainDeepshika {
    public static void main(String[] args) {
//        System.out.println("The product of two numbers are:" +productOfTwoNumbers(5,10));
//
//   public static int productOfTwoNumbers(int a,int b){
//       return a*b;}
        List<String> names = new ArrayList<>();
        names.add("Deepshika");
        names.add("Mamatha");
        names.add("Nagarajan");
        names.add("Bewin");
        names.add("chris");
        names.add("aishu");

        List<String> names2 = new ArrayList<>();
        names2.add("Deepshika");
        names2.add("Hema");
        names2.add("NathiPriya");
        names2.add("parneesh");
        names2.add("visagan");
        names2.add("Deepak");

        CollectionsDeepshika pod2 = new CollectionsDeepshika();
        pod2.iteration(names);
        System.out.println();
        pod2.printNames(names);
        System.out.println();
        System.out.println(pod2.compareNames(names, names2));
    }
}