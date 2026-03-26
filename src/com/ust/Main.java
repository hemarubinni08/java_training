package com.ust;

import com.ust.impl.FourWheelersHemanthImpl;
import com.ust.impl.TwoWheelersHemanthImpl;

public class Main {
    public static void main(String[] args) {
        FourWheelersHemanthImpl four = new FourWheelersHemanthImpl();
        System.out.println(four.typeOfVehicle());
        System.out.println(four.hasAc());
        VehicleInterfaceHemanth bike = new TwoWheelersHemanthImpl();
        bike.typeOfVehicle();
        bike.mileage();
    }
}
