package com.ust;

class BikeRohit extends VehicleRohit {
    public String speed() {
        return "300 km/hr";
    }

    @Override
    public Boolean doors() {
        return false;
    }

    @Override
    public Boolean hasAc() {
        return false;
    }

    @Override
    public String noOfSeats() {
        return "Can seat 2 people.";
    }
}
