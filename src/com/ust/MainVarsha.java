package com.ust;

import com.ust.impl.AutoVarshaImpl;
import com.ust.impl.BikeVarshaImpl;
import com.ust.impl.BusVarshaImpl;
import com.ust.impl.CarVarshaImpl;

public class MainVarsha {
    public static void main(String[] args) {
        VehicleVarsha varshaVehicle = new VehicleVarsha();
        BikeVarshaImpl varshaBike = new BikeVarshaImpl();
        AutoVarshaImpl varshaAuto = new AutoVarshaImpl();
        CarVarshaImpl varshaCar = new CarVarshaImpl();
        BusVarshaImpl varshaBus = new BusVarshaImpl();


        System.out.println("Bike : " + varshaBike.numberOfWheels() + " " + varshaBike.numberOfLights() + " " + varshaBike.capacityOfFuel() + " " + varshaBike.numberOfDoors() + " " + varshaBike.publicTransportation() + " " + varshaBike.hasAc() + " " + varshaBike.sunRoof());
        System.out.println("Auto : " + varshaAuto.numberOfWheels() + " " + varshaAuto.numberOfLights() + " " + varshaAuto.capacityOfFuel() + " " + varshaAuto.numberOfDoors() + " " + varshaAuto.publicTransportation() + " " + varshaAuto.hasAc() + " " + varshaAuto.sunRoof());
        System.out.println("Car : " + varshaCar.numberOfWheels() + " " + varshaCar.numberOfLights() + " " + varshaCar.capacityOfFuel() + " " + varshaCar.numberOfDoors() + " " + varshaCar.publicTransportation() + " " + varshaCar.hasAc() + " " + varshaCar.sunRoof());
        System.out.println("Bus : " + varshaBus.numberOfWheels() + " " + varshaBus.numberOfLights() + " " + varshaBus.capacityOfFuel() + " " + varshaBus.numberOfDoors() + " " + varshaBus.publicTransportation() + " " + varshaBus.hasAc() + " " + varshaBus.sunRoof());
        System.out.println("Vehicle : " + varshaVehicle.numberOfWheels() + " " + varshaVehicle.numberOfLights() + " " + varshaVehicle.capacityOfFuel());
    }
}
