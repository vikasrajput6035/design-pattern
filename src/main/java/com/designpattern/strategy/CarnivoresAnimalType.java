package com.designpattern.strategy;

public class CarnivoresAnimalType implements AnimalType {

    @Override
    public void food() {
        System.out.println("Meat or Flesh");
    }

}
