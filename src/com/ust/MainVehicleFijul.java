package com.ust;

public class MainVehicleFijul {
    public static void main(String[] args) {
        CarFijul car = new CarFijul();
        VehicleFijul bike = new BikeFijul();
        VehicleFijul vehicle = new VehicleFijul();
        BusFijul bus = new BusFijul();
        TruckFijul truck = new TruckFijul();

        System.out.println(car.isServiceDue());
        System.out.println(bike.numberOfWheels());
        System.out.println(vehicle.brandName());

    }
}
