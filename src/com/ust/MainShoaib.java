package com.ust;

public class MainShoaib {

    public static void main(String[] args) {
        ShoaibArithmetic obj= new ShoaibArithmetic();
        System.out.println(obj.addition(1,3));
        System.out.println(obj.subtract(3,8));
        System.out.println(obj.multiply(8,8));


        ShoaibVehicle bike = new ShoaibBikes();
        ShoaibBus bus = new ShoaibBus();
        ShoaibVehicle scooty = new ShoaibScooty();
        ShoaibCar car = new ShoaibCar();

        System.out.println(scooty.vehicleBrand());


    }
}
