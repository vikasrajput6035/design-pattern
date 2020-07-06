package com.designpattern.singleton;

public class Database {

    //Helps it to become thread safe
    private static volatile Database database;

    private Database() {
        // Prevents Reflection to Make Instance
        if (database != null) {
            throw new RuntimeException("Use newInstance() method to create new object");
        }
    }

    public static Database newInstance(){

        if (database == null) {
            //Prevents applying lock to the entire newInstance() method
            synchronized (Database.class) {
               if (database == null) {
                    System.out.println("Using the new instance");
                    database = new Database();
                }else {
                    System.out.println("Using the same instance");
                }
            }
            return database;
        } else {
            System.out.println("Using the same instance");
            return database;
        }
    }

    //Prevents someone from cloning the singleton object
    @Override
    protected Object clone() throws CloneNotSupportedException  {
        throw new CloneNotSupportedException();
    }
}
