package com.designpattern.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        CakeShop cakeShop = new IndianCakeShop();
        Cake indianCake = cakeShop.order(CakeTypeEnum.BLACKFOREST);

        cakeShop = new AmericanCakeShop();
        Cake americanCake = cakeShop.order(CakeTypeEnum.BLACKFOREST);
    }

}
