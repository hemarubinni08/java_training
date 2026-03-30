package com.ust;

import com.ust.impl.BikeInterfaceKvImpl;
import com.ust.impl.ScootyInterfaceKvImpl;
import com.ust.impl.TruckInterfaceKvImpl;

public class MainKeerthi {
    public static void main(String[] args) {
        //Vehicle scooty = new ScootyKv();
        //Vehicle bike = new BikeKv();
        //CarKv car=new CarKv();
        //Vehicle truck = new TruckKv();
        //System.out.println("no of wheels:" + scooty.noOfWheels());
        //System.out.println("Max speed:" + car.maxSpeed());
        //System.out.println("Brand name:" + bike.getBrand());
        //System.out.println("Car has AC:" + car.hasAc());
        //System.out.println("No of passengers:" + car.noOfPassengers());
        CarInterfaceKvImpl cr=new CarInterfaceKvImpl();
        BikeInterfaceKvImpl bk=new BikeInterfaceKvImpl();
        TruckInterfaceKvImpl tk=new TruckInterfaceKvImpl();
        ScootyInterfaceKvImpl so=new ScootyInterfaceKvImpl();
        System.out.println("no of wheels:" + cr.noOfWheels());
        System.out.println("Max speed:" + cr.maxSpeed());
        System.out.println("Brand name:" + cr.getBrand());
        System.out.println("no of wheels:" + bk.noOfWheels());
        System.out.println("Max speed:" + bk.maxSpeed());
        System.out.println("Brand name:" + bk.getBrand());
        System.out.println("no of wheels:" + tk.noOfWheels());
        System.out.println("Max speed:" + tk.maxSpeed());
        System.out.println("Brand name:" + tk.getBrand());
        System.out.println("no of wheels:" + so.noOfWheels());
        System.out.println("Max speed:" + so.maxSpeed());
        System.out.println("Brand name:" + so.getBrand());
        System.out.println("Car has AC:" + cr.hasAc());
        System.out.println("No of passengers:" + cr.noOfPassengers());
        System.out.println("Truck has AC:" + tk.hasAc());
        System.out.println("No of passengers:" + tk.noOfPassengers());

    }
}