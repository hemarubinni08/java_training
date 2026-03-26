package com.ust;

import com.ust.impl.BikeHemaImpl;
import com.ust.impl.BusHemaImpl;
import com.ust.impl.CarHemaImpl;
import com.ust.impl.TruckHemaImpl;

public class MainHema {
    public static void main(String[] args) {
//        TruckHema th = new TruckHema();
//        CarHema ch = new CarHema();
//        BikeHema bh = new BikeHema();
//        BusHema b=new BusHema();
//        String brand = th.getBrand();
//        System.out.println(brand);
//        System.out.println(th.hasAirBrakes());
//        System.out.println(th.loadCapacity());
//        String brand1 = ch.getBrand();
//        System.out.println(brand1);
//        String color = ch.color();
//        System.out.println(color);
//        String gear = ch.gearSystem();
//        System.out.println(gear);
//        System.out.println(ch.hasAc());
//        String fuel = bh.getFuelType();
//        System.out.println(fuel);
//        int wheel = bh.getWheelsCount();
//        System.out.println(wheel);
//        System.out.println(b.hasAirBrakes());
//        System.out.println(b.gearSystem());
//        System.out.println(b.getBrand());
//        System.out.println("That,s All I Learned Inheritance");

        BikeHemaImpl bhi = new BikeHemaImpl();
        BusHemaImpl bi = new BusHemaImpl();
        CarHemaImpl chi = new CarHemaImpl();
        TruckHemaImpl thi = new TruckHemaImpl();
        String brand = thi.getBrand();
        System.out.println(brand);
        System.out.println(thi.hasAirBrakes());
        System.out.println(thi.loadCapacity());
        String brand1 = chi.getBrand();
        System.out.println(brand1);
        String color = chi.color();
        System.out.println(color);
        String gear = chi.gearSystem();
        System.out.println(gear);
        System.out.println(chi.hasAc());
        String fuel = bhi.getFuelType();
        System.out.println(fuel);
        int wheel = bhi.getWheelsCount();
        System.out.println(wheel);
        System.out.println(bi.hasAirBrakes());
        System.out.println(bi.gearSystem());
        System.out.println(bi.getBrand());
        System.out.println("That,s All I Learned Interface");

    }
}

