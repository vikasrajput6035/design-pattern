package com.designpattern.abstractfactory;

public class AmericanIngredientFactory implements IngredientFactory {

    public CakeFlour getCakeFlour() {
        return new AmericanCakeFlour();
    }

    public VanillaExtract getVanillaExtract() {
        return new AmericanVanillaExtract();
    }

    public Cream getCakeCream() {
        return new AmericanCakeCream();
    }

}