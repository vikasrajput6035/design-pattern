package com.designpattern.abstractfactory;

public class AmericanCakeShop extends CakeShop {

    @Override
    Cake prepareCake(CakeTypeEnum cakeTypeEnum) {
        IngredientFactory ingredientFactory = new AmericanIngredientFactory();
        Cake cake;
        switch (cakeTypeEnum) {
        case BLACKFOREST:
            cake = new BlackForestCake(ingredientFactory);
            cake.name = "American Black Forest";
            break;

        case REDVELVET:
            cake = new RedVelvetCake(ingredientFactory);
            cake.name = "American RedVelvetCake";
            break;

        default:
            cake = null;
            break;
        }
        System.out.println(cake.name + "is getting prepared");
        return cake;
    }

}
