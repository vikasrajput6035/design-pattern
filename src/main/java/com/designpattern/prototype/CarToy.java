package com.designpattern.prototype;

public class CarToy extends Toy {

    public CarToy(String manufacturingCompany, boolean isRechargeable, boolean isWithRemoteControl) {
        super(manufacturingCompany, isRechargeable, isWithRemoteControl);
    }
    
    @Override
    public Toy copy() {
        return new CarToy(manufacturingCompany, isRechargeable, isWithRemoteControl);
    }

}
