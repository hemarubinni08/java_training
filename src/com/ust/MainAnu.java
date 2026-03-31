package com.ust;

import com.ust.impl.CollectionAnu01;

import java.util.*;

public class MainAnu {
    public static void main(String[] args){
        //list
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Anudeepika");
        list1.add("Ritika");
        list1.add("Hemanth");
        list1.add("Adra");
        list1.add("Akash");
        list1.add("Yeshwanth");
        list2.add("Hemanth");
        list2.add("Keerthi");
        list2.add("Lekhya");
        CollectionAnu object = new CollectionAnu();
        object.iteration(list1);
        object.filterName(list1);
        object.removeDuplicates(list1,list2);

        //Set
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Anudeepika");
        set1.add("Ritika");
        set1.add("Hemanth");
        set1.add("Adra");
        set1.add("Akash");
        set1.add("Yeshwanth");
        set2.add("Hemanth");
        set2.add("Keerthi");
        set2.add("Lekhya");
        CollectionSetAnu obj = new CollectionSetAnu();
        obj.iterationSet(set1);
        obj.filterNameSet(set1);
        obj.removeDuplicatesSet(set1,set2);

        // Map
        Map<String, String> new1 = new HashMap<>();
        Map<String, String> new2 = new HashMap<>();
        new1.put("01", "Anu");
        new1.put("02", "Ritika");
        new1.put("03", "Hemath");
        new1.put("04", "Ardra");
        new1.put("05", "Akash");
        new1.put("06", "Yeshwanth");
        new2.put("02", "Ritika");
        new2.put("08", "Keerti");
        new2.put("09", "Lekhya");
        CollectionAnu01 object1 = new CollectionAnu01();
        object1.hashMapIteration(new1);
        object1.remove(new1);
        object1.duplicates(new1,new2);
    }
}









































//        MainArithemetic object = new MainArithemetic();
//        System.out.println("Addition: " + object.addition(30, 50));
//        System.out.println("subtraction: " + object.subtraction(40, 20));
//        System.out.println("Multiplication : " + object.multiplication(10, 10));

//        VehicleAbstractAnu car = new CarAbstractAnu();
//        VehicleAbstractAnu bike = new BikeAbstractAnu();
//        VehicleAbstractAnu scooty = new ScootyAbstractAnu();
//        VehicleAbstractAnu truck = new TruckAbstractAnu();
//        HeavyVehiclesInterfaceAnu car = new CarInterfaceImpl();
//        VehicleInterfaceAnu scooty = new ScootyInterfaceImpl();

//        BikeInterfaceAnuImpl bike = new BikeInterfaceAnuImpl();
//        ScootyInterfaceAnuImpl scooty = new ScootyInterfaceAnuImpl();
//        CarInterfaceAnuImpl car = new CarInterfaceAnuImpl();
//        TruckInterfaceAnuImpl truck = new TruckInterfaceAnuImpl();


//        System.out.println("Number of wheels in scooty: " + scooty.noOfWheels());
//        System.out.println("Maximum speed : " + car.maxSpeed());
//        System.out.println("Bike brand name: " + bike.getBrand());
//        System.out.println("Brand name of truck: " + truck.getBrand());


//        Vehicle scooty = new ScootyAd();
//        CarAd car = new CarAd();
//        Vehicle bike = new BikeAd();
//        TruckAd truck = new TruckAd();
//
//        System.out.println("Number of wheels in scooty: " + scooty.noOfWheels());
//        System.out.println("Maximum Speed of car: " + car.maxSpeed());
//        System.out.println("Bike brand name: " + bike.getBrand());
//        System.out.println("Maximum mileage for truck: " + truck.maxMileage());
//        System.out.println("Car has Ac : " + car.hasAc());
//        System.out.println("Truck has GPS: " + truck.hasGps());
//        System.out.println("No of passengers in car: " + car.noOfPassengers());

