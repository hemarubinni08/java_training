package com.ust;

public class VehicleDeepshika {
    public static void main(String[] args) {
        VehicleBike bike = new VehicleBike();
        VehicleCar car = new VehicleCar();
        VehicleTruck truck = new VehicleTruck();
        VehicleBus bus = new VehicleBus();
        System.out.println("The color of bike: " + bike.color());
        System.out.println("The No of Wheels Present in bike :" + bike.noOfWheels());
        System.out.println("The Fuel in bike: " + bike.typeOfFuel());
        System.out.println("----------------------------------------------");
        System.out.println("The color of car: " + car.color());
        System.out.println("The No of Wheels Present in car :" + car.noOfWheels());
        System.out.println("The Fuel in car: " + car.typeOfFuel());
        //System.out.println("Contains Doors:" + car.hasDoors());
        System.out.println("---------------------------------------------");
        System.out.println("The color of bus: " + bus.color());
        System.out.println("The No of Wheels Present in bus :" + bus.noOfWheels());
        System.out.println("The Fuel in bus: " + bus.typeOfFuel());
        //System.out.println("Has AC:" + bus.hasAc());
        System.out.println("It is a Public Transport:" + bus.isPublicTransport());
        System.out.println("-------------------------------------------");
        System.out.println("The color of truck: " + truck.color());
        System.out.println("The No of Wheels Present in truck :" + truck.noOfWheels());
        System.out.println("The Fuel in truck: " + truck.typeOfFuel());
        //System.out.println("Has AC:" + truck.hasAc());
    }
}

