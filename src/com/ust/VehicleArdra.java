package com.ust;

public class VehicleArdra {
    public int numberOfWheels() {
        return 4;
    }

    public String getSizeOfVehicle() {
        return "Medium";
    }

    public int maximumPassengers() {
        return 6;
    }

    public int numberOfDoors() {
        return 4;
    }

    public boolean needsHelmet() {
        return false;
    }

    public static void main(String[] args) {
        VehicleArdra vehicle = new VehicleArdra();
        BikeArdra bike = new BikeArdra();
        AutoArdra auto = new AutoArdra();
        CarArdra car = new CarArdra();
        TruckArdra truck = new TruckArdra();
        BusArdra bus = new BusArdra();
        System.out.println(bus.needsHelmet());
    }
}