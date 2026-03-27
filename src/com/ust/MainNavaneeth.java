package com.ust;

import com.ust.impl.*;

public class MainNavaneeth {
    public static void main(String[] args) {
        BikeAbsractNavaneeth bn = new BikeAbsractNavaneeth();
        CarAbstractNavaneeth cn = new CarAbstractNavaneeth();
        BusAbstractNavaneeth bbn = new BusAbstractNavaneeth();

        System.out.println("Bike : " + bn.numberOfWheels() + " Wheels, " + bn.brand() + ", " + bn.engineCapacity() + " CC, " + "Gears: " + bn.hasGears()); // + " AC : " + bn.hasAc() + ", " + " Public Tansport : " + bn.hasPublicTransport() + ", " + "DOORS :" + bn.doors());
        System.out.println("Car : " + cn.numberOfWheels() + " Wheels, " + cn.brand() + ", " + cn.engineCapacity() + " CC, " + "Gears: " + cn.hasGears()); //+ " AC : " + cn.hasAc() + ", " + " Public Tansport : " + cn.hasPublicTransport() + ", " + "DOORS :" + cn.doors());
        System.out.println("Bus : " + bbn.numberOfWheels() + " Wheels, " + bbn.brand() + ", " + bbn.engineCapacity() + " CC, " + "Gears: " + bbn.hasGears()); //+ " AC : " + bbn.hasAc() + ", " + " Public Tansport : " + bbn.hasPublicTransport() + ", " + "DOORS :" + bbn.doors());
    }
}
