package com.designpattern.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        
        Animal lion = new AnimalSimulator("Lion");
        lion.setAnimalType(new CarnivoresAnimalType());//set the behaviour dynamically
        lion.displayAnimal();
        
        Animal cow = new AnimalSimulator("Cow");
        cow.setAnimalType(new HerbivoresAnimalType());
        cow.displayAnimal();
    }

}
