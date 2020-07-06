package com.designpattern.strategy;

public abstract class Animal {

    private String name;
    private AnimalType animalType;
    
    
    abstract void displayAnimal();
    
    void food() {
        animalType.food();
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }
}
