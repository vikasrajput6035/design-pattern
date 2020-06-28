package com.designpattern.factory;

public class AmericanCakeShop extends CakeShop {

    @Override
    Cake prepareCake(CakeTypeEnum cakeTypeEnum) {
        Cake cake;
        switch (cakeTypeEnum) {
        case BLACKFOREST:
            cake = new AmericanBlackForestCake();
            break;

        case REDVELVET:
            cake = new AmericanRedVelvetCake();
            break;

        default:
            cake = null;
            break;
        }

        return cake;
    }

}
