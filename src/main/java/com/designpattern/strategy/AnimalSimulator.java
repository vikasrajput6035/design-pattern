package com.designpattern.strategy;

public class AnimalSimulator extends Animal {

    public AnimalSimulator(String name) {
        setName(name);
    }
    
    @Override
    void displayAnimal() {
        System.out.println(getName()+" Eats Following:");
        food();
    }

}
