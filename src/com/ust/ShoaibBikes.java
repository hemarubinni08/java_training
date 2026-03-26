package com.ust;

import java.util.Scanner;

public class ShoaibBikes extends ShoaibVehicle {

    public int numberOfWheels() {
        System.out.println("Bike wheels");
        return 2;
    }

    public String brand() {
        return "Ducati";
    }

    @Override
    public int kilometerDone() {
        return 70000;
    }
}