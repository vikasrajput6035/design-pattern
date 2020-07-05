package com.designpattern.prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        Toy carToy = new CarToy("Mercedes Kids", true, false);
        System.out.println(carToy);
        Toy anotherCarToy = carToy.copy();
        System.out.println(anotherCarToy);
        
        Toy animalToy = new CarToy("Animal Kids", true, true);
        System.out.println(animalToy);
        Toy anotherAnimal = animalToy.copy();
        System.out.println(anotherAnimal);
    }

}
