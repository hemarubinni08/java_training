package com.ust;

public class CarNagarajan extends HeavyVehicleNagarajan {

    String carInfo() {
        return displayInfo() + ", Doors " + numberOfDoors(door) + ", AC : " + ac;
    }

    String openCarDoor() {
        return "Car door is opened";
    }
}
