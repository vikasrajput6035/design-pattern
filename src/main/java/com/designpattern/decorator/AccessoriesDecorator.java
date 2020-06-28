package com.designpattern.decorator;

public abstract class AccessoriesDecorator implements Car {

    private Car car;
    
    public AccessoriesDecorator(Car car) {
        this.car = car;
    }
    
    public String accessories() {
        return car.accessories();
    }
    
    public double cost() {
        return car.cost();
    }
}
