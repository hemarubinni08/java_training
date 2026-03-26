package com.ust;

import com.ust.impl.*;

public class MainAron {
    public static void main(String[] args) {
        CarAbstractAronImpl car = new CarAbstractAronImpl();
        System.out.println("Car");
        System.out.println("Brand Name: " + car.getBrandName());
        System.out.println("Car makes the sound " + car.getSound());
        System.out.println("No of wheels in a car " + car.getNoOfWheels());
        System.out.println("No of warranty in years: " + car.getWarrantyInYears());

        System.out.println("\nBike");
        BikeAbstractAronImpl bike = new BikeAbstractAronImpl();
        System.out.println("Brand Name: " + bike.getBrandName());
        System.out.println("Bike makes the sound " + bike.getSound());
        System.out.println("No of wheels in a Bike " + bike.getNoOfWheels());
        System.out.println("No of warranty in years: " + bike.getWarrantyInYears());
        System.out.println("This bike is a " + bike.getBikeType());

        System.out.println("\nAuto");
        AutoAbstractAronImpl auto = new AutoAbstractAronImpl();
        System.out.println("Brand Name: " + auto.getBrandName());
        System.out.println("Auto makes the sound " + auto.getSound());
        System.out.println("No of wheels in a Bike " + auto.getNoOfWheels());
        System.out.println("No of doors in an auto " + auto.getNoOfDoors());
        System.out.println("No of warranty in years: " + auto.getWarrantyInYears());

        System.out.println("\nLorry");
        LorryAbstractClassImpl lorry = new LorryAbstractClassImpl();
        System.out.println("Brand Name: " + lorry.getBrandName());
        System.out.println("Lorry makes the sound " + lorry.getSound());
        System.out.println("No of wheels in a Bike " + lorry.getNoOfWheels());
        System.out.println("No of doors in a Lorry " + lorry.getNoOfDoors());
        System.out.println("No of warranty in years: " + lorry.getWarrantyInYears());
    }
}
