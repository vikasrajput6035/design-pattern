package com.designpattern.prototype;

public class AnimalToy extends Toy {

    public AnimalToy(String manufacturingCompany, boolean isRechargeable, boolean isWithRemoteControl) {
        super(manufacturingCompany, isRechargeable, isWithRemoteControl);
    }
    
    @Override
    public Toy copy() {
        return new AnimalToy(manufacturingCompany, isRechargeable, isWithRemoteControl);
    }
}
