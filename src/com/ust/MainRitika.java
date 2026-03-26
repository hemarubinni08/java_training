package com.ust;

import com.ust.impl.BikeInterfaceRituImpl;
import com.ust.impl.CarInterfaceRituImpl;
import com.ust.impl.TruckInterfaceRituImpl;
import com.ust.impl.VechicleInterfaceRituImpl;

public class MainRitika {
    public static void main(String[] args) {
        VechicleInterfaceRitu car=new CarInterfaceRituImpl();
        TruckInterfaceRituImpl truck=new TruckInterfaceRituImpl();
        VechicleInterfaceRitu bike= new BikeInterfaceRituImpl();
//        HeavyVechicleInterface truck=new TruckInterfaceImpl();


        System.out.println("number of wheels in car: " + car.noOfWheels());
        System.out.println("Mileage of Bike: " + bike.mileage());



/**        CarRitu car = new CarRitu();
        VechicleRitu bike = new BikeRitu();
        TruckRitu truck = new TruckRitu();
        VechicleRitu bmw = new BmwRitu();

        System.out.println("number of wheels in car: " + car.noOfWheels());
        System.out.println("Mileage of Bike " + bike.mileage());
        System.out.println("Speed of Truck: " + truck.speed());
        System.out.println("number of wheels in BMW: " + bmw.noOfWheels());
        System.out.println("Brand name of car: " + car.brandName());
        System.out.println("In Truck ac is there or not: " + truck.hasAC());
*/


    }
}
