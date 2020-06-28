package com.designpattern.decorator;

public class BaseModelCar implements Car {

    public String accessories() {
        return "Seat Covers, Rear Parking Sensor";
    }

    public double cost() {
        return 4500;
    }

    
}
