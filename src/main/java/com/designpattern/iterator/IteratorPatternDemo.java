package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        Fruit[] fruitsArray = {
                new Fruit("Mango"),
                new Fruit("Apple"),
                new Fruit("Pine Apple"),
                new Fruit("Custard Apple"),
                new Fruit("Guava"),
                new Fruit("Banana"),
                new Fruit("Grapes")
        };
        
        List<Fruit> fruitsList = new ArrayList<Fruit>();
        fruitsList.add(new Fruit("Strawberry"));
        fruitsList.add(new Fruit("Blueberry"));
        fruitsList.add(new Fruit("Water Melon"));
        fruitsList.add(new Fruit("Pappaya"));
        
        FruitsArrayIterator fruitsArrayIterator = new FruitsArrayIterator(fruitsArray);
        FruitsListIterator fruitsListIterator = new FruitsListIterator(fruitsList);
        printFruits(fruitsArrayIterator);
        printFruits(fruitsListIterator);
    }
    
    static void printFruits(Iterator iterator) {
        System.out.println("Fruits List:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
