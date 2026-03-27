package com.ust;

import com.ust.impl.BikeAbstractBew;
import com.ust.impl.CarAbstractBew;

public class VehicleMainAbstractBew {
    public static void main(String[] args){
        CarAbstractBew car = new CarAbstractBew() ;
        BikeAbstractBew bike = new BikeAbstractBew();

        System.out.println(car.numberOfWheels());
        System.out.println(bike.getEngineCc());
    }
}

