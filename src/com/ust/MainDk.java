package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainDk {
    public static void main(String[] args) {
//        ArithmeticOperations a = new ArithmeticOperations();
//        System.out.println(a.addition(2, 3));
//        System.out.println(a.subtraction(5, 4));
//        System.out.println(a.multiplication(2, 3));
//        System.out.println(a.multiplication(3, 4, 5));
//        System.out.println(a.division(10, 2));
        List<String> namesList = new ArrayList<>();
        List<String> nameList1 = new ArrayList<>();
        List<String> nameList2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<String> combineList = new ArrayList<>();

        namesList.add("Deepa");
        namesList.add("Varsha");
        namesList.add("Harsha");
        namesList.add("Pranav");
        namesList.add("Navaneeth");
        namesList.add("Chandu");

        nameList1.add("Deepa");
        nameList1.add("Varsha");
        nameList1.add("Harsha");
        nameList1.add("Pranav");
        nameList1.add("Navaneeth");
        nameList1.add("Chandu");

        nameList2.add("Deepa");
        nameList2.add("karthika");
        nameList2.add("thammi");
        nameList2.add("chaila");
        nameList2.add("Nava");
        nameList2.add("sruthi");


        CollectionsDeepa cd = new CollectionsDeepa();
//        cd.printNames(namesList);
//        cd.ignoreName(namesList);

//        System.out.println(cd.removeDuplicates(nameList1,nameList2,result));
        cd.removeDuplicates(nameList1, nameList2, result, combineList);
        result.forEach(System.out::println);

    }
}
