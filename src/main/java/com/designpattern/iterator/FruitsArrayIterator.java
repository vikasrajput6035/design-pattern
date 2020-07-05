package com.designpattern.iterator;

public class FruitsArrayIterator implements Iterator {

    private Fruit[] fruitsArray;
    private int currentIndex = 0;

    public FruitsArrayIterator(Fruit[] fruitsArray) {
        this.fruitsArray = fruitsArray;
    }

    public boolean hasNext() {

        if (currentIndex < fruitsArray.length)
            return true;
        else
            return false;
    }

    public Object next() {

        Fruit array = null;
        if (hasNext()) {
            array = fruitsArray[currentIndex];
        }
        currentIndex++;
        return array;
    }

}
