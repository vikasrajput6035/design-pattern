package com.designpattern.abstractfactory;

public abstract class CakeShop {

    Cake order(CakeTypeEnum cakeTypeEnum) {
        Cake cake = prepareCake(cakeTypeEnum);
        cake.bake();
        cake.decorate();
        cake.pack();
        return cake;
    }
    
    abstract Cake prepareCake(CakeTypeEnum cakeTypeEnum);
}
