package com.ust;

import java.util.*;

public class MainKeerthi {
    public static void main(String[] args){
        Map<String,String> newMap=new HashMap<>();
        newMap.put("1","keerthi");
        newMap.put("2","navya");
        newMap.put("3","harsh");
        newMap.put("4","gokul");
        newMap.put("5","deepak");
        newMap.put("6","rohit");


//        List<String> names = new ArrayList<>();
//        names.add("keerthi");
//        names.add("navya");
//        names.add("deepak");
//        names.add("gokul");
//        names.add("harsh");
//        names.add("rohit");
//        List<String> sree = new ArrayList<>();
//        sree.add("keerthi");
//        sree.add("anu");
//        sree.add("lekya");
//        sree.add("lali");
//        sree.add("jp");
//        sree.add("kush");
         //CollectionKv.getNonDuplicate(names,sree);
//        CollectionKv.collectionIterations(names);
//        CollectionKv.collectionIteration(names);
////        CollectionKv.listIteration(sree);
//        HashSet<String> set1 = new HashSet<>();
//        set1.add("keerthi");
//        set1.add("navya");
//        set1.add("harsh");
//        set1.add("rohit");
//        set1.add("deepak");
//        set1.add("gokul");
//        HashSet<String> set2 = new HashSet<>();
//        set2.add("keerthi");
//        set2.add("anu");
//        set2.add("lekya");
//        set2.add("lali");
//        set2.add("jp");
//        set2.add("kush");
//        CollectionSetKvNew collectionSetKvNew = new CollectionSetKvNew();
//        collectionSetKvNew.collectionSetIterations(set1);
//        collectionSetKvNew.hashIteration(set1);
//        collectionSetKvNew.getNonDuplicate(set1,set2);
//    CollectionSetKvNew.removeDuplicateSet(set1,set2);
//      CollectionSetKvNew obj=new CollectionSetKvNew();
//       System.out.println(obj.removeDuplicateSet(set1,set2));
        CollectionHashMapKv.hashMapIteration((HashMap<String, String>) newMap);
        CollectionHashMapKv.checkEmployee((HashMap<String, String>) newMap);





    }
}