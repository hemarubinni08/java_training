package com.ust;

class TruckRohit extends CarRohit {
    public String Heavy() {
        return "Heavy Vehicle";
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