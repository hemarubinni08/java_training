package com.ust;

public class MainRitika {
    public static void main(String[] args) {
        CarRitu car = new CarRitu();
        VechicleRitu bike = new BikeRitu();
        TruckRitu truck = new TruckRitu();
        VechicleRitu bmw = new BmwRitu();

        System.out.println("number of wheels in car: " + car.noOfWheels());
        System.out.println("Mileage of Bike " + bike.mileage());
        System.out.println("Speed of Truck: " + truck.speed());
        System.out.println("number of wheels in BMW: " + bmw.noOfWheels());
        System.out.println("Brand name of car: " + car.brandName());
        System.out.println("In Truck ac is there or not: " + truck.hasAC());


    }
}
