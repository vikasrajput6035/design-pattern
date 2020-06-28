package com.designpattern.decorator;

public class AirBags extends AccessoriesDecorator {

    public AirBags(Car car) {
        super(car);
    }

    public String accessories() {
        return super.accessories() + ", Air Bags";
    }

    public double cost() {
        return super.cost() + 225;
    }

}
