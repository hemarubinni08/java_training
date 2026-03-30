package com.ust;

import java.util.*;
import java.util.ArrayList;

public class MainRitika {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("101", "Ritu");
        map1.put("102", "Yesh");
        map1.put("103", "Anu");
        map1.put("104", "Hemanta");
        map1.put("105", "Ardra");
        map1.put("106", "Akash");

        map2.put("106", "Akash");
        map2.put("202", "Piyush");
        map2.put("203", "Mansi");
        map2.put("204", "Ayushi");
        map2.put("205", "Shreya");
        map2.put("206", "Ritika");

        CollectionRitika obj = new CollectionRitika();
        obj.duplicateLambdaMapRitu(map1, map2);
    }
}

/**
 * Set<String> set1=new HashSet<>();
 * Set<String> set2=new HashSet<>();
 * set1.add("Kanha");
 * set1.add("Shreya");
 * set1.add("Piyush");
 * set1.add("Rishav");
 * set1.add("Mansi");
 * set1.add("Anu");
 * set1.add("Hemath");
 * <p>
 * set2.add("Yesh");
 * set2.add("Anu");
 * set2.add("Akash");
 * set2.add("Ritu");
 * set2.add("Hemath");
 * set2.add("Ardra");
 * <p>
 * CollectionRitika obj=new CollectionRitika();
 * System.out.println(obj.deleteDuplicateSet(set1,set2));
 */

/**
 * List<String> list1=new ArrayList<>();
 * List<String> list2=new ArrayList<>();
 * list1.add("Ritu");
 * list1.add("Anu");
 * list1.add("Hemanth");
 * list1.add("Yesh");
 * list1.add("Ardra");
 * list1.add("Akash");
 * <p>
 * list2.add("Kushal");
 * list2.add("Harsh");
 * list2.add("Chandra");
 * list2.add("Harsita");
 * list2.add("Mansi");
 * list2.add("Akash");
 * <p>
 * CollectionRitika obj = new CollectionRitika();
 * System.out.print(obj.removeCommon(list1,list2));
 */

/**
 * VechicleAbstractRitu car = new CarAbstractRitu();
 * TruckAbstractRitu truck = new TruckAbstractRitu();
 * VechicleAbstractRitu bike = new BikeAbstractRitu();
 * <p>
 * System.out.println("Number of wheels in car: " + car.noOfTyres());
 * System.out.println("Mileage of Bike: " + bike.mileage());
 * System.out.println("Number of people in truck: " + truck.noOfPeople());
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


/**
 * CarRitu car = new CarRitu();
 * VechicleRitu bike = new BikeRitu();
 * TruckRitu truck = new TruckRitu();
 * VechicleRitu bmw = new BmwRitu();
 * <p>
 * System.out.println("number of wheels in car: " + car.noOfWheels());
 * System.out.println("Mileage of Bike " + bike.mileage());
 * System.out.println("Speed of Truck: " + truck.speed());
 * System.out.println("number of wheels in BMW: " + bmw.noOfWheels());
 * System.out.println("Brand name of car: " + car.brandName());
 * System.out.println("In Truck ac is there or not: " + truck.hasAC());
 */


