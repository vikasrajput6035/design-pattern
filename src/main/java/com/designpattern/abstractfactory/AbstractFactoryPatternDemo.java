package com.designpattern.abstractfactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        CakeShop cakeShop = new IndianCakeShop();
        Cake indianCake = cakeShop.order(CakeTypeEnum.BLACKFOREST);

        cakeShop = new AmericanCakeShop();
        Cake americanCake = cakeShop.order(CakeTypeEnum.BLACKFOREST);
    }

}
