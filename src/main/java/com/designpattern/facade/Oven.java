package com.designpattern.facade;

public class Oven {

    void preheatOven(String temperature) {
        System.out.println("Pre-heat oven to "+temperature+" Celsius..");
    }
    
    Pizza bakePizza(PizzaStone pizzaStone) {
        System.out.println("Bake for 30 minutes or until pizza is crispy and golden brown..");
        return new Pizza();
    }
}
