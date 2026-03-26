package com.ust;
//Driver code for ArithmeticAkash and VehicleAkash and its child classes.

import com.ust.impl.BikeInterfaceAkashImpl;
import com.ust.impl.CarInterfaceAkashImpl;
import com.ust.impl.LuxuryCarInterfaceAkashImpl;
import com.ust.impl.TruckInterfaceAkashImpl;

import java.util.Scanner;

public class Main_akash {
    public static void main(String[] args) {
        ArithmeticAkash arithmeticObject = new ArithmeticAkash();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();
        System.out.println("Sum of numbers: " + ArithmeticAkash.add(first_number, second_number));
        System.out.println("Difference of numbers: " + ArithmeticAkash.subtract(first_number, second_number));
        System.out.println("Multiplication result of numbers: " + ArithmeticAkash.multiply(first_number, second_number));
        System.out.println("Division of numbers: " + ArithmeticAkash.division(first_number, second_number));
        //Driver for Vehicle class
        VehicleAkash vehicleAkash = new VehicleAkash();
        System.out.println("The details from the parent");
        System.out.println("Number of wheels: " + vehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + vehicleAkash.applicableTax());
        System.out.println("Seating capacity: " + vehicleAkash.seatingCapacity());
        System.out.println("Power Generated: " + vehicleAkash.powerGenerated());
        System.out.println("----------------------------------------------------");
        //Driver for Car class
        CarVehicleAkash carVehicleAkash = new CarVehicleAkash();
        System.out.println("The details from the Car");
        System.out.println("Number of wheels: " + carVehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + carVehicleAkash.applicableTax());
        System.out.println("Seating capacity: " + carVehicleAkash.seatingCapacity());
        System.out.println("Power Generated: " + carVehicleAkash.powerGenerated());
        System.out.println("Number of doors: " + carVehicleAkash.numberOfDoors());
        System.out.println("This is a heavy vehicle");
        if (carVehicleAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (carVehicleAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (carVehicleAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        //Driver for Bike class
        BikeAkash bikeAkash = new BikeAkash();
        System.out.println("The details from the Bike");
        System.out.println("Number of wheels: " + bikeAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + bikeAkash.applicableTax());
        System.out.println("Seating capacity: " + bikeAkash.seatingCapacity());
        System.out.println("Power Generated: " + bikeAkash.powerGenerated());
        System.out.println("This is a light vehicle");
        System.out.println("----------------------------------------------------");
        //Driver for Truck class
        TruckAkash truckAkash = new TruckAkash();
        System.out.println("The details from the Truck");
        System.out.println("Number of wheels: " + truckAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + truckAkash.applicableTax());
        System.out.println("Seating capacity: " + truckAkash.seatingCapacity());
        System.out.println("Power Generated: " + truckAkash.powerGenerated());
        System.out.println("Number of doors: " + truckAkash.numberOfDoors());
        System.out.println("This is a heavy vehicle");
        if (truckAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (truckAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (truckAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        //Driver for Luxury class
        LuxuryCarAkash luxuryCarAkash = new LuxuryCarAkash();
        System.out.println("The details from the Luxury car");
        System.out.println("Number of wheels: " + luxuryCarAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + luxuryCarAkash.applicableTax());
        System.out.println("Seating capacity: " + luxuryCarAkash.seatingCapacity());
        System.out.println("Power Generated: " + luxuryCarAkash.powerGenerated());
        System.out.println("Number of doors: " + luxuryCarAkash.numberOfDoors());
        System.out.println("This is a heavy vehicle");
        if (luxuryCarAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (luxuryCarAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (luxuryCarAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("Inheritance using interface");
        //Driver for Car class
        CarInterfaceAkashImpl carInterfaceAkash = new CarInterfaceAkashImpl();
        System.out.println("The details from the Car");
        System.out.println("Number of wheels: " + carInterfaceAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + carInterfaceAkash.applicableTax());
        System.out.println("Seating capacity: " + carInterfaceAkash.seatingCapacity());
        System.out.println("Power Generated: " + carInterfaceAkash.powerGenerated());
        System.out.println("Number of doors: " + carInterfaceAkash.numberOfDoors());
        System.out.println("This is a heavy vehicle");
        if (carInterfaceAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (carInterfaceAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (carInterfaceAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        //Driver for Bike class
        BikeInterfaceAkashImpl bikeInterfaceAkash = new BikeInterfaceAkashImpl();
        System.out.println("The details from the Bike");
        System.out.println("Number of wheels: " + bikeInterfaceAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + bikeInterfaceAkash.applicableTax());
        System.out.println("Seating capacity: " + bikeInterfaceAkash.seatingCapacity());
        System.out.println("Power Generated: " + bikeInterfaceAkash.powerGenerated());
        System.out.println("This is a light vehicle");
        System.out.println("----------------------------------------------------");
        //Driver for Truck class
        TruckInterfaceAkashImpl truckInterfaceAkash = new TruckInterfaceAkashImpl();
        System.out.println("The details from the Truck");
        System.out.println("Number of wheels: " + truckInterfaceAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + truckInterfaceAkash.applicableTax());
        System.out.println("Seating capacity: " + truckInterfaceAkash.seatingCapacity());
        System.out.println("Power Generated: " + truckInterfaceAkash.powerGenerated());
        System.out.println("Number of doors: " + truckInterfaceAkash.numberOfDoors());
        System.out.println("This is a heavy vehicle");
        if (truckInterfaceAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (truckInterfaceAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (truckInterfaceAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        //Driver for Luxury class
        LuxuryCarInterfaceAkashImpl luxuryCarInterfaceAkash = new LuxuryCarInterfaceAkashImpl();
        System.out.println("The details from the Luxury car");
        System.out.println("Number of wheels: " + luxuryCarInterfaceAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + luxuryCarInterfaceAkash.applicableTax());
        System.out.println("Seating capacity: " + luxuryCarInterfaceAkash.seatingCapacity());
        System.out.println("Power Generated: " + luxuryCarInterfaceAkash.powerGenerated());
        System.out.println("Number of doors: " + luxuryCarInterfaceAkash.numberOfDoors());
        System.out.println("This is a heavy vehicle");
        if (luxuryCarInterfaceAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (luxuryCarInterfaceAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (luxuryCarInterfaceAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Inheritance using abstract");
        //Driver for Car class
        CarAbstractAkash carAbstractAkash = new CarAbstractAkash();
        System.out.println("The details from the Car");
        System.out.println("Number of wheels: " + carAbstractAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + carAbstractAkash.applicableTax());
        System.out.println("Seating capacity: " + carAbstractAkash.seatingCapacity());
        System.out.println("Power Generated: " + carAbstractAkash.powerGenerated());
        System.out.println("This is a heavy vehicle");
        if (carAbstractAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (carAbstractAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (carAbstractAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        //Driver for Bike class
        BikeAbstractAkash bikeAbstractAkash = new BikeAbstractAkash();
        System.out.println("The details from the Bike");
        System.out.println("Number of wheels: " + bikeAbstractAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + bikeAbstractAkash.applicableTax());
        System.out.println("Seating capacity: " + bikeAbstractAkash.seatingCapacity());
        System.out.println("Power Generated: " + bikeAbstractAkash.powerGenerated());
        System.out.println("This is a light vehicle");
        System.out.println("----------------------------------------------------");
        //Driver for Truck class
        TruckAbstractAkash truckAbstractAkash = new TruckAbstractAkash();
        System.out.println("The details from the Truck");
        System.out.println("Number of wheels: " + truckAbstractAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + truckAbstractAkash.applicableTax());
        System.out.println("Seating capacity: " + truckAbstractAkash.seatingCapacity());
        System.out.println("Power Generated: " + truckAbstractAkash.powerGenerated());
        System.out.println("This is a heavy vehicle");
        if (truckAbstractAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (truckAbstractAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (truckAbstractAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");
        //Driver for Luxury class
        LuxuryCarAbstractAkash luxuryCarAbstractAkash = new LuxuryCarAbstractAkash();
        System.out.println("The details from the Luxury car");
        System.out.println("Number of wheels: " + luxuryCarAbstractAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + luxuryCarAbstractAkash.applicableTax());
        System.out.println("Seating capacity: " + luxuryCarAbstractAkash.seatingCapacity());
        System.out.println("Power Generated: " + luxuryCarAbstractAkash.powerGenerated());
        System.out.println("This is a heavy vehicle");
        if (luxuryCarAbstractAkash.isCommercial()) {
            System.out.println("This is a commercial vehicle.");
        } else {
            System.out.println(("This is a private vehicle"));
        }
        if (luxuryCarAbstractAkash.hasAC()) {
            System.out.println("AC is available");
        } else {
            System.out.println("AC is not available");
        }
        if (luxuryCarAbstractAkash.isMultiAxle()) {
            System.out.println("This is a multi-axle vehicle");
        } else {
            System.out.println("This is a single axle vehicle");
        }
        System.out.println("----------------------------------------------------");


    }
}
