package com.ust;

import com.ust.impl.*;

public class MainPranav {
    public static void main(String[] args) {
        Bike1abstractPranav bp = new Bike1abstractPranav();
        Car1AbstractPranav cp = new Car1AbstractPranav();
        Truck1PranavImpl tp = new Truck1PranavImpl();
        Bus1AbstractPranav bsp = new Bus1AbstractPranav();
        System.out.println(
                "Bike = Bike Engine : " + bp.engineCapacity() + " | Bike Wheels : " + bp.numberOfWheels() + " | Bike Fuel : " + bp.fuelType());
        System.out.println("CAr = Car Engine : " +
                cp.engineCapacity() + " | Car wheels : " + cp.numberOfWheels() + " | Car Fuel : " + cp.fuelType());
        System.out.println("Truck = Truck Engine " +
                tp.engineCapacity() + " | Truck Wheels : " + tp.numberOfWheels() + " | Truck Fuel : " + tp.fuelType() + " | Has Sunroof : " + tp.hasSunRoof() + " | is Heavy : " + tp.isHeavy());
        System.out.println("Bus = " + bsp.engineCapacity() + " | Bus Wheels : " + bsp.numberOfWheels() + " | Bus Fuel : " + bsp.fuelType() + " | Has Sunroof : " + tp.hasSunRoof() + " | is Heavy : " + tp.isHeavy());

    }
}
