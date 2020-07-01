package com.designpattern.facade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        PizzaMakerFacade facade = new PizzaMakerFacade();
        facade.prepareCheeseBurstPizza();
        System.out.println("#######");
        facade.preparePepproniPizza();
    }

}
