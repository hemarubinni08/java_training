package com.ust;

import java.sql.SQLOutput;
import java.util.*;

import com.ust.impl.CollectionHemanth;
import com.ust.impl.FourWheelersHemanthImpl;
import com.ust.impl.TwoWheelersHemanthImpl;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hemanth");
        names.add("Yesh");
        names.add("Ardra");
        names.add("Ritu");
        names.add("Anu");
        names.add("Akash");
        CollectionHemanth getNames = new CollectionHemanth();
        getNames.eliminateNeighbour(names);



        /*FourWheelersHemanthImpl four = new FourWheelersHemanthImpl();
        System.out.println(four.typeOfVehicle());
        System.out.println(four.hasAc());
        VehicleInterfaceHemanth bike = new TwoWheelersHemanthImpl();
        bike.typeOfVehicle();
        bike.mileage();*/
        //VehicleBikeHemanth bike = new VehicleBikeHemanth();
        //System.out.println(bike.noOfTyres());
        /*ArithematicHemanth Arithematicoperation = new ArithematicHemanth();
        System.out.println(Arithematicoperation.addTwoNumbers(2,5));
        System.out.println(Arithematicoperation.addTwoNumbers(2, 5.1F));
        System.out.println(Arithematicoperation.multiplyTwoNumbers(3,5));*/

    }
}
