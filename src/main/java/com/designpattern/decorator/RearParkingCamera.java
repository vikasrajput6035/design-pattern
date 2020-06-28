package com.designpattern.decorator;

public class RearParkingCamera extends AccessoriesDecorator {

    public RearParkingCamera(Car car) {
        super(car);
    }

    public String accessories() {
        return super.accessories() + ", Rear Parking Camera";
    }

    public double cost() {
        return super.cost() + 500;
    }

}
