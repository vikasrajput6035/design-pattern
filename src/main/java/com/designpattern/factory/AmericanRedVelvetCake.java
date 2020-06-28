package com.designpattern.factory;

public class AmericanRedVelvetCake implements Cake {

    public void bake() {
        System.out.println("American RedVelvet Cake is baked !!!");
    }

    public void pack() {
        System.out.println("American RedVelvet Cake is packed !!!");
    }

    public void decorate() {
        System.out.println("American RedVelvet Cake is decorated !!!");
    }
}
