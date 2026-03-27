package com.ust;

public class MainAbstractMamtha {
    public static void main(String[] args) {
        CarAbstractMamtha car = new CarAbstractMamtha();
        BusAbstractMamtha bus = new BusAbstractMamtha();
        TruckAbstractMamtha truck = new TruckAbstractMamtha();
        BikeAbstractMamtha bike = new BikeAbstractMamtha();

        System.out.println(car.getFuelType());
        System.out.println(car.getColor());
        System.out.println(car.numberOfWheels());
        System.out.println((car.hasEngine()));
        System.out.println();

        System.out.println(bus.getFuelType());
        System.out.println(bus.getColor());
        System.out.println(bus.numberOfWheels());
        System.out.println((bus.hasEngine()));
        System.out.println();

        System.out.println(truck.getFuelType());
        System.out.println(truck.getColor());
        System.out.println(truck.numberOfWheels());
        System.out.println((truck.hasEngine()));
        System.out.println();

        System.out.println(bike.getFuelType());
        System.out.println(bike.getColor());
        System.out.println(bike.numberOfWheels());
        System.out.println((truck.hasEngine()));

    }
}
