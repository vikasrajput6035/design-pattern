package com.designpattern.factory;

public class AmericanBlackForestCake implements Cake {

    public void bake() {
        System.out.println("American Black Forest is baked");
    }

    public void pack() {
        System.out.println("American Black Forest is packed");
    }

    public void decorate() {
        System.out.println("American Black Forest is decorated");
    }

}
