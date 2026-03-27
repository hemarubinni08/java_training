package com.ust;

import com.ust.impl.BikeAbstractAishuImpl;

public class VehicleAbstractAishuMain {
    public static void main(String[] args) {
        BikeAbstractAishuImpl bike=new BikeAbstractAishuImpl();

        System.out.println(bike.wheels());
    }
}
