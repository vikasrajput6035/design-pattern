package com.designpattern.facade;

public class PizzaMakerFacade {

    void prepareCheeseBurstPizza() {
        Pizza pizza = new Pizza();
        pizza.rollTheDough();
        pizza.puffTheDough();
        
        Oven oven = new Oven();
        oven.preheatOven("250 degrees");
        
        Sauce sauce = new Sauce();
        sauce.addSauce("Sweet Sauce");
        pizza.addSauce(sauce);
        
        Cheese cheese = new Cheese();
        cheese.addCheese("Cheese with Butter");
        pizza.addCheese(cheese);
        
        Toppings toppings = new Toppings();
        toppings.addToppings("Cheese, Garlic");
        pizza.addToppings(cheese);
        
        PizzaStone pizzaStone = new PizzaStone();
        pizzaStone.putPizza(pizza);
        
        Pizza bakedPizza = oven.bakePizza(pizzaStone);
        bakedPizza.applyExtraCheese();
    }
    
    void preparePepproniPizza() {
        Pizza pizza = new Pizza();
        pizza.rollTheDough();
        pizza.puffTheDough();
        
        Oven oven = new Oven();
        oven.preheatOven("200 degrees");
        
        Pepper pepper = new Pepper();
        pepper.addPepper();
        pizza.addPepper(pepper);
        
        Cheese cheese = new Cheese();
        cheese.addCheese("Simple cheese with less butter");
        pizza.addCheese(cheese);
        
        Toppings toppings = new Toppings();
        toppings.addToppings("Tomato, Capsicum");
        pizza.addToppings(cheese);
        
        PizzaStone pizzaStone = new PizzaStone();
        pizzaStone.putPizza(pizza);
        
        Pizza bakedPizza = oven.bakePizza(pizzaStone);
    }
}
