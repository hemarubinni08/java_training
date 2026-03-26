package com.ust;

public class MainHema {
    public static void main(String[] args) {
        TruckHema th = new TruckHema();
        CarHema ch = new CarHema();
        BikeHema bh = new BikeHema();
        String brand = th.getBrand();
        System.out.println(brand);
        System.out.println(th.hasAirBrakes());
        System.out.println(th.loadCapacity());
        String brand1 = ch.getBrand();
        System.out.println(brand1);
        String color = ch.color();
        System.out.println(color);
        String gear = ch.gearSystem();
        System.out.println(gear);
        System.out.println(ch.hasAc());
        int wheel = bh.getWheelsCount();
        System.out.println(wheel);
        System.out.println(bh.doorsCount());
        String fuel = bh.getFuelType();
        System.out.println(fuel);
        System.out.println("That,s All I Learned Inheritance");
    }
}

