package com.ust;

public class MainVehicleMamtha {
    public static void main(String[] args) {
        CarMamtha car1 = new CarMamtha();
        BusMamtha bus1 = new BusMamtha();
        BikeMamtha bike = new BikeMamtha();
        TruckMamtha truck = new TruckMamtha();

        System.out.println("car color:" + car1.getColor());
        System.out.println("car Wheels:" + car1.getNumberOfWheels());
        System.out.println("car fuelType:" + car1.getFuelType());
        System.out.println("Number of seats in a Car :" + car1.numberOfSeats());


        System.out.println("bus color:" + bus1.getColor());
        System.out.println("bus Wheels:" + bus1.getNumberOfWheels());
        System.out.println("bus fuelType:" + bus1.getFuelType());
        System.out.println("bus is a Public Transport:" + bus1.isPublicTransport());
        System.out.println("bus has AC:" + bus1.isAC());
        System.out.println("Number of Doors in Bus:" + bus1.numberOfDoors());


        System.out.println("Bike color:" + bike.getColor());
        System.out.println("Bike Wheels:" + bike.getNumberOfWheels());
        System.out.println("Bike fuelType:" + bike.getFuelType());
        System.out.println("Bike Brand:" + bike.getBrand());


        System.out.println("Truck color:" + truck.getColor());
        System.out.println("Truck Wheels:" + truck.getNumberOfWheels());
        System.out.println("Truck fuelType:" + truck.getFuelType());
        System.out.println("Truck weight:" + car1.weight());

    }
}
