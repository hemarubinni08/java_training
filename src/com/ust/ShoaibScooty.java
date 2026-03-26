package com.ust;

public class ShoaibScooty extends ShoaibVehicle {
    public int numberOfWheels() {
        System.out.println("Scooty wheels");
        return 2;
    }

    @Override
    public String vehicleBrand() {
        return "Maaruti Suzuki";
    }

    @Override
    public int kilometerDone() {
        return 55000;
    }
}