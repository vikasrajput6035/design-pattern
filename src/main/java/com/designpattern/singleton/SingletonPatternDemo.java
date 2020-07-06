package com.designpattern.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) throws InterruptedException{
        
        Database database = Database.newInstance();
        database = Database.newInstance();
        database = Database.newInstance();
        database = Database.newInstance();
        database = Database.newInstance();
    }

}
