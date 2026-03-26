package com.ust;

import com.ust.impl.CarInterfaceChailaImpl;
import com.ust.impl.TruckInterfaceChailaImpl;

/*
public class Object {
    public static void main(String[] args) {
        ArithmeticOperation obj = new ArithmeticOperation();
        System.out.println(obj.addition(5, 6));
        System.out.println(obj.subraction(8, 4));
        System.out.println(obj.multiplication(3, 5));
    }
}
*/
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

public class Object {
    public static void main(String[] args){
        BusAbstractChaila objabsbus = new BusAbstractChaila();
        TruckAbstractChaila objabstruck = new TruckAbstractChaila();
        System.out.println(objabsbus.getNumberOfWheels());
        System.out.println(objabstruck.getNumberOfWheels());
    }
}