package com.ust;

import com.ust.impl.*;

public class MainAnu {
    public static void main(String[] args) {
//        VehicleAbstractAnu car = new CarAbstractAnu();
//        VehicleAbstractAnu bike = new BikeAbstractAnu();
//        VehicleAbstractAnu scooty = new ScootyAbstractAnu();
//        VehicleAbstractAnu truck = new TruckAbstractAnu();
//        HeavyVehiclesInterfaceAnu car = new CarInterfaceImpl();
//        VehicleInterfaceAnu scooty = new ScootyInterfaceImpl();

        BikeInterfaceAnuImpl bike = new BikeInterfaceAnuImpl();
        ScootyInterfaceAnuImpl scooty = new ScootyInterfaceAnuImpl();
        CarInterfaceAnuImpl car = new CarInterfaceAnuImpl();
        TruckInterfaceAnuImpl truck = new TruckInterfaceAnuImpl();


//        System.out.println("Number of wheels in scooty: " + scooty.noOfWheels());
//        System.out.println("Maximum speed : " + car.maxSpeed());
//        System.out.println("Bike brand name: " + bike.getBrand());
//        System.out.println("Brand name of truck: " + truck.getBrand());


//        Vehicle scooty = new ScootyAd();
//        CarAd car = new CarAd();
//        Vehicle bike = new BikeAd();
//        TruckAd truck = new TruckAd();
//
        System.out.println("Number of wheels in scooty: " + scooty.noOfWheels());
        System.out.println("Maximum Speed of car: " + car.maxSpeed());
        System.out.println("Bike brand name: " + bike.getBrand());
//        System.out.println("Maximum mileage for truck: " + truck.maxMileage());
//        System.out.println("Car has Ac : " + car.hasAc());
//        System.out.println("Truck has GPS: " + truck.hasGps());
//        System.out.println("No of passengers in car: " + car.noOfPassengers());
    }

}
