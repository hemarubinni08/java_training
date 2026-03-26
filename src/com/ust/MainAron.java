package com.ust;

public class MainAron {
    public static void main(String[] args) {
        CarAron car = new CarAron();
        System.out.println("Brand Name: " + car.getBrandName());
        System.out.println("Car makes the sound " + car.getSound());
        System.out.println("No of wheels in a car " + car.getNoOfWheels());
        System.out.println("No of doors in a car " + car.getNoOfDoors());
        System.out.println("Door Type: " + car.getDoorType());
        System.out.println("Does it have a sunroof: " + car.hasSunRoof());
        System.out.println("No of warranty in years: " + car.getWarrantyInYears());
        System.out.println();

        BikeAron bike = new BikeAron();
        System.out.println("Brand Name: " + bike.getBrandName());
        System.out.println("Bike makes the sound " + bike.getSound());
        System.out.println("No of wheels in a Bike " + bike.getNoOfWheels());
        System.out.println("This bike is a " + bike.getBikeType());
        System.out.println("No of warranty in years: " + bike.getWarrantyInYears());
        System.out.println();

        AutoAron auto = new AutoAron();
        System.out.println("Brand Name: " + auto.getBrandName());
        System.out.println("Auto makes the sound " + auto.getSound());
        System.out.println("No of wheels in a Bike " + auto.getNoOfWheels());
        System.out.println("No of doors in an auto " + auto.getNoOfDoors());
        System.out.println("No of warranty in years: " + auto.getWarrantyInYears());
        System.out.println();

        LorryAron lorry = new LorryAron();
        System.out.println("Brand Name: " + lorry.getBrandName());
        System.out.println("Lorry makes the sound " + lorry.getSound());
        System.out.println("No of wheels in a Bike " + lorry.getNoOfWheels());
        System.out.println("No of doors in a Lorry " + lorry.getNoOfDoors());
        System.out.println("Can it carry load: " + lorry.canCarryLoad());
        System.out.println("No of warranty in years: " + lorry.getWarrantyInYears());
    }
}
