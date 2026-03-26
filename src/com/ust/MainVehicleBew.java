package com.ust;

public class MainVehicleBew {
    static void main(String[] args) {
        VehicleBew vehicle = new VehicleBew();
        CarBew car = new CarBew();
        BikeBew bike = new BikeBew();
        TruckBew truck = new TruckBew();
        HeavyVehicleBew heavy = new HeavyVehicleBew();

        System.out.println(vehicle.colour());
        System.out.println(vehicle.getBrand());
        System.out.println(car.numberOfDoors());
        System.out.println(car.numberOfWheels());
        System.out.println(bike.getEngineCc());
        System.out.println(truck.hasAc());
        System.out.println(heavy.isPublicTransport());
        System.out.println(car.hasAc());
    }
}
