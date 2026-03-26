package com.ust;

/*
public class Object {
    public static void main(String[] args) {
        ArithmeticOperation obj = new ArithmeticOperation();
        System.out.println(obj.addition(5, 6));
        System.out.println(obj.subraction(8, 4));
        System.out.println(obj.multiplication(3, 5));
    }
}
*/
public class Object {
    public static void main(String[] args) {
        VehicleChaila objveh = new VehicleChaila();
        CarChaila objcar = new CarChaila();
        BikeChaila objbike = new BikeChaila();
        TruckChaila objtruck = new TruckChaila();
        BusChaila objbus = new BusChaila();
        HeavyVehicleChaila obj = new HeavyVehicleChaila();
        System.out.println(objcar.airConditioner());
        System.out.println(objtruck.stearingControl());
        System.out.println(objbike.getNumberOfSeats());
        System.out.println(objcar.getNumberOfWheels());
        System.out.println(objtruck.getBrand());
    }
}