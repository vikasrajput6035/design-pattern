package com.designpattern.iterator;

import java.util.List;

public class FruitsList implements Iterable {

    private List<Fruit> fruits;

    public FruitsList(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Iterator createInterator() {
        return new FruitsListIterator(fruits);
    }
}