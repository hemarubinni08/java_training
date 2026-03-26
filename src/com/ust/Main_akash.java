package com.ust;
//Driver code for ArithmeticAkash and VehicleAkash and its child classes.
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
        System.out.println("Number of wheels: " + VehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + VehicleAkash.applicableTax());
        System.out.println("Seating capacity: " + VehicleAkash.seatingCapacity());
        System.out.println("Power Generated: " + VehicleAkash.powerGenerated());
        System.out.println("----------------------------------------------------");
        //Driver for Car class
        CarVehicleAkash carVehicleAkash = new CarVehicleAkash();
        System.out.println("The details from the Car");
        System.out.println("Number of wheels: " + VehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + VehicleAkash.applicableTax());
        System.out.println("Seating capacity: " + VehicleAkash.seatingCapacity());
        System.out.println("Power Generated: " + VehicleAkash.powerGenerated());
        System.out.println("----------------------------------------------------");
        //Driver for Bike class
        BikeAkash bikeAkash = new BikeAkash();
        System.out.println("The details from the Bike");
        System.out.println("Number of wheels: " + VehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + BikeAkash.applicableTax());
        System.out.println("Seating capacity: " + BikeAkash.seatingCapacity());
        System.out.println("Power Generated: " + BikeAkash.powerGenerated());
        System.out.println("----------------------------------------------------");
        //Driver for Truck class
        TruckAkash truckAkash = new TruckAkash();
        System.out.println("The details from the Truck");
        System.out.println("Number of wheels: " + VehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + TruckAkash.applicableTax());
        System.out.println("Seating capacity: " + TruckAkash.seatingCapacity());
        System.out.println("Power Generated: " + TruckAkash.powerGenerated());
        System.out.println("----------------------------------------------------");
        //Driver for Luxury class
        LuxuryCarAkash luxuryCarAkash = new LuxuryCarAkash();
        System.out.println("The details from the Luxury car");
        System.out.println("Number of wheels: " + VehicleAkash.numberOfWheels());
        System.out.println("Applicable Tax: " + LuxuryCarAkash.applicableTax());
        System.out.println("Seating capacity: " + LuxuryCarAkash.seatingCapacity());
        System.out.println("Power Generated: " + LuxuryCarAkash.powerGenerated());
        System.out.println("----------------------------------------------------");
    }
}
