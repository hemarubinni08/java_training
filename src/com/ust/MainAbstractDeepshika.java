package com.ust;

public class MainAbstractDeepshika {
    public static void main(String[] args) {
        CarAbstractDeepshika car = new CarAbstractDeepshika();
        BikeAbstractDeepshika bike = new BikeAbstractDeepshika();
        BusAbstractDeepshika bus = new BusAbstractDeepshika();
        TruckAbstractDeepshika truck = new TruckAbstractDeepshika();

        System.out.println(car.noOFWheels());
        System.out.println(car.typeOfFuel());
        System.out.println(car.color());
        System.out.println(car.hasEngine());
        System.out.println();
        System.out.println(bus.noOFWheels());
        System.out.println(bus.typeOfFuel());
        System.out.println(bus.color());
        System.out.println(bus.hasEngine());
        System.out.println();
        System.out.println(truck.noOFWheels());
        System.out.println(truck.typeOfFuel());
        System.out.println(truck.color());
        System.out.println(truck.hasEngine());
        System.out.println();
        System.out.println(bike.noOFWheels());
        System.out.println(bike.typeOfFuel());
        System.out.println(bike.color());
        System.out.println(bike.hasEngine());
        System.out.println();
    }
}
