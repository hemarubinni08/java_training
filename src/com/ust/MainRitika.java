package com.ust;

public class MainRitika {
    public static void main(String[] args) {
        CarRitu car = new CarRitu();
        VechicleRitu bike = new BikeRitu();
        VechicleRitu truck = new TruckRitu();
        VechicleRitu bmw = new BmwRitu();
//        CarRitu car=new CarRitu();

        System.out.println("number of wheels: " + car.noOfWheels());
        System.out.println("Mileage of Bike " + bike.mileage());
        System.out.println("Speed of Truck: " + truck.speed());
        System.out.println("number of wheels: " + bmw.noOfWheels());
        System.out.println("Brand name of car " + car.brandName());

    }
}
