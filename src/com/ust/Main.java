package com.ust;

import com.ust.impl.TwoWheelersHemanthImpl;

public class Main {
    public static void main(String[] args) {
        /*FourWheelersHemanthImpl four = new FourWheelersHemanthImpl();
        System.out.println(four.typeOfVehicle());
        System.out.println(four.hasAc());
        VehicleInterfaceHemanth bike = new TwoWheelersHemanthImpl();
        bike.typeOfVehicle();
        bike.mileage();*/
        //VehicleBikeHemanth bike = new VehicleBikeHemanth();
        //System.out.println(bike.noOfTyres());
        ArithematicHemanth Arithematicoperation = new ArithematicHemanth();
        System.out.println(Arithematicoperation.addTwoNumbers(2,5));
        System.out.println(Arithematicoperation.addTwoNumbers(2, 5.1F));
        System.out.println(Arithematicoperation.multiplyTwoNumbers(3,5));
    }
}
