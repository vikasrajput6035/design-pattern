package com.designpattern.abstractfactory;

public class IndianIngredientFactory implements IngredientFactory {

    public CakeFlour getCakeFlour() {
        return new IndianCakeFlour();
    }

    public VanillaExtract getVanillaExtract() {
        return new IndianVanillaExtract();
    }

    public Cream getCakeCream() {
        return new IndianCakeCream();
    }

}
