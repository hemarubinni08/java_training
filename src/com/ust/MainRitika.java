package com.ust;

import com.ust.impl.BikeInterfaceImpl;
import com.ust.impl.CarInterfaceImpl;
import com.ust.impl.TruckInterfaceImpl;
import com.ust.impl.VechicleInterfaceImpl;

public class MainRitika {
    public static void main(String[] args) {
        VechicleInterfaceRitu car=new CarInterfaceImpl();
//        TruckInterfaceImpl truck=new TruckInterfaceImpl();
        VechicleInterfaceRitu bike= new BikeInterfaceImpl();
        HeavyVechicleInterface truck=new TruckInterfaceImpl();


        System.out.println("number of wheels in car: " + car.noOfWheels());
        System.out.println("Mileage of Bike: " + bike.mileage());
        System.out.println("Number of people in truck: " + truck.noOfPeople());



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
