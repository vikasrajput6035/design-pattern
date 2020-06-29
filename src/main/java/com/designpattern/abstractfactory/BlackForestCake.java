package com.designpattern.abstractfactory;

public class BlackForestCake extends Cake {

    IngredientFactory ingredientFactory;

    public BlackForestCake(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Cake prepare() {
        this.cakeFlour = ingredientFactory.getCakeFlour();
        this.cream = ingredientFactory.getCakeCream();
        this.vanillaExtract = ingredientFactory.getVanillaExtract();
        return this;
    }

}
