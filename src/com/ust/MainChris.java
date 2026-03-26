package com.ust;

//public class MainChris {
//    public static void main(String[] args) {
//        int fact = factorial(5);
//        System.out.println(fact);
//    }
//
//    public static Integer factorial(int num) {
//        int prod = 1;
//        for (int i = 1; i <= num; i++) {
//            prod = prod * i;
//        }
//        return prod;
//    }
//}

public class MainChris {
    public static void main(String[] args) {
        VehicleCJ vehicle = new VehicleCJ();
        CarCJ car = new CarCJ();
        BusCJ bus = new BusCJ();
        BikeCJ bike = new BikeCJ();
        TruckCJ truck = new TruckCJ();
        truck.ac = true;
        bus.ac = true;
        car.ac = true;
        truck.door = 2;
        bus.door = 2;
        car.door = 4;


        System.out.println("Truck Information");
        System.out.println("The Brand is " + truck.getBrand());
        System.out.println("The Insurance Perios is " + truck.insurancePeriod() + " Years");
        System.out.println("NUmber of Doors: " + truck.numberOfDoors(truck.door));
        System.out.println("Number of Gears: " + truck.numberOfGears());
        System.out.println("Number of Wheels: " + truck.numberOfWheels());
        System.out.println("Engine Power: " + truck.engineCc() + " cc");
        System.out.println("Air Conditioning: " + truck.haveAc(truck.ac));
        System.out.println("\n");


        System.out.println("Bike Information");
        System.out.println("The Brand is " + bike.getBrand());
        System.out.println("The Insurance Period is " + bike.insurancePeriod() + " Years");
        System.out.println("Number of Gears: " + bike.numberOfGears());
        System.out.println("Number of Wheels: " + bike.numberOfWheels());
        System.out.println("Engine Power: " + bike.engineCc() + " cc");
    }
}
