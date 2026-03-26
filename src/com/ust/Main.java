package com.ust;

public class Main {
    public static void main(String[] args) {
        SixWheelersHemanth sixwheeler = new SixWheelersHemanth();
        System.out.println(sixwheeler.modelName());
        System.out.println(sixwheeler.hasAc());
        System.out.println(sixwheeler.maximumSpeed());
        System.out.println(sixwheeler.typeOfVehicle());
        FourWheelersHemanth fourwheels = new FourWheelersHemanth();
        System.out.println(fourwheels.numberOfWheels());
    }
}
