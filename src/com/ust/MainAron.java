package com.ust;

import com.ust.impl.CarInterfaceAronImpl;
import com.ust.impl.BikeInterfaceAronImpl;
import com.ust.impl.LorryInterfaceAronImpl;
import com.ust.impl.AutoInterfaceAronImpl;

public class MainAron {
    public static void main(String[] args) {
        CarInterfaceAronImpl car = new CarInterfaceAronImpl();
        System.out.println("Car");
        System.out.println("Brand Name: " + car.getBrandName());
        System.out.println("Car makes the sound " + car.getSound());
        System.out.println("No of wheels in a car " + car.getNoOfWheels());
        System.out.println("No of doors in a car " + car.getNoOfDoors());
        System.out.println("No of warranty in years: " + car.getWarrantyInYears());

        System.out.println("\nBike");
        BikeInterfaceAronImpl bike = new BikeInterfaceAronImpl();
        System.out.println("Brand Name: " + bike.getBrandName());
        System.out.println("Bike makes the sound " + bike.getSound());
        System.out.println("No of wheels in a Bike " + bike.getNoOfWheels());
        System.out.println("No of warranty in years: " + bike.getWarrantyInYears());

        System.out.println("\nAuto");
        AutoInterfaceAronImpl auto = new AutoInterfaceAronImpl();
        System.out.println("Brand Name: " + auto.getBrandName());
        System.out.println("Auto makes the sound " + auto.getSound());
        System.out.println("No of wheels in a Bike " + auto.getNoOfWheels());
        System.out.println("No of doors in an auto " + auto.getNoOfDoors());
        System.out.println("No of warranty in years: " + auto.getWarrantyInYears());

        System.out.println("\nLorry");
        LorryInterfaceAronImpl lorry = new LorryInterfaceAronImpl();
        System.out.println("Brand Name: " + lorry.getBrandName());
        System.out.println("Lorry makes the sound " + lorry.getSound());
        System.out.println("No of wheels in a Bike " + lorry.getNoOfWheels());
        System.out.println("No of doors in a Lorry " + lorry.getNoOfDoors());
        System.out.println("No of warranty in years: " + lorry.getWarrantyInYears());
    }
}
