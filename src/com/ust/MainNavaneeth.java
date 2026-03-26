package com.ust;

public class MainNavaneeth {
    public static void main(String[] args) {
        BikeNavaneeth bn = new BikeNavaneeth();
        CarNavaneeth cn = new CarNavaneeth();
        TruckNavaneeth tn = new TruckNavaneeth();
        BusNavaneeth bbn = new BusNavaneeth();

        System.out.println("Bike : " + bn.numberOfWheels() + " Wheels, " + bn.brand() + ", " + bn.engineCapacity() + " CC, " + bn.stand() + " Stand");
        System.out.println("Car : " + cn.numberOfWheels() + " Wheels, " + cn.brand() + "," + cn.engineCapacity() + " CC, " + " AC : " + cn.hasAc() + ", " + " Public Tansport : " + cn.hasPublicTransport() + ", " + "DOORS :" + cn.doors());
        System.out.println("Truck : " + tn.numberOfWheels() + " Wheels, " + tn.brand() + ", " + tn.engineCapacity() + " CC, " + " AC : " + tn.hasAc() + ", " + " Public Tansport : " + tn.hasPublicTransport() + ", " + "DOORS :" + tn.doors());
        System.out.println("Bus : " + bbn.numberOfWheels() + " Wheels, " + bbn.brand() + ", " + bbn.engineCapacity() + " CC, " + " AC : " + bbn.hasAc() + ", " + " Public Tansport : " + bbn.hasPublicTransport() + ", " + "DOORS :" + bbn.doors());
    }
}
