package com.designpattern.iterator;

public class FruitsArray implements Iterable {

    private Fruit[] fruits;

    public FruitsArray(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public Iterator createInterator() {
        return new FruitsArrayIterator(fruits);
    }
}