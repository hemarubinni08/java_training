package com.ust;

import java.util.*;

public class MainHema {
    public static void main(String[] args) {

////        TruckHema th = new TruckHema();
////        CarHema ch = new CarHema();
////        BikeHema bh = new BikeHema();
////        BusHema b=new BusHema();
////        String brand = th.getBrand();
////        System.out.println(brand);
////        System.out.println(th.hasAirBrakes());
////        System.out.println(th.loadCapacity());
////        String brand1 = ch.getBrand();
////        System.out.println(brand1);
////        String color = ch.color();
////        System.out.println(color);
////        String gear = ch.gearSystem();
////        System.out.println(gear);
////        System.out.println(ch.hasAc());
////        String fuel = bh.getFuelType();
////        System.out.println(fuel);
////        int wheel = bh.getWheelsCount();
////        System.out.println(wheel);
////        System.out.println(b.hasAirBrakes());
////        System.out.println(b.gearSystem());
////        System.out.println(b.getBrand());
////        System.out.println("That,s All I Learned Inheritance");
////        BikeHemaImpl bhi = new BikeHemaImpl();
////        BusHemaImpl bi = new BusHemaImpl();
////        CarHemaImpl chi = new CarHemaImpl();
////        TruckHemaImpl thi = new TruckHemaImpl();
////        String brand = thi.getBrand();
////        System.out.println(brand);
////        System.out.println(thi.hasAirBrakes());
////        System.out.println(thi.loadCapacity());
////        String brand1 = chi.getBrand();
////        System.out.println(brand1);
////        String color = chi.color();
////        System.out.println(color);
////        String gear = chi.gearSystem();
////        System.out.println(gear);
////        System.out.println(chi.hasAc());
////        String fuel = bhi.getFuelType();
////        System.out.println(fuel);
////        int wheel = bhi.getWheelsCount();
////        System.out.println(wheel);
////        System.out.println(bi.hasAirBrakes());
////        System.out.println(bi.gearSystem());
////        System.out.println(bi.getBrand());
////        System.out.println("That,s All I Learned Interface");
//                BikeAbstractHema bk = new BikeAbstractHema();
//                BusAbstractHema bh = new BusAbstractHema();
//                CarAbstractHema cb = new CarAbstractHema();
//                TruckAbstractHema tb = new TruckAbstractHema();
//                String brand = bk.getBrand();
//                System.out.println(brand);
//                System.out.println(tb.loadCapacity());
//                String brand1 = tb.getBrand();
//                System.out.println(brand1);
//                String color = cb.color();
//                System.out.println(color);
//                String gear = cb.getFuelType();
//                System.out.println(gear);
//                String fuel = bk.getFuelType();
//                System.out.println(fuel);
//                int wheel = tb.getWheelsCount();
//                System.out.println(wheel);
//                System.out.println(bh.doorsCount());
//                System.out.println(tb.getBrand());
//                System.out.println(cb.Capacity());
//                System.out.println(bh.getFuelType());
//                System.out.println(bh.rate());

        CollectionHema collectionHema = new CollectionHema();
        List<String> pod1Names = new ArrayList<>();
        pod1Names.add("Hema");
        pod1Names.add("Gopi");
        pod1Names.add("Kushal");
        pod1Names.add("Srujan");
        pod1Names.add("Fijil");
        pod1Names.add("Shoaib");

        List<String> pod2Names= new ArrayList<>();
        pod2Names.add("Srujan");
        pod2Names.add("Nagaraj");
        pod2Names.add("Mamatha");
        pod2Names.add("Deepshika");

        System.out.println("List Iteration Using ForLoop : ");
        collectionHema.forIterationHema(pod1Names);
        System.out.println();

        System.out.println("List Iteration Using Lambda Function : ");
        collectionHema.lambdaIterationHema(pod1Names);
        System.out.println();

        System.out.println("Skip the particular name in List: ");
        collectionHema.filterForIteration(pod1Names);
        System.out.println();

        System.out.println("Skip using filter : ");
        collectionHema.filterLambdaIteration(pod1Names);
        System.out.println();

        System.out.println("Remove duplicate using two for loops : ");
        collectionHema.removeDuplicatesForHema(pod1Names, pod2Names);
        System.out.println();

        System.out.println("Remove duplicate using single for loop : ");
        collectionHema.removeDuplicatesHema(pod1Names, pod2Names);
        System.out.println();

        System.out.println("Remove duplicate using two lambda : ");
        collectionHema.removeDuplicatesTwoLambda(pod1Names, pod2Names);
        System.out.println();

        System.out.println("Remove duplicate using single Lambda : ");
        collectionHema.removeDuplicatesLambda(pod1Names, pod2Names);
        System.out.println();

        HashSet<String> nameSet1 = new HashSet<>();
        nameSet1.add("Gopi");
        nameSet1.add("hema");
        nameSet1.add("kushal");
        nameSet1.add("srujan");
        nameSet1.add("fijul");
        nameSet1.add("shoaib");

        HashSet<String> nameSet2 = new HashSet<>();
        nameSet2.add("Gopi");
        nameSet2.add("nagaraj");
        nameSet2.add("deepshi");
        nameSet2.add("mamatha");
        nameSet2.add("deepak");
        nameSet2.add("nathi");

        System.out.println("Remove Duplicates Using Single For Loop in hashset and Lambda : ");
        collectionHema.hashSetSingleForLoopHema(nameSet1, nameSet2);
        System.out.println();

        System.out.println("Remove Duplicates UsingTwo For Loops in  HashSet and Lambda : ");
        collectionHema.hasSetTwoForLoopsHema(nameSet1, nameSet2);
        System.out.println();

        Map<String, String> namesMap1 = new HashMap<>();
        namesMap1.put("308250", "hema");
        namesMap1.put("308340", "gopi");
        namesMap1.put("308232", "shoaib");
        namesMap1.put("308351", "fijul");
        namesMap1.put("308323", "kushal");
        namesMap1.put("308348", "srujan");

        Map<String, String> namesMap2 = new HashMap<>();
        namesMap2.put("308250", "hema");
        namesMap2.put("308450", "srujan");
        namesMap2.put("308451", "mamatha");
        namesMap2.put("308452", "deepshi");
        namesMap2.put("308453", "praneesh");

        collectionHema.MapIterationHema(namesMap1);
        collectionHema.FilterMap(namesMap1);
        collectionHema.RemoveDuplicatesSingleLoop(namesMap1, namesMap2);
        collectionHema.RemoveDuplicatesTwoLoops(namesMap1, namesMap2);
    }
}

