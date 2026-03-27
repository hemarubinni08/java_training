package com.ust;

import java.util.ArrayList;
import java.util.*;

public class CollectionAnu {
    //    public void filterName(List<String> names) {
//        for (String list : names) {
//            if (list == "Rithika") {
//                continue;
//            }
//            else {
//                System.out.println(list);
//            }
//        }
    public void combinelists(List<String> list1, List<String> list2) {
        List<String> new1 = new ArrayList<>();
//        for (String name : list1) {
//            if (!list2.contains(name)) {
//                new1.add(name);
//            }
//        }
//        for (String name : list2) {
//            if (!list1.contains(name)) {
//                new1.add(name);
//            }
//        }
//        System.out.println(new1);

//        new1.clear();
        new1.addAll(list1.stream().filter(name-> !list2.contains(name)).toList());
        new1.addAll(list2.stream().filter(name-> !list1.contains(name)).toList());
        System.out.println(new1);
    }

}
