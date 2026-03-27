package com.ust;

import com.ust.impl.CarInterfaceChailaImpl;
import com.ust.impl.TruckInterfaceChailaImpl;

import java.util.ArrayList;
import java.util.List;

import static com.ust.ListChaila.mergelist;

//Arthmetic operations
/*
public class Object {
    public static void main(String[] args) {
        ArithmeticOperation obj = new ArithmeticOperation();
        System.out.println(obj.addition(2,3,5));
        System.out.println(obj.subraction(8, 4));
        System.out.println(obj.multiplication(3, 5));
    }
}*/
//inheritance
/*
public class Object {
    public static void main(String[] args) {
        VehicleChaila objveh = new VehicleChaila();
        CarChaila objcar = new CarChaila();
        BikeChaila objbike = new BikeChaila();
        TruckChaila objtruck = new TruckChaila();
        BusChaila objbus = new BusChaila();
        HeavyVehicleChaila obj = new HeavyVehicleChaila();
        System.out.println(objcar.airConditioner());
        System.out.println(objtruck.stearingControl());
        System.out.println(objbike.getNumberOfSeats());
        System.out.println(objcar.getNumberOfWheels());
        System.out.println(objtruck.getBrand());
    }
}

 */
//interface
/*
public class Object{
    public static void main(String[] args){
        CarInterfaceChailaImpl objcarint = new CarInterfaceChailaImpl();
        TruckInterfaceChailaImpl objtruckint = new TruckInterfaceChailaImpl();
        System.out.println(objcarint.stearingControl());
        System.out.println(objtruckint.airConditioner());
    }
}

 */
//abstraction
/*
public class Object {
    public static void main(String[] args){
        BusAbstractChaila objabsbus = new BusAbstractChaila();
        TruckAbstractChaila objabstruck = new TruckAbstractChaila();
        System.out.println(objabsbus.getNumberOfWheels());
        System.out.println(objabstruck.getNumberOfWheels());
    }
}

 */
public class Object{
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(1);
        List<Integer> result = mergelist(list1,list2);
        System.out.println(result);

    }
}