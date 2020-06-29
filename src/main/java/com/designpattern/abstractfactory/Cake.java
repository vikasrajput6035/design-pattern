package com.designpattern.abstractfactory;

public abstract class Cake {

    String name;
    Cream cream;
    VanillaExtract vanillaExtract;
    CakeFlour cakeFlour;
    
    public void bake() {
        System.out.println("Cake is baked");
    }

    public void pack() {
        System.out.println("Cake is packed");
    }

    public void decorate() {
        System.out.println("Cake is decorated");
    }
    
    public abstract Cake prepare();
}
