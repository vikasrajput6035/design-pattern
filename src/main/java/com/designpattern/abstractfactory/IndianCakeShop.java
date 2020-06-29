package com.designpattern.abstractfactory;

public class IndianCakeShop extends CakeShop {

    @Override
    Cake prepareCake(CakeTypeEnum cakeTypeEnum) {
        IngredientFactory ingredientFactory = new IndianIngredientFactory();
        Cake cake;
        switch (cakeTypeEnum) {
        case BLACKFOREST:
            cake = new BlackForestCake(ingredientFactory);
            cake.name = "Indian BlackForestCake";
            break;

        case REDVELVET:
            cake = new RedVelvetCake(ingredientFactory);
            cake.name = "Indian RedVelvetCake";
            break;

        default:
            cake = null;
            break;
        }
        System.out.println(cake.name + "is getting prepared");
        
        return cake;
    }

}
