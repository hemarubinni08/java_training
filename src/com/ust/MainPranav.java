package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainPranav {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Pranav");
        list1.add("Harsha");
        list1.add("Chandu");
        list1.add("Navaneeth");
        list1.add("Varsha");
        list1.add("Deepa");
        List<String> list2 = new ArrayList<>();
        list2.add("Pranav");
        list2.add("manu");
        list2.add("kris");
        list2.add("hari");
        list2.add("ram");
        list2.add("gopal");
        list2.add("john");
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(7);
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(5);
        set2.add(9);
        Map<String, String> map = new HashMap<>();
        map.put("308257", "Pranav");
        map.put("308256", "Harsha");
        map.put("308255", "Chandra");
        map.put("308254", "Navaneeth");
        map.put("308253", "Varsha");
        map.put("308252", "Deepa");
        CollectionJavaPranav cp = new CollectionJavaPranav();
        cp.removeSpecificUsingStreamMethodUsingFilter(map);
//        cp.removeSpecificUsingStreamMethodUsingFilter(map);
//        cp.findDuplicatesInSet(set1, set2);
//        System.out.println(cp.findDuplicatesInSet(set1, set2));
//        cp.findDuplicatesInSet(set1, set2);
//        public void printResults(Set<Integer> set1, Set<Integer> set2){
//        System.out.println(set1);
//        System.out.println("different methods");
//        System.out.println(set2);
//    }


    }
//


}

