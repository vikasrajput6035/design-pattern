package com.designpattern.decorator;

public class CruizeControl extends AccessoriesDecorator {

    public CruizeControl(Car car) {
        super(car);
    }

    public String accessories() {
        return super.accessories() + ", Cruize Control";
    }

    public double cost() {
        return super.cost() + 750;
    }

}
