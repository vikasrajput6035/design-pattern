package com.designpattern.factory;

public class IndianRedVelvetCake implements Cake {

    public void bake() {
        System.out.println("RedVelvet Cake is baked !!!");
    }

    public void pack() {
        System.out.println("RedVelvet Cake is packed !!!");
    }

    public void decorate() {
        System.out.println("RedVelvet Cake is decorated !!!");
    }
}
