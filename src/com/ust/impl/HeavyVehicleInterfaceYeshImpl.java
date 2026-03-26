package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceYesh;
import com.ust.VehicleInterfaceYesh;

public class HeavyVehicleInterfaceYeshImpl implements HeavyVehiclesInterfaceYesh, VehicleInterfaceYesh {
    @Override
    public int noOfDoors() {
        return 4;

    }

    @Override
    public boolean canCarryLaguage() {
        return false;
    }

    @Override
    public String canAutoDrive() {
        return "Yes";
    }

    @Override
    public int numberOfwheels() {
        return 0;
    }

    @Override
    public int maxSpeedOfVehicle() {
        return 0;
    }

    @Override
    public String colorOfVehicle() {
        return "";
    }
}
