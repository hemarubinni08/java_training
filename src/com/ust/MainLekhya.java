package com.ust;

import com.ust.impl.BikeLekhyaImpl;
import com.ust.impl.CarLekhyaImpl;

public class MainLekhya {
    public static void main(String[] args) {
        CarLekhyaImpl car = new CarLekhyaImpl();
        BikeLekhyaImpl bike = new BikeLekhyaImpl();
        System.out.println(car.getRpm());
        System.out.println(car.hasAc());
        System.out.println(bike.getFuelUsed());
    }
}
