package com.ust;

public class MainLekhya {
    public static void main(String[] args) {
        //System.out.println(largestNumber(683, 380));
        VehicleTwoWheelerLekhya vehicleScooty = new VehicleTwoWheelerLekhya();
        VehicleFourWheelerLekhya vehicleCar = new VehicleFourWheelerLekhya();
        VehicleThreeWheelerLekhya vehicleAuto = new VehicleThreeWheelerLekhya();
        VehicleSixWheelerLekhya vehicleLorry = new VehicleSixWheelerLekhya();
        System.out.println(vehicleScooty.getRpm());
        System.out.println(vehicleScooty.getWarranty());
        System.out.println(vehicleCar.getBrandOfTheVehicle());
        System.out.println(vehicleAuto.getSpeedLimit());
        System.out.println(vehicleLorry.getRegistrationName());
        System.out.println(vehicleLorry.hasAc());
    }

    /*public static Integer largestNumber(int a, int b) {
        return Math.max(a, b);
    }*/
}
