package com.ust;

public class AutoSrujan extends VehiclesSrujan {
    public int numberOfWheels() {
        return 3;
    }

    public String fuelType() {
        return "Diesel";
    }

    public int costOfVehicle() {
        return 300000;
    }

    public static class CarAbstractGopi extends VehicleAbstractGopi {
        public int wheelsCount(){
            return 4;
        }

        @Override
        String tyreName() {
            return "";
        }

        @Override
        String seatColour() {
            return "";
        }

        @Override
        int mileage() {
            return 0;
        }

        @Override
        boolean gears() {
            return false;
        }

        public int price(){
            return 578998;
        }
    }
}
