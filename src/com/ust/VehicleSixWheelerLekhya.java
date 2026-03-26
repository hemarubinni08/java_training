package com.ust;
import java.time.LocalDate;

public class VehicleSixWheelerLekhya extends HeavyVehicleLekhya {
    public static LocalDate getRegistrationDate() {
        return LocalDate.now();
    }

    public static String getPurposeOfUsage() {
        return "Exporting Goods";
    }

    public static String getRegistrationName() {
        return "Kelvin Das";
    }
}
