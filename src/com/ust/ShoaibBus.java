package com.ust;

import java.util.Scanner;

public class ShoaibBus extends HeavyVehicleShoaib {

    public int numberOfWheels() {
        System.out.println("Bus wheels");
        return 4;
    }

    public String vehicleBrand() {
        return "Tata";
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public int kilometerDone() {
        return 50000;
    }
}