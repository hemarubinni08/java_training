package com.ust;

import com.ust.impl.BikeNavaneethImpl;
import com.ust.impl.BusNavaneethImpl;
import com.ust.impl.CarNavaneethImpl;

public class MainNavaneeth {
    public static void main(String[] args) {
        BikeNavaneethImpl bn = new BikeNavaneethImpl();
        CarNavaneethImpl cn = new CarNavaneethImpl();
        BusNavaneethImpl bbn = new BusNavaneethImpl();

        System.out.println("Bike : " + bn.numberOfWheels() + " Wheels, " + bn.brand() + ", " + bn.engineCapacity() + " CC, " + " AC : " + bn.hasAc() + ", " + " Public Tansport : " + bn.hasPublicTransport() + ", " + "DOORS :" + bn.doors());
        System.out.println("Car : " + cn.numberOfWheels() + " Wheels, " + cn.brand() + "," + cn.engineCapacity() + " CC, " + " AC : " + cn.hasAc() + ", " + " Public Tansport : " + cn.hasPublicTransport() + ", " + "DOORS :" + cn.doors());
        System.out.println("Bus : " + bbn.numberOfWheels() + " Wheels, " + bbn.brand() + ", " + bbn.engineCapacity() + " CC, " + " AC : " + bbn.hasAc() + ", " + " Public Tansport : " + bbn.hasPublicTransport() + ", " + "DOORS :" + bbn.doors());
    }
}
