package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        Main m = new Main();
        WaterVehicle v = m.new Boat();
        v.getVehicleName();
        v.getVehicleCapacity();
    }
    public class Boat implements WaterVehicle{
        String name;
        int capacity;
        public String getVehicleName(){
            return name;
        }
        public int getVehicleCapacity(){
           return capacity;
        }
    }
}
