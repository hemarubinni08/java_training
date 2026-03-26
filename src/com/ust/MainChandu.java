package com.ust;

public class MainChandu {
    public static void main(String[] args) {
        VehicleChandu vc = new VehicleChandu();
        BikeChandu bc = new BikeChandu();
        CarChandu cc = new CarChandu();
        TruckChandu tc = new TruckChandu();
        BusChandu bbc = new BusChandu();

        System.out.println("Vehicle: " + vc.fuel() + ", " + vc.engine() + "cc, "
                + vc.wheels() + " wheels, " + vc.passenger() + " Passengers");
        System.out.println("Bike: " + bc.fuel() + ", " + bc.engine() + "cc, "
                + bc.wheels() + " wheels, " + bc.passenger() + " Passengers");
        System.out.println("Truck: " + tc.fuel() + ", " + tc.engine() + "cc, "
                + tc.wheels() + " wheels, " + tc.passenger() + " Passengers, truck has AC: " + tc.hasAc() + ", truck has sunroof: " + tc.hasSunroof() + ", truck has driver cabin: " + tc.hasDriverCabin());
        System.out.println("Car: " + cc.fuel() + ", " + cc.engine() + "cc, "
                + cc.wheels() + " wheels, " + cc.passenger() + " Passengers");
        System.out.println("Bus: " + bbc.fuel() + ", " + bbc.engine() + "cc, "
                + bbc.wheels() + " wheels, " + bbc.passenger() + " Passengers, bus has AC: " + bbc.hasAc() + ", bus has sunroof: " + bbc.hasSunroof() + ", bus has driver cabin: " + bbc.hasDriverCabin());
    }

}
