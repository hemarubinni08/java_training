package com.ust.impl;

public class VehicleInterfaceMainBew {
    static void main() {
        CarInterfaceBewimpl car = new CarInterfaceBewimpl();
        System.out.println(car.getBrand());

        TruckInterfaceBewimpl truck = new TruckInterfaceBewimpl();
        System.out.println(truck.isPublicTransport());
    }
}
