package com.ust;

public class MainHarshavardhan {
    public static void main(String[] args) {
        VehicleHarsha vehicleObj = new VehicleHarsha();
        System.out.println("Number of wheels in vehicle: " + vehicleObj.numberOfWheels());
        System.out.println("Engine capacity in vehicle: " + vehicleObj.engineCapacity());
        System.out.println("fuel type of vehicle: " + vehicleObj.fuelType());

        bikeHarsha bikeObj = new bikeHarsha();
        System.out.println();
        System.out.println("Number of wheels in bike: " + bikeObj.numberOfWheels());
        System.out.println("Engine capacity in bike: " + bikeObj.engineCapacity());
        System.out.println("fuel type of bike: " + bikeObj.fuelType());
        System.out.println("Can do wheelie: "+ bikeObj.canDoWheelie());

        HeavyVehiclesHarsha carObj = new carHarsha();
        System.out.println();
        System.out.println("Number of wheels in car: " + carObj.numberOfWheels());
        System.out.println("Engine capacity in car: " + carObj.engineCapacity());
        System.out.println("fuel type of car: " + carObj.fuelType());
        System.out.println("car has AC: " + carObj.hasAc());
        System.out.println("Is public transport: " + carObj.isPublicTransport());
        System.out.println("Has sunroof: " + carObj.hasSunRoof());

        HeavyVehiclesHarsha busObj = new BusHarsha();
        System.out.println();
        System.out.println("Number of wheels in bus: " + busObj.numberOfWheels());
        System.out.println("Engine capacity in bus: " + busObj.engineCapacity());
        System.out.println("fuel type of bus: " + busObj.fuelType());
        System.out.println("bus has AC: " + busObj.hasAc());
        System.out.println("Is public transport: " + busObj.isPublicTransport());
        System.out.println("Has sunroof: " + busObj.hasSunRoof());

        HeavyVehiclesHarsha lorryObj = new LorryHarsha();
        System.out.println();
        System.out.println("Number of wheels in Lorry: " + lorryObj.numberOfWheels());
        System.out.println("Engine capacity in Lorry: " + lorryObj.engineCapacity());
        System.out.println("fuel type of Lorry: " + lorryObj.fuelType());
        System.out.println("lorry has AC: " + lorryObj.hasAc());
        System.out.println("Is public transport: " + lorryObj.isPublicTransport());
        System.out.println("Has sunroof: " + lorryObj.hasSunRoof());
    }
}
