package com.ust;

import java.util.*;
import java.util.ArrayList;

public class MainRitika {
    public static void main(String[] args) {
        Map<String,String> newMap = new HashMap<>();
        newMap.put("101", "Ritu");
        newMap.put("102", "Yesh");
        newMap.put("103", "Anu");
        newMap.put("104", "Hemanta");
        newMap.put("105", "Ardra");
        newMap.put("106", "Akash");

        CollectionRitika obj=new CollectionRitika();
        obj.specificId(newMap);

//        Set<String> set1=new HashSet<>();
//        Set<String> set2=new HashSet<>();
//        set1.add("Kanha");
//        set1.add("Shreya");
//        set1.add("Piyush");
//        set1.add("Rishav");
//        set1.add("Mansi");
//        set1.add("Anu");
//        set1.add("Hemath");
//
//        set2.add("Yesh");
//        set2.add("Anu");
//        set2.add("Akash");
//        set2.add("Ritu");
//        set2.add("Hemath");
//        set2.add("Ardra");
//
//        CollectionRitika obj=new CollectionRitika();
//        System.out.println(obj.deleteDuplicateSet(set1,set2));

//        List<String> list1=new ArrayList<>();
//        List<String> list2=new ArrayList<>();
//        list1.add("Ritu");
//        list1.add("Anu");
//        list1.add("Hemanth");
//        list1.add("Yesh");
//        list1.add("Ardra");
//        list1.add("Akash");
//
//        list2.add("Kushal");
//        list2.add("Harsh");
//        list2.add("Chandra");
//        list2.add("Harsita");
//        list2.add("Mansi");
//        list2.add("Akash");
//
//        CollectionRitika obj = new CollectionRitika();
//        System.out.print(obj.removeCommon(list1,list2));

    }
}
/**
 * VechicleAbstractRitu car = new CarAbstractRitu();
 * TruckAbstractRitu truck = new TruckAbstractRitu();
 * VechicleAbstractRitu bike = new BikeAbstractRitu();
 * <p>
 * System.out.println("Number of wheels in car: " + car.noOfTyres());
 * System.out.println("Mileage of Bike: " + bike.mileage());
 * System.out.println("Number of people in truck: " + truck.noOfPeople());
 * <p>
 * }
 * }
 */

/**
 * VechicleInterfaceRitu car=new CarInterfaceImpl();
 * TruckInterfaceImpl truck=new TruckInterfaceImpl();
 * VechicleInterfaceRitu bike= new BikeInterfaceImpl();
 * HeavyVechicleInterface truck=new TruckInterfaceImpl();
 * <p>
 * <p>
 * System.out.println("number of wheels in car: " + car.noOfWheels());
 * System.out.println("Mileage of Bike: " + bike.mileage());
 * System.out.println("Number of people in truck: " + truck.noOfPeople());
 */


/**     CarRitu car = new CarRitu();
 VechicleRitu bike = new BikeRitu();
 TruckRitu truck = new TruckRitu();
 VechicleRitu bmw = new BmwRitu();

 System.out.println("number of wheels in car: " + car.noOfWheels());
 System.out.println("Mileage of Bike " + bike.mileage());
 System.out.println("Speed of Truck: " + truck.speed());
 System.out.println("number of wheels in BMW: " + bmw.noOfWheels());
 System.out.println("Brand name of car: " + car.brandName());
 System.out.println("In Truck ac is there or not: " + truck.hasAC());
 */


