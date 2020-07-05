package com.designpattern.iterator;

import java.util.List;

public class FruitsListIterator implements Iterator {

    private List<Fruit> fruitsArray;
    private int currentIndex = 0;
    
    public FruitsListIterator(List<Fruit> fruitsArray) {
        this.fruitsArray = fruitsArray;
    }
    
    public boolean hasNext() {
        
        if(currentIndex < fruitsArray.size())
            return true;
        else
            return false;
    }

    public Object next() {
        
        Fruit array = null;
        if(hasNext()) {
            array = fruitsArray.get(currentIndex);
        }
        currentIndex++;
        return array;
    }

}
