package com.designpattern.facade;

public class Pizza {

    public Pizza() {
        rollTheDough();
        puffTheDough();
    }
    
    void rollTheDough() {
        System.out.println("Take out a dough and roll it out to circle..");
    }
    
    void puffTheDough() {
        System.out.println("Puff out the edge of the dough so the crust is thicker at the edge..");
    }
    
    void addSauce(Sauce sauce) {
        System.out.println("Sauce added..");
    }
    
    void addCheese(Cheese cheese) {
        System.out.println("Cheese added..");
    }
    
    void addToppings(Cheese cheese) {
        System.out.println("Toppings added..");
    }
    
    void applyExtraCheese() {
        System.out.println("Extra cheese for cheese burst pizza..");
    }
    
    void addPepper(Pepper pepper) {
        System.out.println("Pepper added..");
    }
}
