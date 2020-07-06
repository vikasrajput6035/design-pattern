package com.designpattern.strategy;

public class HerbivoresAnimalType implements AnimalType {

    @Override
    public void food() {
        System.out.println("Plant, Grass, Fruits, Roots, etc");
    }

}
