package com.ust;

public class MainGopi {
    public static void main(String[] args) {
        CarGopi obj1 = new CarGopi();
        BikeGopi obj2 = new BikeGopi();
        BusGopi obj3 = new BusGopi();
        TruckGopi obj4 = new TruckGopi();
        HeavyVehicles obj5 = new HeavyVehicles();
        int wheel = obj1.WheelsCount();
        System.out.println(wheel);
        String seat = obj2.SeatColour();
        System.out.println(seat);
        boolean gear = obj5.Gears();
        System.out.println(gear);
        System.out.println(obj5.price());
    }
}
