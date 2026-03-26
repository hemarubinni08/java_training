package com.ust;

public class MainVarsha {
    public static void main(String[] args) {
        VehicleVarsha varshaVehicle = new VehicleVarsha();
        BikeVarsha varshaBike = new BikeVarsha();
        AutoVarsha varshaAuto = new AutoVarsha();
        CarVarsha varshaCar = new CarVarsha();
        BusVarsha varshaBus = new BusVarsha();
        HeavyVehicleVarsha varshaHv = new HeavyVehicleVarsha();


        System.out.println("Bike : " + varshaBike.numberOfWheels() + " " + varshaBike.numberOfLights() + " " + varshaBike.capacityOfFuel() + " " + varshaBike.numberOfDoors() + " " + varshaBike.publicTransportation() + " " + varshaBike.hasAc() + " " + varshaBike.sunRoof());
        System.out.println("Auto : " + varshaAuto.numberOfWheels() + " " + varshaAuto.numberOfLights() + " " + varshaAuto.capacityOfFuel() + " " + varshaAuto.numberOfDoors() + " " + varshaAuto.publicTransportation() + " " + varshaAuto.hasAc() + " " + varshaAuto.sunRoof());
        System.out.println("Car : " + varshaCar.numberOfWheels() + " " + varshaCar.numberOfLights() + " " + varshaCar.capacityOfFuel() + " " + varshaCar.numberOfDoors() + " " + varshaCar.publicTransportation() + " " + varshaCar.hasAc() + " " + varshaCar.sunRoof());
        System.out.println("Bus : " + varshaBus.numberOfWheels() + " " + varshaBus.numberOfLights() + " " + varshaBus.capacityOfFuel() + " " + varshaBus.numberOfDoors() + " " + varshaBus.publicTransportation() + " " + varshaBus.hasAc() + " " + varshaBus.sunRoof());
        System.out.println("Vehicle : " + varshaVehicle.numberOfWheels() + " " + varshaVehicle.numberOfLights() + " " + varshaVehicle.capacityOfFuel());
        System.out.println(" HeavyVehicleVarsha: " + varshaHv.numberOfWheels() + " " + varshaHv.numberOfLights() + " " + varshaHv.capacityOfFuel() + " " + varshaHv.numberOfDoors() + " " + varshaHv.publicTransportation() + " " + varshaHv.hasAc() + " " + varshaHv.sunRoof());
    }
}
