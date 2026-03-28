package com.ust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainAishu {
    public static void main(String[] args) {
//        int n=multiplyNum(2,7);
//        System.out.println(n);
//    }
//    public static Integer multiplyNum(int a,int b){
//        return a*b;
//    }

       CollectionAish collectionAish = new CollectionAish();
        List<String> names = new ArrayList<>();
        names.add("aishu");
        names.add("bewin");
        names.add("chris");

        List<String> name1 = new ArrayList<>();
        name1.add("bewin");
        name1.add("mamtha");
        name1.add("deepshika");

        HashSet<String> names1 = new HashSet<String>();
        names1.add("aishu");
        names1.add("bewin");
        names1.add("chris");

        HashSet<String> names2 = new HashSet<String>();
        names2.add("bewin");
        names2.add("mamtha");
        names2.add("deepshika");


        HashMap<Integer,String>employee=new HashMap<Integer,String>();
        employee.put(308332,"aishu");
        employee.put(308230,"bewin");
        employee.put(308254,"chris");
        employee.put(308242,"nagaraja");
        employee.put(308341,"mamtha");
        employee.put(308335,"deepshika");

        collectionAish.employeeFilterWithContainsKey(employee);
    }
}




