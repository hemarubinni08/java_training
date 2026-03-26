package com.ust;

import com.ust.impl.BikeKushalImpl;
import com.ust.impl.BusKushalImpl;
import com.ust.impl.CarKushalImpl;
import com.ust.impl.TruckKushalImpl;

public class MainKushal {
    static void main() {
//        ArithmeticOperationKushal aok = new ArithmeticOperationKushal();
//        System.out.println("Addition of two numbers is : " + " " + aok.add(6, 2));
//        System.out.println("Subtraction of two numbers is : " + " " + aok.subtract(6, 2));
//        System.out.println("Multiplication of two numbers is : " + " " + aok.multiply(6, 2));
//        System.out.println("Division of two numbers is : " + " " + aok.division(6, 2));
//    }
    /*
    public static int addNum(int n1, int n2) {
        return n1 + n2;
    }*/
//        BikeKushal bk = new BikeKushal();
//        CarKushal ck = new CarKushal();
//        BusKushal buk = new BusKushal();
//        TruckKushal tk = new TruckKushal();
//        String carBrand = bk.getBrand();
//        VehicleKushal carobj = new CarKushal();
//        System.out.println("Bike Brand is : " + bk.getBrand());
//        System.out.println("Bike Doors Count is : " + bk.getDoorsCount());
//        System.out.println("Car Colour is : " + ck.getColour());
//        System.out.println("Car Wheels Count is : " + ck.getWheelsCount());
//        System.out.println("Car Drive Type is is : " + ck.getDriveType());
//        System.out.println("Truck Capacity is : " + tk.getVehicleCapacity());
//        System.out.println("Truck Wheels Count is : " + tk.getWheelsCount());
//        System.out.println("Bus Vehicle Type is : " + buk.getVehicleType());
//        System.out.println("Bus has extra Tyre : " + buk.hasExtraTrye());
//        System.out.println("Truck has AC : " + tk.hasAC());

        BikeKushalImpl bki = new BikeKushalImpl();
        CarKushalImpl cki = new CarKushalImpl();
        TruckKushalImpl tki = new TruckKushalImpl();
        BusKushalImpl buki = new BusKushalImpl();

        System.out.println("Car Colour is : " + cki.getColour());
        System.out.println("Bus Brand is : " + buki.getBrand());
        System.out.println("Bike Comes Under Category of type : " + bki.getVehicleType());
        System.out.println("Truck Has AC : " + tki.hasAC());
        System.out.println("Truck Has This many Doors : " + tki.getDoorsCount());

    }
}
