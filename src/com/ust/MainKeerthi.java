package com.ust;

import java.util.*;

public class MainKeerthi {
    public static void main(String[] args){
        HashMap<String,String> newMap=new HashMap<>();
        newMap.put("1","keerthi");
        newMap.put("2","navya");
        newMap.put("3","harsh");
        newMap.put("4","gokul");
        newMap.put("5","deepak");
        newMap.put("6","rohit");
        HashMap<String,String> newMap1=new HashMap<>();
        newMap1.put("1","keerthi");
        newMap1.put("7","lekhya");
        newMap1.put("8","harshith");
        newMap1.put("9","gowha");
        newMap1.put("10","anu");
        newMap1.put("11","amu");


        List<String> names = new ArrayList<>();
        names.add("keerthi");
        names.add("navya");
        names.add("deepak");
        names.add("gokul");
        names.add("harsh");
        names.add("rohit");
        List<String> sree = new ArrayList<>();
        sree.add("keerthi");
        sree.add("anu");
        sree.add("lekya");
        sree.add("lali");
        sree.add("jp");
        sree.add("kush");
        CollectionKv.collectionIterations(names);
        CollectionKv.getNonDuplicate(names,sree);
        CollectionKv.collectionIteration(names);


        HashSet<String> set1 = new HashSet<>();
        set1.add("keerthi");
        set1.add("navya");
        set1.add("harsh");
        set1.add("rohit");
        set1.add("deepak");
        set1.add("gokul");
        HashSet<String> set2 = new HashSet<>();
        set2.add("keerthi");
        set2.add("anu");
        set2.add("lekya");
        set2.add("lali");
        set2.add("jp");
        set2.add("kush");
        CollectionSetKvNew.collectionSetIterations(set1);
        CollectionSetKvNew.hashIteration(set1);
        CollectionSetKvNew.getNonDuplicate(set1,set2);
        CollectionSetKvNew.removeDuplicateSet(set1,set2);

        CollectionHashMapKv.hashMapIteration((HashMap<String, String>) newMap);
        CollectionHashMapKv.checkEmployee((HashMap<String, String>) newMap);
        CollectionHashMapKv.removeDupilcateValues(newMap,newMap1);
        CollectionHashMapKv.doIteration(newMap,newMap1);



    }
}