package com.ust;

public class MainPranav {
    public static void main(String[] args) {
        BikePranav bp = new BikePranav();
        CarPranav cp = new CarPranav();
        TruckPranav tp = new TruckPranav();
        BusPranav bsp = new BusPranav();
        System.out.println(
                "Bike = Bike Engine : " + bp.engineCapacity() + " | Bike Wheels : " + bp.numberOfWheels() + " | Bike Fuel : " + bp.fuelType() + " | Two Seat: " + bp.twoSeater());
        System.out.println("CAr = Car Engine" +
                cp.engineCapacity() + " | Car wheels : " + cp.numberOfWheels() + " | Car Fuel : " + cp.fuelType());
        System.out.println("Truck = Truck Engine " +
                tp.engineCapacity() + " | Truck Wheels : " + tp.numberOfWheels() + " | Truck Fuel : " + tp.fuelType() + " | is this heavy : " + tp.isHeavy() + " | is this public : " + tp.publicTransport());
        System.out.println("Bus = Bus Engine : " +
                bsp.engineCapacity() + " | Bus Wheels : " + bsp.numberOfWheels() + " | Bus Fuel : " + bsp.fuelType() + " | is this heavy : " + bsp.isHeavy() + " | is this public : " + bsp.publicTransport());

    }
}
