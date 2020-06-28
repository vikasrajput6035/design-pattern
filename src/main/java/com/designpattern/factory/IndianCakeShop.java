package com.designpattern.factory;

public class IndianCakeShop extends CakeShop {

    @Override
    Cake prepareCake(CakeTypeEnum cakeTypeEnum) {
        Cake cake;
        switch (cakeTypeEnum) {
        case BLACKFOREST:
            cake = new IndianBlackForestCake();
            break;

        case REDVELVET:
            cake = new IndianRedVelvetCake();
            break;

        default:
            cake = null;
            break;
        }

        return cake;
    }

}
