package com.ust;

import com.ust.impl.*;

import static com.ust.ReverseString.reverseString;
import static com.ust.WhileFijul.printCharacters;

public class MainFijul {
    public static void main(String[] args) {
        System.out.println(reverseString("fijul"));
        printCharacters("hfgdyais");
        BankDetails object = new BankDetails();
        System.out.println(object.addBalance(2000, 3000, 4000));
        System.out.println(object.minusBalance(4000, 2000));
        CarFijul car = new CarFijul();
        VehicleFijul bike = new BikeFijul();
        VehicleFijul vehicle = new VehicleFijul();
        BusFijul bus = new BusFijul();
        TruckFijul truck = new TruckFijul();
        System.out.println(car.isServiceDue());
        System.out.println(bike.numberOfWheels());
        System.out.println(vehicle.brandName());
        System.out.println(bus.brandName());
        System.out.println(truck.isServiceDue());
        CarInterfaceFijulImpl carimpl = new CarInterfaceFijulImpl();
        TruckInterfaceFijulImpl truckimpl = new TruckInterfaceFijulImpl();
        BusInterfaceFijulImpl busimpl = new BusInterfaceFijulImpl();
        BikeInterfaceFijulImpl bikeimpl = new BikeInterfaceFijulImpl();
        System.out.println(carimpl.getTopSpeed());
        System.out.println(truckimpl.isServiceDue());
        System.out.println(busimpl.brandName());
        System.out.println(bikeimpl.totalKilometer());
        VehicleAbstractFijul carabstract = new CarAbstractFijulImpl();
        VehicleAbstractFijul bikeabtract = new BikeAbstractFijulimpl();
        System.out.println(bikeabtract.brandName());
        System.out.println(carabstract.getTopSpeed());
    }
}