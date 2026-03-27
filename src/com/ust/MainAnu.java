package com.ust;

//import com.ust.impl.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainAnu {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Anudeepika");
        list1.add("Ritika");
        list1.add("Hemanth");
        list1.add("Ardra");
        list1.add("Akash");
        list1.add("Yeshwanth");
        list2.add("Hemanth");
        list2.add("Keerthi");
        list2.add("Lekhya");
        list2.add("Kuswanth");
        list2.add("JP");
        CollectionAnu object = new CollectionAnu();
        object.combinelists(list1,list2);
//        object.filterName(list);

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
    }

}
