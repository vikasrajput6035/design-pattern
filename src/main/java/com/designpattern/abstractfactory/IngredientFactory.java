package com.designpattern.abstractfactory;

public interface IngredientFactory {

    CakeFlour getCakeFlour();

    VanillaExtract getVanillaExtract();

    Cream getCakeCream();
}
